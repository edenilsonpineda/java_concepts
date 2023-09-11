package com.concepts.java.designpatterns.creational.factory;

import com.concepts.java.designpatterns.creational.factory.budgetknife.BudgetChefKnife;
import com.concepts.java.designpatterns.creational.factory.budgetknife.BudgetSteakKnife;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 */
public class BudgetKnifeStore extends AbstractKnifeStore {  

    /**
     * Own implementation of createKnife Factory Method from KnifeStore
     * @param knifeType
     * @return the knife based on the type
     */
    Knife createKnife(String knifeType) {
        if(knifeType.equals("steak")){
            return new BudgetSteakKnife();
        }else if(knifeType.equals("chefs")){
            return new BudgetChefKnife();
        }else{
            return null;
        }
        // any other budget knife...
    }
    
}
