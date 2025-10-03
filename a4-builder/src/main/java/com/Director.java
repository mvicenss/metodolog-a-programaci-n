package src.main.java.com;

import java.util.Scanner;

public class Director {
    public static void main (String [] args){

        System.out.println("Welcome to the Computer.java Builder!");
        System.out.println("What computer would you like?");
        System.out.println("1. Computer A");
        System.out.println("2. Computer B");
        System.out.println("3. Computer C");

        int option = 0;

        Scanner scanner = new Scanner(System.in);
        option = scanner.nextInt();
        Builder builder = null; //initiate an object of AbstractComputerBuilder but make it empty
        switch(option){
            case 1:
                builder = new ComputerABuilder();
                break;
            case 2:
                builder = new ComputerBBuilder();
                break;
            case 3:
                builder = new ComputerCBuilder();
                break;
            default:
                System.out.println("Invalid option");
                scanner.close();
                break;
        }

        if(builder != null){
            Computer computer = builder.getResult();
            System.out.println("Here is your computer");
            System.out.println(computer);
        }
        scanner.close();

    }
}
