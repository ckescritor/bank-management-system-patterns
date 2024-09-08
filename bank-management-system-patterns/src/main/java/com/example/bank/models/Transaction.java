package com.example.bank.model;

import java.time.LocalDateTime;

public class Transaction {
    private double amount;
    private LocalDateTime date;
    private TransactionType type;
    private String description;

    // Construtor para inicializar a transação com valor, tipo e descrição
    public Transaction(double amount, TransactionType type, String description) {
        this.amount = amount;
        this.date = LocalDateTime.now();
        this.type = type;
        this.description = description;
    }

    // Métodos getter para os atributos da transação
    public double getAmount() {
        return amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public TransactionType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }

    // Método para exibir detalhes da transação
    public void printTransactionDetails() {
        System.out.println("Data: " + date);
        System.out.println("Tipo: " + type);
        System.out.println("Valor: " + amount);
        System.out.println("Descrição: " + description);
    }
}
