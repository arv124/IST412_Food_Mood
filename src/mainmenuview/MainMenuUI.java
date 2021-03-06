/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenuview;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import navigationcontroller.*;

/**
 *
 * @author nadaziab
 */
public class MainMenuUI {
    
    private JFrame f;
    private JPanel p;
    
    private JButton addFoodBtn, addMoodBtn, viewProfileBtn, editEntriesBtn;
    
    /**
     * default constructor for MainMenuUI
     */
    public MainMenuUI(){
        f = new JFrame();
        p = new JPanel();
        f.setLayout(new BorderLayout());
        p.setLayout(new GridBagLayout());
        
        f.setTitle("FoodMood");
        f.setSize(500, 500); // default size is 0,0
        //f.setLocation(300, 300); // default is 0,0 (top left corner)
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        createComponents();
        addActionListeners();
        
        f.add(p, BorderLayout.CENTER);
        f.setVisible(true);
        
    }
    
    private void createComponents() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
        addFoodBtn = new JButton("Add Food Entry");
        c.gridx = 0;
        c.gridy = 0;
        p.add(addFoodBtn, c);
        
        addMoodBtn = new JButton("Add Mood Entry");
        c.gridx = 0;
        c.gridy = 1;
        p.add(addMoodBtn, c);
        
        editEntriesBtn = new JButton("Edit Entries");
        c.gridx = 0;
        c.gridy = 2;
        p.add(editEntriesBtn, c);
        
        viewProfileBtn = new JButton("View Profile");
        c.gridx = 0;
        c.gridy = 3;
        p.add(viewProfileBtn, c);
        
        
    }
    
    private void addActionListeners() {
        
        addFoodBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NavigationController navCntl = new NavigationController(0);
                f.dispose();
            }
        });
        
        addMoodBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NavigationController navCntl = new NavigationController(1);
                f.dispose();
            }
        });
        
        editEntriesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NavigationController navCntl = new NavigationController(2);
            }
        });
        
        viewProfileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NavigationController navCntl = new NavigationController(3);
            }
        });
        
      
        
    }

}
