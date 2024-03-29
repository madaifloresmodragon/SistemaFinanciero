import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.statistics.HistogramDataset;

import javax.swing.*;
import org.jfree.chart.plot.PlotOrientation;

public class LogNormalDistribucion extends JFrame {
    private double[] arrCantidadVendida;
    public LogNormalDistribucion(double[] arrCantidadVendida){
        this.arrCantidadVendida = arrCantidadVendida;
        JFreeChart chart = createChart();
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800,600));
        setContentPane(chartPanel);
    }
    private JFreeChart createChart() {
    HistogramDataset dataset = new HistogramDataset();
    dataset.addSeries("Histograma", arrCantidadVendida, 100); // Crear histograma con 10 intervalos

    JFreeChart chart = ChartFactory.createHistogram(
            "Distribución Lognormal", // Título del gráfico
            "Valor", // Etiqueta del eje x
            "Frecuencia", // Etiqueta del eje y
            dataset, // Dataset con los datos
            PlotOrientation.VERTICAL, // Orientación del gráfico
            true, // Incluir leyenda
            true, // Incluir tooltips
            false); // Incluir URLs

    return chart;
    
    }
}