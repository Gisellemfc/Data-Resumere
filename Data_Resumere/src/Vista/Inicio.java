package Vista;

import Controlador.ArchivoTxt;
import static Vista.Panel.palabrasClave;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Inicio extends javax.swing.JFrame {

    //Atributo estatico para poder referirnos a él entre varias clases
    public static Panel ventanaPanel;
    
    public Inicio(Panel ventanaPanel) {
        
        initComponents(); //Inicializar componentes
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/IconoVentana.png")).getImage()); //Poner icono a la ventana

        this.ventanaPanel = ventanaPanel; //Se establece el panel
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanelEncabezado = new javax.swing.JPanel();
        jLabelLOGO = new javax.swing.JLabel();
        jPanelInferior = new javax.swing.JPanel();
        jPanelInferiorSuperior = new javax.swing.JPanel();
        jLabelSeparador1 = new javax.swing.JLabel();
        jLabelBienvenida = new javax.swing.JLabel();
        jLabelFrase = new javax.swing.JLabel();
        jLabelSeparador2 = new javax.swing.JLabel();
        jPanelInferiorInferior = new javax.swing.JPanel();
        jLabelCarpetas = new javax.swing.JLabel();
        btnEntrarAlPanel = new javax.swing.JButton();
        jLabelFlecha1 = new javax.swing.JLabel();
        jLabelFlecha2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATARESUMERE");
        setPreferredSize(new java.awt.Dimension(650, 650));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelEncabezado.setBackground(new java.awt.Color(41, 47, 54));
        jPanelEncabezado.setMinimumSize(new java.awt.Dimension(400, 170));
        jPanelEncabezado.setPreferredSize(new java.awt.Dimension(500, 130));
        jPanelEncabezado.setLayout(new java.awt.GridBagLayout());

        jLabelLOGO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logo.png"))); // NOI18N
        jPanelEncabezado.add(jLabelLOGO, new java.awt.GridBagConstraints());

        getContentPane().add(jPanelEncabezado, java.awt.BorderLayout.PAGE_START);

        jPanelInferior.setBackground(new java.awt.Color(41, 47, 54));
        jPanelInferior.setPreferredSize(new java.awt.Dimension(400, 300));
        jPanelInferior.setLayout(new java.awt.BorderLayout());

        jPanelInferiorSuperior.setBackground(new java.awt.Color(41, 47, 54));
        jPanelInferiorSuperior.setPreferredSize(new java.awt.Dimension(400, 140));
        jPanelInferiorSuperior.setLayout(new java.awt.GridBagLayout());

        jLabelSeparador1.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador1.setText("_____________________________________________________________________");
        jPanelInferiorSuperior.add(jLabelSeparador1, new java.awt.GridBagConstraints());

        jLabelBienvenida.setBackground(new java.awt.Color(241, 139, 88));
        jLabelBienvenida.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 40)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(241, 139, 88));
        jLabelBienvenida.setText("¡Bienvenido a DATARESUMERE!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        jPanelInferiorSuperior.add(jLabelBienvenida, gridBagConstraints);

        jLabelFrase.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 2, 26)); // NOI18N
        jLabelFrase.setForeground(new java.awt.Color(255, 255, 255));
        jLabelFrase.setText("¡EVALÚE Y ANALICE SUS RESÚMENES EN 1 CLICK!");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 0, 0);
        jPanelInferiorSuperior.add(jLabelFrase, gridBagConstraints);

        jLabelSeparador2.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador2.setText("________________________________________________________________________________________");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        jPanelInferiorSuperior.add(jLabelSeparador2, gridBagConstraints);

        jPanelInferior.add(jPanelInferiorSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelInferiorInferior.setBackground(new java.awt.Color(41, 47, 54));
        jPanelInferiorInferior.setPreferredSize(new java.awt.Dimension(400, 250));
        jPanelInferiorInferior.setLayout(new java.awt.GridBagLayout());

        jLabelCarpetas.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        jLabelCarpetas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ImagenCarpetas.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 33;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        jPanelInferiorInferior.add(jLabelCarpetas, gridBagConstraints);

        btnEntrarAlPanel.setBackground(new java.awt.Color(41, 47, 54));
        btnEntrarAlPanel.setFont(new java.awt.Font("Rockwell", 3, 24)); // NOI18N
        btnEntrarAlPanel.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrarAlPanel.setText("ENTRAR");
        btnEntrarAlPanel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnEntrarAlPanel.setPreferredSize(new java.awt.Dimension(100, 50));
        btnEntrarAlPanel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarAlPanelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.ipadx = 53;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(66, 0, 0, 7);
        jPanelInferiorInferior.add(btnEntrarAlPanel, gridBagConstraints);

        jLabelFlecha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechadere.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 45);
        jPanelInferiorInferior.add(jLabelFlecha1, gridBagConstraints);

        jLabelFlecha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flechaizq.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 34;
        jPanelInferiorInferior.add(jLabelFlecha2, gridBagConstraints);

        jPanelInferior.add(jPanelInferiorInferior, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanelInferior, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarAlPanelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarAlPanelActionPerformed
        
        int n = JOptionPane.showConfirmDialog(
            null,
            "¿Quieres recuperar la información de la ultima sesión?",
            "AVISO RECUPERACIÓN DE SESIÓN",
            JOptionPane.YES_NO_OPTION);

        if(n == JOptionPane.YES_OPTION){
            
            ArchivoTxt txt = new ArchivoTxt();
            txt.recuperarResumenes();
            txt.recuperarPalabrasClaves();
            
        }
        
        this.setVisible(false);//Colocar ventana de inicio invisible
        ventanaPanel.setVisible(true);//Ventana de panel visible
       
    }//GEN-LAST:event_btnEntrarAlPanelActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        ArchivoTxt txt = new ArchivoTxt();
        txt.actualizarArchivoPalabrasClaves(palabrasClave);
        
    }//GEN-LAST:event_formWindowClosing

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrarAlPanel;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelCarpetas;
    private javax.swing.JLabel jLabelFlecha1;
    private javax.swing.JLabel jLabelFlecha2;
    private javax.swing.JLabel jLabelFrase;
    private javax.swing.JLabel jLabelLOGO;
    private javax.swing.JLabel jLabelSeparador1;
    private javax.swing.JLabel jLabelSeparador2;
    private javax.swing.JPanel jPanelEncabezado;
    private javax.swing.JPanel jPanelInferior;
    private javax.swing.JPanel jPanelInferiorInferior;
    private javax.swing.JPanel jPanelInferiorSuperior;
    // End of variables declaration//GEN-END:variables
}
