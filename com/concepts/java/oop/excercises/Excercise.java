package com.concepts.java.oop.excercises;

public class Excercise {
    /**
     * 
     */
    public void solve(Integer num1, Integer num2){
        if(num1 == null || num2 == null){
            System.err.println("Numbers cannot be null");
        }

        if(num1 % num2 == 0){
            System.out.println("Numbers are divisible");
        }else{
            System.out.println("Numbers are not divisible");
        }
    }
}
