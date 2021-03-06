/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodmodel;

import java.util.Date;

/**
 *
 * @author nadaziab
 */
public class MoodModel {
    
    private String description;
    private Date recordedAt;
    
    /**
     * The default constructor for the Mood class
     */
    public MoodModel() {
        System.out.println("MoodModel instantiated");
    }
    
    /**
     * The constructor for the Mood Class with the description
     * @param description the description of the mood
     */
    public MoodModel(String description, Date recordedAt) {
        this.description = description;
        this.recordedAt = recordedAt;
    }
    
    /**
     * Get the description of the mood
     * @return the description of the mood
     */
    public String getDescription() {
        return this.description;
    }
    
    /**
     * Set the description of the mood
     * @param description the description of the mood
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Get when the mood was recorded
     * @return when the mood was recorded
     */
    public Date getRecordedAt() {
        return recordedAt;
    }
    
    /**
     * Set when the mood was recorded
     * @param recordedAt when the mood was recorded
     */
    public void setRecordedAt(Date recordedAt) {
        this.recordedAt = recordedAt;
    }
    /**
     * Get the information at index
     * @param index index of retrieval
     * @return information at the index
     */
    public String getInfo(String index) {
        return description + " " + recordedAt;
    }
}
