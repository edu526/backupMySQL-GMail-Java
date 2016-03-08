package Presentacion;

import Factory.FactoryConnectionDb;
import dao.CargoDao;
import dao.CargoDaoImp;
import java.awt.BorderLayout;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.ResourceBundle;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import reporte.CReporte;

public class MDI_Menu extends javax.swing.JFrame implements Runnable{
    ResourceBundle bundle;
    CargoDao cargodao_ = new CargoDaoImp();
    Object[][] o;
    
    //reloj
    String hora,minutos,segundos,ampm;
    Calendar calendario;    
    Thread h1;
    
    
    public MDI_Menu() {
        initComponents();
        
        traducir();
        //mostrar reloj
        
        h1 = new Thread(this);
        h1.start();
        
        //setLocationRelativeTo(null);//centrar el software
        setExtendedState(JFrame.MAXIMIZED_BOTH); //extender frame
        setTitle(bundle.getString("menu.tituloMenu.text")); //titulo del software
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono.jpg")).getImage());//cambiar de icono al software
        ((JPanel)getContentPane()).setOpaque(false); 
        ImageIcon uno=new ImageIcon(this.getClass().getResource("/imagenes/fondo01.png"));
        JLabel fondo= new JLabel(); 
        fondo.setIcon(uno); 
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        
        this.add(fondo, BorderLayout.CENTER);        
    }

