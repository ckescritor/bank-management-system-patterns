# Explorando Padrões de Projetos na Prática com Java

## Descrição

Este repositório contém um projeto demonstrativo que explora a aplicação prática de vários padrões de projeto em Java puro. O objetivo é ilustrar a implementação e o uso dos padrões Singleton, Factory, Strategy, Decorator e Observer em um sistema de gerenciamento de banco. O código é modular e flexível, permitindo fácil entendimento e personalização.

## Padrões de Projeto Utilizados

### Singleton

O padrão **Singleton** garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global a essa instância. É utilizado para gerenciar uma única instância de um recurso compartilhado.

**Classe: `BankSingleton.java`**
```java
package com.example.bank.singleton;

public class BankSingleton {
    private static BankSingleton instance;
    
    private BankSingleton() {}

    public static synchronized BankSingleton getInstance() {
        if (instance == null) {
            instance = new BankSingleton();
        }
        return instance;
    }
}

