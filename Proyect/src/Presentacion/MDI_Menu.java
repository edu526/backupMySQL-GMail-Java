package Presentacion;

import DAO.PositionDao;
import DAO.PositionDaoImp;
import Ejecucion.Control;
import Ejecucion.NewMain;
import Model.cBloqueroVentanas;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
//import reporte.CReporte;

public class MDI_Menu extends javax.swing.JFrame implements Runnable{
    PositionDao cargodao_ = new PositionDaoImp();
    Object[][] o;
    //reloj
    String hora,minutos,segundos,ampm;
    Calendar calendario;    
    Thread h1;
    
    
    public MDI_Menu() {
        initComponents();
        
        //mostrar reloj        
        h1 = new Thread(this);
        h1.start();
        
        //setLocationRelativeTo(null);//centrar el software
        setExtendedState(JFrame.MAXIMIZED_BOTH); //extender frame
        setTitle("Software"); //titulo del software
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg"))
                .getImage());//cambiar de icono al software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().
                getResource("/imagenes/fondo01.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        this.add(fondo, BorderLayout.CENTER);        
        
        if(Factory.FactoryConnectionDb.idCargo !=0){
            menuCargo.setVisible(false);
            
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_principal = new javax.swing.JDesktopPane();
        lblhora = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jToolBar2 = new javax.swing.JToolBar();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuClienteControl = new javax.swing.JMenuItem();
        menuClienteReporte = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenu();
        menuProductoControl = new javax.swing.JMenuItem();
        menuReporteProducto = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuCategoria = new javax.swing.JMenuItem();
        menuProve = new javax.swing.JMenu();
        menuProveedor = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        menuEmpleadoControl = new javax.swing.JMenuItem();
        menuEmpleadoReporte = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuCargo = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        menuVentaVenta = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        menuVentaReporte = new javax.swing.JMenuItem();
        menuVerBoleta = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuControlUsuario = new javax.swing.JMenuItem();
        menuHerramienta = new javax.swing.JMenu();
        menuCalculadora = new javax.swing.JMenuItem();
        menuBloc = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        menuCambiarcontrasenia = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_principal.setOpaque(false);

        lblhora.setBackground(new java.awt.Color(0, 0, 0));
        lblhora.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        lblhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jToolBar1.setFloatable(false);
        jToolBar1.setRollover(true);
        jToolBar1.setOpaque(false);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacen.png"))); // NOI18N
        jButton1.setText("Producto");
        jButton1.setFocusable(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton1);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/control_ventas.png"))); // NOI18N
        jButton3.setText("Boletas");
        jButton3.setToolTipText("Boletas");
        jButton3.setFocusable(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton3);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vender.png"))); // NOI18N
        jButton5.setText("Venta");
        jButton5.setFocusable(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton5);

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_suit.png"))); // NOI18N
        jButton7.setText("Cliente");
        jButton7.setFocusable(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton7);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculator.png"))); // NOI18N
        jButton2.setText("Calculadora");
        jButton2.setFocusable(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton2);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_edit.png"))); // NOI18N
        jButton6.setText("Block de Notas");
        jButton6.setFocusable(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton6);

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar_sesion.png"))); // NOI18N
        jButton8.setText("Cerrar Sesión");
        jButton8.setFocusable(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton8);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        jButton4.setText("Salir");
        jButton4.setFocusable(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jToolBar2.add(jButton4);

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblhora, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToolBar2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap(559, Short.MAX_VALUE)
                .addGroup(panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblhora)))
        );
        panel_principal.setLayer(lblhora, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_principal.setLayer(jToolBar1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        panel_principal.setLayer(jToolBar2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setInheritsPopupMenu(true);

        menuCliente.setText("Clientes");
        menuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClienteMouseClicked(evt);
            }
        });

