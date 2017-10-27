/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package navigationcontroller;

import foodview.AddFoodUI;
import moodview.AddMoodUI;

/**
 *
 * @author nadaziab
 */
public class NavigationController {
    
    private int option;
    
    /**
     * default constructor for NavigationController
     * @param option the menu option selected as an int
     */
    public NavigationController(int option) {
        this.option = option;
        runOption();
    }
    
    /**
     * navigates to selected option
     */
    private void runOption() {
        switch (option) {
            case 0:
                //add food
                AddFoodUI addFoodUI = new AddFoodUI();
                break;
            case 1:
                //add mood
                AddMoodUI addMoodUI = new AddMoodUI();
                break;
            case 2:
                //edit entries
                break;
            case 3:
                //view profile
                break;
        }
    }
    
    
}
