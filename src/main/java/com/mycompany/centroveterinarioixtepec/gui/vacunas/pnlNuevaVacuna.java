package com.mycompany.centroveterinarioixtepec.gui.vacunas;

import com.mycompany.centroveterinarioixtepec.entidades.Cliente;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import com.mycompany.centroveterinarioixtepec.entidades.Mascota;
import java.awt.BorderLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class pnlNuevaVacuna extends javax.swing.JPanel {

    Controller control = new Controller();
    JPanel pnlPrincipal = null;

    public pnlNuevaVacuna(JPanel pnlPrincipal) {
        initComponents();
        this.pnlPrincipal = pnlPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        txtDosis = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        txtTemperatura = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        label1 = new javax.swing.JLabel();
        txtMascota = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btnNuevaDesparasitante = new javax.swing.JButton();
        comboMascotas = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        proxVacuna = new com.toedter.calendar.JDateChooser();
        txtVacuna = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("NUEVO REGISTRO DE VACUNA");

        label.setBackground(new java.awt.Color(255, 255, 255));
        label.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label.setForeground(new java.awt.Color(0, 0, 0));
        label.setText("Dosis (ml):");

        txtDosis.setBackground(new java.awt.Color(255, 255, 255));
        txtDosis.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtDosis.setForeground(new java.awt.Color(102, 102, 102));
        txtDosis.setBorder(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Temperatura de la mascota (C°):");

        txtTemperatura.setBackground(new java.awt.Color(255, 255, 255));
        txtTemperatura.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtTemperatura.setForeground(new java.awt.Color(102, 102, 102));
        txtTemperatura.setBorder(null);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Peso de la mascota (Kg):");

        txtPeso.setBackground(new java.awt.Color(255, 255, 255));
        txtPeso.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtPeso.setForeground(new java.awt.Color(102, 102, 102));
        txtPeso.setBorder(null);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Proxima vacuna:");

        label1.setBackground(new java.awt.Color(255, 255, 255));
        label1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        label1.setForeground(new java.awt.Color(0, 0, 0));
        label1.setText("Mascota:");

        txtMascota.setBackground(new java.awt.Color(255, 255, 255));
        txtMascota.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtMascota.setForeground(new java.awt.Color(51, 51, 51));
        txtMascota.setBorder(null);
        txtMascota.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMascotaKeyReleased(evt);
            }
        });

        btnNuevaDesparasitante.setBackground(new java.awt.Color(49, 161, 186));
        btnNuevaDesparasitante.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        btnNuevaDesparasitante.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaDesparasitante.setText("Guardar");
        btnNuevaDesparasitante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaDesparasitanteActionPerformed(evt);
            }
        });

        comboMascotas.setBackground(new java.awt.Color(255, 255, 255));
        comboMascotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 16)); // NOI18N
        comboMascotas.setForeground(new java.awt.Color(102, 102, 102));
        comboMascotas.setBorder(null);
        comboMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMascotasActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Vacuna:");

        jSeparator8.setMinimumSize(new java.awt.Dimension(50, 10));
        jSeparator8.setPreferredSize(new java.awt.Dimension(50, 10));

        proxVacuna.setBackground(new java.awt.Color(255, 255, 255));
        proxVacuna.setForeground(new java.awt.Color(102, 102, 102));
        proxVacuna.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N

        txtVacuna.setBackground(new java.awt.Color(255, 255, 255));
        txtVacuna.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        txtVacuna.setForeground(new java.awt.Color(102, 102, 102));
        txtVacuna.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label1)
                            .addComponent(label)
                            .addComponent(jLabel4)
                            .addComponent(txtTemperatura)
                            .addComponent(jSeparator1)
                            .addComponent(txtDosis)
                            .addComponent(jSeparator6)
                            .addComponent(txtMascota)
                            .addComponent(comboMascotas, 0, 295, Short.MAX_VALUE)
                            .addComponent(jSeparator2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator7)
                            .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPeso)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel9)
                                    .addComponent(proxVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 17, Short.MAX_VALUE))
                            .addComponent(jSeparator4)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(btnNuevaDesparasitante)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(103, 103, 103))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(comboMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDosis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(proxVacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addComponent(btnNuevaDesparasitante)
                .addContainerGap(67, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnRegresar)
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(208, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevaDesparasitanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaDesparasitanteActionPerformed

        if (txtMascota != null) {
            //Controla que se haya seleccionado un registro
            if (comboMascotas.getSelectedIndex() != -1) {
                //Se obtiene la id del cliente a eliminar
                String nombreMascota = String.valueOf(comboMascotas.getSelectedItem());

                int idMascota = Integer.parseInt(String.valueOf(nombreMascota.charAt(0)));                        
                Mascota mascota = control.traerMascota(idMascota);
                
                String fechaVacuna = String.valueOf(LocalDate.now());;

                String fechaProxVacuna = "";
                
                System.out.println("fecha vac" + proxVacuna.getDate());
                
                if(proxVacuna.getDate() != null){
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                    fechaProxVacuna = sdf.format(proxVacuna.getDate());
                }                                
                

                if (control.nuevaVacuna(mascota, txtVacuna.getText(), txtDosis.getText(),
                        txtPeso.getText(), txtTemperatura.getText(), fechaVacuna, fechaProxVacuna)) {

                    JOptionPane.showMessageDialog(null, "Registro agregado exitosamente");
                    
                    txtMascota.setText("");
                    txtVacuna.setText("");
                    txtDosis.setText("");
                    txtTemperatura.setText("");
                    txtPeso.setText("");

                } else {
                    JOptionPane.showMessageDialog(null, "Error, no se agregó el registro de vacunacion");
                }
            } else {
                mostrarMensaje("No se seleccionó ninguna mascota", "error", "Registro de vacunacion");
            }
        } else {
            mostrarMensaje("No se seleccionó ninguna mascota", "error", "Registro de vacunacion");
        }

    }//GEN-LAST:event_btnNuevaDesparasitanteActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        pnlVacunas pMascotas = new pnlVacunas(pnlPrincipal);

        cambiarPanel(pMascotas);

    }//GEN-LAST:event_btnRegresarActionPerformed

    private void txtMascotaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMascotaKeyReleased

        cargarComboBox(txtMascota.getText());

        comboMascotas.showPopup();
    }//GEN-LAST:event_txtMascotaKeyReleased

    private void comboMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMascotasActionPerformed
        txtMascota.setText(String.valueOf(comboMascotas.getSelectedItem()));
    }//GEN-LAST:event_comboMascotasActionPerformed

    public void cambiarPanel(JPanel panel) {
        panel.setLocation(0, 0);
        panel.setSize(1720, 972);

        pnlPrincipal.removeAll();
        pnlPrincipal.add(panel, BorderLayout.CENTER);
        pnlPrincipal.revalidate();
        pnlPrincipal.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNuevaDesparasitante;
    private javax.swing.JButton btnRegresar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboMascotas;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    public javax.swing.JLabel label;
    public javax.swing.JLabel label1;
    private com.toedter.calendar.JDateChooser proxVacuna;
    public javax.swing.JTextField txtDosis;
    public javax.swing.JTextField txtMascota;
    private javax.swing.JTextField txtPeso;
    private javax.swing.JTextField txtTemperatura;
    public javax.swing.JTextField txtVacuna;
    // End of variables declaration//GEN-END:variables

    private void cargarComboBox(String nombreBuscado) {
        //Se define el modelo de la tabla
        DefaultComboBoxModel modelComboBox = new DefaultComboBoxModel();

        List<Mascota> listaMascotas = control.traerMascotas(nombreBuscado);

        //Se recorre la lista para mostrar cada registro en la tabla
        if (listaMascotas != null) {
            for (Mascota mascota : listaMascotas) {
                String nombreMascota = mascota.getIdMascota() + "." + mascota.getNombre() + "|";
                Cliente cliente = mascota.getCliente();
                String duenio =nombreMascota + cliente.getNombre() + " " + cliente.getApePaterno() + " " + cliente.getApeMaterno();

                modelComboBox.addElement(duenio);
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
}
