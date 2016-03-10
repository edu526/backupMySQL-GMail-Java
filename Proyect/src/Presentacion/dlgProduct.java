
package Presentacion;

import DAO.ProductDao;
import DAO.ProductDaoImp;
import Factory.FactoryConnectionDb;
import DAO.CategoryDao;
import DAO.CategoryDaoImp;
import DAO.ProviderDao;
import DAO.ProviderDaoImp;
import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Model.cCategory;

import Model.cProduct;
import Model.cProvider;

public class dlgProduct extends javax.swing.JDialog {

    ProviderDao proveedordao_ = new ProviderDaoImp();
    Object[][] p;
    CategoryDao categoriadao_ = new CategoryDaoImp();
    Object[][] c;
    public dlgProduct(java.awt.Frame parent, boolean modal,cProduct producto_) {
        super(parent, modal);
        initComponents();
        listarCombo();
        setTitle("Producto"); //titulo del software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
   
        
        setLocationRelativeTo(null);
           
        int id = producto_.getIdProduct();
           
        btnGrabar.setText(id==0?"Agregar":"Modificar");
        btnEliminar.setVisible(id>0);
        txtCodigo.setText(id+"");
        txtnom.setText(producto_.getNameProduct());
        txtstock.setText(producto_.getQuantity()+"");
        txtpreciov.setText(producto_.getPrice()+"");
        
        
        try {
            String[] name = comboName(producto_.getCategory_idCategory(),
                producto_.getProvider_idProvider());
        
            comboCategoria.setSelectedItem(name[0]);
            comboProveedor.setSelectedItem(name[1]);
                       
        }catch (NullPointerException es){
            
        }
        
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblDescripcion = new javax.swing.JLabel();
        lblStock = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblDescripcion1 = new javax.swing.JLabel();
        lblDescripcion4 = new javax.swing.JLabel();
        lblDescripcion5 = new javax.swing.JLabel();
        lblDescripcion6 = new javax.swing.JLabel();
        txtnom = new javax.swing.JTextField();
        txtstock = new javax.swing.JTextField();
        txtpreciov = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JLabel();
        comboProveedor = new javax.swing.JComboBox();
        comboCategoria = new javax.swing.JComboBox();
        btnEliminar = new javax.swing.JButton();
        btnGrabar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setOpaque(false);

        lblDescripcion.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion.setText("id");

        lblStock.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblStock.setForeground(new java.awt.Color(255, 255, 255));
        lblStock.setText("Stock");

        lblDescripcion1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion1.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion1.setText("Nombre");

        lblDescripcion4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion4.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion4.setText("Precio Venta");

        lblDescripcion5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion5.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion5.setText("Categoria");

        lblDescripcion6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblDescripcion6.setForeground(new java.awt.Color(255, 255, 255));
        lblDescripcion6.setText("Proveedor");

        txtstock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtstockKeyTyped(evt);
            }
        });

        txtpreciov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtpreciovKeyTyped(evt);
            }
        });

        txtCodigo.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDescripcion)
                    .addComponent(lblDescripcion1)
                    .addComponent(lblDescripcion6)
                    .addComponent(lblDescripcion4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(448, 448, 448)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 1024, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblDescripcion5))
                                .addGap(1212, 1212, 1212))))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtnom)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txtpreciov, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(106, 106, 106)
                            .addComponent(lblStock)
                            .addGap(18, 18, 18)
                            .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtCodigo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion1)
                    .addComponent(txtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion4)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtpreciov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblStock)
                        .addComponent(txtstock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDescripcion6)
                    .addComponent(lblDescripcion5)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setAutoscrolls(true);
        btnEliminar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Grabar.png"))); // NOI18N
        btnGrabar.setText("GRABAR");
        btnGrabar.setToolTipText("");
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnGrabar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGrabarActionPerformed
        ProductDao productodao = new ProductDaoImp();
        cProduct producto_ = new cProduct();

        if(txtnom.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del Nombre",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
            txtnom.requestFocus();
        }else if(txtstock.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de Stock",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
            txtstock.requestFocus();
        }else if(txtpreciov.getText().trim().length()==0){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del precio de Origen",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
            txtpreciov.requestFocus();
        }else if(comboCategoria.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Error en el ingreso de la categoria",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
        }else if(comboProveedor.getSelectedItem() == null){
            JOptionPane.showMessageDialog(null, "Error en el ingreso del proveedor",FactoryConnectionDb.Mensaje,JOptionPane.ERROR_MESSAGE);
        }else{

            producto_.setIdProduct(Integer.parseInt(txtCodigo.getText()));
            producto_.setNameProduct(txtnom.getText());
            producto_.setQuantity(Integer.parseInt(txtstock.getText()));
            producto_.setPrice(Double.parseDouble(txtpreciov.getText()));
            
            int[] id = comboId(comboCategoria.getSelectedItem().toString() ,
                        comboProveedor.getSelectedItem().toString());
            
            producto_.setCategory_idCategory(id[0]);
            producto_.setProvider_idProvider(id[1]);

            if(producto_.getIdProduct()>0){
                productodao.update(producto_);
                JOptionPane.showMessageDialog(null, "Producto modificado correctamente",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                productodao.insert(producto_);
                JOptionPane.showMessageDialog(null, "Producto ingresado correctamente",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            }
            dispose();
        }
    }//GEN-LAST:event_btnGrabarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int confirmacion = JOptionPane.showConfirmDialog (null, "Desea eliminar este Producto?",FactoryConnectionDb.Mensaje,JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==confirmacion){
            ProductDao productodao = new ProductDaoImp();
            productodao.delete(Integer.parseInt(txtCodigo.getText()));
            JOptionPane.showMessageDialog(null, "Producto eliminado ",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            dispose();
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtstockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtstockKeyTyped
          char c=evt.getKeyChar(); 
          if(Character.isLetter(c)) { 
              getToolkit().beep(); 
              evt.consume(); 
              JOptionPane.showMessageDialog(this,"Ingresa Solo Numeros"); 
          }         // TODO add your handling code here:
    }//GEN-LAST:event_txtstockKeyTyped

    private void txtpreciovKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpreciovKeyTyped
    char caracter = evt.getKeyChar();
                if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
                                && (caracter !='.')){
                                  JOptionPane.showMessageDialog(this,"Ingresa Solo Numeros y un punto"); 

                evt.consume();
                }   
                if (caracter == '.' && txtpreciov.getText().contains(".")) {
                evt.consume();
}     // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciovKeyTyped


    private void listarCombo(){
        List<cCategory> listc = categoriadao_.list("");
        List<cProvider> listp = proveedordao_.list("");
        
        for (cCategory tr : listc) {   
            comboCategoria.addItem(tr.getNameCategory());
        }
        for (cProvider tr : listp) {   
            comboProveedor.addItem(tr.getNameProvider());
        }
    }
    private String[] comboName(int idCategoria, int idProveedor){
        List<cCategory> listc = categoriadao_.list("");
        List<cProvider> listp = proveedordao_.list("");
        
        String[] name = new String[2];
        
        c =new Object[2][listc.size()];  
        p =new Object[2][listp.size()]; 

        int i = 0;
        for (cCategory tr : listc) {   
            c[0][i]=tr.getIdCategory();
            c[1][i]=tr.getNameCategory(); 

            if(idCategoria == Integer.parseInt(c[0][i].toString())){
                name[0]=c[1][i].toString(); 
                break;
            }
            i++;
        }
        i = 0;
        for (cProvider tr : listp) {   
            p[0][i]=tr.getIdProvider();
            p[1][i]=tr.getNameProvider(); 

            if(idProveedor == Integer.parseInt(p[0][i].toString())){
                name[1]=p[1][i].toString(); 
                break;
            }
            i++;
        }

        return name;
        
    }
    private int[] comboId(String nameCategoria, String nameProveedor){
        List<cCategory> listc = categoriadao_.list("");
        List<cProvider> listp = proveedordao_.list("");
        
        int[] id = new int[2];
        
        c =new Object[2][listc.size()];  
        p =new Object[2][listp.size()]; 
        
        int i = 0;
        for (cCategory tr : listc) {   
            c[0][i]=tr.getIdCategory();
            c[1][i]=tr.getNameCategory(); 

            if(nameCategoria.equals(c[1][i].toString())){
                id[0]=Integer.parseInt(c[0][i].toString()); 
                break;
            }
            i++;
        }
        i = 0;
        for (cProvider tr : listp) {   
            p[0][i]=tr.getIdProvider();
            p[1][i]=tr.getNameProvider(); 

            if(nameProveedor.equals(p[1][i].toString())){
                id[1]=Integer.parseInt(p[0][i].toString()); 
                break;
            }
            i++;
        }

        return id;
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JComboBox comboCategoria;
    private javax.swing.JComboBox comboProveedor;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JLabel lblDescripcion4;
    private javax.swing.JLabel lblDescripcion5;
    private javax.swing.JLabel lblDescripcion6;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel txtCodigo;
    private javax.swing.JTextField txtnom;
    private javax.swing.JTextField txtpreciov;
    private javax.swing.JTextField txtstock;
    // End of variables declaration//GEN-END:variables
}
