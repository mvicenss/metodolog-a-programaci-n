package src.main.java.com.user_experience;

import java.time.LocalDate;
import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        List <UserExperiencePrototype> personalizedClones = new ArrayList<>();
        ui.logo();
        ui.welcome();
        wait(3000);

        // Build prototypes and measure time
        long t0 = System.nanoTime();

        // Constructors based on each class
        UserExperiencePrototype fiberProto = new FiberExperience(
                300,
                "prototype",
                "fiber",
                null,
                null,
                Arrays.asList("Fiber base banner")
        );

        UserExperiencePrototype mobileProto = new MobileExperience(
                600123456,
                50,
                "prototype",
                "mobile",
                null,
                null,
                Arrays.asList("Mobile base banner")
        );

        UserExperiencePrototype fusionProto = new FusionExperience(
                600987654,
                100,
                600,
                "prototype",
                "fusion",
                null,
                null,
                Arrays.asList("Fusion base banner")
        );

        UserExperiencePrototype newUserProto = new NewUserExperience(
                "New Customer",
                "new.customer@example.com",
                LocalDate.now(),
                "prototype",
                "new",
                null,
                null,
                Arrays.asList("Welcome banner")
        );

     
        PrototypeRegistry registry = new PrototypeRegistry();
            registry.addPrototype("fiber", fiberProto);
            registry.addPrototype("mobile", mobileProto);
            registry.addPrototype("fusion", fusionProto);
            registry.addPrototype("new", newUserProto);

            registry.showPrototype();

        long t1 = System.nanoTime();
        ui.showTime("Prototype creation took", (t1 - t0) / 1_000_000);


        // Demonstration of cloning and customization
        long d0 = System.nanoTime();
        UserExperiencePrototype quickA = registry.getClone("fiber");
        ui.customize(quickA, "John Smith", Arrays.asList("+10 GB free"), Collections.emptyList());
        
        UserExperiencePrototype quickB = registry.getClone("fusion");
        ui.customize(quickB, "Maria Gomez", Collections.emptyList(), Arrays.asList("Autumn cross-discount"));
        long d1 = System.nanoTime();
        ui.showTime("Cloning + customization (demo) took", (d1 - d0) / 1_000_000);

        ui.show(quickA);
        ui.show(quickB);

        System.out.println("Original prototypes remain unchanged:");
        ui.show(fiberProto);
        ui.show(fusionProto);


        // User-interactive loop
        boolean again = true;
        while (again) {
            ui.menu();
            int option = ui.readOption(in);
            if (option == 0) break;

            if (option == 5){
                if(personalizedClones.isEmpty()){
                    System.out.println("No personalized clones.");
                }else{
                    for(UserExperiencePrototype c : personalizedClones){
                        ui.show(c);
                    }
                }
                continue;
            }

            String key = ui.keyFromOption(option);
            if (key.isEmpty()) {
                System.out.println("Unknown option.");
                continue;
            }

            String username = ui.askUsername(in);
            List<String> extraOffers = ui.askList(in, "Extra promotions");
            List<String> extraBanners = ui.askList(in, "Banners");

            long c0 = System.nanoTime();
            UserExperiencePrototype clone = registry.getClone(key);
            if (clone == null) {
                System.out.println("Clone failed.");
                continue;
            }
            ui.customize(clone, username, extraOffers, extraBanners);
            personalizedClones.add(clone);
            long c1 = System.nanoTime();
            ui.showTime("Cloning + customization took", (c1 - c0) / 1_000_000);

            ui.show(clone);

            System.out.print("Create another customized experience? (y/n): ");
            String ans = in.nextLine().trim().toLowerCase(Locale.ROOT);
            again = ans.equals("y") || ans.equals("yes");
        }

        System.out.println("Goodbye!");
        in.close();
    }

    public static void wait(int ms){
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
