package com.concepts.java.designpatterns.structural.facade.impl;

import java.math.BigDecimal;

import com.concepts.java.designpatterns.structural.facade.IAccount;

public class Chequing implements IAccount{

    @Override
    public void deposit(BigDecimal amount) {
        throw new UnsupportedOperationException("Unimplemented method 'deposit'");
    }

    @Override
    public void withdraw(BigDecimal amount) {
        throw new UnsupportedOperationException("Unimplemented method 'withdraw'");
    }

    @Override
    public void transfer(IAccount toAccount, BigDecimal amount) {
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }

    @Override
    public int getAccountNumber() {
        throw new UnsupportedOperationException("Unimplemented method 'getAccountNumber'");
    }

    @Override
    public BigDecimal getBalance() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }
    
}
