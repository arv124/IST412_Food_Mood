/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodview;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author nadaziab
 */
public class AddMoodUI {
    
    private JFrame f;
    private JPanel p;
    
    private JLabel moodDescrLabel, moodDateLabel;
    private JTextField moodDescrField, moodDateField;
    private JButton addBtn;
    
    /**
     * default constructor for AddMoodUI
     */
    public AddMoodUI() {
        f = new JFrame();
        p = new JPanel();
        f.setLayout(new BorderLayout());
        p.setLayout(new GridBagLayout());
        
        f.setTitle("Add Mood");
        f.setSize(500, 500); // default size is 0,0
        //f.setLocation(300, 300); // default is 0,0 (top left corner)
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        createComponents();
        
        f.add(p, BorderLayout.CENTER);
        f.setVisible(true);
    }
    
    /**
     * method to create UI components
     */
    private void createComponents() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
        moodDescrLabel = new JLabel("Mood Description");
        c.gridx = 0;
        c.gridy = 0;
        p.add(moodDescrLabel, c);
        
        moodDescrField = new JTextField("");
        moodDescrField.setPreferredSize(new Dimension(100, 30));
        c.gridx = 1;
        c.gridy = 0;
        p.add(moodDescrField, c);
        
        moodDateLabel = new JLabel("Time Recorded");
        c.gridx = 0;
        c.gridy = 1;
        p.add(moodDateLabel, c);
        
        moodDateField = new JTextField("");
        moodDateField.setPreferredSize(new Dimension(100, 30));
        c.gridx = 1;
        c.gridy = 1;
        p.add(moodDateField, c);
        
        addBtn = new JButton("Add Mood");
        c.gridx = 1;
        c.gridy = 2;
        p.add(addBtn, c);
    }
    
    /**
     * gets mood description input
     * @return mood description as a String
     */
    public String getMoodDescription() {
        return moodDescrField.getText();
    }
    
    /**
     * gets mood date input
     * @return mood date as a String
     */
    public String getMoodDate() {
        return moodDateField.getText();
    }
    
}
