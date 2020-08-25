package designPatterns.structuralPatterns.FacadePattern;

import java.math.BigDecimal;

public class CurrentAccount implements IAccount {
    int accountNumber;
    BigDecimal balance;

    CurrentAccount(int accountNumber, BigDecimal balance) {
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