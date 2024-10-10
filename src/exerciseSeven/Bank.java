package exerciseSeven;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    // Constructor for the Bank class
    public Bank() {
        // Initialize the accounts ArrayList
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    // Method to deposit money into a specific Account
    public void depositMoney(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdrawMoney(Account account, double amount) {
        account.withdraw(amount);
    }

   // Method to get the list of all accounts
    public ArrayList<Account> getAccounts() {
        // Return the accounts ArrayList
        return new ArrayList<>(accounts);
    }
}
