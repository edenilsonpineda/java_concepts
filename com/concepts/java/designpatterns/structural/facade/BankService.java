package com.concepts.java.designpatterns.structural.facade;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.concepts.java.designpatterns.structural.facade.impl.Investment;
import com.concepts.java.designpatterns.structural.facade.impl.Savings;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 * 
 *          <p>
 *          This will be the facade that wraps all the IAccount implementations
 *          and can be used by any client
 *          </p>
 */
public class BankService {
    private HashMap<Integer, IAccount> bankAccounts;

    public BankService() {
        this.bankAccounts = new HashMap<>();
    }

    /**
     * 
     * @param type
     * @param initAmount
     * @return the number account if the account is created, if not, it will return
     *         -1
     */
    public int createNewAccount(String type, BigDecimal initAmount) {
        IAccount newAccount = null;
        switch (type) {
            case "chequing":
                break;
            case "saving":
                newAccount = new Savings(initAmount);
                break;
            case "investment":
                newAccount = new Investment(initAmount);
                break;
            default:
                Logger.getLogger(BankService.class.getName()).severe("Invalid account type");
                break;
        }

        if (newAccount != null) {
            this.bankAccounts.put(newAccount.getAccountNumber(), newAccount);
            return newAccount.getAccountNumber();
        }

        return -1;
    }

    public void transferMoney(int to, int from, BigDecimal amount) {
        IAccount toAccount =  findAccountByAccountNumber(to);
        IAccount fromAccount = findAccountByAccountNumber(from);

        Logger.getLogger(BankService.class.getName()).log(Level.INFO,
                () -> "Processing request to transfer from " + from
                        + " to " + to + ", with amount $" + amount.doubleValue());

        fromAccount.transfer(toAccount, amount);
        fromAccount.withdraw(amount);

        Logger.getAnonymousLogger().log(Level.INFO,
                () -> "The new balance of the account " + from + " is $" + fromAccount.getBalance().doubleValue());
    }

    public IAccount findAccountByAccountNumber(int accountNumber){
        return bankAccounts.get(accountNumber);
    }
}
