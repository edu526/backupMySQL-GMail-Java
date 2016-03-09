
package Presentacion;

import DAO.DetailSaleDao;
import DAO.DetailSaleDaoImp;
import DAO.ProductDao;
import DAO.ProductDaoImp;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Model.cDetailSale;
import Model.cProduct;
//import reporte.CReporte;

public class dlgDetailSale extends javax.swing.JDialog {
    DetailSaleDao detalledao_ = new DetailSaleDaoImp();
    ProductDao productodao_ = new ProductDaoImp();
    
    Object[][] o;
    String  idBoleta;
    public dlgDetailSale(java.awt.Frame parent, boolean modal,int id) {
        super(parent, modal);
        initComponents();
        
        setTitle("Detalle boleta"); //titulo del software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        listar(id+"");
        idBoleta=id+"";
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaDetalle = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tablaDetalle.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tablaDetalle);

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Imprimir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        //new CReporte().imprimirBoleta(idBoleta);
    }//GEN-LAST:event_jButton2ActionPerformed
private void listar(String id){
        List<cDetailSale> list = detalledao_.list(id);
        o =new Object[6][list.size()];
        int i = 0;
        for (cDetailSale tr : list) {            
            o[0][i]=tr.getIdDetailSale();
            o[1][i]=tr.getProduct_idProduct();
            o[2][i]=nameProducto(tr.getProduct_idProduct());
            o[3][i]=precioProducto(tr.getProduct_idProduct());  
            o[4][i]=tr.getQuantity();  
            o[5][i]=tr.getPrice();  
            
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
        modelo.addColumn("Nº",o[0]);
        modelo.addColumn("idProducto",o[1]);
        modelo.addColumn("Nombre Producto",o[2]);
        modelo.addColumn("Precio/u",o[3]);
        modelo.addColumn("Cantidad",o[4]);
        modelo.addColumn("Precio/t",o[5]);
        
        tablaDetalle.setModel(modelo);
        
    }

    public String nameProducto(int id){
        cProduct pro = productodao_.search(id);
        return pro.getNameProduct();
    }
    public double precioProducto(int id){
        cProduct pro = productodao_.search(id);
        return pro.getPrice();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaDetalle;
    // End of variables declaration//GEN-END:variables
}
