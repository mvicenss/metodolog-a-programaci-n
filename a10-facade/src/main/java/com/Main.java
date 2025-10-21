package src.main.java.com;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int option;

        Card card = new Card();
        Account account = new Account();
        SecuritySystem security = new SecuritySystem();
        NotificationService notification = new NotificationService();

        System.out.println("_correct pin: 9513_");
        System.out.println("Enter your PIN: ");
        String inputPin = sc.nextLine();

        if(!card.validatePin(inputPin)){
            System.out.println("Invalid PIN");
            return;
        }

        BankFacade bank = new BankFacade(card, account, security, notification); //Putting the bank object here allows for reutilizing, instead of creating a new one every time


        do{
            System.out.println(" --- CAIXABANK --- ");
            System.out.println("1. Money Transfer");
            System.out.println("0. Exit");

            option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    System.out.println(" --- Transfer money --- ");

                    System.out.println("Target account: ");
                    String targetAccount = sc.nextLine();

                    System.out.println("Amount to transfer: ");
                    float amount = sc.nextFloat();

                    bank.transfer(inputPin,amount,targetAccount);
                    break;
                case 0:
                    System.out.println("Thank you for trusting us.");
                    break;
            }

        }while(option != 0);

    }
}
