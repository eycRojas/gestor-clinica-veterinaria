package com.mycompany.centroveterinarioixtepec.gui.desparasitaciones;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import com.mycompany.centroveterinarioixtepec.entidades.Desparasitacion;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import java.util.List;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JPanel;

public class pnlDesparasitaciones extends javax.swing.JPanel {

    Controller control = null;
    JPanel pnlPrincipal = null;
    DefaultTableModel modelTabla = null;
    List<Desparasitacion> listaDesparasitaciones = null;

    public pnlDesparasitaciones(JPanel pnlPrincipal) {
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
        btnNuevaDesp = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtBuscarDesparasitante = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDesparasitantes = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtBuscarClave = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();

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
        jLabel2.setText("DESPARASITACIONES");

        btnNuevaDesp.setBackground(new java.awt.Color(49, 161, 186));
        btnNuevaDesp.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnNuevaDesp.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaDesp.setText("Nuevo registro");
        btnNuevaDesp.setMargin(new java.awt.Insets(2, 4, 2, 4));
        btnNuevaDesp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaDespActionPerformed(evt);
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

        txtBuscarDesparasitante.setBackground(new java.awt.Color(255, 255, 255));
        txtBuscarDesparasitante.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N
        txtBuscarDesparasitante.setForeground(new java.awt.Color(102, 102, 102));
        txtBuscarDesparasitante.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarDesparasitanteKeyReleased(evt);
            }
        });

        tblDesparasitantes.setBackground(new java.awt.Color(255, 255, 255));
        tblDesparasitantes.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tblDesparasitantes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tblDesparasitantes.setForeground(new java.awt.Color(0, 0, 0));
        tblDesparasitantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "|", "NO.", "CLAVE DUEÑO", "MASCOTA", "ESPECIE", "DUEÑO", "FECHA", "DESPARASITANTE", "DOSIS(ml)", "PESO(kg)", "TEMPERATURA(C°)", "PROXIMA DOSIS"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDesparasitantes);
        if (tblDesparasitantes.getColumnModel().getColumnCount() > 0) {
            tblDesparasitantes.getColumnModel().getColumn(0).setMinWidth(1);
            tblDesparasitantes.getColumnModel().getColumn(0).setPreferredWidth(1);
            tblDesparasitantes.getColumnModel().getColumn(0).setMaxWidth(1);
            tblDesparasitantes.getColumnModel().getColumn(1).setPreferredWidth(15);
            tblDesparasitantes.getColumnModel().getColumn(2).setPreferredWidth(100);
            tblDesparasitantes.getColumnModel().getColumn(4).setPreferredWidth(50);
            tblDesparasitantes.getColumnModel().getColumn(5).setPreferredWidth(160);
            tblDesparasitantes.getColumnModel().getColumn(6).setPreferredWidth(50);
            tblDesparasitantes.getColumnModel().getColumn(8).setPreferredWidth(30);
            tblDesparasitantes.getColumnModel().getColumn(9).setPreferredWidth(40);
        }

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

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Buscar por fechas entre: ");

        jDateChooser1.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser1.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jDateChooser3.setForeground(new java.awt.Color(102, 102, 102));
        jDateChooser3.setFont(new java.awt.Font("Arial", 0, 15)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("y");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(jLabel2))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(260, 260, 260)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel5)
                                        .addGap(8, 8, 8)
                                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 492, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 963, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBuscarDesparasitante, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnNuevaDesp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEliminar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnModificar))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtBuscarClave, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnBuscar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnLimpiar)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtBuscarDesparasitante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel5)
                        .addComponent(jDateChooser3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscarClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(btnLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevaDesp)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
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

        eliminarRegistro();

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevaDespActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaDespActionPerformed

        pnlNuevaDesp pNuevaDesp = new pnlNuevaDesp(pnlPrincipal);

        cambiarPanel(pNuevaDesp);

    }//GEN-LAST:event_btnNuevaDespActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        modificarRegistro();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtBuscarDesparasitanteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarDesparasitanteKeyReleased

        String nombreBuscado = txtBuscarDesparasitante.getText();

        cargarTabla(nombreBuscado);

    }//GEN-LAST:event_txtBuscarDesparasitanteKeyReleased

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevaDesp;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblDesparasitantes;
    private javax.swing.JTextField txtBuscarClave;
    private javax.swing.JTextField txtBuscarDesparasitante;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {

        listaDesparasitaciones = control.traerDespartasitaciones();
        crearTabla();

    }

    private void cargarTabla(String nombreBuscado) {

        listaDesparasitaciones = control.traerDespartasitaciones(nombreBuscado);
        crearTabla();

    }

    private void buscarClave(String clave) {

        listaDesparasitaciones = control.traerDespartasitaciones2(clave);

        if (listaDesparasitaciones != null && !listaDesparasitaciones.isEmpty()) {
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
        modelTabla = (DefaultTableModel) tblDesparasitantes.getModel();

        //Se recorre la lista para mostrar cada registro en la tabla
        if (listaDesparasitaciones != null) {
            int i = 1;
            for (Desparasitacion desparasitacion : listaDesparasitaciones) {
                Mascota mascota = desparasitacion.getMascota();
                Cliente cliente = mascota.getCliente();

                String dueño = cliente.getNombre() + " " + cliente.getApePaterno();

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

                String fechaOriginal = desparasitacion.getFechaDesparasitacion(); // Fecha en formato yyyy-MM-dd
                LocalDate fecha = LocalDate.parse(fechaOriginal); // Convierte a LocalDate                
                String fechaFormateada = fecha.format(formatter);

                String fechaProxFormateada = "";
                String fechaProxOriginal = desparasitacion.getFechaProxDesparasitacion();
                if (fechaProxOriginal != null) {
                    LocalDate fechaProx = LocalDate.parse(fechaProxOriginal);
                    fechaProxFormateada = fechaProx.format(formatter);
                } else {
                    fechaProxFormateada = "Finalizada";
                }

                Object[] objeto = {desparasitacion.getIdDesparasitante(), i, cliente.getClave(), mascota.getNombre(), mascota.getEspecie(), dueño, fechaFormateada, desparasitacion.getNombreDesparasitante(),
                    desparasitacion.getDosis(), desparasitacion.getPeso(), desparasitacion.getTemperatura(), fechaProxFormateada};

                modelTabla.addRow(objeto);

                i++;
            }

        }

        tblDesparasitantes.setModel(modelTabla);

    }

    private void eliminarRegistro() {
        //Controla quw la tabla no esté vacía
        if (tblDesparasitantes.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblDesparasitantes.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a eliminar
                int idRegistro = Integer.parseInt(String.valueOf(tblDesparasitantes.getValueAt(tblDesparasitantes.getSelectedRow(), 1)));

                control.eliminarDesparasitante(idRegistro);

                //Mensaje para el usuario
                mostrarMensaje("Registro eliminado correctamente", "info", "Eliminación de registros");

                cargarTabla();
            } else {
                mostrarMensaje("Registro eliminado correctamente", "info", "Eliminación de registros");
            }
        } else {
            mostrarMensaje("No hay registros para eliminar", "error", "Eliminación de registros");
        }
    }

    private void modificarRegistro() {
        //Controla quw la tabla no esté vacía
        if (tblDesparasitantes.getRowCount() > 0) {
            //Controla que se haya seleccionado un registro
            if (tblDesparasitantes.getSelectedRow() != -1) {
                //Se obtiene la id del cliente a modificar
                int idRegistro = Integer.parseInt(String.valueOf(tblDesparasitantes.getValueAt(tblDesparasitantes.getSelectedRow(), 0)));

                String mascota = (String) tblDesparasitantes.getValueAt(tblDesparasitantes.getSelectedRow(), 3)
                        + "|" + tblDesparasitantes.getValueAt(tblDesparasitantes.getSelectedRow(), 5);

                pnlModificarDesp panelModificar = new pnlModificarDesp(idRegistro, pnlPrincipal, mascota);

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

    public void cambiarPanel(JPanel panel) {
        panel.setLocation(0, 0);
        panel.setSize(1720, 972);

        pnlPrincipal.removeAll();
        pnlPrincipal.add(panel, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();

    }

}
