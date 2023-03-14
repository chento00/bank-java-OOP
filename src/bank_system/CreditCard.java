package bank_system;

import java.util.Scanner;

public class CreditCard extends Bank{
    public CreditCard(int no, String username) {
        super(no, username);
    }

    public CreditCard() {
    }

    @Override
    public void deposit(Scanner scanner) {
        System.out.print("Enter pin : ");
        int pinCredit=scanner.nextInt();
        if(pinCredit==Bank.pin){
            System.out.print("Enter money you want to Deposite : ");
            double moneyDeposit=scanner.nextDouble();
            if(moneyDeposit <1){
                System.out.println("Your money should be greater than 0");
            }else{
                super.balance=super.balance+moneyDeposit;
                System.out.println("Congratulation your deposit success: ");
            }
        }else{
            System.out.println("Your pin is incorrect !!");
        }
    }

    @Override
    public void withdrawal(Scanner scanner ) {
        System.out.print("Enter pin : ");
        int pinCredit=scanner.nextInt();
        if(pinCredit==super.pin){
            System.out.print("Enter money you want to Withdrawal: ");
            double moneyWithdrawal=scanner.nextDouble();
            if(!(moneyWithdrawal > super.balance)){
                super.balance=super.balance-moneyWithdrawal;
                System.out.println("Withdrawal Success : "+moneyWithdrawal);
            }else{
                System.out.println("Your balance is smaller than the money you Withdrawal");
            }
        }else{
            System.out.println("Your pin is incorrect !!");
        }
    }

    @Override
    public void showBalance() {
        System.out.println("=================================");
        System.out.println("No : "+super.no);
        System.out.println("Name : "+super.username);
        System.out.println("Your Balance is : "+super.balance);
        System.out.println("Type : Credit card");
    }
}
