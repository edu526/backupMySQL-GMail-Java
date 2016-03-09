package Presentacion;

import Factory.FactoryConnectionDb;
import DAO.ProviderDao;
import DAO.ProviderDaoImp;
import java.awt.BorderLayout;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Model.cProvider;

public class dlgProvider extends javax.swing.JDialog {

    public dlgProvider(java.awt.Frame parent, boolean modal,cProvider proveedor_) {
        super(parent, modal);
        initComponents();
        
        setTitle("Proveedor"); //titulo del software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
   
        int id =proveedor_.getIdProvider();
        btnGrabar.setText(id==0?"Agregar":"Modificar");
        btnElminar.setVisible(id>0);
        lblCod.setText(proveedor_.getIdProvider()+"");
        txtnombre.setText(proveedor_.getNameProvider());
        txtDireccion.setText(proveedor_.getAddres());
        txttelefono.setText(proveedor_.getPhone());
        txtdescripcion.setText(proveedor_.getDescription());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        txtDireccion = new javax.swing.JTextField();
        lblNombre1 = new javax.swing.JLabel();
        lblNombre2 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lblCod = new javax.swing.JLabel();
        btnElminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        lblCodigo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lblCodigo.setText("id");

        lblNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre.setText("Nombre");

        lblCorreo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(255, 255, 255));
        lblCorreo.setText("Descripcion");

        txtnombre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane3.setViewportView(txtdescripcion);

        txtDireccion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        lblNombre1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre1.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre1.setText("Dirección");

        lblNombre2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombre2.setForeground(new java.awt.Color(255, 255, 255));
        lblNombre2.setText("Telefono");

        txttelefono.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCorreo)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblNombre2)
                                .addGap(18, 18, 18)
                                .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNombre1)
                                .addGap(18, 18, 18)
                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblNombre)
                            .addComponent(lblCodigo))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCod, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCorreo)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnElminar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnElminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnElminar.setText("Eliminar");
        btnElminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElminarActionPerformed(evt);
            }
        });

        btnGrabar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grabar.png"))); // NOI18N
        btnGrabar.setText("Grabar");
        btnGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGrabarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(376, 376, 376)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnElminar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(btnGrabar)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(btnElminar)
                    .addContainerGap(75, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnElminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog (null, "Desea eliminar este cargo?",FactoryConnectionDb.Mensaje,JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==confirmacion){
            ProviderDao mensajedao = new ProviderDaoImp();
            mensajedao.delete(Integer.parseInt(lblCod.getText()));
            JOptionPane.showMessageDialog(null, "Cargo eliminado ",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_btnElminarActionPerformed

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        ProviderDao proveedordao = new ProviderDaoImp();
        cProvider proveedor_ = new cProvider();
        
        
        if(txtnombre.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del nombre",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
            txtnombre.requestFocus();
        }else if(txtDireccion.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la direccion",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
            txtDireccion.requestFocus();
        }else if(txttelefono.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del telefono",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
            txttelefono.requestFocus();
        }else{
            proveedor_.setIdProvider(Integer.parseInt(lblCod.getText()));
            proveedor_.setNameProvider(txtnombre.getText());
            proveedor_.setAddres(txtDireccion.getText());
            proveedor_.setPhone(txttelefono.getText());
            proveedor_.setDescription(txtdescripcion.getText());
            proveedor_.setCell_phone(txtdescripcion.getText());
            proveedor_.setEmail(txtdescripcion.getText());
            if(proveedor_.getIdProvider()>0){
                proveedordao.update(proveedor_);                
                JOptionPane.showMessageDialog(null, "Datos del proveedor modificados correctamente",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            }                
            else{
                proveedordao.insert(proveedor_);
                JOptionPane.showMessageDialog(null, "Datos del proveedor ingresados correctamente",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            }
            dispose();            
        }   
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(this,"Ingresa Solo Numeros"); 
          } 
    }//GEN-LAST:event_txttelefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnElminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCod;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombre1;
    private javax.swing.JLabel lblNombre2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
