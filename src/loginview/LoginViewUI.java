/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginview;

import databasecontroller.Database;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.*;
import databasecontroller.Database;
import mainmenuview.MainMenuUI;
import profileview.CreateProfileUI;

/**
 *
 * @author nadaziab
 */
public class LoginViewUI {
    
    private JFrame f;
    private JPanel p;
    
    private JLabel usernameLabel, passwordLabel;
    private JTextField usernameField, passwordField;
    public JButton loginBtn, createProfileBtn;
    
    /**
     * default constructor for LoginViewUI
     */
    public LoginViewUI() {
        f = new JFrame();
        p = new JPanel();
        f.setLayout(new BorderLayout());
        p.setLayout(new GridBagLayout());
        
        f.setTitle("Login");
        f.setSize(500, 500); // default size is 0,0
        //f.setLocation(300, 300); // default is 0,0 (top left corner)
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
        createComponents();
        addActionListeners();
        
        f.add(p, BorderLayout.CENTER);
        f.setVisible(true);
    }
    
    /**
     * method to create UI components
     */
    private void createComponents() {
        GridBagConstraints c = new GridBagConstraints();
        c.fill = GridBagConstraints.BOTH;
        
        usernameLabel = new JLabel("Username");
        c.gridx = 0;
        c.gridy = 0;
        p.add(usernameLabel, c);
        
        usernameField = new JTextField("");
        usernameField.setPreferredSize(new Dimension(100, 30));
        c.gridx = 1;
        c.gridy = 0;
        p.add(usernameField, c);
        
        passwordLabel = new JLabel("Password");
        c.gridx = 0;
        c.gridy = 1;
        p.add(passwordLabel, c);
        
        passwordField = new JTextField("");
        passwordField.setPreferredSize(new Dimension(100, 30));
        c.gridx = 1;
        c.gridy = 1;
        p.add(passwordField, c);
        
        loginBtn = new JButton("Login");
        c.gridx = 1;
        c.gridy = 2;
        p.add(loginBtn, c);
        
        createProfileBtn = new JButton("Create a Profile");
        c.gridx = 1;
        c.gridy = 3;
        p.add(createProfileBtn, c);
    }
    
    private void addActionListeners() {
        
        loginBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //authenticate login
                Database d = new Database();
                d.authProfile(getUsername(), getPassword());
               
                //if authenticated, launch main menu
                MainMenuUI mainMenuUI = new MainMenuUI();
                f.dispose();
            }
        });
        
        createProfileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //leave login, go to CreateProfile
                CreateProfileUI createProfileUI = new CreateProfileUI();
                f.dispose();
            }
        });
    }
    
    /**
     * gets username input
     * @return username as a String
     */
    public String getUsername() {
        return usernameField.getText();
    }
    
    /**
     * gets password input
     * @return password as a String
     */
    public String getPassword() {
        return passwordField.getText();
    }
}
