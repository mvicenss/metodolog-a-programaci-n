package src.main.java.com.user_experience;

import java.util.*;

public class ui {

    // Text formatting codes
    public static final String GRAY = "\u001B[90m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[94m";
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";

    
    public static void separator(){
       
        // Print a separator line
        System.out.println("\n" + GRAY + "===============================================================================================================================" + RESET + "\n");
    }

    public static void clear(){
        
        // Clean the console
        System.out.print("\033[2J");
        System.out.flush();
    }

    public static void logo() {
        clear();

        // Print blue ASCII art of the Movistar logo
        separator();
        System.out.print(BLUE +
    "                       @@@@@@@@                                                                                                \n" +
    "    @@@@@             @@@@@@@@@@                                                                                               \n" +
    "  @@@@@@@@@          @@@@@@@@@@@                                                                     @@@                       \n" +
    " @@@@@@@@@@@        @@@@@@@@@@@@@          @@@@@   @@@@@        @@@@                         @@@@    @@@      @@@@         @@@\n" +
    "@@@@@@@@@@@@@@     @@@@@@@@@@@@@@        @@@@@@@@@@@@@@@@@   @@@@@@@@@@  @@@    @@@@ @@@   @@@@@@@@  @@@@@   @@@@@@@@   @@@@@@\n" +
    "@@@@@@@@@@@@@@@   @@@@@@@@  @@@@@       @@@@@  @@@@@   @@@@ @@@@@  @@@@@ @@@    @@@  @@@  @@@@       @@@          @@@@ @@@@@  \n" +
    "@@@@@@@@@@@@@@@@@@@@@@@@@    @@@@@      @@@@    @@@     @@@ @@@@    @@@@ @@@@  @@@@  @@@  @@@@@@@    @@@    @@@@@@@@@@ @@@@   \n" +
    "@@@@@ @@@@@@@@@@@@@@@@@@     @@@@       @@@@    @@@     @@@ @@@@    @@@@  @@@  @@@   @@@    @@@@@@@  @@@   @@@@@@@@@@@ @@@@   \n" +
    "@@@@@  @@@@@@@@@@@@@@@@     @@@@@       @@@@    @@@     @@@ @@@@    @@@@  @@@@@@@@   @@@        @@@  @@@@  @@@@   @@@@ @@@@   \n" +
    "@@@@@   @@@@@@@@@@@@@@@     @@@@@       @@@@    @@@     @@@  @@@@@@@@@@    @@@@@@    @@@  @@@@@@@@@  @@@@@@ @@@@@@@@@@ @@@@   \n" +
    " @@@@    @@@@@@@@@@@@@       @@@         @@@    @@@     @@@     @@@@@@      @@@@     @@@   @@@@@@      @@@    @@@@@@    @@@   \n" +
    " @@@@@    @@@@@@@@@@@                                                                                                         \n" +
    "  @@@@       @@@@@@                                                                                                           \n" +
    RESET);
        separator();
    }

    public static void welcome() {
        
        // Print short welcome message explaining the demonstration
        System.out.println("This project aims to show a practical example of the Prototype design pattern.");
        separator();
    }

    public static void menu() {
        
        // Print menu choices and prompt for input
        System.out.println("Choose a base experience to CLONE:");
        System.out.println("  (1) Fiber");
        System.out.println("  (2) Mobile");
        System.out.println("  (3) Fusion");
        System.out.println("  (4) New customer");
        System.out.println("  (5) Show Registry");
        System.out.println("  (0) Exit");
        System.out.print("Please select an option: ");
    }

    public static int readInt(Scanner in) {
        
        // Read a line and parse it as an integer
        while (true) {
            String s = in.nextLine().trim();
            return Integer.parseInt(s);
        }
    }

    public static int readOption(Scanner in) {
        
        // Check if 0 <= input <= 5
        while (true) {
            int n = readInt(in);
            if (n >= 0 && n <= 5) return n;
            System.out.print("Valid options are 0-5. Try again: ");
        }
    }

