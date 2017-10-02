/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainmenucontroller;
import chartcontroller.ChartController;
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
import researchcontroller.ResearchController;
/**
 *
 * @author nadaziab
 */
public class MainMenuController {
    
    public MainMenuController() {
    
        System.out.println("MainMenuController instantiated");
        
        MainMenuModel theMainMenuModel = new MainMenuModel();
        
        MainMenuUI theMainMenuUI = new MainMenuUI();
        
        testOptions();
        
        
        /*
        SettingsController theSettingsController = new SettingsController();
        ProfileController theProfileController = new ProfileController();
        NotificationController theNotificationController = new NotificationController();
        FoodController theFoodController = new FoodController();
        MoodController theMoodController = new MoodController(); //if only controlling moods was this easy.
        StatsController theStatsController = new StatsController();
        RecommendationsController theRecomendationConroller = new RecommendationsController();
        */
           
    }
    
    /**
     * run through all options
     */
    private void testOptions() {
        System.out.println();
        runSettings();
        System.out.println();
        runProfile();
        System.out.println();
        runNotification();
        System.out.println();
        runFood();
        System.out.println();
        runMood();
        System.out.println();
        runStats();
        System.out.println();
        runRecommendations();
        System.out.println();
        runCharts();
        System.out.println();
        runResearch();                
    }
    
    private void runSettings() {
        System.out.println("** Settings test start **");
        SettingsController theSettingsController = new SettingsController();
        System.out.println("** Settings test end **");
    }
    
    private void runProfile() {
        System.out.println("** Profile test start **");
        ProfileController theProfileController = new ProfileController();
        System.out.println("** Profile test end **");
    }
    
    private void runNotification() {
        System.out.println("** Notification test start **");
        NotificationController theNotificationController = new NotificationController();
        System.out.println("** Notification test end **");
    }
    
    private void runFood() {
        System.out.println("** Food test start **");
        FoodController theFoodController = new FoodController();
        System.out.println("** Food test end **");
    }
    
    private void runMood() {
        System.out.println("** Mood test start **");
        MoodController theMoodController = new MoodController(); //if only controlling moods was this easy.
        System.out.println("** Mood test end **");
    }
    
    private void runStats() {
        System.out.println("** Stats test start **");
        StatsController theStatsController = new StatsController();
        System.out.println("** Stats test end **");
    }
    
    private void runRecommendations() {
        System.out.println("** Recommendations test start **");
        RecommendationsController theRecomendationConroller = new RecommendationsController();
        System.out.println("** Recommendations test end **");
    }
    
    private void runCharts(){
        System.out.println("** Chart test start **");
        ChartController theChartController = new ChartController();
        System.out.println("** Chart test end **");
    }
    private void runResearch(){
        System.out.println("** Research test start **");
        ResearchController theResearchController = new ResearchController();
        System.out.println("** Research test end **");
    }
}
