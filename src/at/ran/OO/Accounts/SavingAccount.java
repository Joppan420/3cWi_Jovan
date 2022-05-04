package at.ran.OO.Accounts;

public class SavingAccount extends BaseAccount{

    @Override
    public double withdraw(double amount) {
        if ((getBalance() - amount) > 0){
            return super.withdraw(amount);
        }else{
            System.out.println("Keine Deckung");
            return 0;
        }
    }
}
