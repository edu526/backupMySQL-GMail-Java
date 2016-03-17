package Presentacion;

import DAO.ProductDao;
import DAO.ProductDaoImp;
import Model.cBloqueroVentanas;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import Model.cProduct;

public class frmProduct extends javax.swing.JInternalFrame {
    ProductDao productodao_ = new ProductDaoImp();
    Object[][] o;
    public frmProduct() {
        initComponents();
        setTitle("Producto"); //titulo del software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        
        listar("");
                
    }
    private void listar(String texto){
        List<cProduct> list = productodao_.list(texto);
        o =new Object[4][list.size()];
        int i = 0;
        for (cProduct tr : list) {            
            o[0][i]=tr.getIdProduct()+"";
            o[1][i]=tr.getNameProduct();
            o[2][i]=tr.getPrice();
            o[3][i]=tr.getQuantity();  
            i++;
        }
        
        DefaultTableModel modelo=new DefaultTableModel(){
            public Class getColumnClass(int indiceColumna){
                Object stefany=getValueAt(0, indiceColumna);
                if(stefany == null){
                    return Object.class;
                }else{
                return stefany.getClass();
                }
               }
        };
        modelo.addColumn("idProducto",o[0]);
        modelo.addColumn("Nombre",o[1]);
        modelo.addColumn("Precio",o[2]);
        modelo.addColumn("Cantidad",o[3]);
        
        jTable1.setModel(modelo);
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtbuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnnuevo = new javax.swing.JButton();
        btnnuevo1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(51, 51, 51));
        setTitle("Producto");
        setToolTipText("");
        setAutoscrolls(true);

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"casa", "dos", "tre", "cuaaa"},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnnuevo1.setText("Cerrar");
        btnnuevo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevo1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnnuevo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnnuevo1)
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo)
                    .addComponent(btnnuevo1))
                .addContainerGap(276, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(49, 49, 49)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        if(txtbuscar.getText().trim().length()>0)
        listar(txtbuscar.getText().trim());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int idProducto = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        ProductDao productodao = new ProductDaoImp();
        dlgProduct dialog = new dlgProduct(new javax.swing.JFrame(), true,productodao.search(idProducto));
        dialog.setVisible(true);
        listar("");
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        dlgProduct dialog = new dlgProduct(new javax.swing.JFrame(), true,new cProduct());
        dialog.setVisible(true);
        listar("");
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnnuevo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevo1ActionPerformed
        cBloqueroVentanas.setViewControlProducto(true);
        dispose();
    }//GEN-LAST:event_btnnuevo1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnnuevo1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables

}
