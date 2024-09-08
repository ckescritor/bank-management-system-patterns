package com.example.bank.repository;

import com.example.bank.model.Transaction;
import java.util.HashMap;
import java.util.Map;

public class TransactionRepository {
    private Map<String, Transaction> transactions = new HashMap<>();

    public void save(Transaction transaction) {
        transactions.put(transaction.getId(), transaction);
    }

    public Transaction findById(String id) {
        return transactions.get(id);
    }
}
