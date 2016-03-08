package Presentacion;

import java.util.ResourceBundle;
import javax.swing.*;

import dao.UsuarioDao;
import dao.UsuarioDaoImp;
import Factory.FactoryConnectionDb;
import java.util.List;
import model.cUsuario;

public class acceso extends javax.swing.JFrame {
     
    ResourceBundle bundle;
    
    public acceso() {

        initComponents();
        FactoryConnectionDb.idioma=0;
            traducir();
        setLocationRelativeTo(null);//centrar el software
        setResizable(false); //bloquear la ampliacion del software
        setTitle(bundle.getString("acceso.lblAcceso.text")); //titulo del software
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());//cambiar de icono al software
        //poner fondo al software
        
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo02.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        this.setLocationRelativeTo(null);
            
            
        txtUsuario.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        btnEntrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lbldate = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        lblhora = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblAcceso = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        lblIdioma = new javax.swing.JMenu();
        lblIdiomaEs = new javax.swing.JRadioButtonMenuItem();
        lblIdiomaEu = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 102));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setForeground(new java.awt.Color(255, 255, 255));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsuario.setText("USUARIO:");
        jPanel1.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, 20));

        lblContraseña.setForeground(new java.awt.Color(255, 255, 255));
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblContraseña.setText("CONTRASEÑA:");
        jPanel1.add(lblContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        txtUsuario.setText("admin");
        jPanel1.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 229, -1));

        txtContraseña.setText("admin");
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 229, -1));

        btnEntrar.setText("Entrar");
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 109, -1));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jPanel1.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 102, -1));

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldate.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbldate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 100, 10));

        lblHora.setForeground(new java.awt.Color(255, 255, 255));
        lblHora.setText("HORA:");
        jPanel1.add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        lblhora.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblhora, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 90, 10));

        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("FECHA:");
        jPanel1.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/mypc_lock.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 240, 260));

        lblAcceso.setFont(new java.awt.Font("Tunga", 1, 24)); // NOI18N
        lblAcceso.setForeground(new java.awt.Color(255, 255, 255));
        lblAcceso.setText("ACCESO AL SISTEMA ");
        jPanel1.add(lblAcceso, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, -1, 32));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-1, 1, 590, 280));

        lblIdioma.setText("Lenguaje");

        buttonGroup1.add(lblIdiomaEs);
        lblIdiomaEs.setSelected(true);
        lblIdiomaEs.setText("Español");
        lblIdiomaEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIdiomaEsActionPerformed(evt);
            }
        });
        lblIdioma.add(lblIdiomaEs);

        buttonGroup1.add(lblIdiomaEu);
        lblIdiomaEu.setText("Ingles");
        lblIdiomaEu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblIdiomaEuActionPerformed(evt);
            }
        });
        lblIdioma.add(lblIdiomaEu);

        jMenuBar1.add(lblIdioma);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void traducir(){
        if(FactoryConnectionDb.idioma==0) 
            bundle = ResourceBundle.getBundle("Propiedades/es_PE");
        else bundle = ResourceBundle.getBundle("Propiedades/eu_EU");
        
        setTitle(bundle.getString("acceso.lblAcceso.text")); //titulo del software
        
        lblIdioma.setText(bundle.getString("acceso.lblIdioma.text"));
        lblIdiomaEs.setText(bundle.getString("acceso.lblIdiomaEs.text"));
        lblIdiomaEu.setText(bundle.getString("acceso.lblIdiomaEu.text"));
        lblAcceso.setText(bundle.getString("acceso.lblAcceso.text"));
        lblUsuario.setText(bundle.getString("acceso.lblUsuario.text"));
        lblContraseña.setText(bundle.getString("acceso.lblContrasenia.text"));
        btnSalir.setText(bundle.getString("acceso.btnSalir.text"));
        btnEntrar.setText(bundle.getString("acceso.btnEntrar.text"));
        lblFecha.setText(bundle.getString("acceso.lblFecha.text"));
        lblHora.setText(bundle.getString("acceso.lblHora.text"));
    }

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
            
        String usuario_ = txtUsuario.getText();
        String clave_  = txtContraseña.getText();
            
        if(usuario_.trim().length()==0 && clave_.trim().length()==0){
            dispose();
            //new frmmarcacion().setVisible(true);
        }else{
            UsuarioDao _usuario = new UsuarioDaoImp();
            List<cUsuario> _list = _usuario.list();
            boolean existe = false;
            
            for (cUsuario us : _list) {
                if(us.getUsuario().equals(usuario_)&& us.getContrasenia().equals(dao.MD5.getMD5(clave_)) ){
                    existe = true;
                    FactoryConnectionDb.usuario = us.getUsuario();
                    FactoryConnectionDb.idUsuario = us.getIdUsuario()+"";
                    FactoryConnectionDb.idEmpleado = us.getIdEmpleado();
                    FactoryConnectionDb.contrasenia = us.getContrasenia();
                    break;
                }                
            }
            if(existe){
                
                dispose();
                new MDI_Menu().setVisible(true);
            }else{
                
                JOptionPane.showMessageDialog(null, "Usuario o Clave Incorrecta!",FactoryConnectionDb.Mensaje,JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_btnEntrarActionPerformed

    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void lblIdiomaEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIdiomaEsActionPerformed
        FactoryConnectionDb.idioma = 0;
        traducir();
    }//GEN-LAST:event_lblIdiomaEsActionPerformed

    private void lblIdiomaEuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIdiomaEuActionPerformed
        FactoryConnectionDb.idioma = 1;
        traducir();
    }//GEN-LAST:event_lblIdiomaEuActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblAcceso;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    private javax.swing.JMenu lblIdioma;
    private javax.swing.JRadioButtonMenuItem lblIdiomaEs;
    private javax.swing.JRadioButtonMenuItem lblIdiomaEu;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lblhora;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
