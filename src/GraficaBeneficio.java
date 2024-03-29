import java.awt.BorderLayout;
import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;



public class GraficaBeneficio extends javax.swing.JFrame {
    private SistemaFinanciero sistemaFinanciero;
    
    
    public GraficaBeneficio() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nro de iteraciones");

        jLabel2.setText("Beneficio máximo");

        jLabel3.setText("Beneficio mínimo");

        jLabel4.setText("Beneficio esperado");

        jLabel5.setText("Desviación típica");

        jButton1.setText("Simular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 372, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 259, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 390, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 267, Short.MAX_VALUE)
        );

        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Ver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Ver triangular");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                                .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4))
                        .addContainerGap(37, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // Limpiar los campos de texto
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField3.setText("");
        jTextField4.setText("");

        // Limpiar las gráficas
        jPanel1.removeAll();
        jPanel2.removeAll();
        jPanel1.revalidate();
        jPanel1.repaint();
        jPanel2.revalidate();
        jPanel2.repaint();

        //Crear un nuevo objeto Sistema financiero
        sistemaFinanciero = new SistemaFinanciero();
        int numIteraciones = Integer.parseInt(jTextField1.getText());
        sistemaFinanciero.simular(numIteraciones);
        
        
        //Obtener los datos generados por Sistema Financiero
        double[] beneficios = sistemaFinanciero.getBeneficios();
        double[] beneIntervalo = sistemaFinanciero.getBeneIntervalo();
        int[] frecuencia = sistemaFinanciero.getFrecuencia();
        
        // Mostrar los resultados en los campos de texto
        jTextField2.setText(String.valueOf(sistemaFinanciero.getMaxBeneficio()));
        jTextField5.setText(String.valueOf(sistemaFinanciero.getMinBeneficio()));
        jTextField3.setText(String.valueOf(sistemaFinanciero.getMedia()));
        jTextField4.setText(String.valueOf(sistemaFinanciero.getDesviacion()));
        jTextField6.setText(String.valueOf(numIteraciones));
        
        //Crear grafico para benefios por Iteracion
        DefaultCategoryDataset datosBeneficios = new DefaultCategoryDataset();
        for (int i = 0; i < beneficios.length; i++) {
            datosBeneficios.addValue(beneficios[i], "Beneficio", "Iteración " + (i + 1));
        }
        JFreeChart graficoBeneficios = ChartFactory.createBarChart(
                "Beneficios por Iteración", "Iteración", "Beneficio",
                datosBeneficios, PlotOrientation.VERTICAL, true, true, false);
        
        // Crear gráfico para frecuencia de beneficios
        DefaultCategoryDataset datosFrecuencia = new DefaultCategoryDataset();
        for (int i = 0; i < frecuencia.length; i++) {
            datosFrecuencia.addValue(frecuencia[i], "Frecuencia", String.valueOf(beneIntervalo[i]));
        }
        JFreeChart graficoFrecuencia = ChartFactory.createBarChart(
                "Histograma de frecuencias", "Intervalo de Beneficios", "Frecuencia",
                datosFrecuencia, PlotOrientation.VERTICAL, true, true, false);
        
        // Mostrar gráficos en los paneles correspondientes
        mostrarGraficoEnPanel(graficoBeneficios, jPanel1);
        mostrarGraficoEnPanel(graficoFrecuencia, jPanel2);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        // Botón para abrir una nueva ventana con 8 JLabel y 8 JTextField
        NuevaVentana ventana = new NuevaVentana();
        ventana.setVisible(true);
        
        
        //Obtener los datos generados por Sistema Financiero
        double[] beneficios = sistemaFinanciero.getBeneficios();
        int indiceMin = sistemaFinanciero.getIndiceMin();
        
        //Obtener los datos adicionales necesarios
        double[] arrIngresos = sistemaFinanciero.getArrIngresos();
        double[] arrGastos = sistemaFinanciero.getArrGastos();
        double[] arrCostesVariables = sistemaFinanciero.getArrCostesVariables();
        double[] arrPrecio = sistemaFinanciero.getArrPrecio();
        double[] arrCostesFijos = sistemaFinanciero.getArrCostesFijos();
        double[] arrCosteUnitario = sistemaFinanciero.getArrCosteUnitario();
        double[] arrCantidadVendida = sistemaFinanciero.getArrCantidadVendida();
        
        //calculamos valores de beneficiominimo
        double precio = arrPrecio[indiceMin];
        double costesFijos = arrCostesFijos[indiceMin];
        double costeUnitario = arrCosteUnitario [indiceMin];
        double cantidadVendida = arrCantidadVendida[indiceMin];
        double ingresos = arrIngresos[indiceMin];
        double costesVariables = arrCostesVariables[indiceMin];
        double gastos = arrGastos[indiceMin];
        
        ventana.setPrecioText(String.valueOf(precio));
        ventana.setCostesFijosText(String.valueOf(costesFijos));
        ventana.setCosteUnitarioText(String.valueOf(costeUnitario));
        ventana.setCantidadVendidaText(String.valueOf(cantidadVendida));
        ventana.setIngresosText(String.valueOf(ingresos));
        ventana.setCostesVariablesText(String.valueOf(costesVariables));
        ventana.setGastosText(String.valueOf(gastos));
        ventana.setBeneficiosText(String.valueOf(sistemaFinanciero.getMinBeneficio()));

                
              
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         // Botón para abrir una nueva ventana con 8 JLabel y 8 JTextField
        NuevaVentana ventana2 = new NuevaVentana();
        ventana2.setVisible(true);
        
        //Obtener los datos generados por Sistema Financiero
        double[] beneficios = sistemaFinanciero.getBeneficios();
        int indiceMax = sistemaFinanciero.getIndiceMax();
        
        //Obtener los datos adicionales necesarios
        double[] arrIngresos = sistemaFinanciero.getArrIngresos();
        double[] arrGastos = sistemaFinanciero.getArrGastos();
        double[] arrCostesVariables = sistemaFinanciero.getArrCostesVariables();
        double[] arrPrecio = sistemaFinanciero.getArrPrecio();
        double[] arrCostesFijos = sistemaFinanciero.getArrCostesFijos();
        double[] arrCosteUnitario = sistemaFinanciero.getArrCosteUnitario();
        double[] arrCantidadVendida = sistemaFinanciero.getArrCantidadVendida();
        
        //calculamos valores de beneficiominimo
        double precio = arrPrecio[indiceMax];
        double costesFijos = arrCostesFijos[indiceMax];
        double costeUnitario = arrCosteUnitario [indiceMax];
        double cantidadVendida = arrCantidadVendida[indiceMax];
        double ingresos = arrIngresos[indiceMax];
        double costesVariables = arrCostesVariables[indiceMax];
        double gastos = arrGastos[indiceMax];
        
        ventana2.setPrecioText(String.valueOf(precio));
        ventana2.setCostesFijosText(String.valueOf(costesFijos));
        ventana2.setCosteUnitarioText(String.valueOf(costeUnitario));
        ventana2.setCantidadVendidaText(String.valueOf(cantidadVendida));
        ventana2.setIngresosText(String.valueOf(ingresos));
        ventana2.setCostesVariablesText(String.valueOf(costesVariables));
        ventana2.setGastosText(String.valueOf(gastos));
        ventana2.setBeneficiosText(String.valueOf(sistemaFinanciero.getMaxBeneficio()));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        double[] arrCosteUnitario = sistemaFinanciero.getArrCosteUnitario();
        double[] arrCantidadVendida = sistemaFinanciero.getArrCantidadVendida();
        
        TriangularDistribucion triangular = new TriangularDistribucion(arrCosteUnitario);
        triangular.pack();// Ajustar el tamaño de la ventana automáticamente
        triangular.setVisible(true);
        
        LogNormalDistribucion lognormal = new LogNormalDistribucion(arrCantidadVendida);
        lognormal.pack();
        lognormal.setVisible(true);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void mostrarGraficoEnPanel(JFreeChart chart, javax.swing.JPanel panel) {
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setMouseWheelEnabled(true);
        chartPanel.setPreferredSize(new Dimension(600, 450));
        panel.setLayout(new BorderLayout());
        panel.add(chartPanel, BorderLayout.CENTER);
        pack();
        repaint();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraficaBeneficio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraficaBeneficio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraficaBeneficio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraficaBeneficio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GraficaBeneficio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
