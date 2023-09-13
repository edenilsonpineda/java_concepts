package com.concepts.java.designpatterns.structural.composite;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 * 
 * <p> 
 *     Leaf class doesn't contain components, just implement the IStructure interface 
 * </p>
 */
public class Room implements IStructure{
    private String name;

    public Room(String name){
        this.name = name;
    }

    @Override
    public void enter() {
        System.out.println("You have entered to " + this.name);
    }

    @Override
    public void exit() {
        System.out.println("You have left " + this.name);
    }

    @Override
    public void location() {
        System.out.println("You are currently in the " + this.name);
    }

    @Override
    public String getName() {
        return this.name;
    }
    
}
