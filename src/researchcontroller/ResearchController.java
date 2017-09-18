/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchcontroller;

import java.util.ArrayList;
import researchmodel.Research;

/**
 *
 * @author Nate
 */
public class ResearchController {
    
    ArrayList<Research> researchList;
    String searchTerms;
    /**
     * default constructor of ResearchController
     */
    public ResearchController(){
        this.researchList = new ArrayList<>();
    }
    /**
     * adds new research to available list of research
     * @param research 
     */
    public void addNewResearch(researchmodel.Research research){
          researchList.add(research);
    }
    /**
     * deletes selected research from the list of available research
     * @param index index of research to be removed
     */
    public void removeResearch(int index){
        researchList.remove(index);
    }
    /**
     * searches for new research using the search terms
     * @param searchTerms terms to be used to find research
     * @return Returns new research that has been found
     */
     public Research getResearch(String searchTerms){
         Research newResearch = new Research("temp");
         return newResearch;
     }
    
    
    
}
