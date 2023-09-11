package com.concepts.java;

import com.concepts.java.datastructures.ArrayExample;
import com.concepts.java.oop.swing.UsingSwingKit;

public class Main {

	public static void main(String[] args) {
		// Using Swing library example
		UsingSwingKit swingKit = new UsingSwingKit();
		swingKit.showMessageDialog("Running Java Program!");

		// Data structures
		ArrayExample arrayExample = new ArrayExample();
		arrayExample.displayWeekDays();

		System.exit(0);
	}

}
