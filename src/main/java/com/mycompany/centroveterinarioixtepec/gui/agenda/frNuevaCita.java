package com.mycompany.centroveterinarioixtepec.gui.agenda;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class frNuevaCita extends javax.swing.JFrame {

    Controller control = new Controller();
    Calendar calendar = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
    List<Mascota> listaMascotas = new LinkedList<Mascota>();
    JPanel pnlPrincipal = null;
    int año, mes, dia;

    public frNuevaCita(int año, int mes, int dia, JPanel pnlPrincipal) {
        this.pnlPrincipal = pnlPrincipal;
        this.año = año;
        this.mes = mes;
        this.dia = dia;
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        calendar.set(año, mes - 1, dia);
        String fechaFormateada = sdf.format(calendar.getTime());
        this.setTitle("Nueva cita para: " + fechaFormateada);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        txtClaveDueño = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        comboDueños = new javax.swing.JComboBox<>();
        label5 = new javax.swing.JLabel();
        txtDueño = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        label2 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        comboMascotas = new javax.swing.JComboBox<>();
        label6 = new javax.swing.JLabel();
        txtAsunto = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        label3 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        label4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        btnGuardarCita = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Clave del dueño:");

        txtClaveDueño.setBackground(new java.awt.Color(255, 255, 255));
        txtClaveDueño.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtClaveDueño.setForeground(new java.awt.Color(51, 51, 51));
        txtClaveDueño.setBorder(null);
        txtClaveDueño.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtClaveDueñoKeyReleased(evt);
            }
        });

        comboDueños.setBackground(new java.awt.Color(255, 255, 255));
        comboDueños.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        comboDueños.setForeground(new java.awt.Color(102, 102, 102));
        comboDueños.setBorder(null);
        comboDueños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDueñosActionPerformed(evt);
            }
        });

        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Dueño:");

        txtDueño.setBackground(new java.awt.Color(255, 255, 255));
        txtDueño.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtDueño.setForeground(new java.awt.Color(51, 51, 51));

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Mascota:");

        txtMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtMascota.setForeground(new java.awt.Color(51, 51, 51));

        comboMascotas.setBackground(new java.awt.Color(255, 255, 255));
        comboMascotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        comboMascotas.setForeground(new java.awt.Color(102, 102, 102));
        comboMascotas.setBorder(null);
        comboMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMascotasActionPerformed(evt);
            }
        });

        label6.setBackground(new java.awt.Color(255, 255, 255));
        label6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label6.setForeground(new java.awt.Color(0, 0, 0));
        label6.setText("Asunto:");

        txtAsunto.setBackground(new java.awt.Color(255, 255, 255));
        txtAsunto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtAsunto.setForeground(new java.awt.Color(51, 51, 51));
        txtAsunto.setBorder(null);

        label3.setBackground(new java.awt.Color(255, 255, 255));
        label3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label3.setForeground(new java.awt.Color(0, 0, 0));
        label3.setText("Hora:");

        label7.setBackground(new java.awt.Color(255, 255, 255));
        label7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label7.setForeground(new java.awt.Color(0, 0, 0));
        label7.setText(":");

        label4.setBackground(new java.awt.Color(255, 255, 255));
        label4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label4.setForeground(new java.awt.Color(0, 0, 0));
        label4.setText("Descripción:");

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtDescripcion.setForeground(new java.awt.Color(51, 51, 51));
        txtDescripcion.setRows(5);
        txtDescripcion.setBorder(null);
        jScrollPane1.setViewportView(txtDescripcion);

        btnGuardarCita.setBackground(new java.awt.Color(49, 161, 186));
        btnGuardarCita.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnGuardarCita.setText("Guardar");
        btnGuardarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarCitaActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(49, 161, 186));
        btnCancelar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtHora.setForeground(new java.awt.Color(51, 51, 51));
        txtHora.setBorder(null);

        txtMinuto.setBackground(new java.awt.Color(255, 255, 255));
        txtMinuto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtMinuto.setForeground(new java.awt.Color(51, 51, 51));
        txtMinuto.setBorder(null);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(label5)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(164, 164, 164)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtAsunto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator4)
                                                .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(comboDueños, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jSeparator1)
                                                .addComponent(txtClaveDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label2)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(164, 164, 164)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(comboMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(label1)
                            .addGap(328, 328, 328))))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaveDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label1))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboDueños, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5)
                    .addComponent(txtDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label3))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCita)
                    .addComponent(btnCancelar))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtClaveDueñoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveDueñoKeyReleased

        cargarComboDueños(txtClaveDueño.getText());

        comboDueños.showPopup();
    }//GEN-LAST:event_txtClaveDueñoKeyReleased

    private void comboDueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDueñosActionPerformed
        txtClaveDueño.setText(String.valueOf(comboDueños.getSelectedItem()));

        Cliente cliente = control.traerCliente(txtClaveDueño.getText());

        String dueño = cliente.getNombre() + " " + cliente.getApePaterno() + " " + cliente.getApeMaterno();

        txtDueño.setText(dueño);

        cargarComboMascotas(txtClaveDueño.getText());

    }//GEN-LAST:event_comboDueñosActionPerformed

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed

        if (!txtClaveDueño.getText().equals("") && !txtDueño.getText().equals("") && !txtMascota.getText().equals("") && !txtAsunto.getText().equals("")
                && !txtHora.getText().equals("") && !txtMinuto.getText().equals("") && !txtDescripcion.getText().equals("")) {

            System.out.println("entra");

            Mascota mascota = null;
            String nombreMascota = txtMascota.getText();

            for (Mascota mascotaLista : listaMascotas) {
                if (mascotaLista.getIdMascota() == Integer.parseInt(String.valueOf(nombreMascota.charAt(0)))) {
                    mascota = mascotaLista;
                }
            }

            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(calendar.getTime());

            if (control.nuevaCita(txtAsunto.getText(), txtDescripcion.getText(), fecha,
                    txtHora.getText() + ":" + txtMinuto.getText(),
                    "N", mascota)) {

                mostrarMensaje("Cita agendada correctamente", "info", "Registro de citas");

                LocalDate fechaActual = LocalDate.now();
                LocalDate fechaCitas = LocalDate.of(año, mes, dia);

                pnlAgenda pAgenda = new pnlAgenda(pnlPrincipal, fechaActual, fechaCitas);
                cambiarPanel(pAgenda);

                this.dispose();

            }

        } else {
            mostrarMensaje("Favor de rellenar todos los campos", "error", "Registro de citas");
        }

    }//GEN-LAST:event_btnGuardarCitaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void comboMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMascotasActionPerformed

        txtMascota.setText(String.valueOf(comboMascotas.getSelectedItem()));

    }//GEN-LAST:event_comboMascotasActionPerformed

    private void cargarComboDueños(String claveBuscado) {
        //Se define el modelo de la tabla
        DefaultComboBoxModel modelComboBox = new DefaultComboBoxModel();

        List<Cliente> listaClientes = control.traerClientesClave(claveBuscado);

        //Se recorre la lista para mostrar cada registro en la tabla
        if (listaClientes != null) {
            for (Cliente cliente : listaClientes) {
                String clave = cliente.getClave();

                modelComboBox.addElement(clave);
            }

        }

        comboDueños.setModel(modelComboBox);
    }

    private void cargarComboMascotas(String curpDueño) {
        //Se define el modelo de la tabla
        DefaultComboBoxModel modelComboBox = new DefaultComboBoxModel();

        listaMascotas = control.traerMascotas2(curpDueño);

        //Se recorre la lista para mostrar cada registro en la tabla
        if (listaMascotas != null) {
            for (Mascota mascota : listaMascotas) {
                String nombreMascota = mascota.getIdMascota() + "." + mascota.getNombre();

                modelComboBox.addElement(nombreMascota);
            }

        }

        comboMascotas.setModel(modelComboBox);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardarCita;
    private javax.swing.JComboBox<String> comboDueños;
    private javax.swing.JComboBox<String> comboMascotas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    public javax.swing.JLabel label1;
    public javax.swing.JLabel label2;
    public javax.swing.JLabel label3;
    public javax.swing.JLabel label4;
    public javax.swing.JLabel label5;
    public javax.swing.JLabel label6;
    public javax.swing.JLabel label7;
    public javax.swing.JTextField txtAsunto;
    public javax.swing.JTextField txtClaveDueño;
    private javax.swing.JTextArea txtDescripcion;
    public javax.swing.JLabel txtDueño;
    private javax.swing.JTextField txtHora;
    public javax.swing.JLabel txtMascota;
    private javax.swing.JTextField txtMinuto;
    // End of variables declaration//GEN-END:variables
}