        menuClienteControl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        menuClienteControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteIco.png"))); // NOI18N
        menuClienteControl.setText("Control");
        menuClienteControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteControlActionPerformed(evt);
            }
        });
        menuCliente.add(menuClienteControl);

        menuClienteReporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        menuClienteReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        menuClienteReporte.setText("Reporte");
        menuClienteReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteReporteActionPerformed(evt);
            }
        });
        menuCliente.add(menuClienteReporte);

        jMenuBar1.add(menuCliente);

        menuProducto.setText("Productos");
        menuProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuProductoMouseClicked(evt);
            }
        });

        menuProductoControl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menuProductoControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/almacenIco.png"))); // NOI18N
        menuProductoControl.setText("Control");
        menuProductoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductoControlActionPerformed(evt);
            }
        });
        menuProducto.add(menuProductoControl);

        menuReporteProducto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        menuReporteProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        menuReporteProducto.setText("Reporte");
        menuReporteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteProductoActionPerformed(evt);
            }
        });
        menuProducto.add(menuReporteProducto);
        menuProducto.add(jSeparator1);

        menuCategoria.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/categoria.png"))); // NOI18N
        menuCategoria.setText("Categoria");
        menuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaActionPerformed(evt);
            }
        });
        menuProducto.add(menuCategoria);

        menuProve.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/provider_icon.jpg"))); // NOI18N
        menuProve.setText("Proveedor");

        menuProveedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/provider_icon.jpg"))); // NOI18N
        menuProveedor.setText("Proveedor");
        menuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProveedorActionPerformed(evt);
            }
        });
        menuProve.add(menuProveedor);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        jMenuItem3.setText("Reporte");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuProve.add(jMenuItem3);

        menuProducto.add(menuProve);

        jMenuBar1.add(menuProducto);

        menuEmpleado.setText("Empleado");
        menuEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpleadoMouseClicked(evt);
            }
        });

        menuEmpleadoControl.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK));
        menuEmpleadoControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/employee.jpg"))); // NOI18N
        menuEmpleadoControl.setText("Control");
        menuEmpleadoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadoControlActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuEmpleadoControl);

        menuEmpleadoReporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        menuEmpleadoReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        menuEmpleadoReporte.setText("Reporte ");
        menuEmpleadoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadoReporteActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuEmpleadoReporte);
        menuEmpleado.add(jSeparator2);

        menuCargo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/goodEmployee.png"))); // NOI18N
        menuCargo.setText("Cargo");
        menuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargoActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuCargo);

        jMenuBar1.add(menuEmpleado);

        menuVenta.setText("Venta");
        menuVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVentaMouseClicked(evt);
            }
        });

        menuVentaVenta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.ALT_MASK));
        menuVentaVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/vender Ico.png"))); // NOI18N
        menuVentaVenta.setText("Venta");
        menuVentaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaVentaActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaVenta);
        menuVenta.add(jSeparator3);

        menuVentaReporte.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.SHIFT_MASK));
        menuVentaReporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.png"))); // NOI18N
        menuVentaReporte.setText("Reporte");
        menuVentaReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaReporteActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaReporte);

        menuVerBoleta.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        menuVerBoleta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/control_ventas Ico.png"))); // NOI18N
        menuVerBoleta.setText("Ver Boletas");
        menuVerBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerBoletaActionPerformed(evt);
            }
        });
        menuVenta.add(menuVerBoleta);

        jMenuBar1.add(menuVenta);

        menuUsuario.setText("Usuario");

        menuControlUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/clienteIco.png"))); // NOI18N
        menuControlUsuario.setText("Control");
        menuControlUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuControlUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuControlUsuario);

        jMenuBar1.add(menuUsuario);

        menuHerramienta.setText("Herramientas");

        menuCalculadora.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK));
        menuCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calculator Ico.png"))); // NOI18N
        menuCalculadora.setText("Calculadora");
        menuCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuCalculadoraMouseClicked(evt);
            }
        });
        menuCalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCalculadoraActionPerformed(evt);
            }
        });
        menuHerramienta.add(menuCalculadora);

        menuBloc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.SHIFT_MASK));
        menuBloc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/book_edit Ico.png"))); // NOI18N
        menuBloc.setText("Bloc de Notas");
        menuBloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBlocActionPerformed(evt);
            }
        });
        menuHerramienta.add(menuBloc);

        jMenuBar1.add(menuHerramienta);

        menuConfiguracion.setText("Configuración");

        menuCambiarcontrasenia.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        menuCambiarcontrasenia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/change-password.png"))); // NOI18N
        menuCambiarcontrasenia.setText("Cambiar contraseña");
        menuCambiarcontrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambiarcontraseniaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuCambiarcontrasenia);
        menuConfiguracion.add(jSeparator4);

        menuCerrarSesion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        menuCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrar_sesionIco.png"))); // NOI18N
        menuCerrarSesion.setText("Cerrar Sesión");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuCerrarSesion);

        menuSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        menuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir Ico.png"))); // NOI18N
        menuSalir.setText("Salir");
        menuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSalirActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuSalir);

        jMenuBar1.add(menuConfiguracion);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteControlActionPerformed
        frmCustomer bol=new frmCustomer();
        if(cBloqueroVentanas.isViewControlCliente()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewControlCliente(false);
        }     
    }//GEN-LAST:event_menuClienteControlActionPerformed

    private void menuClienteReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteReporteActionPerformed
        //frmReporteCliente c=new frmReporteCliente();
        //panel_principal.add(c);
        //c.setVisible(true);
    }//GEN-LAST:event_menuClienteReporteActionPerformed

    private void menuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClienteMouseClicked

    }//GEN-LAST:event_menuClienteMouseClicked

    private void menuProductoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductoControlActionPerformed
        frmProduct bol=new frmProduct();
        if(cBloqueroVentanas.isViewControlProducto()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewControlProducto(false);
        }
    }//GEN-LAST:event_menuProductoControlActionPerformed

    private void menuReporteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteProductoActionPerformed
