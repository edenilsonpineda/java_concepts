package com.concepts.java.designpatterns.creational.factory;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 * @see {@link com.concepts.java.designpatterns.factory.Knife class}
 */
public class KnifeFactory {
    /**
     * 
     * @param knifeType
     * @return a knife based on the type
     */
    public Knife createKnife(String knifeType){
        Knife knife = null;
       
        if(knifeType.equals("steak")){
           knife = new SteakKnife();
        }else if(knifeType.equals("chefs")){
            knife = new ChefsKnife();
        }

        return knife;
    }
}
