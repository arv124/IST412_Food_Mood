/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fmcorellationchartcontroller;

import fmcorrelationchartmodel.FMCorrelationChart;
import java.util.ArrayList;

/**
 *
 * @author Nate
 */
public class FMCorrelationChartController {

    ArrayList<FMCorrelationChart> charts;
    /**
     * Default constructor for FMCorrelationChartController
     */
    public FMCorrelationChartController() {
        charts = new ArrayList<>();
    }

    /**
     * adds new chart to list of available charts
     *
     * @param chart chart to be added to the list
     */
    public void addNewChart(fmcorrelationchartmodel.FMCorrelationChart chart) {
        charts.add(chart);
    }

    /**
     * removes specific chart from the list
     *
     * @param index specified chart to be removed
     */
    public void removeChart(int index) {
        charts.remove(index);
    }

}
