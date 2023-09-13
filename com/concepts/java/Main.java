package com.concepts.java;

import com.concepts.java.designpatterns.structural.composite.Housing;
import com.concepts.java.designpatterns.structural.composite.Room;
import com.concepts.java.designpatterns.structural.composite.assignment.Playlist;
import com.concepts.java.designpatterns.structural.composite.assignment.Song;
import com.concepts.java.designpatterns.structural.facade.impl.Customer;
import com.concepts.java.oop.swing.UsingSwingKit;

public class Main {

	public static void main(String[] args) {
		// Using Swing library example
		UsingSwingKit swingKit = new UsingSwingKit();
		swingKit.showMessageDialog("Running Java Program!");

		// Data structures
		// ArrayExample arrayExample = new ArrayExample();
		// arrayExample.displayWeekDays();

		// Design Patterns
		// Facade Pattern implementation
		Customer customer = new Customer();
		customer.createBankAccountsWithServiceFacade();

		// Composite design pattern implementation
		// Main.testComposite();

		Main.compositeAssignment();

		System.exit(0);
	}

	static void testComposite() {
		// Composite design pattern
		Housing building = new Housing("16000 Street.");
		Housing floorOne = new Housing("1600 Street - First Floor");
		int firstFloor = building.addStructure(floorOne);

		// Add rooms components
		Room washRoom1Man = new Room("1F Men's Washroom");
		Room washRoom1Women = new Room("1F Women's Washroom");
		Room commonRoom1 = new Room("1F Common area");

		int firstMenWashroom = floorOne.addStructure(washRoom1Man);
		int firstWomansWashroom = floorOne.addStructure(washRoom1Women); // This can be used to walk into the womans
																			// room
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

	static void compositeAssignment() {
		// Make new empty "Study" playlist
		Playlist studyPlaylist = new Playlist("Study");

		// Make "Synth Pop" playlist and add 2 songs to it.
		Playlist synthPopPlaylist = new Playlist("Synth Pop");
		Song synthPopSong1 = new Song("Girl Like You", "Toro Y Moi");
		Song synthPopSong2 = new Song("Outside", "TOPS");
		synthPopPlaylist.add(synthPopSong1);
		synthPopPlaylist.add(synthPopSong2);

		// Make "Experimental" playlist and add 3 songs to it,
		// then set playback speed of the playlist to 0.5x
		Playlist experimentalPlaylist = new Playlist("Experimental");
		Song experimentalSong1 = new Song("About you", "XXYYXX");
		Song experimentalSong2 = new Song("Motivation", "Clams Casino");
		Song experimentalSong3 = new Song("Computer Vision", "Oneohtrix Point Never");
		experimentalPlaylist.add(experimentalSong1);
		experimentalPlaylist.add(experimentalSong2);
		experimentalPlaylist.add(experimentalSong3);
		float slowSpeed = 0.5f;
		experimentalPlaylist.setPlaybackSpeed(slowSpeed);

		// Add the "Synth Pop" playlist to the "Experimental" playlist
		experimentalPlaylist.add(synthPopPlaylist);

		// Add the "Experimental" playlist to the "Study" playlist
		studyPlaylist.add(experimentalPlaylist);
		
		// Create a new song and set its playback speed to 1.25x, play this song,
		// get the name of glitchSong → "Textuell", then get the artist of this song → "Oval"
		Song glitchSong = new Song("Textuell", "Oval");
		float fasterSpeed = 1.25f;
		glitchSong.setPlaybackSpeed(fasterSpeed);
		glitchSong.play();
		String name = glitchSong.getName();
		String artist = glitchSong.getArtist();
		System.out.println("The song name is " + name);
		System.out.println("The song artist is " + artist);

		// Add glitchSong to the "Study" playlist
		studyPlaylist.add(glitchSong);

		// Play "Study" playlist.
		studyPlaylist.play();

		// Get the playlist name of studyPlaylist → "Study"
		System.out.println("The Playlist's name is " + studyPlaylist.getName());
	}
}
