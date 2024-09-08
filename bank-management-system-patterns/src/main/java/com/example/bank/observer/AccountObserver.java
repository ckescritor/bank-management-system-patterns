package com.example.bank.observer;

import com.example.bank.model.Account;

// Observador que monitora atualizações em contas
public class AccountObserver implements Observer {
    private Account account;

    public AccountObserver(Account account) {
        this.account = account;
    }

    @Override
    public void update() {
        // Ação tomada quando a conta é atualizada
        System.out.println("A conta de " + account.getCustomer().getName() + " foi atualizada.");
        System.out.println("Saldo atual: " + account.getBalance());
    }
}
