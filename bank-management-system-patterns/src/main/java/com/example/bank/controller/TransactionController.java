package com.example.bank.controller;

import com.example.bank.model.Transaction;
import com.example.bank.service.TransactionService;
import com.example.bank.service.AccountService;
import com.example.bank.model.Account;

import java.util.List;

public class TransactionController {

    private final TransactionService transactionService;
    private final AccountService accountService;

    public TransactionController(TransactionService transactionService, AccountService accountService) {
        this.transactionService = transactionService;
        this.accountService = accountService;
    }

    // Create a new deposit transaction
    public Transaction deposit(int accountId, double amount) {
        Account account = accountService.getAccountById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
        
        return transactionService.deposit(account, amount);
    }

    // Create a new withdrawal transaction
    public Transaction withdraw(int accountId, double amount) {
        Account account = accountService.getAccountById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));
        
        return transactionService.withdraw(account, amount);
    }

    // Create a new transfer transaction between accounts
    public Transaction transfer(int fromAccountId, int toAccountId, double amount) {
        Account fromAccount = accountService.getAccountById(fromAccountId)
                .orElseThrow(() -> new IllegalArgumentException("Source account not found"));
        Account toAccount = accountService.getAccountById(toAccountId)
                .orElseThrow(() -> new IllegalArgumentException("Destination account not found"));
        
        return transactionService.transfer(fromAccount, toAccount, amount);
    }

    // Get transaction history for an account
    public List<Transaction> getTransactionHistory(int accountId) {
        Account account = accountService.getAccountById(accountId)
                .orElseThrow(() -> new IllegalArgumentException("Account not found"));

        return transactionService.getTransactionHistory(account);
    }
}

