package com.concepts.java;

import com.concepts.java.designpatterns.structural.composite.Housing;
import com.concepts.java.designpatterns.structural.composite.Room;
import com.concepts.java.designpatterns.structural.facade.impl.Customer;
import com.concepts.java.oop.swing.UsingSwingKit;

public class Main {

	public static void main(String[] args) {
		// Using Swing library example
		UsingSwingKit swingKit = new UsingSwingKit();
		swingKit.showMessageDialog("Running Java Program!");

		// Data structures
		//ArrayExample arrayExample = new ArrayExample();
		//arrayExample.displayWeekDays();


		// Design Patterns 
		// Facade Pattern implementation
		Customer customer = new Customer();
		customer.createBankAccountsWithServiceFacade();

		// Composite design pattern implementation
		Main.testComposite();

		System.exit(0);
	}

	static void testComposite(){
		// Composite design pattern
		Housing building = new Housing("16000 Street.");
		Housing floorOne = new Housing("1600 Street - First Floor");
		int firstFloor = building.addStructure(floorOne);

		// Add rooms components 
		Room washRoom1Man = new Room("1F Men's Washroom");
		Room washRoom1Women = new Room("1F Women's Washroom");
		Room commonRoom1 = new Room("1F Common area");

		int firstMenWashroom = floorOne.addStructure(washRoom1Man);
		int firstWomansWashroom = floorOne.addStructure(washRoom1Women); // This can be used to walk into the womans room
		int firstCommonRoom = floorOne.addStructure(commonRoom1);

		building.enter(); // Enter the building
		Housing currentFloor = (Housing) building.getStructure(firstFloor);
		currentFloor.enter(); // Walk into the first floor
		Room currentRoom = (Room) currentFloor.getStructure(firstMenWashroom);
		currentRoom.enter(); // Walk into the men's room
		currentRoom = (Room) currentFloor.getStructure(firstCommonRoom);
		currentRoom.enter(); // Walk into the common area
		building.exit();
	}

}
