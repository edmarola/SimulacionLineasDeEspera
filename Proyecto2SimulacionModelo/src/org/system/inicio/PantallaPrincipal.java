/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.system.inicio;

import java.awt.Color;
import java.awt.Toolkit;
import org.timer.temporizador.SystemTimer;

/*                    
   
 */

/*
    Interfaz de inicio donde se muestra la tabla con los datos recolectados (patrón de llegada y
    patrón de servicio)
 */

public class PantallaPrincipal extends javax.swing.JFrame {
    
    //Atributo de la clase
    private SystemTimer systemTimer = null;
    public static int cantidadDeCorridas = 0;
    public static double tiempoPromedioLlegadaSIMULACION = 0;
    public static double tiempoPromedioServicioSIMULACION = 0;
    public static double tiempoOcioServidorSIMULACION = 0;
    public static double tiempoUtilizacionServidorSIMULACION = 0;
    public static double tiempoPromedioEsperaColaSIMULACION = 0;
    public static double tiempoPromedioEsperaSistemaSIMULACION = 0;
    /*
     Método constructor de la clase
     */
    private void constructor() {
        systemTimer = null;
    }

    /*
        Métodos getter and setter del systemTimer
    */
    public SystemTimer getSystemTimer() {
        return systemTimer;
    }

    public void setSystemTimer(SystemTimer systemTimer) {
        this.systemTimer = systemTimer;
    }
    
    /*
        Bloque de instrucciones que cargan los componentes principales de la interfaz,
        y su respectivo temporizador, llevando el control de la hora del Sistema.
        Cabe destacar que todas las interfaces de la aplicación poseen su respectivo
        método de inicio con el cual se carga todo lo mencionado anteriormente.
     */
    
    public PantallaPrincipal() {
        initComponents();
        constructor();
        //setIconImage(Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("org/icons/iconos/clock.png")));
        getContentPane().setBackground(new Color(209,233,239));
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        menu_inicio = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        t_1 = new javax.swing.JLabel();
        continuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de lineas de espera - CORPOELEC");
        setBackground(new java.awt.Color(209, 233, 239));
        setExtendedState(MAXIMIZED_BOTH);
        setFocusable(false);
        setMinimumSize(new java.awt.Dimension(1110, 700));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout();
        flowLayout1.setAlignOnBaseline(true);
        getContentPane().setLayout(flowLayout1);

        jPanel1.setBackground(new java.awt.Color(209, 233, 239));
        jPanel1.setFocusable(false);
        jPanel1.setMinimumSize(new java.awt.Dimension(1180, 680));
        jPanel1.setPreferredSize(new java.awt.Dimension(1180, 680));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu_inicio.setFont(new java.awt.Font("Corbel", 1, 24)); // NOI18N
        menu_inicio.setForeground(new java.awt.Color(102, 102, 102));
        menu_inicio.setText("Sistema de Lineas de Espera");
        jPanel1.add(menu_inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 30, 400, 72));

