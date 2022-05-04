package at.ran.OO.Accounts;

public class CheckingsAccount extends BaseAccount {
    private int limit;

    public CheckingsAccount(int limit) {
        this.limit = limit;
    }

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > (limit * -1)){
            System.out.println("Withdraw " + amount + " Euros");
            return super.withdraw(amount);
        }else {
            System.out.println("Leider keine Deckung");
            return 0;
        }

    }
}
