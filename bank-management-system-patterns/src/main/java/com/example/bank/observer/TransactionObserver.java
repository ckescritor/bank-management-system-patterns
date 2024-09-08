package com.example.bank.observer;

import com.example.bank.model.Transaction;

// Observador que monitora transações
public class TransactionObserver implements Observer {
    private Transaction transaction;

    public TransactionObserver(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public void update() {
        // Aqui você pode definir o que fazer quando houver uma transação
        System.out.println("Transação monitorada: " + transaction.getId() + " no valor de " + transaction.getAmount());
    }
}
