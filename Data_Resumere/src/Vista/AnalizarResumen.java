package Vista;

import Controlador.Resumen;
import java.util.Collections;
import javax.swing.ImageIcon;


public class AnalizarResumen extends javax.swing.JFrame {

   
    public AnalizarResumen() {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/IconoVentana.png")).getImage()); //Poner icono a la ventana
        Collections.sort(Panel.archivero);
        
        for(int i = 0; i < Panel.archivero.size(); i++){
            
            jComboBoxResumenes.addItem(Panel.archivero.get(i));
        }
    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelAnalizarResumen = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        btnAnalizarResumen = new javax.swing.JButton();
        jLabelSeparador = new javax.swing.JLabel();
        jComboBoxResumenes = new javax.swing.JComboBox<>();
        jLabelTitulo2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ANALIZAR RESUMEN");
        setPreferredSize(new java.awt.Dimension(700, 300));
        setSize(new java.awt.Dimension(650, 350));

        jPanelSuperior.setBackground(new java.awt.Color(241, 139, 88));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanelSuperior.setLayout(new java.awt.GridBagLayout());

        btnVolver.setBackground(new java.awt.Color(255, 255, 255));
        btnVolver.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(41, 47, 54));
        btnVolver.setText("VOLVER");
        btnVolver.setBorder(null);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 10;
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelAnalizarResumen.setBackground(new java.awt.Color(41, 47, 54));
        jLabelAnalizarResumen.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelAnalizarResumen.setForeground(new java.awt.Color(41, 47, 54));
        jLabelAnalizarResumen.setText("ANALIZAR RESUMEN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 10);
        jPanelSuperior.add(jLabelAnalizarResumen, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoMASpequeñoNEGRO.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanelSuperior.add(jLabelLogo, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(41, 47, 54));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelTitulo1.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo1.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo1.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo1.setText("A continuación aparece la lista de las investigaciones guardadas,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo1, gridBagConstraints);

        btnAnalizarResumen.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalizarResumen.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnAnalizarResumen.setForeground(new java.awt.Color(41, 47, 54));
        btnAnalizarResumen.setText("ANALIZAR RESUMEN");
        btnAnalizarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarResumenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 59;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 14, 0);
        jPanelInferior.add(btnAnalizarResumen, gridBagConstraints);

        jLabelSeparador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        jPanelInferior.add(jLabelSeparador, gridBagConstraints);

        jComboBoxResumenes.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jComboBoxResumenes, gridBagConstraints);

        jLabelTitulo2.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo2.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo2.setText("seleccione la que desee analizar:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo2, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      
        //Si se da click al botón de volver
        this.dispose(); //Se cierra esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAnalizarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarResumenActionPerformed

        //Se guarda el titulo del resumen seleccionado
        String resumen = (String) jComboBoxResumenes.getSelectedItem();
        
        //Se busca el resumen en la tabla
        Resumen escogido = (Resumen) Panel.resumenes.buscarValor(resumen, true);
        
        String resultado = "Titulo:\n" + escogido.getTitulo() + "\n\nAutores:\n" + escogido.getAutores() + "\n\n";
        
        //Código para saber el tiempo de ejecusión de un método
        long tiempoInicio = System.nanoTime();
        
        //Se analiza y se escribe el resultado
        resultado += Panel.palabrasClave.analizarResumen(escogido);
        
        long tiempoTermina = System.nanoTime()- tiempoInicio; // tiempo en que se ejecuta el método
        
        resultado += "\nNúmero de palabras del resumen: " + escogido.getSize() + "\n\nTiempo empleado en el análisis: " + tiempoTermina + " Nanosegundos";
        
        Panel.jTextArea.setText(resultado);
        
        this.setVisible(false);
    }//GEN-LAST:event_btnAnalizarResumenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalizarResumen;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> jComboBoxResumenes;
    private javax.swing.JLabel jLabelAnalizarResumen;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
