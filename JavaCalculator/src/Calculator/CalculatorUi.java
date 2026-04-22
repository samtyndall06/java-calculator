/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author maste
 */
public class CalculatorUi {
    
    public CalculatorUi(){
        JFrame frame = new JFrame("Calculator");
        frame.setSize(300, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        //Display
        JTextField display = new JTextField();
        display.setEditable(false);
        frame.add(display, BorderLayout.NORTH);
        
        //Buttons
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(4,4));
        
        String[] buttonLabels = {
            "7", "8", "9", "/",
            "4", "5", "6", "*",
            "1", "2", "3", "-",
            "0", ".", "=", "+"
        };
        
        for(String label : buttonLabels){
            JButton button = new JButton(label);
            buttonPanel.add(button);
        }
        
        frame.add(buttonPanel, BorderLayout.CENTER);
        
        frame.setVisible(true);
    }
    
    public static void main(String [] args){
        new CalculatorUi();
    }
}