    public static String askUsername(Scanner in) {
        
        // Ask the user for a username
        System.out.print("Username for this clone: ");
        return in.nextLine().trim();
    }

    public static List<String> askList(Scanner in, String prompt) {

        // Prompt user for a list of strings separated by commas
        System.out.print(prompt + " (comma-separated, Enter = none): ");
        String line = in.nextLine().trim();
        
        // If user presses enter, return empty list
        List<String> list = new ArrayList<>();
        if (line.isEmpty()) return list;
        String[] parts = line.split(",");
        
        for (String p : parts) {
            String x = p.trim();
            if (!x.isEmpty()) list.add(x);
        }
        return list;
    }

    public static String keyFromOption(int option) {

        // Convert numeric menu option to the prototype key string
        if (option == 1) return "fiber";
        if (option == 2) return "mobile";
        if (option == 3) return "fusion";
        if (option == 4) return "new";
        if (option == 5) return "registry";
        return "";
    }

    public static void customize(UserExperiencePrototype exp, String username, List<String> offers, List<String> banners) {
        
        // Apply custom values to the cloned experience (object mutation)
        if (exp == null) return;
        
        if (username != null && !username.isBlank()) {
            exp.username = username;
        }
        
        // Ensure the target list is mutable
        if (offers != null && !offers.isEmpty()) {
            if (exp.offers == null) {
                // If there are no existing offers, it will create a new mutable list
                exp.offers = new ArrayList<>();
            } else if (!(exp.offers instanceof ArrayList)) {
                // If the existing list is immutable, it will create a new mutable list with the same elements
                exp.offers = new ArrayList<>(exp.offers);
            }
            exp.offers.addAll(offers);
        }

        // Add extra banners
        if (banners != null && !banners.isEmpty()) {
            if (exp.banners == null) {
                exp.banners = new ArrayList<>();
            } else if (!(exp.banners instanceof ArrayList)) {
                exp.banners = new ArrayList<>(exp.banners);
            }
            exp.banners.addAll(banners);
        }
    }

    public static void showTime(String label, long ms) {
        
        // Print how long an operation took (in milliseconds)
        System.out.println(label + ": " + ms + " ms");
    }

    public static void show(UserExperiencePrototype exp) {

        // Print experience details (common and subclass fields)
        if (exp == null) {
            System.out.println(RED + "(null experience)" + RESET);
            return;
        }
        
        separator();
        
        System.out.println("Username:  " + exp.username);
        System.out.println("PlanType:  " + exp.planType);
        System.out.println("Menu:      " + listToString(exp.menu));
        System.out.println("Offers:    " + listToString(exp.offers));
        System.out.println("Banners:   " + listToString(exp.banners));


        // subclass details (these are extra fields shown only for some types)
        if (exp instanceof FiberExperience f) {
            // Use pattern matching to access subclass fields without a cast
            System.out.println("Fiber speed: " + f.getSpeed() + " Mbps");
        }

        if (exp instanceof MobileExperience m) {
            System.out.println("Mobile number: " + m.getNumber());
            System.out.println("Data (GB):     " + m.getData());
        }
        
        if (exp instanceof FusionExperience fu) {
            System.out.println("Mobile number: " + fu.getNumber());
            System.out.println("Data (GB):     " + fu.getData());
            System.out.println("Fiber speed:   " + fu.getFiberSpeed() + " Mbps");
        }
        
        if (exp instanceof NewUserExperience n) {
            System.out.println("Name:            " + n.getName());
            System.out.println("Email:           " + n.getEmail());
            System.out.println("RegistrationDay: " + n.getRegistrationDate());
        }
        
        separator();
    }

    private static String listToString(java.util.List<String> xs) {
        
        // Helper to print a list
        if (xs == null || xs.isEmpty()) return "[]";
        return xs.toString();
    }
}
