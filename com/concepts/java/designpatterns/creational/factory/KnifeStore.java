package com.concepts.java.designpatterns.creational.factory;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 */
public class KnifeStore {
    private KnifeFactory factory;

    /*
    * require a KnifeFactory object to be passed to this constructor
    * also known as Object Factory
     */ 
    public KnifeStore(KnifeFactory factory){
        this.factory = factory;
    }

    public Knife orderKnife(String knifeType){
        Knife knife = factory.createKnife(knifeType);
        
        // Prepare the knife
        knife.polish();
        knife.sharpen();
        knife.packageForShipping();

        return knife;
    }
}
