package com.example.bank.strategy;

import com.example.bank.model.Account;

public class DepositStrategy implements TransactionStrategy {

    @Override
    public void execute(Account account, double amount) {
        account.deposit(amount);
    }
}
