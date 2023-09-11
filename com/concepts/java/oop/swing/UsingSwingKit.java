package com.concepts.java.oop.swing;

import javax.swing.JOptionPane;

public class UsingSwingKit {
    public void showMessageDialog(String message){
    	JOptionPane.showMessageDialog(null, message);
    }

    public void sumTwoNumbersUsingInputDialog(){
        int firstNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite el primer número"));
        int secondNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite el segundo número"));

        int sum = firstNumber + secondNumber;
        JOptionPane.showMessageDialog(null, 
            "La suma de ambos números es: " + sum, 
            "Resultado", 
            JOptionPane.PLAIN_MESSAGE);
    }
}