    public void traducir(){
        if(FactoryConnectionDb.idioma==0) 
            bundle = ResourceBundle.getBundle("Propiedades/es_PE");
        else bundle = ResourceBundle.getBundle("Propiedades/eu_EU");
        
        setTitle(bundle.getString("menu.tituloMenu.text")); //titulo del software
        
        menuCliente.setText(bundle.getString("menu.menuCliente.text"));
        menuClienteControl.setText(bundle.getString("menu.menuControlCliente.text"));
        menuClienteReporte.setText(bundle.getString("menu.menuReporteCliente.text"));
        
        menuProducto.setText(bundle.getString("menu.menuProducto.text"));
        menuProductoControl.setText(bundle.getString("menu.menuControlProducto.text"));
        menuReporteProducto.setText(bundle.getString("menu.menuReporteProducto.text"));
        menuCategoria.setText(bundle.getString("menu.menuCategoria.text"));
        menuProveedor.setText(bundle.getString("menu.menuProveedor.text"));
        menuLaboratorio.setText(bundle.getString("menu.menuLaboratorio.text"));
        menuCatego.setText(bundle.getString("menu.menuCategoria.text"));
        menuProve.setText(bundle.getString("menu.menuProveedor.text"));
        menuLabo.setText(bundle.getString("menu.menuLaboratorio.text"));
        
        menuEmpleado.setText(bundle.getString("menu.menuEmpleado.text"));
        menuEmpleadoControl.setText(bundle.getString("menu.menuControlEmpleado.text"));
        menuEmpleadoReporte.setText(bundle.getString("menu.menuReporteEmpleado.text"));
        menuCargo.setText(bundle.getString("menu.menuReporteCargo.text"));
        menuCar.setText(bundle.getString("menu.menuReporteCargo.text"));
        
        menuVenta.setText(bundle.getString("menu.menuVenta.text"));
        menuVentaVenta.setText(bundle.getString("menu.menuVenta.text"));
        menuVentaReporte.setText(bundle.getString("menu.menuReporteVenta.text"));
        menuVerBoleta.setText(bundle.getString("menu.menuVerBoleta.text"));
        
        menuUsuario.setText(bundle.getString("menu.menuUsuario.text"));
        menuControlUsuario.setText(bundle.getString("menu.menuUsuarioControl.text"));
        
        menuHerramienta.setText(bundle.getString("menu.menuHerramienta.text"));
        menuCalculadora.setText(bundle.getString("menu.menuCalculadora.text"));
        menuBloc.setText(bundle.getString("menu.menuBloc.text"));
       
        menuConfiguracion.setText(bundle.getString("menu.menuConfiguracion.text"));
        lblIdiomaEs.setText(bundle.getString("menu.lblIdiomaEs.text"));
        lblIdiomaEu.setText(bundle.getString("menu.lblIdiomaEu.text"));
        lblIdioma.setText(bundle.getString("menu.lblIdioma.text"));
        menuCerrarSesion.setText(bundle.getString("menu.menuCerrarSesion.text"));
        menuSalir.setText(bundle.getString("menu.menuSalir.text"));        
        menuCambiarcontrasenia.setText(bundle.getString("menu.menuCambiarContraseina.text"));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel_principal = new javax.swing.JDesktopPane();
        lblhora = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuCliente = new javax.swing.JMenu();
        menuClienteControl = new javax.swing.JMenuItem();
        menuClienteReporte = new javax.swing.JMenuItem();
        menuProducto = new javax.swing.JMenu();
        menuProductoControl = new javax.swing.JMenuItem();
        menuReporteProducto = new javax.swing.JMenuItem();
        menuCatego = new javax.swing.JMenu();
        menuCategoria = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        menuProve = new javax.swing.JMenu();
        menuProveedor = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        menuLabo = new javax.swing.JMenu();
        menuLaboratorio = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        menuEmpleado = new javax.swing.JMenu();
        menuEmpleadoControl = new javax.swing.JMenuItem();
        menuEmpleadoReporte = new javax.swing.JMenuItem();
        menuCar = new javax.swing.JMenu();
        menuCargo = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        menuVenta = new javax.swing.JMenu();
        menuVentaVenta = new javax.swing.JMenuItem();
        menuVentaReporte = new javax.swing.JMenuItem();
        menuVerBoleta = new javax.swing.JMenuItem();
        menuUsuario = new javax.swing.JMenu();
        menuControlUsuario = new javax.swing.JMenuItem();
        menuHerramienta = new javax.swing.JMenu();
        menuCalculadora = new javax.swing.JMenuItem();
        menuBloc = new javax.swing.JMenuItem();
        menuConfiguracion = new javax.swing.JMenu();
        lblIdioma = new javax.swing.JMenu();
        lblIdiomaEs = new javax.swing.JRadioButtonMenuItem();
        lblIdiomaEu = new javax.swing.JRadioButtonMenuItem();
        menuCambiarcontrasenia = new javax.swing.JMenuItem();
        menuCerrarSesion = new javax.swing.JMenuItem();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panel_principal.setOpaque(false);

        lblhora.setFont(new java.awt.Font("Poor Richard", 1, 48)); // NOI18N
        lblhora.setForeground(new java.awt.Color(255, 255, 255));
        lblhora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblhora.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));

        javax.swing.GroupLayout panel_principalLayout = new javax.swing.GroupLayout(panel_principal);
        panel_principal.setLayout(panel_principalLayout);
        panel_principalLayout.setHorizontalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap(445, Short.MAX_VALUE)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_principalLayout.setVerticalGroup(
            panel_principalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_principalLayout.createSequentialGroup()
                .addContainerGap(345, Short.MAX_VALUE)
                .addComponent(lblhora, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_principal.setLayer(lblhora, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setInheritsPopupMenu(true);

        menuCliente.setText("Clientes");
        menuCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuClienteMouseClicked(evt);
            }
        });

        menuClienteControl.setText("Control");
        menuClienteControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuClienteControlActionPerformed(evt);
            }
        });
        menuCliente.add(menuClienteControl);

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

        menuProductoControl.setText("Control");
        menuProductoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProductoControlActionPerformed(evt);
            }
        });
        menuProducto.add(menuProductoControl);

        menuReporteProducto.setText("Reporte");
        menuReporteProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReporteProductoActionPerformed(evt);
            }
        });
        menuProducto.add(menuReporteProducto);

        menuCatego.setText("Categoría");

        menuCategoria.setText("Categoria");
        menuCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCategoriaActionPerformed(evt);
            }
        });
        menuCatego.add(menuCategoria);

        jMenuItem2.setText("Reporte");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        menuCatego.add(jMenuItem2);

        menuProducto.add(menuCatego);

        menuProve.setText("Proveedor");

        menuProveedor.setText("Proveedor");
        menuProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuProveedorActionPerformed(evt);
            }
        });
        menuProve.add(menuProveedor);

        jMenuItem3.setText("Reporte");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        menuProve.add(jMenuItem3);

        menuProducto.add(menuProve);

        menuLabo.setText("Laboratorio");

        menuLaboratorio.setText("Laboratorio");
        menuLaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLaboratorioActionPerformed(evt);
            }
        });
        menuLabo.add(menuLaboratorio);

        jMenuItem4.setText("Reporte");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        menuLabo.add(jMenuItem4);

        menuProducto.add(menuLabo);

        jMenuBar1.add(menuProducto);

        menuEmpleado.setText("Empleado");
        menuEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuEmpleadoMouseClicked(evt);
            }
        });

        menuEmpleadoControl.setText("Control");
        menuEmpleadoControl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadoControlActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuEmpleadoControl);

        menuEmpleadoReporte.setText("Reporte ");
        menuEmpleadoReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmpleadoReporteActionPerformed(evt);
            }
        });
        menuEmpleado.add(menuEmpleadoReporte);

        menuCar.setText("Cargo");

        menuCargo.setText("Control");
        menuCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCargoActionPerformed(evt);
            }
        });
        menuCar.add(menuCargo);

        jMenuItem1.setText("Reporte");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        menuCar.add(jMenuItem1);

        menuEmpleado.add(menuCar);

        jMenuBar1.add(menuEmpleado);

        menuVenta.setText("Venta");
        menuVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuVentaMouseClicked(evt);
            }
        });

        menuVentaVenta.setText("Venta");
        menuVentaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaVentaActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaVenta);

        menuVentaReporte.setText("Reporte");
        menuVentaReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentaReporteActionPerformed(evt);
            }
        });
        menuVenta.add(menuVentaReporte);

        menuVerBoleta.setText("Ver Boletas");
        menuVerBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerBoletaActionPerformed(evt);
            }
        });
        menuVenta.add(menuVerBoleta);

        jMenuBar1.add(menuVenta);

        menuUsuario.setText("Usuario");

        menuControlUsuario.setText("Control");
        menuControlUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuControlUsuarioActionPerformed(evt);
            }
        });
        menuUsuario.add(menuControlUsuario);

        jMenuBar1.add(menuUsuario);

        menuHerramienta.setText("Herramientas");

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

        menuBloc.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        menuBloc.setText("Bloc de Notas");
        menuBloc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBlocActionPerformed(evt);
            }
        });
        menuHerramienta.add(menuBloc);

        jMenuBar1.add(menuHerramienta);

        menuConfiguracion.setText("Configuración");

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

        menuConfiguracion.add(lblIdioma);

        menuCambiarcontrasenia.setText("Cambiar contraseña");
        menuCambiarcontrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCambiarcontraseniaActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuCambiarcontrasenia);

        menuCerrarSesion.setText("Cerrar Sesión");
        menuCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuCerrarSesionActionPerformed(evt);
            }
        });
        menuConfiguracion.add(menuCerrarSesion);

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
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuClienteControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteControlActionPerformed
        frmCliente bol=new frmCliente();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuClienteControlActionPerformed

    private void menuClienteReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuClienteReporteActionPerformed
        frmReporteCliente c=new frmReporteCliente();
        panel_principal.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_menuClienteReporteActionPerformed

    private void menuClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuClienteMouseClicked

    }//GEN-LAST:event_menuClienteMouseClicked

    private void menuProductoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProductoControlActionPerformed
        frmProducto c=new frmProducto();
        panel_principal.add(c);
        c.show();
    }//GEN-LAST:event_menuProductoControlActionPerformed

    private void menuReporteProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReporteProductoActionPerformed
        frmReporteProducto l=new frmReporteProducto();
        panel_principal.add(l);
        l.setVisible(true);
    }//GEN-LAST:event_menuReporteProductoActionPerformed

    private void menuProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuProductoMouseClicked

    }//GEN-LAST:event_menuProductoMouseClicked

    private void menuEmpleadoControlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadoControlActionPerformed
        frmEmpleado bol=new frmEmpleado();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuEmpleadoControlActionPerformed

    private void menuEmpleadoReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmpleadoReporteActionPerformed
        new CReporte().imprimirEmpleado();
    }//GEN-LAST:event_menuEmpleadoReporteActionPerformed

    private void menuEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuEmpleadoMouseClicked

    }//GEN-LAST:event_menuEmpleadoMouseClicked

    private void menuVentaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaVentaActionPerformed
        frmBoleta bol=new frmBoleta();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuVentaVentaActionPerformed

    private void menuVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuVentaMouseClicked

    }//GEN-LAST:event_menuVentaMouseClicked

    private void menuCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuCalculadoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_menuCalculadoraMouseClicked

    private void menuCalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCalculadoraActionPerformed
        try
        {
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("calc");
            p.waitFor();

        }
        catch (IOException ioe )
        {
            ioe.getStackTrace();
        }
        catch (InterruptedException ie )
        {
        }
    }//GEN-LAST:event_menuCalculadoraActionPerformed

    private void menuBlocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBlocActionPerformed
        try
        {
            Runtime rt=Runtime.getRuntime();
            Process p =rt.exec("notepad");
            p.waitFor();

        }
        catch (IOException ioe )
        {
            ioe.getStackTrace();
        }
        catch (InterruptedException ie )
        {
        }
    }//GEN-LAST:event_menuBlocActionPerformed

    private void menuCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCargoActionPerformed
        frmCargo bol=new frmCargo();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuCargoActionPerformed

    private void lblIdiomaEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIdiomaEsActionPerformed
        FactoryConnectionDb.idioma = 0;
        traducir();
    }//GEN-LAST:event_lblIdiomaEsActionPerformed

    private void lblIdiomaEuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblIdiomaEuActionPerformed
        FactoryConnectionDb.idioma = 1;
        traducir();
    }//GEN-LAST:event_lblIdiomaEuActionPerformed

    private void menuCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCerrarSesionActionPerformed
        acceso x = new acceso();
        x.setVisible(true);
        dispose();
    }//GEN-LAST:event_menuCerrarSesionActionPerformed

    private void menuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_menuSalirActionPerformed

    private void menuCambiarcontraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCambiarcontraseniaActionPerformed
        frmCambiarContrasenia x = new frmCambiarContrasenia();
        panel_principal.add(x);
        x.show(true);
    }//GEN-LAST:event_menuCambiarcontraseniaActionPerformed

    private void menuControlUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuControlUsuarioActionPerformed
        frmNuevoUsuario bol=new frmNuevoUsuario();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuControlUsuarioActionPerformed

    private void menuVentaReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentaReporteActionPerformed
        frmReporteBoleta bol=new frmReporteBoleta();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuVentaReporteActionPerformed

    private void menuCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuCategoriaActionPerformed
        frmCategoria bol=new frmCategoria();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuCategoriaActionPerformed

    private void menuLaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLaboratorioActionPerformed
       frmLaboratorio bol=new frmLaboratorio();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuLaboratorioActionPerformed

    private void menuProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuProveedorActionPerformed
        frmProveedor bol=new frmProveedor();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuProveedorActionPerformed

    private void menuVerBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerBoletaActionPerformed
        frmVerBoletas bol=new frmVerBoletas();
        panel_principal.add(bol);
        bol.show();
    }//GEN-LAST:event_menuVerBoletaActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        new CReporte().reporteCargo();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        new CReporte().reporteProveedor();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new CReporte().reporteCategoria();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        new CReporte().reporteLaboratorio();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu lblIdioma;
    private javax.swing.JRadioButtonMenuItem lblIdiomaEs;
    private javax.swing.JRadioButtonMenuItem lblIdiomaEu;
    private javax.swing.JLabel lblhora;
    private javax.swing.JMenuItem menuBloc;
    private javax.swing.JMenuItem menuCalculadora;
    private javax.swing.JMenuItem menuCambiarcontrasenia;
    private javax.swing.JMenu menuCar;
    private javax.swing.JMenuItem menuCargo;
    private javax.swing.JMenu menuCatego;
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
    private javax.swing.JMenu menuLabo;
    private javax.swing.JMenuItem menuLaboratorio;
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
         hora = calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);            
        }
        minutos = calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    }
}
