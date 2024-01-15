public class Test {
    public static void main(String[] args) {

        //BankAccount Test
        System.out.println("Banking Class:");
        BankAccount account = new BankAccount();
        account.setFirstName("Anthony");
        account.setLastName("Nishiyama");
        account.setAccountID(789456);
        account.deposit(1000.0);
        account.withdrawal(200.0);
        account.accountSummary();
        System.out.println();
        System.out.println();

        //Checking Class Test
        System.out.println("Checking Class:");
        // Test CheckingAccount
        CheckingAccount checkingAccount = new CheckingAccount();
        checkingAccount.setFirstName("Rinn");
        checkingAccount.setLastName("Nishiyama");
        checkingAccount.setAccountID(654987);
        checkingAccount.setInterestRate(2.5);
        checkingAccount.deposit(1500.0);
        checkingAccount.processWithdrawal(1600.0);
        checkingAccount.accountSummary();
    }
}
