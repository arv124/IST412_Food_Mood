/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notificationcontroller;

import java.util.ArrayList;

/**
 *
 * @author nadaziab
 */
public class NotificationController {
    
    ArrayList<notificationmodel.NotificationModel> notifications;
    
    /**
     * This is the default constructor for the Notification class
     */
    public NotificationController() {
        notifications = new ArrayList<>();
    }
    
    /**
     * Add a notification to the list of notifications
     * @param notification the notification to be added
     */
    public void addNotification(notificationmodel.NotificationModel notification) {
        notifications.add(notification);
    }
    
    /**
     * Delete a notification from the list of notifications
     * @param index the index of the notification to be removed
     */
    public void deleteNotification(int index) {
        notifications.remove(index);
    }
 
}
