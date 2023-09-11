package com.concepts.java.designpatterns.structural.facade.impl;

import java.math.BigDecimal;

import com.concepts.java.designpatterns.structural.facade.BankService;

public class Customer {
    public void createBankAccountsWithServiceFacade(){
        BankService bankService = new BankService();

        int mySavingAccount = bankService.createNewAccount("saving", BigDecimal.valueOf(5000.00));
        int investmentAccount = bankService.createNewAccount("investment", BigDecimal.valueOf(1000.00));

        /**
         * Transfer money simulations
         */
        bankService.transferMoney(mySavingAccount, investmentAccount, new BigDecimal(300));

    }
}
