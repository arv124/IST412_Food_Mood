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
/**
 *
 * @author nadaziab
 */
public class MainMenuController {
    
    public MainMenuController() {
    
        MainMenuModel theMainMenuModel = new MainMenuModel();
        
        MainMenuUI theMainMenuUI = new MainMenuUI();
        
        
        
        SettingsController theSettingsController = new SettingsController();
        
    }
}
