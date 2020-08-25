package designPatterns.structuralPatterns.FacadePattern;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class BankService {
    private Map<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new HashMap<Integer, IAccount>();
    }

    public int createNewAccount(String type, BigDecimal amount) {
        int accountNumber = ThreadLocalRandom.current().nextInt();
        IAccount account = null;
        if (type.equals("savings")) {
            account = new SavingsAccount(accountNumber, amount);
        } else if (type.equals("current")) {
            account = new CurrentAccount(accountNumber, amount);
        }
        if (account != null) {
            this.bankAccounts.put(account.getAccountNumber(), account);
            return account.getAccountNumber();
        }
        return -1;
    }

    public void transferMoney(int from, int to, BigDecimal amount) {
        IAccount fromAccount = this.bankAccounts.get(from);
        IAccount toAccount = this.bankAccounts.get(to);
        fromAccount.transfer(toAccount, amount);
    }
}