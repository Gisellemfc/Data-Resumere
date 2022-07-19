package Vista;

import Controlador.ArchivoTxt;
import Controlador.TablaHash;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class Panel extends javax.swing.JFrame {
    
    //Atributos de las tablas hash del panel
    public static TablaHash resumenes;
    public static TablaHash palabrasClave;
    public static ArrayList<String> archivero;
    public static ArrayList<String> palabrero;
        
    public Panel(TablaHash resumenes, TablaHash palabrasClave, ArrayList<String> archivero, ArrayList<String> palabrero){
        
        initComponents();
        this.setVisible(false); //Se hace visible la ventana
        this.setLocationRelativeTo(null); //Centrar ventana
        this.setIconImage(new ImageIcon(getClass().getResource("../Imagenes/IconoVentana.png")).getImage()); //Poner icono a la ventana

        //Se establecen las tablas hash pasadas por parámetros
        this.resumenes = resumenes;
        this.palabrasClave = palabrasClave;
        this.archivero = archivero;
        this.palabrero = palabrero;

        jTextArea.setLineWrap(true);
        jTextArea.setWrapStyleWord(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel2 = new javax.swing.JLabel();
        jPanelSuperior = new javax.swing.JPanel();
        btnVolver = new javax.swing.JButton();
        jLabelPanelDeTrabajo = new javax.swing.JLabel();
        jLabelLogoPequeño = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();
        jPanelIzquierdo = new javax.swing.JPanel();
        jLabelFunciones = new javax.swing.JLabel();
        jLabelDisponibles = new javax.swing.JLabel();
        btnAgregarResumen = new javax.swing.JButton();
        btnAgregarPalabraClave = new javax.swing.JButton();
        btnBuscarInvestigacion = new javax.swing.JButton();
        btnAnalizarResumen = new javax.swing.JButton();
        jLabelSeparador = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea = new javax.swing.JTextArea();

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LogoPequeño.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PANEL DE ANÁLISIS");
        setMinimumSize(new java.awt.Dimension(1200, 600));
        setPreferredSize(new java.awt.Dimension(1150, 650));
        setSize(new java.awt.Dimension(1200, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanelSuperior.setBackground(new java.awt.Color(241, 139, 88));
        jPanelSuperior.setPreferredSize(new java.awt.Dimension(1200, 50));
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
        gridBagConstraints.ipadx = 26;
        gridBagConstraints.ipady = 10;
        jPanelSuperior.add(btnVolver, gridBagConstraints);

        jLabelPanelDeTrabajo.setBackground(new java.awt.Color(41, 47, 54));
        jLabelPanelDeTrabajo.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 24)); // NOI18N
        jLabelPanelDeTrabajo.setForeground(new java.awt.Color(41, 47, 54));
        jLabelPanelDeTrabajo.setText("PANEL DE ANÁLISIS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 16;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 215, 0, 215);
        jPanelSuperior.add(jLabelPanelDeTrabajo, gridBagConstraints);

        jLabelLogoPequeño.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoMASpequeñoNEGRO.png"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 17;
        gridBagConstraints.gridy = 0;
        jPanelSuperior.add(jLabelLogoPequeño, gridBagConstraints);

        jButtonSalir.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(41, 47, 54));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setBorder(null);
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 36;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 32, 0, 32);
        jPanelSuperior.add(jButtonSalir, gridBagConstraints);

        getContentPane().add(jPanelSuperior, java.awt.BorderLayout.PAGE_START);

        jPanelIzquierdo.setBackground(new java.awt.Color(41, 47, 54));
        jPanelIzquierdo.setPreferredSize(new java.awt.Dimension(400, 500));
        jPanelIzquierdo.setLayout(new java.awt.GridBagLayout());

        jLabelFunciones.setBackground(new java.awt.Color(241, 139, 88));
        jLabelFunciones.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 57)); // NOI18N
        jLabelFunciones.setForeground(new java.awt.Color(241, 139, 88));
        jLabelFunciones.setText("FUNCIONES");
        jPanelIzquierdo.add(jLabelFunciones, new java.awt.GridBagConstraints());

        jLabelDisponibles.setBackground(new java.awt.Color(241, 139, 88));
        jLabelDisponibles.setFont(new java.awt.Font("Franklin Gothic Medium", 1, 57)); // NOI18N
        jLabelDisponibles.setForeground(new java.awt.Color(241, 139, 88));
        jLabelDisponibles.setText("DISPONIBLES");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        jPanelIzquierdo.add(jLabelDisponibles, gridBagConstraints);

        btnAgregarResumen.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarResumen.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnAgregarResumen.setForeground(new java.awt.Color(41, 47, 54));
        btnAgregarResumen.setText("AGREGAR RESUMEN");
        btnAgregarResumen.setBorder(null);
        btnAgregarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarResumenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 40;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(14, 2, 14, 2);
        jPanelIzquierdo.add(btnAgregarResumen, gridBagConstraints);

        btnAgregarPalabraClave.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarPalabraClave.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnAgregarPalabraClave.setForeground(new java.awt.Color(41, 47, 54));
        btnAgregarPalabraClave.setText("AGREGAR PALABRA CLAVE");
        btnAgregarPalabraClave.setBorder(null);
        btnAgregarPalabraClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPalabraClaveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 45;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(14, 2, 14, 2);
        jPanelIzquierdo.add(btnAgregarPalabraClave, gridBagConstraints);

        btnBuscarInvestigacion.setBackground(new java.awt.Color(255, 255, 255));
        btnBuscarInvestigacion.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnBuscarInvestigacion.setForeground(new java.awt.Color(41, 47, 54));
        btnBuscarInvestigacion.setText("BUSCAR INVESTIGACIÓN");
        btnBuscarInvestigacion.setBorder(null);
        btnBuscarInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInvestigacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 53;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(14, 2, 14, 2);
        jPanelIzquierdo.add(btnBuscarInvestigacion, gridBagConstraints);

        btnAnalizarResumen.setBackground(new java.awt.Color(255, 255, 255));
        btnAnalizarResumen.setFont(new java.awt.Font("Rockwell", 1, 20)); // NOI18N
        btnAnalizarResumen.setForeground(new java.awt.Color(41, 47, 54));
        btnAnalizarResumen.setText("ANALIZAR RESUMEN");
        btnAnalizarResumen.setBorder(null);
        btnAnalizarResumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalizarResumenActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 58;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(14, 2, 14, 2);
        jPanelIzquierdo.add(btnAnalizarResumen, gridBagConstraints);

        jLabelSeparador.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSeparador.setText("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 34;
        jPanelIzquierdo.add(jLabelSeparador, gridBagConstraints);

        getContentPane().add(jPanelIzquierdo, java.awt.BorderLayout.LINE_START);

        jTextArea.setEditable(false);
        jTextArea.setColumns(1);
        jTextArea.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 0, 18)); // NOI18N
        jTextArea.setRows(10);
        jTextArea.setBorder(null);
        jScrollPane1.setViewportView(jTextArea);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
     
    Inicio inicio = new Inicio(this);//Crear ventana de inicio
    this.setVisible(false);//Quitar la ventana de panel
    inicio.setVisible(true);//Hacer visible ventana de inicio
        
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarPalabraClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPalabraClaveActionPerformed
    
        AgregarPalabraClave ventana = new AgregarPalabraClave();//Crear ventana
        ventana.setVisible(true);//Hacer visible ventana de Agregar Palabra Clave
       
    }//GEN-LAST:event_btnAgregarPalabraClaveActionPerformed

    private void btnAgregarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarResumenActionPerformed

        //Se crea un objeto de tipo archivo txt
        ArchivoTxt resumen = new ArchivoTxt();
        
        //Se agrega el resumen
        resumen.abrirArchivo(evt, this, resumenes, true);
    
    }//GEN-LAST:event_btnAgregarResumenActionPerformed

    private void btnAnalizarResumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalizarResumenActionPerformed
       
       AnalizarResumen analizarVentana=new  AnalizarResumen ();//Crear ventana
       analizarVentana.setVisible(true);//Hacer visible ventana de analizar resumen
       
    }//GEN-LAST:event_btnAnalizarResumenActionPerformed

    private void btnBuscarInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInvestigacionActionPerformed
     
        BuscarInvestigacion ventanaBuscar = new  BuscarInvestigacion();//Creación de ventana
        ventanaBuscar.setVisible(true);//Hacer visible ventana de buscar investigación
        
    }//GEN-LAST:event_btnBuscarInvestigacionActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
        ArchivoTxt txt = new ArchivoTxt();
        txt.actualizarArchivoPalabrasClaves(palabrasClave);
        
    }//GEN-LAST:event_formWindowClosing

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
         
        ArchivoTxt txt = new ArchivoTxt();
        txt.actualizarArchivoPalabrasClaves(palabrasClave);
        
        System.exit(0);//Salir del programa
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarPalabraClave;
    private javax.swing.JButton btnAgregarResumen;
    private javax.swing.JButton btnAnalizarResumen;
    private javax.swing.JButton btnBuscarInvestigacion;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelDisponibles;
    private javax.swing.JLabel jLabelFunciones;
    private javax.swing.JLabel jLabelLogoPequeño;
    private javax.swing.JLabel jLabelPanelDeTrabajo;
    private javax.swing.JLabel jLabelSeparador;
    private javax.swing.JPanel jPanelIzquierdo;
    private javax.swing.JPanel jPanelSuperior;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextArea jTextArea;
    // End of variables declaration//GEN-END:variables

}
