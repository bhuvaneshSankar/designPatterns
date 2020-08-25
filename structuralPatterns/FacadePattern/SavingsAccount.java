package designPatterns.structuralPatterns.FacadePattern;

import java.math.BigDecimal;

public class SavingsAccount implements IAccount {
    int accountNumber;
    BigDecimal balance;

    public SavingsAccount(int accountNumber, BigDecimal balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {

    }

    public void withdraw(BigDecimal amount) {

    }

    public void transfer(IAccount toAccount, BigDecimal amount) {

    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
}