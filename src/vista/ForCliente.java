/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Cliente;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jhon
 */
public class ForCliente extends javax.swing.JFrame {
    
    private ForListaClientes listaClientes;
    private Cliente c;
    
    /**
     * Creates new form ForMenu
     */
    public ForCliente() {
        initComponents();
        AreaCentral.setBackground(new java.awt.Color(52,52,52,235));//Transparecia en el jPanel
        
    }

    public void setListaClientes(ForListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }
    
    public void inforActualizar () {
        if (listaClientes.getAccion().equals("actualizar")) {
            cajaIdCliente.setEnabled(false);
            textoTitulo.setText("Actualzar");
            jLabel10.setText("Actualzar");
            jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Change_User_32px.png")));
            c = listaClientes.getClienteBD().cargarUnCliente(listaClientes.getId());
            cargarTextos();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Encabezado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        nombreEmpresa = new javax.swing.JLabel();
        GuardarPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        LimpiarPanel = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        MenuPanel = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        RegresarPanel = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        SalirPanel = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        AreaCentral = new javax.swing.JPanel();
        textoTitulo = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaDireccion = new javax.swing.JTextField();
        cajaCuidad = new javax.swing.JTextField();
        comboTipoAsesoria = new javax.swing.JComboBox<>();
        comboAsesor = new javax.swing.JComboBox<>();
        textoID = new javax.swing.JLabel();
        cajaIdCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Servicio Asesoramiento");
        setMinimumSize(new java.awt.Dimension(1270, 720));
        setUndecorated(true);
        setResizable(false);

        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encabezado.setBackground(new java.awt.Color(243, 243, 243));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(52, 52, 52));
        jLabel3.setText("X");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(52, 52, 52));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cliente");

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EncabezadoLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1226, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Fondo.add(Encabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 60));

        Menu.setBackground(new java.awt.Color(142, 139, 130));
        Menu.setPreferredSize(new java.awt.Dimension(384, 720));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Handle_With_Care_96px.png"))); // NOI18N

        nombreEmpresa.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        nombreEmpresa.setForeground(new java.awt.Color(233, 220, 190));
        nombreEmpresa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreEmpresa.setText("Nombre de la Empresa");

        GuardarPanel.setBackground(new java.awt.Color(172, 169, 160));
        GuardarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarPanelMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(233, 220, 190));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Add_User_Male_32px.png"))); // NOI18N
        jLabel10.setText("Guardar");

        javax.swing.GroupLayout GuardarPanelLayout = new javax.swing.GroupLayout(GuardarPanel);
        GuardarPanel.setLayout(GuardarPanelLayout);
        GuardarPanelLayout.setHorizontalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        GuardarPanelLayout.setVerticalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        LimpiarPanel.setBackground(new java.awt.Color(172, 169, 160));
        LimpiarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LimpiarPanelMouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(233, 220, 190));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Broom_32px.png"))); // NOI18N
        jLabel11.setText("Limpiar");

        javax.swing.GroupLayout LimpiarPanelLayout = new javax.swing.GroupLayout(LimpiarPanel);
        LimpiarPanel.setLayout(LimpiarPanelLayout);
        LimpiarPanelLayout.setHorizontalGroup(
            LimpiarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        LimpiarPanelLayout.setVerticalGroup(
            LimpiarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        MenuPanel.setBackground(new java.awt.Color(172, 169, 160));
        MenuPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuPanelMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(233, 220, 190));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Menu_32px.png"))); // NOI18N
        jLabel12.setText("Menú");

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        RegresarPanel.setBackground(new java.awt.Color(172, 169, 160));
        RegresarPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarPanelMouseClicked(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(233, 220, 190));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Go_Back_32px.png"))); // NOI18N
        jLabel13.setText("Regresar");

        javax.swing.GroupLayout RegresarPanelLayout = new javax.swing.GroupLayout(RegresarPanel);
        RegresarPanel.setLayout(RegresarPanelLayout);
        RegresarPanelLayout.setHorizontalGroup(
            RegresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        RegresarPanelLayout.setVerticalGroup(
            RegresarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        SalirPanel.setBackground(new java.awt.Color(172, 169, 160));
        SalirPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalirPanelMouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(233, 220, 190));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/icons8_Exit_32px.png"))); // NOI18N
        jLabel16.setText("Salir");

        javax.swing.GroupLayout SalirPanelLayout = new javax.swing.GroupLayout(SalirPanel);
        SalirPanel.setLayout(SalirPanelLayout);
        SalirPanelLayout.setHorizontalGroup(
            SalirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );
        SalirPanelLayout.setVerticalGroup(
            SalirPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(nombreEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SalirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RegresarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimpiarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(GuardarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombreEmpresa)
                .addGap(67, 67, 67)
                .addComponent(GuardarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(LimpiarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(RegresarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(SalirPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        Fondo.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 350, 720));

        AreaCentral.setBackground(new java.awt.Color(52, 52, 52));
        AreaCentral.setPreferredSize(new java.awt.Dimension(890, 720));

        textoTitulo.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        textoTitulo.setForeground(new java.awt.Color(233, 220, 190));
        textoTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textoTitulo.setText("Crear");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 220, 190));
        jLabel5.setText("Nombre");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(233, 220, 190));
        jLabel6.setText("Dirección");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(233, 220, 190));
        jLabel7.setText("Cuidad");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(233, 220, 190));
        jLabel8.setText("Tipo asesoria");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(233, 220, 190));
        jLabel9.setText("Asesor");

        cajaNombre.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaNombreKeyTyped(evt);
            }
        });

        cajaDireccion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaDireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaDireccionKeyTyped(evt);
            }
        });

        cajaCuidad.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaCuidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaCuidadKeyTyped(evt);
            }
        });

        comboTipoAsesoria.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        comboAsesor.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        textoID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        textoID.setForeground(new java.awt.Color(233, 220, 190));
        textoID.setText("ID cliente");

        cajaIdCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        cajaIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cajaIdClienteKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout AreaCentralLayout = new javax.swing.GroupLayout(AreaCentral);
        AreaCentral.setLayout(AreaCentralLayout);
        AreaCentralLayout.setHorizontalGroup(
            AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(textoTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AreaCentralLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(textoID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cajaIdCliente)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaDireccion, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cajaCuidad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboAsesor, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboTipoAsesoria, 0, 410, Short.MAX_VALUE))
                .addGap(96, 96, 96))
        );
        AreaCentralLayout.setVerticalGroup(
            AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AreaCentralLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(textoTitulo)
                .addGap(50, 50, 50)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoID)
                    .addComponent(cajaIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cajaCuidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(comboTipoAsesoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(AreaCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comboAsesor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        Fondo.add(AreaCentral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 720));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/textura-papel-arrugado.jpg"))); // NOI18N
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 720));

        getContentPane().add(Fondo, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        if (listaClientes != null) {
            listaClientes.getClienteBD().cerrarConexion();
        }
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void LimpiarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LimpiarPanelMouseClicked
        limpiarTextos();
    }//GEN-LAST:event_LimpiarPanelMouseClicked

    private void SalirPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalirPanelMouseClicked
        if (listaClientes != null) {
            listaClientes.getClienteBD().cerrarConexion();
        }
        System.exit(0);
    }//GEN-LAST:event_SalirPanelMouseClicked

    private void RegresarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarPanelMouseClicked
        listaClientes.cargarTabla();
        listaClientes.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_RegresarPanelMouseClicked

    private void MenuPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuPanelMouseClicked
        if (listaClientes != null) {
            listaClientes.getClienteBD().cerrarConexion();
        }
        new ForMenu().setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MenuPanelMouseClicked

    private void GuardarPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarPanelMouseClicked
        if (!cajaIdCliente.getText().isEmpty()) {
            c = new Cliente();
            c.setIdCliente(cajaIdCliente.getText());
            c.setNombreCliente(cajaNombre.getText());
            c.setCalleCliente(cajaDireccion.getText());
            c.setCiudadCliente(cajaCuidad.getText());
            c.setTipoAsesoria(comboTipoAsesoria.getSelectedItem().toString());
            c.setIdEmpleadoAsesor(comboAsesor.getSelectedItem().toString());
            if (jLabel10.getText().equals("Guardar") && !listaClientes.getClienteBD().idDuplicada(c.getIdCliente())) {
                listaClientes.getClienteBD().crearCliente(c);
                limpiarTextos();
            } else if (jLabel10.getText().equals("Actualzar")) {
                listaClientes.getClienteBD().actualizarCliente(c);
                listaClientes.cargarTabla();
                listaClientes.setVisible(true);
                setVisible(false);
                limpiarTextos();
            } else {
                JOptionPane.showMessageDialog(null, "Se presento un error en el ID, puede estar duplicado.", "Error en operación", JOptionPane.ERROR_MESSAGE);
            }
            
        }
    }//GEN-LAST:event_GuardarPanelMouseClicked

    private void cajaIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaIdClienteKeyTyped
        limitarCajas(20, cajaIdCliente, evt);
    }//GEN-LAST:event_cajaIdClienteKeyTyped

    private void cajaNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaNombreKeyTyped
        limitarCajas(50, cajaNombre, evt);
    }//GEN-LAST:event_cajaNombreKeyTyped

    private void cajaDireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaDireccionKeyTyped
        limitarCajas(20, cajaDireccion, evt);
    }//GEN-LAST:event_cajaDireccionKeyTyped

    private void cajaCuidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cajaCuidadKeyTyped
        limitarCajas(20, cajaCuidad, evt);
    }//GEN-LAST:event_cajaCuidadKeyTyped

    
    //Metodos mios
    
    private void limpiarTextos () {
        if (!listaClientes.getAccion().equals("actualizar")) {
            cajaIdCliente.setText("");
            cajaIdCliente.setEnabled(true);
        }
        cajaIdCliente.setText("");
        cajaNombre.setText("");
        cajaDireccion.setText("");
        cajaCuidad.setText("");
        comboTipoAsesoria.setSelectedIndex(-1);
        comboAsesor.setSelectedIndex(-1);
    }
    
    public void cargarListas () {
        LinkedList lista = listaClientes.getClienteBD().idEmpleados();
        comboTipoAsesoria.removeAllItems();
        comboTipoAsesoria.addItem("");
        comboTipoAsesoria.addItem("asesor prestamo");
        comboTipoAsesoria.addItem("Información de cuentas");
        comboTipoAsesoria.addItem("Asesorias");
        comboAsesor.removeAllItems();
        comboAsesor.addItem("");
        for (int i = 0; i < lista.size(); i++) {
            comboAsesor.addItem(lista.get(i).toString());
        }
        comboAsesor.setSelectedIndex(-1);
        comboTipoAsesoria.setSelectedIndex(-1);
    }
    
    public void cargarTextos () {
        cajaIdCliente.setText(c.getIdCliente());
        cajaNombre.setText(c.getNombreCliente());
        cajaDireccion.setText(c.getCalleCliente());
        cajaCuidad.setText(c.getCiudadCliente());
        comboTipoAsesoria.setSelectedItem(c.getTipoAsesoria());
        comboAsesor.setSelectedItem(c.getIdEmpleadoAsesor());
    }
    
    public void limitarCajas (int limite, javax.swing.JTextField cajaTexto, java.awt.event.KeyEvent eventoMouse) {
        if (cajaTexto.getText().length() >= limite) {
            eventoMouse.consume();
            getToolkit().beep();
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ForCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ForCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ForCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ForCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ForCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AreaCentral;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel GuardarPanel;
    private javax.swing.JPanel LimpiarPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel RegresarPanel;
    private javax.swing.JPanel SalirPanel;
    private javax.swing.JTextField cajaCuidad;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaIdCliente;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboAsesor;
    private javax.swing.JComboBox<String> comboTipoAsesoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nombreEmpresa;
    private javax.swing.JLabel textoID;
    private javax.swing.JLabel textoTitulo;
    // End of variables declaration//GEN-END:variables
}