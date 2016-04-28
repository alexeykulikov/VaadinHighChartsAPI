/*
 * Copyright (c) 2015 by Manfred Huber.
 */

package at.downdrown.vaadinaddons.highchartsapi.model.plotoptions;

import at.downdrown.vaadinaddons.highchartsapi.model.ChartType;

public class ColumnChartPlotOptions extends HighChartsPlotOptionsImpl {
    private int threshold;

    public ColumnChartPlotOptions() {
        chartType = ChartType.COLUMN;
    }

    @Override
    public void preparePlotOptions(StringBuilder builder) {
        super.preparePlotOptions(builder);
        builder.append(", threshold: " + threshold);
    }

    public int getThreshold() {
        return threshold;
    }

    public void setThreshold(int threshold) {
        this.threshold = threshold;
    }
}