package com.example.bank.service;

import com.example.bank.model.Transaction;
import com.example.bank.repository.TransactionRepository;

public class TransactionService {
    private TransactionRepository transactionRepository = new TransactionRepository();

    public void recordTransaction(Transaction transaction) {
        transactionRepository.save(transaction);
    }

    public Transaction findTransactionById(String id) {
        return transactionRepository.findById(id);
    }
}
