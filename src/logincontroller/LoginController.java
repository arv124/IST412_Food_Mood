/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logincontroller;
import loginmodel.*;
import loginview.*;
import mainmenucontroller.*;
/**
 *
 * @author nadaziab
 */
public class LoginController {
    
    public LoginController() {
    
        LoginModel theLoginModel = new LoginModel();
        
        LoginViewUI theLoginViewUI = new LoginViewUI();
        
        MainMenuController theMainMenuController = new MainMenuController();
        
        
    }
}
