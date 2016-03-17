/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Factory.FactoryConnectionDb;
import DAO.UserDao;
import DAO.UserDaoImp;
import Model.cBloqueroVentanas;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Model.cUser;

public class frmChangePassword extends javax.swing.JInternalFrame {

    public frmChangePassword() {
        initComponents();
        
        setResizable(false); //bloquear la ampliacion del software
        setTitle("Cambiar Contraseña"); //titulo del software
        //poner fondo al software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtclavenueva = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        txtclaveactual = new javax.swing.JPasswordField();
        txtconfclavenueva = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        btnSalir.setText("Cerrar");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clave Actual :");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Clave Nueva:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clave Nueva:");

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtconfclavenueva)
                    .addComponent(txtclavenueva, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtclaveactual, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtclaveactual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtclavenueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtconfclavenueva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        cBloqueroVentanas.setViewCanbiarContrasenia(true);
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String sClave = txtclaveactual.getText();
        String sClave1 = txtclavenueva.getText();
        String sClave2 = txtconfclavenueva.getText();
        cUser usu = new cUser();
                usu.setUser(FactoryConnectionDb.user);
                usu.setPass(FactoryConnectionDb.pass);
                usu.setEmployee_idEmployee(FactoryConnectionDb.idEmployee);
                usu.setIdUser(Integer.parseInt(FactoryConnectionDb.idUser));
       
        boolean existe = false;
        if(usu.getPass().equals(DAO.MD5.getMD5(sClave))){
            existe = true;
        }
        if(existe){
            if(sClave1.equals(sClave2)){
                
                usu.setPass(DAO.MD5.getMD5(sClave1));                
                UserDao usuariodao = new UserDaoImp();
                
                usuariodao.update(usu);
                FactoryConnectionDb.pass=usu.getPass();
                JOptionPane.showMessageDialog(null, "Clave Modificada Correctamente",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
                txtclaveactual.setText("");
                txtclavenueva.setText("");
                txtconfclavenueva.setText("");
            }else{
                JOptionPane.showMessageDialog(null, "Clave diferente a la Confirmacion",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Clave de usuario actual es Incorrecta ",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_btnModificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField txtclaveactual;
    private javax.swing.JPasswordField txtclavenueva;
    private javax.swing.JPasswordField txtconfclavenueva;
    // End of variables declaration//GEN-END:variables
}
