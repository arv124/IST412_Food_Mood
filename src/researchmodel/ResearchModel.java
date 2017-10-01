/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchmodel;

/**
 *
 * @author Nate
 */
public class ResearchModel {
    
    private String researchName;
    private String research;
    
    /**
     * Default constructor for Research
     *  
     */
    public ResearchModel(){
        System.out.println("ResearchModel Instantiated");
    }
    
    /**
     * Constructor for ResearchModel 
     * @param name 
     */
    public ResearchModel(String name){
    
        this.researchName = name;
        this.research = "some food/mood research";
    }

    /**
     * gets the research name
     * @return the researchName
     */
    public String getResearchName() {
        return researchName;
    }

    /**
     * returns the research
     * @return the research
     */
    public String getResearch() {
        return research;
    }

    /**
     * sets the research
     * @param research the research to set
     */
    public void setResearch(String research) {
        this.research = research;
    } 
    
}
