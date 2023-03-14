import bank_system.Account;
import bank_system.CreditCard;
import bank_system.InputUtils;
import bank_system.Saving;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account account = null;

        System.out.println("---------SET UP--------");
        System.out.print("Enter No : ");
        int no=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name : ");
        String name=scanner.nextLine();
        CreditCard creditCard=new CreditCard(no,name);
        Saving saving=new Saving(no,name);
        System.out.println("Enter Type of Account you want : ");
        System.out.println("1. Credit Card Account");
        System.out.println("2. Saving Account ");
        System.out.println("3.  Both : Credit card & Saving Account");
        System.out.print("Choose one :");
        int opt = scanner.nextInt();
        switch (opt) {
            case 1: {
                account = new Account(creditCard);
            }
            break;
            case 2: {
                account = new Account(saving);
            }
            break;
            case 3: {
                account = new Account(creditCard ,saving);
            }
            break;
            default:{
                System.out.println("Your input is incorrect !");
            }
        }
        System.out.println("Your set up is success !!");
        do {
            System.out.println("1. Credit card      2.Saving Card");
            System.out.print("Choose card you want to process : ");
            int opt1 = scanner.nextInt();
            switch (opt1){
                case 1:
                {
                    System.out.println("===========credit card===========");
                    switch (InputUtils.input(scanner)){
                        case 1:{
                            account.getCreditCard().deposit(scanner);
                        }break;
                        case 2:{
                            account.getCreditCard().withdrawal(scanner);
                        }break;
                        case 3:{
                            account.getCreditCard().showBalance();
                        }
                    }
                }break;
                case 2:{
                    System.out.println("===========Saving Card===========");
                    switch (InputUtils.input(scanner)){
                        case 1:{
                            account.getSaving().deposit(scanner);
                        }break;
                        case 2:{
                            account.getSaving().withdrawal(scanner);
                        }break;
                        case 3:{
                            account.getSaving().showBalance();
                        }
                        default:{
                            System.out.println("your enter is incorrect ");
                        }
                    }
                }break;
                case 3:{
                    System.out.println("your input is incorrect");
                }break;
            }

        } while (true);
    }
}