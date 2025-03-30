package com.mycompany.centroveterinarioixtepec.gui.clientes;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class pnlClientes extends javax.swing.JPanel {

    Controller control = null;
    JPanel pnlPrincipal = null;
    DefaultTableModel modelTabla = null;
    List<Cliente> listaClientes = null;
    Cliente cliente = null;

    public pnlClientes(JPanel pnlPrincipal) {
        control = new Controller();
        initComponents();
        cargarTabla();
        this.pnlPrincipal = pnlPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarNombre = new javax.swing.JTextField();
        btnNuevoCliente = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarClave = new javax.swing.JTextField();
        btnAsignarMascota = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("CLIENTES");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar por nombre:");

        txtBuscarNombre.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarNombre.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtBuscarNombre.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarNombreKeyReleased(evt);
            }
        });

        btnNuevoCliente.setBackground(new java.awt.Color(49, 161, 186));
        btnNuevoCliente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNuevoCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoCliente.setText("Nuevo");
        btnNuevoCliente.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnNuevoCliente.setMaximumSize(new java.awt.Dimension(136, 30));
        btnNuevoCliente.setMinimumSize(new java.awt.Dimension(136, 30));
        btnNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoClienteActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(49, 161, 186));
        btnEliminar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(49, 161, 186));
        btnModificar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setText("Modificar");
        btnModificar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(49, 161, 186));
        btnBuscar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar por Clave:");

        txtBuscarClave.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarClave.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtBuscarClave.setForeground(new java.awt.Color(102, 102, 102));

        btnAsignarMascota.setBackground(new java.awt.Color(49, 161, 186));
        btnAsignarMascota.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAsignarMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarMascota.setText("Asignar Mascota");
        btnAsignarMascota.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnAsignarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarMascotaActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(49, 161, 186));
        btnLimpiar.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        tblClientes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblClientes.setForeground(new java.awt.Color(0, 0, 0));
        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "|", "CLAVE", "NOMBRE", "APELLIDOS", "DIRECCIÓN", "CELULAR"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblClientes);
        if (tblClientes.getColumnModel().getColumnCount() > 0) {
            tblClientes.getColumnModel().getColumn(0).setMinWidth(1);
            tblClientes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblClientes.getColumnModel().getColumn(0).setMaxWidth(1);
            tblClientes.getColumnModel().getColumn(1).setPreferredWidth(20);
            tblClientes.getColumnModel().getColumn(2).setPreferredWidth(20);
            tblClientes.getColumnModel().getColumn(3).setPreferredWidth(100);
            tblClientes.getColumnModel().getColumn(4).setPreferredWidth(120);
            tblClientes.getColumnModel().getColumn(5).setPreferredWidth(50);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNuevoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAsignarMascota))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarClave)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevoCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsignarMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminarCliente();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoClienteActionPerformed

        pnlNuevoCliente pNuevoCliente = new pnlNuevoCliente(pnlPrincipal);

        cambiarPanel(pNuevoCliente);

    }//GEN-LAST:event_btnNuevoClienteActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        modificarCliente();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (!txtBuscarClave.getText().equals("")) {
            buscarCliente(txtBuscarClave.getText());
        } else {
            mostrarMensaje("No se escribió ninguna clave para buscar", "error", "Buscar cliente");
        }


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarNombreKeyReleased

        String nombreBuscado = txtBuscarNombre.getText();

        cargarTabla(nombreBuscado);

    }//GEN-LAST:event_txtBuscarNombreKeyReleased

    private void btnAsignarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarMascotaActionPerformed

        asignarMascota();

    }//GEN-LAST:event_btnAsignarMascotaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtBuscarClave.setText("");
        cargarTabla();

    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarMascota;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevoCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblClientes;
    private javax.swing.JTextField txtBuscarClave;
    private javax.swing.JTextField txtBuscarNombre;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        listaClientes = control.traerClientes();
        crearTabla();

    }

    private void cargarTabla(String nombreBuscado) {

        listaClientes = control.traerClientes(nombreBuscado);
        crearTabla();

    }

    private void buscarCliente(String clave) {
        cliente = control.traerCliente(clave);        

        if (cliente != null) {
            listaClientes.clear();
            listaClientes.add(cliente);
            crearTabla();
        } else {
            mostrarMensaje("No hay ningún cliente con clave: " + clave, "error", "Busqueda de cliente");
        }

    }

    public void crearTabla() {

        //Se define el modelo de la tabla
        if (modelTabla != null) {
            modelTabla.setRowCount(0);
        }
        modelTabla = (DefaultTableModel) tblClientes.getModel();

        //Se recorre la lista para mostrar cada registro en la tabla
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                Object[] objeto = {cliente.getIdCliente(), cliente.getClave(), cliente.getNombre(), cliente.getApePaterno() + " " + cliente.getApeMaterno(),
                    cliente.getDireccion(), cliente.getTelefono()};

                modelTabla.addRow(objeto);
            }

        }

        tblClientes.setModel(modelTabla);

    }

    private void eliminarCliente() {
        //Controla que la tabla no esté vacía
        if (tblClientes.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblClientes.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                String claveCliente = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1));

                if (control.eliminarCliente(claveCliente)) {
                    mostrarMensaje("Cliente eliminado correctamente", "info", "Eliminación de cliente");
                } else {
                    mostrarMensaje("El cliente no se puede eliminar porque tiene mascotas asociadas."
                            + "\n    Primero elimina a las mascotas para eliminar al cliente", "info", "Eliminación de cliente");
                }
                cargarTabla();
            } else {
                mostrarMensaje("No se seleccionó ningún cliente", "error", "Eliminación de cliente");
            }
        } else {
            mostrarMensaje("No hay clientes para eliminar", "error", "Eliminación de cliente");
        }
    }

    private void modificarCliente() {
        //Controla quw la tabla no esté vacía
        if (tblClientes.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblClientes.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a modificar
                String claveCliente = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1));

                pnlModificarClientes panelModificar = new pnlModificarClientes(claveCliente, pnlPrincipal);

                cambiarPanel(panelModificar);

            } else {
                mostrarMensaje("No se seleccionó ningún cliente", "error", "Eliminación de cliente");
            }
        } else {
            mostrarMensaje("No hay clientes para eliminar", "error", "Eliminación de cliente");
        }
    }

    public void mostrarMensaje(String mensaje, String tipoMensaje, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipoMensaje.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else {
            if (tipoMensaje.equals("error")) {
                optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
            }
        }

        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }

    private void asignarMascota() {
        //Controla quw la tabla no esté vacía
        if (tblClientes.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblClientes.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                String claveCliente = String.valueOf(tblClientes.getValueAt(tblClientes.getSelectedRow(), 1));

                Cliente cliente = control.traerCliente(claveCliente);

                pnlNuevaMascota pNuevaMascota = new pnlNuevaMascota(pnlPrincipal, cliente);

                cambiarPanel(pNuevaMascota);

                cargarTabla();
            } else {
                mostrarMensaje("No se seleccionó ningún cliente", "error", "Asignación de mascota");
            }
        } else {
            mostrarMensaje("No hay clientes para asignar mascotas", "error", "Asignación de mascota");
        }
    }

    public void cambiarPanel(JPanel panel) {
        panel.setLocation(0, 0);
        panel.setSize(1720, 972);

        pnlPrincipal.removeAll();
        pnlPrincipal.add(panel, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();

    }

}
