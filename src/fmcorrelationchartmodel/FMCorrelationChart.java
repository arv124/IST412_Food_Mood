/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fmcorrelationchartmodel;

/**
 *
 * @author Nate
 */
public class FMCorrelationChart {

    private final String chartName;
    private final String chartFood;
    private final String chartMood;
    private String chartDate;

    /**
     * This is the default constructor for FMCorrelationChart
     *
     * @param name name associated with the chart
     * @param date date of the correlation to be charted
     * @param food food item in the correlation
     * @param mood mood item in the correlation
     */
    public FMCorrelationChart(String name, String date, String food, String mood) {
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
