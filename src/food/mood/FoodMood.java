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

    private final foodcontroller.FoodController theFood;
    private final moodcontroller.MoodController theMood;
    /**
     * Contructor for FoodMood pair
     * @param theFood Food Controller
     * @param theMood Mood Controller
     */
    public FoodMood (foodcontroller.FoodController theFood, moodcontroller.MoodController theMood) {
        this.theFood = new foodcontroller.FoodController();
        this.theMood = new moodcontroller.MoodController();
    }
    /**
     * Get the Food Mood Pair
     * @param i
     * @return String of food and mood seperated by space
     */
    public String getPairAt(int i) {
        return theFood.getFood(i).toString()+" "+theMood.getMood(i).toString();
    }
    
}
