package com.example.bank.decorator;

import com.example.bank.model.Account;

// Classe abstrata base para os decorators, implementando a interface Account
public abstract class AccountDecorator implements Account {
    protected Account decoratedAccount;

    public AccountDecorator(Account decoratedAccount) {
        this.decoratedAccount = decoratedAccount;
    }

    @Override
    public int getAccountId() {
        return decoratedAccount.getAccountId();
    }

    @Override
    public String getAccountHolderName() {
        return decoratedAccount.getAccountHolderName();
    }

    @Override
    public double getBalance() {
        return decoratedAccount.getBalance();
    }

    @Override
    public void deposit(double amount) {
        decoratedAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        decoratedAccount.withdraw(amount);
    }
}
