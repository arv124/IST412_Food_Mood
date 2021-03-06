/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chartmodel;


/**
 *
 * @author Nate
 */
public class ChartModel {

    private String chartName;
    private String chartFood;
    private String chartMood;
    private String chartDate;
    
    /**
     * This is the default constructor for ChartModel
     */
    public ChartModel(){
        System.out.println("ChartModel Instantiated");
    }

    /**
     * This is the constructor for ChartModel
     *
     * @param name name associated with the chart
     * @param date date of the correlation to be charted
     * @param food food item in the correlation
     * @param mood mood item in the correlation
     */
    public ChartModel(String name, String date, String food, String mood) {
        this.chartName = name;
        this.chartDate = date;
        this.chartFood = food;
        this.chartMood = mood;
    }

    /**
     * @return the chartName
     */
    public String getChartName() {
        return chartName;
    }

    /**
     * @return the chartFood
     */
    public String getChartFood() {
        return chartFood;
    }

    /**
     * @return the chartMood
     */
    public String getChartMood() {
        return chartMood;
    }

    /**
     * @return the chartDate
     */
    public String getChartDate() {
        return chartDate;
    }

}
