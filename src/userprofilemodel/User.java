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
     * This is the default constructor for the Userc class
     */
    public User(){
    
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
}
