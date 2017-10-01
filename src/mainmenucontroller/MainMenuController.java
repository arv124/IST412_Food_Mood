/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenucontroller;
import mainmenumodel.*;
import mainmenuview.*;
import settingscontroller.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;

import settingscontroller.*;
import profilecontroller.*;
import notificationcontroller.*;
import settingscontroller.*;
import foodcontroller.*;
import moodcontroller.*;
import statscontroller.*;
import recommendationscontroller.*;
/**
 *
 * @author nadaziab
 */
public class MainMenuController {
    
    public MainMenuController() {
    
        MainMenuModel theMainMenuModel = new MainMenuModel();
        
        MainMenuUI theMainMenuUI = new MainMenuUI();
        
        
        
        SettingsController theSettingsController = new SettingsController();
        ProfileController theProfileController = new ProfileController();
        NotificationController theNotificationController = new NotificationController();
        FoodController theFoodController = new FoodController();
        MoodController theMoodController = new MoodController(); //if only controlling moods was this easy.
        StatsController theStatsController = new StatsController();
        RecommendationsController theRecomendationConroller = new RecommendationsController();
        
        
        
    }
}
