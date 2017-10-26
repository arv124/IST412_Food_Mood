/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodview;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.*;

/**
 *
 * @author nadaziab
 */
public class AddFoodUI {
    
    private JFrame f;
    private JPanel p;
    
    private JLabel foodNameLabel, foodDateLabel;
    private JTextField foodNameField, foodDateField;
    private JButton addBtn;
    
    /**
     * default constructor for AddFoodUI
     */
    public AddFoodUI() {
        f = new JFrame();
        p = new JPanel();
        f.setLayout(new BorderLayout());
        p.setLayout(new GridBagLayout());
        
        f.setTitle("Add Food");
        f.setSize(500, 500); // default size is 0,0
        //f.setLocation(300, 300); // default is 0,0 (top left corner)
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        createComponents();
        
        f.add(p, BorderLayout.CENTER);
        f.setVisible(true);
    }
    
    /**
     * create UI components
     */
    private void createComponents() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
        foodNameLabel = new JLabel("Food Name");
        c.gridx = 0;
        c.gridy = 0;
        p.add(foodNameLabel, c);
        
        foodNameField = new JTextField("");
        foodNameField.setPreferredSize(new Dimension(100, 30));
        c.gridx = 1;
        c.gridy = 0;
        p.add(foodNameField, c);
        
        foodDateLabel = new JLabel("Time Consumed");
        c.gridx = 0;
        c.gridy = 1;
        p.add(foodDateLabel, c);
        
        foodDateField = new JTextField("");
        foodDateField.setPreferredSize(new Dimension(100, 30));
        c.gridx = 1;
        c.gridy = 1;
        p.add(foodDateField, c);
        
        addBtn = new JButton("Add Food");
        c.gridx = 1;
        c.gridy = 2;
        p.add(addBtn, c);
    }
    
    /**
     * gets food name input
     * @return food name as a String
     */
    public String getFoodName() {
        return foodNameField.getText();
    }
    
    /**
     * gets food date input
     * @return food date as a String
     */
    public String getFoodDate() {
        return foodDateField.getText();
    }
}
