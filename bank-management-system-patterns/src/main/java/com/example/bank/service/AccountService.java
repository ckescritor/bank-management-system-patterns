package com.example.bank.service;

import com.example.bank.model.Account;
import com.example.bank.repository.AccountRepository;

public class AccountService {
    private AccountRepository accountRepository = new AccountRepository();

    public void createAccount(Account account) {
        accountRepository.save(account);
    }

    public Account findAccountById(String id) {
        return accountRepository.findById(id);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
        accountRepository.save(account);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
        accountRepository.save(account);
    }
}

