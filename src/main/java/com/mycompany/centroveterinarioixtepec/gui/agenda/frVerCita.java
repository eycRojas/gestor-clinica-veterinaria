package com.mycompany.centroveterinarioixtepec.gui.agenda;

import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import java.awt.BorderLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class frVerCita extends javax.swing.JFrame {

    Controller control = new Controller();
    Date fechaCita;
    SimpleDateFormat formatoEntrada = new SimpleDateFormat("yyyy-MM-dd");
    SimpleDateFormat formatoSalida = new SimpleDateFormat("EEEE, dd 'de' MMMM 'de' yyyy");
    JPanel pnlPrincipal = null;
    Cita cita = null;
    int año, mes, dia;

    public frVerCita(Cita cita, JPanel pnlPrincipal) {
        this.pnlPrincipal = pnlPrincipal;
        this.cita = cita;
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        try {
            fechaCita = formatoEntrada.parse(cita.getFecha());
        } catch (ParseException ex) {
            Logger.getLogger(frVerCita.class.getName()).log(Level.SEVERE, null, ex);
        }
        String fechaFormateada = formatoSalida.format(fechaCita);
        this.setTitle("Cita para: " + fechaFormateada);
        rellenarDatos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label5 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        label2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
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
        lblClaveDueño = new javax.swing.JLabel();
        lblDueño = new javax.swing.JLabel();
        lblMascota = new javax.swing.JLabel();
        txtHora = new javax.swing.JTextField();
        txtMinuto = new javax.swing.JTextField();
        btnEliminarCita = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Clave del dueño:");

        label5.setBackground(new java.awt.Color(255, 255, 255));
        label5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label5.setForeground(new java.awt.Color(0, 0, 0));
        label5.setText("Dueño:");

        label2.setBackground(new java.awt.Color(255, 255, 255));
        label2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        label2.setForeground(new java.awt.Color(0, 0, 0));
        label2.setText("Mascota:");

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

        lblClaveDueño.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblClaveDueño.setForeground(new java.awt.Color(51, 51, 51));

        lblDueño.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblDueño.setForeground(new java.awt.Color(51, 51, 51));

        lblMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        lblMascota.setForeground(new java.awt.Color(51, 51, 51));
        lblMascota.setToolTipText("");

        txtHora.setBackground(new java.awt.Color(255, 255, 255));
        txtHora.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtHora.setForeground(new java.awt.Color(51, 51, 51));
        txtHora.setBorder(null);

        txtMinuto.setBackground(new java.awt.Color(255, 255, 255));
        txtMinuto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        txtMinuto.setForeground(new java.awt.Color(51, 51, 51));
        txtMinuto.setBorder(null);

        btnEliminarCita.setBackground(new java.awt.Color(49, 161, 186));
        btnEliminarCita.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnEliminarCita.setText("Eliminar");
        btnEliminarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(label5)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(label3)
                                            .addGap(121, 121, 121)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(label7)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(label2)
                                            .addGap(93, 93, 93)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                .addComponent(txtAsunto, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                                                .addComponent(lblClaveDueño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblDueño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lblMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(label1)
                                    .addGap(328, 328, 328))))
                        .addContainerGap(83, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label1)
                    .addComponent(lblClaveDueño, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblDueño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAsunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(label3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(txtHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMinuto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarCita)
                    .addComponent(btnCancelar)
                    .addComponent(btnEliminarCita))
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

    private void rellenarDatos() {
        lblClaveDueño.setText(cita.getMascota().getCliente().getClave());
        lblDueño.setText(cita.getMascota().getCliente().getNombre() + " "
                + cita.getMascota().getCliente().getApeMaterno() + " " + cita.getMascota().getCliente().getApePaterno());
        lblMascota.setText(cita.getMascota().getNombre());
        txtAsunto.setText(cita.getAsunto());
        txtDescripcion.setText(cita.getDescripcion());

        String hora = cita.getHora();
        String[] hm = hora.split(":");

        txtHora.setText(hm[0]);
        txtMinuto.setText(hm[1]);
        
        String fechaC = cita.getFecha();
        String[] fc = fechaC.split("-");
        año = Integer.valueOf(fc[0]);
        mes = Integer.valueOf(fc[1]);
        dia = Integer.valueOf(fc[2]);

    }

    private void btnGuardarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarCitaActionPerformed

        if (!txtAsunto.getText().equals("") && !txtHora.getText().equals("") && !txtMinuto.getText().equals("")
                && !txtDescripcion.getText().equals("")) {

            cita.setAsunto(txtAsunto.getText());
            cita.setHora(txtHora.getText() + ":" + txtMinuto.getText());
            cita.setDescripcion(txtDescripcion.getText());

            control.modificarCita(cita);

            mostrarMensaje("Cita modificada correctamente", "info", "Registro de citas");

            LocalDate fechaActual = LocalDate.now();
            LocalDate fechaCitas = LocalDate.of(año, mes, dia);

            pnlAgenda pAgenda = new pnlAgenda(pnlPrincipal, fechaActual, fechaCitas);
            cambiarPanel(pAgenda);

            this.dispose();

        } else {
            mostrarMensaje("Favor de rellenar todos los campos", "error", "Registro de citas");
        }

    }//GEN-LAST:event_btnGuardarCitaActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed

        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCitaActionPerformed

        control.eliminarCita(cita.getIdCita());

        mostrarMensaje("Cita eliminada correctamente", "info", "Eliminación de citas");

        LocalDate fechaActual = LocalDate.now();
        LocalDate fechaCitas = LocalDate.of(año, mes, dia);

        pnlAgenda pAgenda = new pnlAgenda(pnlPrincipal, fechaActual, fechaCitas);
        cambiarPanel(pAgenda);

        this.dispose();

    }//GEN-LAST:event_btnEliminarCitaActionPerformed

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
    private javax.swing.JButton btnEliminarCita;
    private javax.swing.JButton btnGuardarCita;
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
    private javax.swing.JLabel lblClaveDueño;
    private javax.swing.JLabel lblDueño;
    private javax.swing.JLabel lblMascota;
    public javax.swing.JTextField txtAsunto;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtHora;
    private javax.swing.JTextField txtMinuto;
    // End of variables declaration//GEN-END:variables
}
