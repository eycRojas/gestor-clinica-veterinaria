package com.mycompany.centroveterinarioixtepec.gui.mascotas;

import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class pnlModificarMascotas extends javax.swing.JPanel {

    Controller control = null;
    Mascota mascota = null;
    pnlMascotas pnlMascotas = null;
    JPanel pnlPrincipal = null;
    String dueño = null;

    public pnlModificarMascotas(int idMascota, JPanel pnlPrincipal, String dueño) {
        control = new Controller();
        initComponents();
        this.dueño = dueño;
        cargarDatos(idMascota);

        this.pnlPrincipal = pnlPrincipal;        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        label1 = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtEspecie = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtRaza = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtColor = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtSeñas = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        btnModificarMascota = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        chkMacho = new javax.swing.JCheckBox();
        chkHembra = new javax.swing.JCheckBox();
        jSeparator8 = new javax.swing.JSeparator();
        txtDueñoMascota = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("MODIFICAR MASCOTA");

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setText("Dueño:");

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Nombre:");

        txtNombreMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtNombreMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtNombreMascota.setForeground(new java.awt.Color(102, 102, 102));
        txtNombreMascota.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Especie:");

        txtEspecie.setBackground(new java.awt.Color(255, 255, 255));
        txtEspecie.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEspecie.setForeground(new java.awt.Color(102, 102, 102));
        txtEspecie.setBorder(null);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Raza:");

        txtRaza.setBackground(new java.awt.Color(255, 255, 255));
        txtRaza.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtRaza.setForeground(new java.awt.Color(102, 102, 102));
        txtRaza.setBorder(null);

        jSeparator3.setMinimumSize(new java.awt.Dimension(50, 10));
        jSeparator3.setPreferredSize(new java.awt.Dimension(50, 10));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Color:");

        txtColor.setBackground(new java.awt.Color(255, 255, 255));
        txtColor.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtColor.setForeground(new java.awt.Color(102, 102, 102));
        txtColor.setBorder(null);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Señas:");

        txtSeñas.setBackground(new java.awt.Color(255, 255, 255));
        txtSeñas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtSeñas.setForeground(new java.awt.Color(102, 102, 102));
        txtSeñas.setBorder(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Edad:");

        txtEdad.setBackground(new java.awt.Color(255, 255, 255));
        txtEdad.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtEdad.setForeground(new java.awt.Color(102, 102, 102));
        txtEdad.setBorder(null);

        btnModificarMascota.setBackground(new java.awt.Color(49, 161, 186));
        btnModificarMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        btnModificarMascota.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarMascota.setText("Guardar");
        btnModificarMascota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarMascotaActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sexo");

        chkMacho.setBackground(new java.awt.Color(255, 255, 255));
        chkMacho.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        chkMacho.setForeground(new java.awt.Color(102, 102, 102));
        chkMacho.setText("Macho");

        chkHembra.setBackground(new java.awt.Color(255, 255, 255));
        chkHembra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        chkHembra.setForeground(new java.awt.Color(102, 102, 102));
        chkHembra.setText("Hembra");

        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 10));
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 10));

        txtDueñoMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtDueñoMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtDueñoMascota.setForeground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEspecie)
                        .addComponent(jSeparator1)
                        .addComponent(txtRaza)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                        .addComponent(jSeparator2)
                        .addComponent(label)
                        .addComponent(jLabel4)
                        .addComponent(jLabel5)
                        .addComponent(label1)
                        .addComponent(jSeparator6)
                        .addComponent(txtNombreMascota))
                    .addComponent(txtDueñoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtEdad)
                        .addComponent(jLabel8)
                        .addComponent(jSeparator5)
                        .addComponent(txtSeñas)
                        .addComponent(txtColor)
                        .addComponent(jSeparator7)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(chkMacho)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkHembra)))
                .addGap(52, 52, 52))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(btnModificarMascota)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chkMacho)
                            .addComponent(chkHembra)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(label)
                                .addGap(4, 4, 4)
                                .addComponent(txtDueñoMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSeñas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEspecie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(btnModificarMascota)
                .addGap(221, 221, 221))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnRegresar)
                .addGap(49, 49, 49)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarMascotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarMascotaActionPerformed

        String sexo = null;
        if (chkMacho.isSelected()) {
            sexo = "M";
        } else {
            if (chkHembra.isSelected()) {
                sexo = "H";
            }
        }

        control.modificarMascota(mascota, txtDueñoMascota.getText(), txtNombreMascota.getText(), txtEspecie.getText(),
                txtRaza.getText(), txtColor.getText(), sexo, txtSeñas.getText());

        pnlMascotas = new pnlMascotas(pnlPrincipal);
        pnlMascotas.mostrarMensaje("Mascota modificada correctamente", "info", "Modificacion de mascota");

        cambiarPanel(pnlMascotas);
    }//GEN-LAST:event_btnModificarMascotaActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        pnlMascotas pMascotas = new pnlMascotas(pnlPrincipal);

        cambiarPanel(pMascotas);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void cargarDatos(int idMascota) {

        this.mascota = control.traerMascota(idMascota);

        txtDueñoMascota.setText(dueño);
        txtNombreMascota.setText(mascota.getNombre());
        txtEspecie.setText(mascota.getEspecie());
        txtRaza.setText(mascota.getRaza());
        txtColor.setText(mascota.getColor());
        txtSeñas.setText(mascota.getSenias());

        if (mascota.getSexo().equals("H")) {
            chkHembra.setSelected(true);
        } else {
            if(mascota.getSexo().equals("M")){
               chkMacho.setSelected(true); 
            }            
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificarMascota;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JCheckBox chkHembra;
    private javax.swing.JCheckBox chkMacho;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel label;
    public javax.swing.JLabel label1;
    private javax.swing.JTextField txtColor;
    private javax.swing.JLabel txtDueñoMascota;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtEspecie;
    public javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextField txtRaza;
    private javax.swing.JTextField txtSeñas;
    // End of variables declaration//GEN-END:variables
}
