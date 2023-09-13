package com.concepts.java.designpatterns.structural.composite;

import java.util.ArrayList;

/**
 * @author edenilson-mbp
 * @version 1.0.0
 * 
 * Composite class
 */
public class Housing implements IStructure{
    private ArrayList<IStructure> structures;
    private String address;

    public Housing(String address){
        this.structures = new ArrayList<>();
        this.address = address;
    }

    public int addStructure(IStructure component){
        this.structures.add(component);
        return this.structures.size() - 1;
    }

    public IStructure getStructure(int componentNumber){
        return this.structures.get(componentNumber);
    }

    @Override
    public void enter() {
        System.out.println("You have entered the " + this.address);
    }

    @Override
    public void exit() {
        System.out.println("You have left the " + this.address);
    }

    @Override
    public void location() {
        System.out.println("You are currently in " + this.getName() + ". It has ");
        for (IStructure struct : structures) {
            System.out.println(struct.getName());
        }
    }

    @Override
    public String getName() {
        return this.address;
    }
    
}
