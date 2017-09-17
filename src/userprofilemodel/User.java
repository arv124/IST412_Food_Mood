/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofilemodel;

/**
 *
 * @author arv124
 */
public class User {
    
    private String username;
    private String password;
    
    
    /**
     * This is the default constructor for the User class
     */
    public User(){
    
    }
    /**
     * Constructor for the User class when username and password are known
     * @param username
     * @param password 
     */
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    /**
     * 
     * @param username the username to authenticate.
     * @param password the password to authenticate.
     * @return the boolean result from authenticate, true is authenticated.
     */
    public boolean authenticate(String username, String password){
        return true;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
}
