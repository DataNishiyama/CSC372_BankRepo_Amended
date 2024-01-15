public class CheckingAccount extends BankAccount {
    private double interestRate;

    // Constructor
    public CheckingAccount() {
        super();
        interestRate = 0.0;
    }

    // Setters
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Methods
    public void processWithdrawal(double amount) {
        double overdraftFee = 30.0;
        double totalWithdrawal = amount + overdraftFee;
        super.withdrawal(totalWithdrawal);
        System.out.println("Initial Withdrawal of $" + amount);
        System.out.println("Overdraft Fee: -$" + overdraftFee);
        System.out.println("Fee assessed: An overdraft fee has been applied.");
        System.out.println("Final Balance: -$" + Math.abs(super.getBalance()));
        applyInterest();
    }

    //Apply Interest
    private void applyInterest() {
        double interest = Math.abs(super.getBalance()) * (interestRate / 100.0);
        super.deposit(interest);
        System.out.println("Interest of $" + interest + " applied.");
    }

    //Deposit
    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (amount >= 0) {
            System.out.println("Deposit of $" + amount + " accepted.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //Account Summary
    @Override
    public void accountSummary() {
        super.accountSummary();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
