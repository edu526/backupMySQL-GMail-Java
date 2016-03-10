package Presentacion;

import Factory.FactoryConnectionDb;
import DAO.EmployeeDao;
import DAO.EmployeeDaoImp;
import DAO.UserDao;
import DAO.UserDaoImp;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import Model.cEmployee;
import Model.cUser;

public class frmNewUser extends javax.swing.JInternalFrame {
    String idEmpleado="";  
    int Categoria;
    
    EmployeeDao empleadodao_ = new EmployeeDaoImp();
    UserDao usuariodao_ = new UserDaoImp();
    Object[][] e;
    public frmNewUser() {
        initComponents();
        
        setTitle("Usuario"); //titulo del software
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

        Listar_empleados = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCliente = new javax.swing.JTable();
        txtbuscar = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        txtContrasenia2 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtContrasenia1 = new javax.swing.JPasswordField();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtEmpleado1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        Listar_empleados.setAlwaysOnTop(true);

        tablaCliente.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCliente);

        txtbuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbuscarKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout Listar_empleadosLayout = new javax.swing.GroupLayout(Listar_empleados.getContentPane());
        Listar_empleados.getContentPane().setLayout(Listar_empleadosLayout);
        Listar_empleadosLayout.setHorizontalGroup(
            Listar_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Listar_empleadosLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Listar_empleadosLayout.setVerticalGroup(
            Listar_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Listar_empleadosLayout.createSequentialGroup()
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButton1.setText("Grabar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Clave:");

        jLabel3.setText("Clave:");

        jLabel2.setText("Usuario:");

        jLabel1.setText("Empleado:");

        txtEmpleado.setEditable(false);
        txtEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpleadoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmpleado)
                            .addComponent(txtUsuario)
                            .addComponent(txtContrasenia1)
                            .addComponent(txtContrasenia2, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(43, 43, 43))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtContrasenia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtContrasenia2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        txtEmpleado1.setEditable(false);
        txtEmpleado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtEmpleado1MouseClicked(evt);
            }
        });

        jLabel5.setText("Empleado:");

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(40, 40, 40))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEmpleado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClienteMouseClicked
    
        try {
        
            idEmpleado = tablaCliente.getValueAt(tablaCliente.getSelectedRow(),0).toString();
            String nombre = tablaCliente.getValueAt(tablaCliente.getSelectedRow(),1).toString();
            String apellidoPa = tablaCliente.getValueAt(tablaCliente.getSelectedRow(),2).toString();
            if(Categoria==1)
            txtEmpleado.setText(nombre+" "+apellidoPa);
            else if(Categoria==2)
            txtEmpleado1.setText(nombre+" "+apellidoPa);

        } catch (NullPointerException e) {
            
        }
        Listar_empleados.setVisible(false); 
    }//GEN-LAST:event_tablaClienteMouseClicked

    private void txtbuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbuscarKeyReleased
        if(txtbuscar.getText().trim().length()>0)
        listarEmpleados(txtbuscar.getText().trim());
    }//GEN-LAST:event_txtbuscarKeyReleased

    private void txtEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoMouseClicked
        Categoria=1;
        Listar_empleados.setSize(353, 250);
        Listar_empleados.setVisible(true);
        listarEmpleados("");
    }//GEN-LAST:event_txtEmpleadoMouseClicked

    private void txtEmpleado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleado1MouseClicked
        Categoria=2;
        Listar_empleados.setSize(353, 250);
        Listar_empleados.setVisible(true);
        listarEmpleados("");
    }//GEN-LAST:event_txtEmpleado1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(idEmpleado.length()>0){
        int confirmacion = JOptionPane.showConfirmDialog (null, "Desea eliminar este usuario?",FactoryConnectionDb.Mensaje,JOptionPane.YES_NO_OPTION);
        if(JOptionPane.YES_OPTION==confirmacion){
            UserDao mensajedao = new UserDaoImp();
            mensajedao.delete(Integer.parseInt(idEmpleado));
            JOptionPane.showMessageDialog(null, "Usuario eliminado ",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
            
        }
        limpiar();
        }JOptionPane.showMessageDialog(null, "Seleccionar un usuario ",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String sClave1 = txtContrasenia1.getText();
        String sClave2 = txtContrasenia2.getText();
        UserDao _usuario = new UserDaoImp();
        cUser usu = new cUser();
        if(idEmpleado.length()<1){
            JOptionPane.showMessageDialog(null, "Seleccionar un empleado",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
        }else if(txtUsuario.getText().length()<3){
            JOptionPane.showMessageDialog(null, "Colocar un usuario Correcto",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
        }else if(sClave1.length()<1){
            JOptionPane.showMessageDialog(null, "Colocar una contraseña Correcto",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
        }
        else if(sClave1.equals(sClave2)){
                usu.setPass(DAO.MD5.getMD5(sClave1));
                usu.setEmployee_idEmployee(Integer.parseInt(idEmpleado));
                usu.setUser(txtUsuario.getText());
                UserDao usuariodao = new UserDaoImp();
                
                System.out.println(usu.getPass()+" "+usu.getEmployee_idEmployee()+" "+usu.getIdUser()+" "+usu.getUser());
                
                usuariodao.insert(usu);
                
                JOptionPane.showMessageDialog(null, "Usuario creado Correctamente",FactoryConnectionDb.Mensaje,JOptionPane.INFORMATION_MESSAGE);
                
            }else{
                JOptionPane.showMessageDialog(null, "Clave diferente a la Confirmacion",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
            }
        
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void limpiar(){
        txtContrasenia1.setText("");
        txtContrasenia2.setText("");
        txtEmpleado.setText("");
        txtEmpleado1.setText("");
        txtUsuario.setText("");
        txtbuscar.setText("");
        idEmpleado="";
        Categoria=0;
    }
    private void listarEmpleados(String texto){
        List<cEmployee> list = empleadodao_.list(texto);
        List<cUser> listu = usuariodao_.list();
        
        e =new Object[4][list.size()];
        int i = 0;
        for (cEmployee tr : list) {
            for(cUser tu : listu){
            if(Categoria==1){
                if(tr.getIdEmployee()!= tu.getEmployee_idEmployee()){
                e[0][i]=tr.getIdEmployee();
                e[1][i]=tr.getNameEmployee();
                e[2][i]=tr.getLast_name();
                e[3][i]=tr.getDni();  
                i++;
                }
            }else if(Categoria==2){
                if(tr.getIdEmployee()== tu.getEmployee_idEmployee() && !"master".equals(tu.getUser())){
                e[0][i]=tr.getIdEmployee();
                e[1][i]=tr.getNameEmployee();
                e[2][i]=tr.getLast_name();
                e[3][i]=tr.getDni();  
                i++;
                }
            }
            }
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
        modelo.addColumn("idCliente",e[0]);
        modelo.addColumn("Nombre",e[1]);
        modelo.addColumn("Apellidos",e[2]);
        modelo.addColumn("DNI",e[3]);
        
        tablaCliente.setModel(modelo);
        
    }
    
    public boolean existe(int id){
        cUser usu = usuariodao_.search(id);
        return (id+"").equals(usu.getEmployee_idEmployee());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog Listar_empleados;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaCliente;
    private javax.swing.JPasswordField txtContrasenia1;
    private javax.swing.JPasswordField txtContrasenia2;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtEmpleado1;
    private javax.swing.JTextField txtUsuario;
    private javax.swing.JTextField txtbuscar;
    // End of variables declaration//GEN-END:variables
}
