package com.mycompany.centroveterinarioixtepec.gui.mascotas;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class pnlMascotas extends javax.swing.JPanel {

    Controller control = null;
    JPanel pnlPrincipal = null;
    DefaultTableModel modelTabla = null;
    List<Mascota> listaMascotas = null;

    public pnlMascotas(JPanel pnlPrincipal) {
        control = new Controller();
        initComponents();
        cargarTabla();
        this.pnlPrincipal = pnlPrincipal;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnNuevaMascota = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarMascota = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarClave = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMascotas = new javax.swing.JTable();
        btnAsignarDesp = new javax.swing.JButton();
        btnAsignarVacuna = new javax.swing.JButton();
        btnAsignarIngreso = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("MASCOTAS");

        btnNuevaMascota.setBackground(new java.awt.Color(49, 161, 186));
        btnNuevaMascota.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNuevaMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaMascota.setText("Nueva mascota");
        btnNuevaMascota.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnNuevaMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaMascotaActionPerformed(evt);
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

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Buscar por mascota: ");

        txtBuscarMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarMascota.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtBuscarMascota.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarMascotaActionPerformed(evt);
            }
        });
        txtBuscarMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarMascotaKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Buscar por Clave del dueño:");

        txtBuscarClave.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarClave.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtBuscarClave.setForeground(new java.awt.Color(102, 102, 102));

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

        tblMascotas.setBackground(new java.awt.Color(255, 255, 255));
        tblMascotas.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblMascotas.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblMascotas.setForeground(new java.awt.Color(0, 0, 0));
        tblMascotas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "|", "NO.", "CLAVE DUEÑO", "DUEÑO", "NOMBRE", "ESPECIE", "RAZA", "COLOR", "SEÑAS", "NACIMIENTO"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblMascotas);
        if (tblMascotas.getColumnModel().getColumnCount() > 0) {
            tblMascotas.getColumnModel().getColumn(0).setMinWidth(1);
            tblMascotas.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblMascotas.getColumnModel().getColumn(0).setMaxWidth(1);
            tblMascotas.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblMascotas.getColumnModel().getColumn(2).setPreferredWidth(45);
            tblMascotas.getColumnModel().getColumn(3).setPreferredWidth(160);
            tblMascotas.getColumnModel().getColumn(4).setPreferredWidth(70);
            tblMascotas.getColumnModel().getColumn(5).setPreferredWidth(60);
            tblMascotas.getColumnModel().getColumn(6).setPreferredWidth(60);
            tblMascotas.getColumnModel().getColumn(7).setPreferredWidth(60);
            tblMascotas.getColumnModel().getColumn(8).setPreferredWidth(60);
            tblMascotas.getColumnModel().getColumn(9).setResizable(false);
            tblMascotas.getColumnModel().getColumn(9).setPreferredWidth(50);
        }

        btnAsignarDesp.setBackground(new java.awt.Color(49, 161, 186));
        btnAsignarDesp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAsignarDesp.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarDesp.setText("Asignar desparasitacion");
        btnAsignarDesp.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnAsignarDesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarDespActionPerformed(evt);
            }
        });

        btnAsignarVacuna.setBackground(new java.awt.Color(49, 161, 186));
        btnAsignarVacuna.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAsignarVacuna.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarVacuna.setText("Asignar vacuna");
        btnAsignarVacuna.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnAsignarVacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarVacunaActionPerformed(evt);
            }
        });

        btnAsignarIngreso.setBackground(new java.awt.Color(49, 161, 186));
        btnAsignarIngreso.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnAsignarIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnAsignarIngreso.setText("Asignar Ingreso");
        btnAsignarIngreso.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnAsignarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarIngresoActionPerformed(evt);
            }
        });

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
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnNuevaMascota)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAsignarDesp)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAsignarVacuna)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAsignarIngreso))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1063, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtBuscarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscarMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar)
                    .addComponent(btnAsignarDesp)
                    .addComponent(btnAsignarVacuna)
                    .addComponent(btnAsignarIngreso)
                    .addComponent(btnNuevaMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        eliminarMascota();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevaMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaMascotaActionPerformed

        pnlNuevaMascota pNuevaMascota = new pnlNuevaMascota(pnlPrincipal);

        cambiarPanel(pNuevaMascota);

    }//GEN-LAST:event_btnNuevaMascotaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        modificarMascota();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtBuscarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarMascotaActionPerformed

    }//GEN-LAST:event_txtBuscarMascotaActionPerformed

    private void txtBuscarMascotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarMascotaKeyReleased

        String nombreBuscado = txtBuscarMascota.getText();

        cargarTabla(nombreBuscado);

    }//GEN-LAST:event_txtBuscarMascotaKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        if (!txtBuscarClave.getText().equals("")) {
            buscarClave(txtBuscarClave.getText());
        } else {
            mostrarMensaje("No se escribió ninguna clave para buscar", "error", "Buscar cliente");
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        txtBuscarClave.setText("");
        cargarTabla();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAsignarDespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarDespActionPerformed
        
        asignarDesp();
        
    }//GEN-LAST:event_btnAsignarDespActionPerformed

    private void btnAsignarVacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarVacunaActionPerformed
        
        asignarVacuna();
        
    }//GEN-LAST:event_btnAsignarVacunaActionPerformed

    private void btnAsignarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarIngresoActionPerformed
        
        asignarIngreso();
        
    }//GEN-LAST:event_btnAsignarIngresoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAsignarDesp;
    private javax.swing.JButton btnAsignarIngreso;
    private javax.swing.JButton btnAsignarVacuna;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaMascota;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMascotas;
    private javax.swing.JTextField txtBuscarClave;
    private javax.swing.JTextField txtBuscarMascota;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        listaMascotas = control.traerMascotas();

        crearTabla();

    }

    private void cargarTabla(String nombreBuscado) {

        listaMascotas = control.traerMascotas(nombreBuscado);

        crearTabla();
    }

    private void buscarClave(String clave) {

        listaMascotas = control.traerMascotas2(clave);

        if (listaMascotas != null && !listaMascotas.isEmpty()) {
            crearTabla();
        } else {
            mostrarMensaje("No hay ningún clinete con clave: " + clave, "error", "Busqueda de cliente");
        }

    }

    public void crearTabla() {

        //Se define el modelo de la tabla
        if (modelTabla != null) {
            modelTabla.setRowCount(0);
        }
        modelTabla = (DefaultTableModel) tblMascotas.getModel();
        
        //Se recorre la lista para mostrar cada registro en la tabla
        if (listaMascotas != null) {
            int i = 1;
            for (Mascota mascota : listaMascotas) {                                
                
                Cliente cliente = mascota.getCliente();
                String dueño = cliente.getNombre() + " " + cliente.getApePaterno() + " " + cliente.getApeMaterno();
                Object[] objeto = {mascota.getIdMascota(), i, cliente.getClave(), dueño, mascota.getNombre(), mascota.getEspecie(), mascota.getRaza(), mascota.getColor(), mascota.getSenias(), mascota.getFecha_nacimiento()};

                modelTabla.addRow(objeto);
                
                i++;
            }
                        

        }

        tblMascotas.setModel(modelTabla);

    }

    private void eliminarMascota() {
        //Controla quw la tabla no esté vacía
        if (tblMascotas.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                int idMascotra = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));

                control.eliminarMascota(idMascotra);

                //Mensaje para el usuario
                mostrarMensaje("Mascota eliminada correctamente", "info", "Eliminación de mascota");

                cargarTabla();
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "error", "Eliminación de mascota");
            }
        } else {
            mostrarMensaje("No hay mascotas para eliminar", "error", "Eliminación de mascota");
        }
    }

    private void modificarMascota() {
        //Controla quw la tabla no esté vacía
        if (tblMascotas.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a modificar
                int idMascota = Integer.parseInt(String.valueOf(tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0)));

                String dueño = (String) tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 2);

                pnlModificarMascotas panelModificar = new pnlModificarMascotas(idMascota, pnlPrincipal, dueño);

                cambiarPanel(panelModificar);

            } else {
                mostrarMensaje("No se seleccionó ninguna Mascota", "error", "Modificación de cliente");
            }
        } else {
            mostrarMensaje("No hay mascotas para modificar", "error", "Modificación de cliente");
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
    
    private void asignarDesp() {
        //Controla quw la tabla no esté vacía
        if (tblMascotas.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                int idMascota = (int) tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0);

                Mascota mascota = control.traerMascota(idMascota);

                pnlNuevaDesp pNuevaDesp = new pnlNuevaDesp(pnlPrincipal, mascota);

                cambiarPanel(pNuevaDesp);

                cargarTabla();
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "error", "Asignación de desparasitacion");
            }
        } else {
            mostrarMensaje("No hay mascotas para asignar desparasitaciones", "error", "Asignación de desparasitacion");
        }
    }
    
    private void asignarVacuna() {
        //Controla quw la tabla no esté vacía
        if (tblMascotas.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                int idMascota = (int) tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0);

                Mascota mascota = control.traerMascota(idMascota);

                pnlNuevaVacuna pNuevaVacuna = new pnlNuevaVacuna(pnlPrincipal, mascota);

                cambiarPanel(pNuevaVacuna);

                cargarTabla();
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "error", "Asignación de desparasitacion");
            }
        } else {
            mostrarMensaje("No hay mascotas para asignar desparasitaciones", "error", "Asignación de desparasitacion");
        }
    }
    
    private void asignarIngreso() {
        //Controla quw la tabla no esté vacía
        if (tblMascotas.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblMascotas.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                int idMascota = (int) tblMascotas.getValueAt(tblMascotas.getSelectedRow(), 0);

                Mascota mascota = control.traerMascota(idMascota);

                pnlNuevoIngreso pNuevoIngreso = new pnlNuevoIngreso(pnlPrincipal, mascota);

                cambiarPanel(pNuevoIngreso);

                cargarTabla();
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "error", "Asignación de ingreso");
            }
        } else {
            mostrarMensaje("No hay mascotas para asignar ingresos", "error", "Asignación de ingreso");
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