        hora.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        hora.setForeground(new java.awt.Color(209, 233, 239));
        hora.setText("Hora:");
        jPanel1.add(hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 40, 188, 35));

        fecha.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        fecha.setForeground(new java.awt.Color(209, 233, 239));
        fecha.setText("Fecha:");
        jPanel1.add(fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 188, 34));

        TablaDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        TablaDatos.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TablaDatos.setForeground(new java.awt.Color(102, 102, 102));
        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"                               11,67", "                               2,75"},
                {"                                4,18", "                               4,85"},
                {"                                9,15", "                               2,98"},
                {"                                2,75", "                               2,90"},
                {"                                3,37", "                               3,07"},
                {"                               15,95", "                               4,67"},
                {"                                5,15", "                               3,10"},
                {"                                0,45", "                               2,50"},
                {"                                4,20", "                              10,18"},
                {"                                6,65", "                               4,08"},
                {"                                6,98", "                               2,28"},
                {"                                1,57", "                               2,28"},
                {"                                1,00", "                               2,25"},
                {"                                1,00", "                               2,05"},
                {"                                3,70", "                               2,60"},
                {"                               11,02", "                               3,32"},
                {"                               9,12", "                               2,42"},
                {"                               1,13", "                               3,37"},
                {"                               2,58", "                               4,80"},
                {"                               5,02", "                               2,27"},
                {"                              0,82", "                               4,35"},
                {"                               1,10", "                               3,48"},
                {"                              1,27", "                               4,58"},
                {"                               2,95", "                               2,20"},
                {"                                6,35", "                               3,25"},
                {"                                3,53", "                               3,00"},
                {"                                3,05", "                               2,38"},
                {"                                1,37", "                               4,52"},
                {"                                3,42", "                               6,85"},
                {"                                2,13", "                               7,82"},
                {"                                7,47", "                               3,10"},
                {"                                0,87", "                               7,63"},
                {"                                0,87", "                               8,02"},
                {"                                3,10", "                              10,13"},
                {"                                6,57", "                               9,08"},
                {"                                5,35", "                               3,67"},
                {"                                22,03", "                               1,00"},
                {"                                0,58", "                               1,38"},
                {"                                12,12", "                               3,38"},
                {"                                0,97", "                               4,38"},
                {"                                7,37", "                               1,65"},
                {"                                1,87", "                               1,10"}
            },
            new String [] {
                "              Tiempo entre llegada (minutos)", "              Tiempo de servicio (minutos)"
            }
        ));
        TablaDatos.setFocusable(false);
        TablaDatos.setGridColor(new java.awt.Color(153, 153, 153));
        TablaDatos.setRowSelectionAllowed(false);
        TablaDatos.setSelectionBackground(new java.awt.Color(50, 72, 135));
        jScrollPane1.setViewportView(TablaDatos);
        if (TablaDatos.getColumnModel().getColumnCount() > 0) {
            TablaDatos.getColumnModel().getColumn(0).setResizable(false);
            TablaDatos.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 660, 350));

        t_1.setFont(new java.awt.Font("Corbel", 1, 14)); // NOI18N
        t_1.setForeground(new java.awt.Color(102, 102, 102));
        t_1.setText("Tabla de datos. C.C La Vela- CORPOELEC");
        jPanel1.add(t_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 200, 370, 35));

        continuar.setBackground(new java.awt.Color(26, 42, 84));
        continuar.setFont(new java.awt.Font("Corbel", 1, 18)); // NOI18N
        continuar.setForeground(new java.awt.Color(255, 255, 255));
        continuar.setText("Iniciar");
        continuar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        continuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continuarActionPerformed(evt);
            }
        });
        jPanel1.add(continuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 610, 140, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/icons/iconos/logopeqcorp.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 310, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("2018 © Todos los derechos reservados - Luna,Rodríguez,Natera.");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 650, -1, -1));

        getContentPane().add(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*
         Esta sección de código corresponde a los eventos de la interfaz.
         Los correspondientes a botones, formularios, entre otros.
    */
    private void continuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continuarActionPerformed
        this.setVisible(false);
        FormularioEntrada EntradaDatos = new FormularioEntrada();
        EntradaDatos.setVisible(true);
        if (systemTimer != null) {
            systemTimer.stopTimer();
        }
        EntradaDatos.setSystemTimer(new SystemTimer());
        EntradaDatos.getSystemTimer().createTimerFormat12Hour(EntradaDatos, "fecha", "hora");
    }//GEN-LAST:event_continuarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            PantallaPrincipal InterfazInicio = new PantallaPrincipal();
            InterfazInicio.setVisible(true);
            if (InterfazInicio.getSystemTimer() != null) {
                InterfazInicio.getSystemTimer().stopTimer();
            }
            InterfazInicio.setSystemTimer(new SystemTimer());
            InterfazInicio.getSystemTimer().createTimerFormat12Hour(InterfazInicio, "fecha", "hora");
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable TablaDatos;
    public static javax.swing.JButton continuar;
    public static javax.swing.JLabel fecha;
    public static javax.swing.JLabel hora;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JLabel menu_inicio;
    public static javax.swing.JLabel t_1;
    // End of variables declaration//GEN-END:variables
}
