package Presentacion;

import DAO.SaleDao;
import DAO.SaleDaoImp;
import DAO.CustomerDao;
import DAO.CustomerDaoImp;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Model.cSale;
import Model.cCustomer;

/**
 *
 * @author DEXTER0
 */
public class frmVerBoletas extends javax.swing.JInternalFrame {

    SaleDao boletadao_ = new SaleDaoImp();
    CustomerDao clientedao_ = new CustomerDaoImp();
    Object[][] o;
    public frmVerBoletas() {
        initComponents();
        
        setTitle("Ver Boletas"); //titulo del software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.add(fondo, BorderLayout.CENTER);
        
        listar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();

        setClosable(true);

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

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
            .addComponent(txtbuscar)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int idBoleta = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
        dlgDetailSale dialog = new dlgDetailSale(new javax.swing.JFrame(), true,idBoleta);
        dialog.setVisible(true);
        listar("");
    }//GEN-LAST:event_jTable1MouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        if(txtbuscar.getText().trim().length()>0)
        listar(txtbuscar.getText().trim());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void listar(String texto){
        List<cSale> list = boletadao_.list(texto);
        o =new Object[4][list.size()];
        int i = 0;
        for (cSale tr : list) {            
            o[0][i]=tr.getIdSale()+"";
            o[1][i]=tr.getCustomer_idCustomer();
            o[2][i]=nameCliente(tr.getCustomer_idCustomer()+"");
            o[3][i]=tr.getDate_buy();  
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
        modelo.addColumn("idBoleta",o[0]);
        modelo.addColumn("idcliente",o[1]);
        modelo.addColumn("Nombre Cliente",o[2]);
        modelo.addColumn("Fecha",o[3]);
        
        jTable1.setModel(modelo);
        
    }
    
    public String nameCliente(String id){
        cCustomer cli = clientedao_.search(Integer.parseInt(id));
        return cli.getNameCustomer()+" "+cli.getLast_name();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