//        frmReporteProducto l=new frmReporteProducto();
//        panel_principal.add(l);
//        l.setVisible(true);
    }//GEN-LAST:event_menuReporteProductoActionPerformed

    private void menuProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductoMouseClicked

    }//GEN-LAST:event_menuProductoMouseClicked

    private void menuEmpleadoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadoControlActionPerformed
        frmEmployee bol=new frmEmployee();
        if(cBloqueroVentanas.isViewControlEmpleado()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewControlEmpleado(false);
        }
    }//GEN-LAST:event_menuEmpleadoControlActionPerformed

    private void menuEmpleadoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadoReporteActionPerformed
        //new CReporte().imprimirEmpleado();
    }//GEN-LAST:event_menuEmpleadoReporteActionPerformed

    private void menuEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpleadoMouseClicked

    }//GEN-LAST:event_menuEmpleadoMouseClicked

    private void menuVentaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaVentaActionPerformed
        frmSale bol=new frmSale();
        if(cBloqueroVentanas.isViewVenta()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewVenta(false);
        }
    }//GEN-LAST:event_menuVentaVentaActionPerformed

    private void menuVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVentaMouseClicked

    }//GEN-LAST:event_menuVentaMouseClicked

    private void menuCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCalculadoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCalculadoraMouseClicked

    private void menuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculadoraActionPerformed
        long va = 1;
        try{   
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("calc");
            p.waitFor(va, TimeUnit.SECONDS);
        }catch (IOException | InterruptedException ioe ){}
    }//GEN-LAST:event_menuCalculadoraActionPerformed

    private void menuBlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBlocActionPerformed
        long va = 1;
        try{
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("notepad");
            p.waitFor(va, TimeUnit.SECONDS);
        }catch (IOException | InterruptedException ioe ){}
    }//GEN-LAST:event_menuBlocActionPerformed

    private void menuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargoActionPerformed
        frmPosition bol=new frmPosition();
        if(cBloqueroVentanas.isViewCargo()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewCargo(false);
        }
    }//GEN-LAST:event_menuCargoActionPerformed

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        access x = new access();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        try {
            Ejecucion.NewMain ne = new NewMain();
            ne.mysql_stop();
            new Control().cerrarApp();    
        } catch (IOException | InterruptedException ex) {
        }
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuCambiarcontraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambiarcontraseniaActionPerformed
        frmChangePassword bol=new frmChangePassword();
        if(cBloqueroVentanas.isViewCanbiarContrasenia()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewCanbiarContrasenia(false);
        }
    }//GEN-LAST:event_menuCambiarcontraseniaActionPerformed

    private void menuControlUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuControlUsuarioActionPerformed
        frmNewUser bol=new frmNewUser();
        if(cBloqueroVentanas.isViewControlUsuario()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewControlUsuario(false);
        }
    }//GEN-LAST:event_menuControlUsuarioActionPerformed

    private void menuVentaReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaReporteActionPerformed
