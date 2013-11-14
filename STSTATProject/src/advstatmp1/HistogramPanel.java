/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advstatmp1;

/**
 *
 * @author Louis
 */

import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class HistogramPanel extends JPanel{
    
    XYSeries series = new XYSeries("Dataset");
    XYSeriesCollection dataset = new XYSeriesCollection();
    
    public HistogramPanel(int n, ArrayList<Double> h, int nRange, String xLabel, String yLabel){
        
        
        for(int i = n; i <= nRange; i++){
            series.add(i, h.get(i-n));
        }
        
        dataset.addSeries(series);
        
        JFreeChart chart = ChartFactory.createHistogram("Hypergeometric Distribution", xLabel, yLabel, dataset, PlotOrientation.VERTICAL, false, true, false);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(500, 250));
        add(chartPanel);
    }
}
