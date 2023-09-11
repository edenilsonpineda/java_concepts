package com.concepts.java.designpatterns.structural.facade.impl;

import java.math.BigDecimal;
import java.util.Random;

import com.concepts.java.designpatterns.structural.facade.IAccount;

public class Investment implements IAccount {
    private Integer accountNumber;
    private BigDecimal balance;

    public Investment(BigDecimal balance){
        this.balance = balance;
        this.accountNumber = new Random().nextInt(50000);
    }

    @Override
    public void deposit(BigDecimal amount) {
        this.balance = balance.add(amount);
    }

    @Override
    public void withdraw(BigDecimal amount) {
        this.balance = balance.subtract(amount);
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        toAccount.deposit(amount); // simulates money transfer
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public BigDecimal getBalance() {
        return this.balance;
    }
    
}
