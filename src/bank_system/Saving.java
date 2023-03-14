package bank_system;

import java.util.Scanner;

public class Saving extends Bank{
    public Saving(int no, String username) {
        super(no, username);
    }

    @Override
    public void deposit(Scanner scanner) {
       System.out.println("Enter pin : ");
       int pinCredit=scanner.nextInt();
       if(pinCredit==super.pin){
           System.out.print("Enter money you want to Deposit : ");
           double moneyDeposit=scanner.nextDouble();
           if(!(moneyDeposit < 1)){
               super.balance=super.balance+moneyDeposit;
               System.out.println("Congratulation your deposit success: ");
           }else{
               System.out.println("Your money should be greater than 0");
           }
       }else{
           System.out.println("Your pin is incorrect !!");
       }
    }

    @Override
    public void withdrawal(Scanner scanner) {
        // restrict can get only one time in a month 30
        if(super.getLocalDate().getDayOfMonth() >29){
            System.out.println("Enter money you want to Withdrawal: ");
            double moneyWithdrawal=scanner.nextDouble();
            // restrict is money greater than 2000 go to meet bank
            if(moneyWithdrawal < 2000){
                if(!(moneyWithdrawal > super.balance)){
                    super.balance=super.balance-moneyWithdrawal;
                    System.out.println("Withdrawal Success : "+moneyWithdrawal);
                }else{
                    System.out.println("Your balance is smaller than the money you Withdrawal");
                }
            }else{
                System.out.println("your withdraw is limit your want more please come Chento Bank");
            }
        }
    }

    @Override
    public void showBalance() {
        System.out.println("=================================");
        System.out.println("No : "+super.no);
        System.out.println("Name : "+super.username);
        System.out.println("Your Balance is : "+super.balance);
        System.out.println("Type : Saving card");
    }
}
