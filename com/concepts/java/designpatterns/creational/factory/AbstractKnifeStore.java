package com.concepts.java.designpatterns.creational.factory;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 */
public abstract class AbstractKnifeStore {
	/**
	 * <p>
	 * This will be the factory method which will be defined by the subclasses
	 * <p>
	 * 
	 * @param knifeType
	 * @return {@link com.concepts.java.designpatterns.factory.Knife class}
	 */
	abstract Knife createKnife(String knifeType);

	/**
	 * 
	 * @param knifeType
	 * @return {@link com.concepts.java.designpatterns.factory.Knife class}
	 */
	public Knife orderKnife(String knifeType) {
		Knife knife = this.createKnife(knifeType);

		// Always prepare the knife
		knife.sharpen();
		knife.polish();
		knife.packageForShipping();

		return knife;
	}
}
