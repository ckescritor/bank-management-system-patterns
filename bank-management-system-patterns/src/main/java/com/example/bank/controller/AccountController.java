package com.example.bank.controller;

import com.example.bank.model.Account;
import com.example.bank.service.AccountService;

import java.util.List;
import java.util.Optional;

public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    // Create a new account
    public Account createAccount(String accountHolderName, double initialBalance) {
        Account account = new Account(accountHolderName, initialBalance);
        return accountService.createAccount(account);
    }

    // Get account by ID
    public Optional<Account> getAccountById(int accountId) {
        return accountService.getAccountById(accountId);
    }

    // Get all accounts
    public List<Account> getAllAccounts() {
        return accountService.getAllAccounts();
    }

    // Update account balance
    public Account updateAccountBalance(int accountId, double newBalance) {
        Optional<Account> optionalAccount = accountService.getAccountById(accountId);
        if (optionalAccount.isPresent()) {
            Account account = optionalAccount.get();
            account.setBalance(newBalance);
            return accountService.updateAccount(account);
        }
        throw new IllegalArgumentException("Account with ID " + accountId + " does not exist.");
    }

    // Delete account by ID
    public void deleteAccount(int accountId) {
        accountService.deleteAccount(accountId);
    }
}

