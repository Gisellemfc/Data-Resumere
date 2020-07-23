package Vista;

import Controlador.ArchivoTxt;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AgregarPalabraClave extends javax.swing.JFrame {

   
    public AgregarPalabraClave() {
        
        initComponents();
        this.setVisible(true); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/IconoVentana.png")).getImage()); //Poner icono a la ventana


    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelAgregarPalabraClave = new javax.swing.JLabel();
        jLabelLogo = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnIngresarPalabra = new javax.swing.JButton();
        jLabelSeparador = new javax.swing.JLabel();
        btnPalabraTxt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("AGREGAR PALABRA CLAVE");
        setPreferredSize(new java.awt.Dimension(650, 300));

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

        jLabelAgregarPalabraClave.setBackground(new java.awt.Color(41, 47, 54));
        jLabelAgregarPalabraClave.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelAgregarPalabraClave.setForeground(new java.awt.Color(41, 47, 54));
        jLabelAgregarPalabraClave.setText("AGREGAR PALABRA CLAVE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 10);
        jPanelSuperior.add(jLabelAgregarPalabraClave, gridBagConstraints);

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoMASpequeñoNEGRO.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanelSuperior.add(jLabelLogo, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(41, 47, 54));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelTitulo.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo.setText("¿CÓMO DESEA INGRESAR LA(S) PALABRA(S)?");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo, gridBagConstraints);

        btnIngresarPalabra.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresarPalabra.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnIngresarPalabra.setForeground(new java.awt.Color(41, 47, 54));
        btnIngresarPalabra.setText("INGRESAR PALABRA");
        btnIngresarPalabra.setPreferredSize(new java.awt.Dimension(400, 30));
        btnIngresarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarPalabraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 59;
        gridBagConstraints.ipadx = 49;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 14, 0);
        jPanelInferior.add(btnIngresarPalabra, gridBagConstraints);

        jLabelSeparador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 11, 0);
        jPanelInferior.add(jLabelSeparador, gridBagConstraints);

        btnPalabraTxt.setBackground(new java.awt.Color(255, 255, 255));
        btnPalabraTxt.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnPalabraTxt.setForeground(new java.awt.Color(41, 47, 54));
        btnPalabraTxt.setText("CARGAR ARCHIVO TXT CON PALABRAS");
        btnPalabraTxt.setPreferredSize(new java.awt.Dimension(400, 30));
        btnPalabraTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalabraTxtActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 49;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 19;
        jPanelInferior.add(btnPalabraTxt, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      
        //Si se da click al botón de volver
        this.dispose(); //Se cierra esta vista
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnIngresarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarPalabraActionPerformed

        IngresoPalabrasClave ventana = new  IngresoPalabrasClave();//Crear ventana
        this.dispose(); //Se cierra esta vista
        ventana.setVisible(true);//Hacer visible ventana de Agregar Palabra Clave
       
        
    }//GEN-LAST:event_btnIngresarPalabraActionPerformed

    private void btnPalabraTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalabraTxtActionPerformed
        
        JOptionPane.showMessageDialog(null, "¡ATENCIÓN! \nIngrese un archivo de texto con el formato: \n'PalabraClave1','PalabraClave2',...,'PalabraClaveN'\nPor el contrario podria guardarse información incompleta u ocurrir un error.", "ALERTA FORMATO PALABRAS CLAVE", JOptionPane.INFORMATION_MESSAGE);
        
        //Se crea un objeto de tipo archivo txt
        ArchivoTxt palabras = new ArchivoTxt();
        
        //Se agrega el resumen
        palabras.abrirArchivo(evt, this, Panel.palabrasClave, false);
        
        this.dispose();
        
    }//GEN-LAST:event_btnPalabraTxtActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresarPalabra;
    private javax.swing.JButton btnPalabraTxt;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabelAgregarPalabraClave;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    // End of variables declaration//GEN-END:variables
}
