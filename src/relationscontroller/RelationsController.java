/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relationscontroller;
import relationsmodel.*;
import moodmodel.MoodList;
import foodmodel.FoodList;
/**
 *
 * @author Nate
 */
public class RelationsController {
    public RelationsController() {
        System.out.println("RelationsController instantiated");
        RelationsModel relations = new RelationsModel(new MoodList(), new FoodList());
    }
}
