package bank_system;

public class Account {
    private CreditCard creditCard;
    private Saving saving;

    public Account(CreditCard creditCard, Saving saving) {
        this.creditCard = creditCard;
        this.saving = saving;
    }

    public Account(CreditCard creditCard) {
        this.creditCard = creditCard;
    }


    public Account(Saving saving) {
        this.saving = saving;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public Saving getSaving() {
        return saving;
    }
}
