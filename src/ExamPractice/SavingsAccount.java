package ExamPractice;

public class SavingsAccount extends BankAccount {

    double interestRate;

    public SavingsAccount(String accountId, double balance, double interestRate) {
        super(accountId, balance);
        this.interestRate = interestRate;
    }

}