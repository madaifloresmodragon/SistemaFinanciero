import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;
public class TriangularDistribucion extends JFrame  {
    private double[] arrCosteUnitario;
    public TriangularDistribucion(double[] arrCosteUnitario){
        this.arrCosteUnitario = arrCosteUnitario;
        JFreeChart chart = createChart();
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(800,600));
        setContentPane(chartPanel);
    }
    private JFreeChart createChart() {
        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;
        double mode = 0;

        // Obtener valores mínimos, máximos y moda
        for (double valor : arrCosteUnitario) {
            if (valor < min) {
                min = valor;
            }
            if (valor > max) {
                max = valor;
            }
            mode += valor;
        }
        mode /= arrCosteUnitario.length;

        double height = 2.0 / (max - min); // Calcula la altura del triángulo

        XYSeries series = new XYSeries("Distribución Triangular");
        series.add(min, 0);
        series.add(mode, height);
        series.add(max, 0);

        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);

        // Crear el gráfico XY
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Distribución Triangular", // Título del gráfico
                "Valor", // Etiqueta del eje x
                "Densidad de probabilidad", // Etiqueta del eje y
                dataset); // Dataset con los datos

        return chart;
    }
}
