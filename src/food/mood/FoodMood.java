/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package food.mood;

/**
 *
 * @author arv124
 */
public class FoodMood {

    private foodcontroller.FoodController theFood;
    private moodcontroller.MoodController theMood;
    
    public foodMood(foodcontroller.FoodController theFood, moodcontroller.MoodController theMood) {
        this.theFood = new foodcontroller.FoodController();
        this.theMood = new moodcontroller.MoodController();
    }
    
    public String getPairAt(int i) {
        return theFood.getFood(i).toString()+theMood.getMood(i).toString();
    }
    
}