//        frmReporteBoleta bol=new frmReporteBoleta();
//        panel_principal.add(bol);
//        bol.show();
    }//GEN-LAST:event_menuVentaReporteActionPerformed

    private void menuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaActionPerformed
        frmCategory bol=new frmCategory();
        if(cBloqueroVentanas.isViewCategoria()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewCategoria(false);
        }
    }//GEN-LAST:event_menuCategoriaActionPerformed

    private void menuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProveedorActionPerformed
        frmProvider bol=new frmProvider();
        if(cBloqueroVentanas.isViewProveedor()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewProveedor(false);
        }
    }//GEN-LAST:event_menuProveedorActionPerformed

    private void menuVerBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerBoletaActionPerformed
        frmViewSale bol=new frmViewSale();
        if(cBloqueroVentanas.isViewBoleta()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewBoleta(false);
        }
    }//GEN-LAST:event_menuVerBoletaActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
    //    new CReporte().reporteProveedor();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            Ejecucion.NewMain ne = new NewMain();
            ne.mysql_stop();
            new Control().cerrarApp();    
        } catch (IOException | InterruptedException ex) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        frmProduct bol=new frmProduct();
        if(cBloqueroVentanas.isViewControlProducto()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewControlProducto(false);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        frmViewSale bol=new frmViewSale();
        if(cBloqueroVentanas.isViewBoleta()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewBoleta(false);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        frmSale bol=new frmSale();
        if(cBloqueroVentanas.isViewVenta()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewVenta(false);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        frmCustomer bol=new frmCustomer();
        if(cBloqueroVentanas.isViewControlCliente()){
            panel_principal.add(bol);
            bol.show();
            cBloqueroVentanas.setViewControlCliente(false);
        }   
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        long va = 1;
        try{   
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("calc");
            p.waitFor(va, TimeUnit.SECONDS);
        }catch (IOException | InterruptedException ioe ){}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        long va = 1;
        try{
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("notepad");
            p.waitFor(va, TimeUnit.SECONDS);
        }catch (IOException | InterruptedException ioe ){}
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        access x = new access();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel lblhora;
    private javax.swing.JMenuItem menuBloc;
    private javax.swing.JMenuItem menuCalculadora;
    private javax.swing.JMenuItem menuCambiarcontrasenia;
    private javax.swing.JMenuItem menuCargo;
    private javax.swing.JMenuItem menuCategoria;
    private javax.swing.JMenuItem menuCerrarSesion;
    private javax.swing.JMenu menuCliente;
    private javax.swing.JMenuItem menuClienteControl;
    private javax.swing.JMenuItem menuClienteReporte;
    private javax.swing.JMenu menuConfiguracion;
    private javax.swing.JMenuItem menuControlUsuario;
    private javax.swing.JMenu menuEmpleado;
    private javax.swing.JMenuItem menuEmpleadoControl;
    private javax.swing.JMenuItem menuEmpleadoReporte;
    private javax.swing.JMenu menuHerramienta;
    private javax.swing.JMenu menuProducto;
    private javax.swing.JMenuItem menuProductoControl;
    private javax.swing.JMenu menuProve;
    private javax.swing.JMenuItem menuProveedor;
    private javax.swing.JMenuItem menuReporteProducto;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JMenu menuUsuario;
    private javax.swing.JMenu menuVenta;
    private javax.swing.JMenuItem menuVentaReporte;
    private javax.swing.JMenuItem menuVentaVenta;
    private javax.swing.JMenuItem menuVerBoleta;
    private javax.swing.JDesktopPane panel_principal;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
         Thread ct = Thread.currentThread();
         while(ct == h1) {   
          calcula();
          lblhora.setText(hora + ":" + minutos + ":" + segundos + " "+ampm);
          try {
           Thread.sleep(1000);
          }catch(InterruptedException e) {}
         }
    }

    public void calcula () {        
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
         int h = calendario.get(Calendar.HOUR_OF_DAY)-12;
         hora = h>9?""+h:"0"+h;
        }else{
         hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""
                 +calendario.get(Calendar.HOUR_OF_DAY):"0"
                 +calendario.get(Calendar.HOUR_OF_DAY);            
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""
                +calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""
                +calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }
}
