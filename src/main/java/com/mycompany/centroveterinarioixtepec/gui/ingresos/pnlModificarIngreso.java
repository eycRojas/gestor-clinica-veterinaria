package com.mycompany.centroveterinarioixtepec.gui.ingresos;

import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import com.mycompany.centroveterinarioixtepec.entidades.Ingreso;
import java.awt.BorderLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class pnlModificarIngreso extends javax.swing.JPanel {

    Controller control = null;
    Ingreso ingreso = null;
    pnlIngresos pIngresos = null;
    JPanel pnlPrincipal = null;
    String mascota = null;

    public pnlModificarIngreso(int idRegistro, JPanel pnlPrincipal, String mascota) {
        control = new Controller();
        initComponents();
        this.mascota = mascota;
        cargarDatos(idRegistro);

        this.pnlPrincipal = pnlPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegresar = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        label10 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jSeparator18 = new javax.swing.JSeparator();
        label11 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        btnModificarIngreso = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        txtCirugia = new javax.swing.JTextField();
        txtMascota = new javax.swing.JLabel();
        label12 = new javax.swing.JLabel();
        comboPagado = new javax.swing.JComboBox<>();
        jSeparator6 = new javax.swing.JSeparator();
        txtEstadoPago = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        btnRegresar.setBackground(new java.awt.Color(49, 161, 186));
        btnRegresar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegresar.setText("Regresar");
        btnRegresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setText("MODIFICAR REGISTRO DE CIRUGÍA");

        label10.setBackground(new java.awt.Color(255, 255, 255));
        label10.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label10.setForeground(new java.awt.Color(0, 0, 0));
        label10.setText("Costo:");

        txtCosto.setBackground(new java.awt.Color(255, 255, 255));
        txtCosto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtCosto.setForeground(new java.awt.Color(102, 102, 102));
        txtCosto.setBorder(null);

        label11.setBackground(new java.awt.Color(255, 255, 255));
        label11.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label11.setForeground(new java.awt.Color(0, 0, 0));
        label11.setText("Mascota:");

        btnModificarIngreso.setBackground(new java.awt.Color(49, 161, 186));
        btnModificarIngreso.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnModificarIngreso.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarIngreso.setText("Guardar");
        btnModificarIngreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarIngresoActionPerformed(evt);
            }
        });

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Cirugía:");

        jSeparator20.setMinimumSize(new java.awt.Dimension(50, 10));
        jSeparator20.setPreferredSize(new java.awt.Dimension(50, 10));

        txtCirugia.setBackground(new java.awt.Color(255, 255, 255));
        txtCirugia.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtCirugia.setForeground(new java.awt.Color(102, 102, 102));
        txtCirugia.setBorder(null);

        txtMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtMascota.setForeground(new java.awt.Color(102, 102, 102));

        label12.setBackground(new java.awt.Color(255, 255, 255));
        label12.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label12.setForeground(new java.awt.Color(0, 0, 0));
        label12.setText("Estado de pago:");

        comboPagado.setBackground(new java.awt.Color(255, 255, 255));
        comboPagado.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        comboPagado.setForeground(new java.awt.Color(102, 102, 102));
        comboPagado.setBorder(null);
        comboPagado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPagadoActionPerformed(evt);
            }
        });

        txtEstadoPago.setBackground(new java.awt.Color(255, 255, 255));
        txtEstadoPago.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEstadoPago.setForeground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label11)
                            .addComponent(label10)
                            .addComponent(jSeparator18)
                            .addComponent(txtCosto, javax.swing.GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)
                            .addComponent(jSeparator19)
                            .addComponent(txtMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(txtCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12)
                                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtEstadoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(btnModificarIngreso)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(0, 47, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(105, 105, 105))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addGap(26, 26, 26)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(label11)
                        .addGap(5, 5, 5)
                        .addComponent(txtMascota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCirugia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEstadoPago, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(comboPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(btnModificarIngreso)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnRegresar)
                .addGap(50, 50, 50)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(308, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        pnlIngresos pMascotas = new pnlIngresos(pnlPrincipal);

        cambiarPanel(pMascotas);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnModificarIngresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarIngresoActionPerformed

        String estadoPago = "";
        
        if (txtEstadoPago.getText().equals("SÍ")) {
            estadoPago = "S";
        } else {
            estadoPago = "N";
        }
        
        control.modificarIngreso(ingreso, txtCirugia.getText(), txtCosto.getText(), estadoPago);

        JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");

        pIngresos = new pnlIngresos(pnlPrincipal);

        cambiarPanel(pIngresos);
    }//GEN-LAST:event_btnModificarIngresoActionPerformed

    private void comboPagadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPagadoActionPerformed
        txtEstadoPago.setText(String.valueOf(comboPagado.getSelectedItem()));
    }//GEN-LAST:event_comboPagadoActionPerformed

    private void cargarDatos(int idRegistro) {

        cargarComboEstado();

        this.ingreso = control.traerIngreso(idRegistro);

        txtMascota.setText(mascota);
        txtCirugia.setText(ingreso.getCirugia());
        txtCosto.setText(ingreso.getCosto());

        if (ingreso.getEstadoPagado().equals("S")) {
            txtEstadoPago.setText("SÍ");
        } else {
            txtEstadoPago.setText("NO");
        }
    }

    public void cargarComboEstado() {

        DefaultComboBoxModel modelComboBox = new DefaultComboBoxModel();

        modelComboBox.addElement("SÍ");
        modelComboBox.addElement("NO");

        comboPagado.setModel(modelComboBox);

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
    private javax.swing.JButton btnModificarIngreso;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> comboPagado;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator6;
    public javax.swing.JLabel label10;
    public javax.swing.JLabel label11;
    public javax.swing.JLabel label12;
    public javax.swing.JTextField txtCirugia;
    public javax.swing.JTextField txtCosto;
    private javax.swing.JLabel txtEstadoPago;
    private javax.swing.JLabel txtMascota;
    // End of variables declaration//GEN-END:variables
}
