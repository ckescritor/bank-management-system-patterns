package com.example.bank.singleton;

import com.example.bank.repository.AccountRepository;
import com.example.bank.repository.CustomerRepository;
import com.example.bank.repository.TransactionRepository;

public class BankSingleton {
    private static BankSingleton instance;

    private AccountRepository accountRepository;
    private CustomerRepository customerRepository;
    private TransactionRepository transactionRepository;

    private BankSingleton() {
        accountRepository = new AccountRepository();
        customerRepository = new CustomerRepository();
        transactionRepository = new TransactionRepository();
    }

    public static BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }

    public AccountRepository getAccountRepository() {
        return accountRepository;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public TransactionRepository getTransactionRepository() {
        return transactionRepository;
    }
}
