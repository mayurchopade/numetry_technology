package com.numetry.banksystem;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(double initialBalance) {
        Account account = new Account(initialBalance);
        accounts.add(account);
    }

    public void displayAllAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println("Account " + (i + 1) + ": " + accounts.get(i).getBalance());
        }
    }

    // Inner class representing an account
    private class Account {
        private double balance;

        public Account(double initialBalance) {
            this.balance = initialBalance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Insufficient funds.");
            }
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addAccount(1000);
        bank.addAccount(2000);
        bank.addAccount(3000);

        bank.displayAllAccounts();

        // Example of depositing into the first account
        bank.accounts.get(0).deposit(500);
        System.out.println("After deposit:");
        bank.displayAllAccounts();
    }
}

