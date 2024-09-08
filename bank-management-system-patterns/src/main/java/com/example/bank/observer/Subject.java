package com.example.bank.observer;

import java.util.ArrayList;
import java.util.List;

// Interface Subject
public abstract class Subject {
    private List<Observer> observers = new ArrayList<>();

    // Adiciona um observador
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Remove um observador
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notifica todos os observadores
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
