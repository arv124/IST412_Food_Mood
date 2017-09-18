/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationmodel;

/**
 *
 * @author nadaziab
 */
public class Notification {
    
    private String message;
    private String status;
    
    /**
     * This is the default constructor for the Notification class
     */
    public Notification() {
        
    }
    
    /**
     * Constructor for Notification with a message
     * @param message 
     */
    public Notification(String message) {
        this.message = message;
        this.status = "new";
    }
    
    /**
     * Get the notification message
     * @return the message
     */
    public String getMessage() {
        return this.message;
    }
    
    /**
     * Get the status of a notification
     * @return the status
     */
    public String getStatus() {
        return this.status;
    }
}
