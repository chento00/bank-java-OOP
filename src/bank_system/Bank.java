package bank_system;
import java.time.LocalDate;
import java.util.Scanner;

abstract class  Bank {
    protected int no;
    protected String username;
     protected double balance;
     protected LocalDate localDate;
//     set default for pin for every account
      static   int pin=2002;
     Bank(){
         balance=0;
         localDate=LocalDate.now();
     }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public Bank(int no, String username) {
        this.no = no;
        this.username = username;
    }

    abstract void  deposit(Scanner scanner);
    abstract void withdrawal(Scanner scanner);
    abstract void showBalance();
}
