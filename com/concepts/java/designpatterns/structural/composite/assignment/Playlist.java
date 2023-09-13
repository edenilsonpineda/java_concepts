package com.concepts.java.designpatterns.structural.composite.assignment;

import java.util.ArrayList;

public class Playlist implements IComponent{
    private String playlistName;
    private ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName){
        this.playlistName = playlistName;
    }

    @Override
    public void play() {
        System.out.println("Currently playing playlist: " + this.playlistName);
        this.playlist.forEach(IComponent::play);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.playlist.forEach(component -> component.setPlaybackSpeed(speed));
    }

    @Override
    public String getName() {
        return this.playlistName;
    }

    /**
     * Add a song component to the playlist
     * @param component
     */
    public void add(IComponent component){
        this.playlist.add(component);
    }

    public void remove(IComponent component){
        this.playlist.remove(component);
    }
    
}


