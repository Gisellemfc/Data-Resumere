package Vista;

import Controlador.PalabraClave;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class IngresoPalabrasClave extends javax.swing.JFrame {

    public IngresoPalabrasClave() {
        
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
        jLabel1 = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        btnRegistrarPalabra = new javax.swing.JButton();
        jLabelSeparador = new javax.swing.JLabel();
        txtPalabraNueva = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("INGRESAR PALABRA");
        setPreferredSize(new java.awt.Dimension(650, 250));
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

        jLabelAgregarPalabraClave.setBackground(new java.awt.Color(41, 47, 54));
        jLabelAgregarPalabraClave.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabelAgregarPalabraClave.setForeground(new java.awt.Color(41, 47, 54));
        jLabelAgregarPalabraClave.setText("AGREGAR PALABRA CLAVE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 10);
        jPanelSuperior.add(jLabelAgregarPalabraClave, gridBagConstraints);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoMASpequeñoNEGRO.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        jPanelSuperior.add(jLabel1, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(41, 47, 54));
        jPanelInferior.setLayout(new java.awt.GridBagLayout());

        jLabelTitulo.setBackground(new java.awt.Color(241, 139, 88));
        jLabelTitulo.setFont(new java.awt.Font("Rockwell", 1, 17)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(241, 139, 88));
        jLabelTitulo.setText("INGRESE LA NUEVA PALABRA CLAVE");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(11, 0, 0, 0);
        jPanelInferior.add(jLabelTitulo, gridBagConstraints);

        btnRegistrarPalabra.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrarPalabra.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnRegistrarPalabra.setForeground(new java.awt.Color(41, 47, 54));
        btnRegistrarPalabra.setText("REGISTRAR PALABRA");
        btnRegistrarPalabra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPalabraActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 59;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 42;
        gridBagConstraints.ipady = 19;
        gridBagConstraints.insets = new java.awt.Insets(17, 6, 14, 0);
        jPanelInferior.add(btnRegistrarPalabra, gridBagConstraints);

        jLabelSeparador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 44;
        jPanelInferior.add(jLabelSeparador, gridBagConstraints);

        txtPalabraNueva.setBackground(new java.awt.Color(204, 204, 204));
        txtPalabraNueva.setFont(new java.awt.Font("Rockwell", 2, 18)); // NOI18N
        txtPalabraNueva.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 50;
        gridBagConstraints.ipadx = 200;
        gridBagConstraints.ipady = 20;
        jPanelInferior.add(txtPalabraNueva, gridBagConstraints);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      
        //Si se da click al botón de volver
        this.dispose(); //Se cierra esta vista
        AgregarPalabraClave ventana = new AgregarPalabraClave();//Crear ventana
        ventana.setVisible(true);//Hacer visible ventana de Agregar Palabra Clave
       
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarPalabraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPalabraActionPerformed

        //Si el texto esta vacío
        if(txtPalabraNueva.getText().equalsIgnoreCase("")){ 
            
            //Mensaje de error
            JOptionPane.showMessageDialog(null, "Por favor, ingrese una palabra", "ERROR CAMPO VACÍO", JOptionPane.ERROR_MESSAGE);
            
        }else{ //Si no esta vacio
            
            //Guardo la palabra
            String palabra = txtPalabraNueva.getText();
            PalabraClave palabraClave = new PalabraClave(palabra);
            
            //Agrego la palabra clave a la tabla hash de palabras clave
            Panel.palabrasClave.agregarClave(palabraClave, false, true);
            

            //Cierro la ventana
            this.dispose();
            
        }
        
    }//GEN-LAST:event_btnRegistrarPalabraActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarPalabra;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelAgregarPalabraClave;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelSuperior;
    public javax.swing.JTextField txtPalabraNueva;
    // End of variables declaration//GEN-END:variables
}
