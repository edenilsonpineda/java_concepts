package com.concepts.java.designpatterns.structural.facade;

import java.math.BigDecimal;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 * 
 * <p>
 * This interface is the one that will be implemented by 
 * the different account classes and will not be known to the customer class.
 * </p>
 */
public interface IAccount {
    public void deposit(BigDecimal amount);
    public void withdraw(BigDecimal amount);
    public void transfer(IAccount toAccount, BigDecimal amount);
    public BigDecimal getBalance();
    public int getAccountNumber();
}
