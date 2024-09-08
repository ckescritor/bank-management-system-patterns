package main.java.com.example.bank.config;

import com.example.bank.service.AccountService;
import com.example.bank.service.CustomerService;
import com.example.bank.service.TransactionService;
import com.example.bank.repository.AccountRepository;
import com.example.bank.repository.CustomerRepository;
import com.example.bank.repository.TransactionRepository;

public class ConfigService {

    private static AccountService accountService;
    private static CustomerService customerService;
    private static TransactionService transactionService;

    // Private constructor to prevent instantiation
    private ConfigService() {}

    public static AccountService getAccountService() {
        if (accountService == null) {
            accountService = new AccountService(getAccountRepository());
        }
        return accountService;
    }

    public static CustomerService getCustomerService() {
        if (customerService == null) {
            customerService = new CustomerService(getCustomerRepository());
        }
        return customerService;
    }

    public static TransactionService getTransactionService() {
        if (transactionService == null) {
            transactionService = new TransactionService(getTransactionRepository());
        }
        return transactionService;
    }

    private static AccountRepository getAccountRepository() {
        // Here you can add any initialization code for AccountRepository if needed
        return new AccountRepository();
    }

    private static CustomerRepository getCustomerRepository() {
        // Here you can add any initialization code for CustomerRepository if needed
        return new CustomerRepository();
    }

    private static TransactionRepository getTransactionRepository() {
        // Here you can add any initialization code for TransactionRepository if needed
        return new TransactionRepository();
    }
}

