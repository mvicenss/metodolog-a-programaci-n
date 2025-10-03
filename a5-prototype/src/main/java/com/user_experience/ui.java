package com.user_experience;

public class ui {
    
    // Text formatting codes
    public static final String GRAY = "\u001B[90m";
    public static final String RED = "\u001B[31m";
    public static final String BLUE = "\u001B[94m";
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String ITALIC = "\u001B[3m";
    public static final String UNDERLINE = "\u001B[4m";

    public static void separator(){
        System.out.println("\n" + GRAY + "===============================================================================================================================" + RESET + "\n");
    }

    public static void clear(){
        System.out.print("\033[2J");
        System.out.flush();
    }

    public static void print(String text){
        System.out.println(text);
    }

    public static void logo() {
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

}