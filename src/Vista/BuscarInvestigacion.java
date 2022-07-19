package Vista;

import Controlador.Resumen;
import Controlador.PalabraClave;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;

public class BuscarInvestigacion extends javax.swing.JFrame {

   
    public BuscarInvestigacion() {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/IconoVentana.png")).getImage()); //Poner icono a la ventana
        Collections.sort(Panel.palabrero);
    
        for(int i = 0; i < Panel.palabrero.size(); i++){
            
            jComboBoxPalabrasClave.addItem(Panel.palabrero.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelBuscarInvestigacion = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelTitulo1 = new javax.swing.JLabel();
        btnVerResumenes = new javax.swing.JButton();
        jLabelSeparador1 = new javax.swing.JLabel();
        jLabelTitulo2 = new javax.swing.JLabel();
        jComboBoxPalabrasClave = new javax.swing.JComboBox<>();
        jLabelTitulo3 = new javax.swing.JLabel();
        jLabelTitulo4 = new javax.swing.JLabel();
        jLabelSeparador2 = new javax.swing.JLabel();
        jComboBoxResumenesDondeSalePalabra = new javax.swing.JComboBox<>();
        jButtonAnalizarResumen = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BUSCAR INVASTIGACIÓN");
        setPreferredSize(new java.awt.Dimension(750, 550));
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

        jLabelBuscarInvestigacion.setBackground(new java.awt.Color(41, 47, 54));
        jLabelBuscarInvestigacion.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelBuscarInvestigacion.setForeground(new java.awt.Color(41, 47, 54));
        jLabelBuscarInvestigacion.setText("BUSCAR INVESTIGACIÓN");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 10);
        jPanelSuperior.add(jLabelBuscarInvestigacion, gridBagConstraints);

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
        jLabelTitulo1.setText("Seleccione palabra clave");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo1, gridBagConstraints);

        btnVerResumenes.setBackground(new java.awt.Color(255, 255, 255));
        btnVerResumenes.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnVerResumenes.setForeground(new java.awt.Color(41, 47, 54));
        btnVerResumenes.setText("BUSCAR RESÚMENES");
        btnVerResumenes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerResumenesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 59;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 14, 0);
        jPanelInferior.add(btnVerResumenes, gridBagConstraints);

        jLabelSeparador1.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSeparador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador1.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        jPanelInferior.add(jLabelSeparador1, gridBagConstraints);

        jLabelTitulo2.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo2.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo2.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo2.setText("para buscar investigaciones guardadas en los que ésta aparece");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        jPanelInferior.add(jLabelTitulo2, gridBagConstraints);

        jComboBoxPalabrasClave.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jComboBoxPalabrasClave, gridBagConstraints);

        jLabelTitulo3.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo3.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo3.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo3.setText("A continuación se vizualizan los resumenes en los que aparece la palabra clave,");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 61;
        gridBagConstraints.insets = new java.awt.Insets(30, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo3, gridBagConstraints);

        jLabelTitulo4.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo4.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo4.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo4.setText("seleccione cuál desea analizar");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 62;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo4, gridBagConstraints);

        jLabelSeparador2.setBackground(new java.awt.Color(255, 255, 255));
        jLabelSeparador2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador2.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 60;
        jPanelInferior.add(jLabelSeparador2, gridBagConstraints);

        jComboBoxResumenesDondeSalePalabra.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 18)); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 63;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferior.add(jComboBoxResumenesDondeSalePalabra, gridBagConstraints);

        jButtonAnalizarResumen.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAnalizarResumen.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButtonAnalizarResumen.setForeground(new java.awt.Color(41, 47, 54));
        jButtonAnalizarResumen.setText("VISUALIZAR RESUMEN");
        jButtonAnalizarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnalizarResumenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 64;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 14, 0);
        jPanelInferior.add(jButtonAnalizarResumen, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      
        //Si se da click al botón de volver
        this.dispose(); //Se cierra esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnVerResumenesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerResumenesActionPerformed

        //Se guarda la palabra seleccionada
        String palabra = (String) jComboBoxPalabrasClave.getSelectedItem();
        
        //Se busca la palabra en la tabla
        PalabraClave escogido = (PalabraClave) Panel.palabrasClave.buscarValor(palabra, false);
        
        ArrayList<String> archivos = Panel.resumenes.buscarInvestigacion(escogido);
        
        Collections.sort(archivos);
        
        jComboBoxResumenesDondeSalePalabra.removeAllItems();
    
        for(int i = 0; i < archivos.size(); i++){
            
            jComboBoxResumenesDondeSalePalabra.addItem(archivos.get(i));
        }
        
    }//GEN-LAST:event_btnVerResumenesActionPerformed

    private void jButtonAnalizarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnalizarResumenActionPerformed
        
        String resumenSelec = (String) jComboBoxResumenesDondeSalePalabra.getSelectedItem();
        
        Resumen seleccionado = (Resumen) Panel.resumenes.buscarValor(resumenSelec, true);
        
        String texto = "Titulo:\n" + seleccionado.getTitulo() + "\n\nAutores:\n" + seleccionado.getAutores() + "\nResumen:\n\n" + seleccionado.getResumen();
        
        Panel.jTextArea.setText(texto);
        
        this.dispose();
        
    }//GEN-LAST:event_jButtonAnalizarResumenActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerResumenes;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButtonAnalizarResumen;
    private javax.swing.JComboBox<String> jComboBoxPalabrasClave;
    private javax.swing.JComboBox<String> jComboBoxResumenesDondeSalePalabra;
    private javax.swing.JLabel jLabelBuscarInvestigacion;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSeparador1;
    private javax.swing.JLabel jLabelSeparador2;
    private javax.swing.JLabel jLabelTitulo1;
    private javax.swing.JLabel jLabelTitulo2;
    private javax.swing.JLabel jLabelTitulo3;
    private javax.swing.JLabel jLabelTitulo4;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
