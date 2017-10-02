/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationsmodel;

import java.util.ArrayList;
import moodmodel.MoodList;
import foodmodel.FoodList;
/**
 *
 * @author Nate
 */
public class RelationsModel {
    private MoodList moods;
    private FoodList foods;
    
    /**
     * Constructor for relation model
     * @param moods List of moods
     * @param foods List of foods
     */
    public RelationsModel(MoodList moods, FoodList foods) {
        System.out.println("RelationsModel instantiated");
    }
    /**
     * Get the mood list
     * @return mood list
     */
    public MoodList getMoods() {
        return moods;
    }
    /**
     * Get the food list
     * @return food list
     */
    public FoodList getFoods() {
        return foods;
    }
    
    
}
