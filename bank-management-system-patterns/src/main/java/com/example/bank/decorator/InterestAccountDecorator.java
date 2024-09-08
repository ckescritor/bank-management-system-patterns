package com.example.bank.decorator;

import com.example.bank.model.Account;

public class InterestAccountDecorator extends AccountDecorator {

    private static final double INTEREST_RATE = 0.03; // 3% de juros

    public InterestAccountDecorator(Account decoratedAccount) {
        super(decoratedAccount);
    }

    // Método que adiciona juros ao saldo da conta
    public void addInterest() {
        double interest = decoratedAccount.getBalance() * INTEREST_RATE;
        decoratedAccount.deposit(interest);
        System.out.println("Juros de " + interest + " adicionados à conta.");
    }

    @Override
    public String getAccountHolderName() {
        return super.getAccountHolderName() + " (Com Juros)";
    }
}
