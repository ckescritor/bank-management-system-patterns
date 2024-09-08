package com.example.bank.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String email;
    private String phoneNumber;
    private List<Account> accounts;

    // Construtor para inicializar o cliente com nome, email e número de telefone
    public Customer(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.accounts = new ArrayList<>();
    }

    // Métodos getter para os atributos do cliente
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Método para adicionar uma conta ao cliente
    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Conta adicionada para o cliente " + name);
    }

    // Método para listar todas as contas associadas ao cliente
    public List<Account> getAccounts() {
        return accounts;
    }

    // Método para obter uma conta específica pelo número da conta
    public Account getAccountByNumber(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }

    // Método para imprimir os detalhes do cliente
    public void printCustomerDetails() {
        System.out.println("Nome: " + name);
        System.out.println("Email: " + email);
        System.out.println("Telefone: " + phoneNumber);
        System.out.println("Número de contas: " + accounts.size());
        for (Account account : accounts) {
            System.out.println("Número da conta: " + account.getAccountNumber() + ", Saldo: " + account.getBalance());
        }
    }
}
