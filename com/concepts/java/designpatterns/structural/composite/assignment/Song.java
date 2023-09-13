package com.concepts.java.designpatterns.structural.composite.assignment;

/**
 * @author edenilson
 * @version 1.0.0
 */
public class Song implements IComponent{
    public String songName;
    public String artist;
    public float speed = 1; // Default playback speed

    public Song(String songName, String artist){
        this.songName = songName;
        this.artist = artist;
    }

    @Override
    public void play() {
        System.out.println("You are currently playing the song: " + songName);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
        System.out.println("Playback speed is set to " + speed);
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist(){
        return this.artist;
    }
}
