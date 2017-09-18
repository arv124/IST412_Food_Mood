/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodcontroller;

import java.util.ArrayList;

/**
 *
 * @author Zhewei
 */
public class FoodController {
    ArrayList<foodmodel.Food> foods;
    
    /**
     * Default constructor for the FoodController class
     */
    public FoodController() {
        foods = new ArrayList<>();
    }
    
    /**
     * Add to the list of foods consumed
     * @param food the food to be added
     */
    public void addFood(foodmodel.Food food) {
        foods.add(food);
    }
    /**
     * Change a food in the list of foods consumed
     * @param index the index of the food that is to be changed
     * @param food the replacement of the original food at index
     */
    public void changeFood(int index, foodmodel.Food food) {
        foods.set(index, food);
    }
    /**
     * Remove a food from the list of foods consumed
     * @param index the index in which to remove the consumed food
     */
    public void removeFood(int index) {
        foods.remove(index);
    }
}
