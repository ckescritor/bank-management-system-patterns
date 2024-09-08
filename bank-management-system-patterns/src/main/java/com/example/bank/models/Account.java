package com.example.bank.model;

public abstract class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    // Método para obter o número da conta
    public int getAccountNumber() {
        return accountNumber;
    }

    // Método para obter o nome do titular da conta
    public String getAccountHolderName() {
        return accountHolderName;
    }

    // Método para obter o saldo da conta
    public double getBalance() {
        return balance;
    }

    // Método para depositar um valor na conta
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Depósito de " + amount + " realizado. Saldo atual: " + balance);
        } else {
            System.out.println("O valor do depósito deve ser positivo.");
        }
    }

    // Método para sacar um valor da conta
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Saque de " + amount + " realizado. Saldo atual: " + balance);
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método abstrato que pode ser implementado por subclasses
    public abstract void accountType();
}
