package com.example.bank.strategy;

import com.example.bank.model.Account;

public interface TransactionStrategy {
    void execute(Account account, double amount);
}

