/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createplayer;

import login.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import inicio.Menu;

/**
 *
 * @author Ruben Chevez G
 */
public class CreatePlayer extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public CreatePlayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        GUARDAR = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mensaje = new javax.swing.JLabel();
        passtxt = new javax.swing.JTextField();
        usertxt = new javax.swing.JTextField();
        GUARDAR2 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel4.setText("USUARIO");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(320, 190, 230, 40);

        GUARDAR.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        GUARDAR.setText("CANCELAR");
        GUARDAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GUARDARMouseClicked(evt);
            }
        });
        jPanel1.add(GUARDAR);
        GUARDAR.setBounds(400, 480, 240, 40);

        jLabel5.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        jLabel5.setText("CONTRASEÑA");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(270, 310, 290, 40);

        mensaje.setFont(new java.awt.Font("Viner Hand ITC", 1, 18)); // NOI18N
        mensaje.setForeground(new java.awt.Color(204, 0, 0));
        mensaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(mensaje);
        mensaje.setBounds(170, 430, 470, 40);

        passtxt.setBackground(new java.awt.Color(227, 197, 151));
        passtxt.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        passtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(passtxt);
        passtxt.setBounds(260, 360, 300, 50);

        usertxt.setBackground(new java.awt.Color(227, 197, 151));
        usertxt.setFont(new java.awt.Font("Vivaldi", 1, 24)); // NOI18N
        usertxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(usertxt);
        usertxt.setBounds(270, 230, 300, 50);

        GUARDAR2.setFont(new java.awt.Font("Viner Hand ITC", 1, 36)); // NOI18N
        GUARDAR2.setText("GUARDAR");
        jPanel1.add(GUARDAR2);
        GUARDAR2.setBounds(160, 480, 200, 40);

        fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/createplayer/menu.png"))); // NOI18N
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 1280, 700);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GUARDARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GUARDARMouseClicked
        Menu m = new Menu();
        m.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_GUARDARMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GUARDAR;
    private javax.swing.JLabel GUARDAR2;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensaje;
    private javax.swing.JTextField passtxt;
    private javax.swing.JTextField usertxt;
    // End of variables declaration//GEN-END:variables
}
