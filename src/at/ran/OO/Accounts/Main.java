package at.ran.OO.Accounts;

public class Main {
    public static void main(String[] args) throws Exception {

        CheckingsAccount ca = new CheckingsAccount(3000);
        ca.deposit(5000);
        ca.withdraw(2000);
        ca.withdraw(1000);
        System.out.println(ca.getBalance());

        SavingAccount sa = new SavingAccount();
        sa.deposit(50);
        sa.withdraw(40);
        System.out.println(sa.getBalance());

    }
}
