package com.mycompany.centroveterinarioixtepec.gui;

import java.awt.Dimension;
import Animacion.Animacion;
import com.mycompany.centroveterinarioixtepec.gui.agenda.pnlAgenda;
import com.mycompany.centroveterinarioixtepec.gui.clientes.pnlClientes;
import com.mycompany.centroveterinarioixtepec.gui.desparasitaciones.pnlDesparasitaciones;
import com.mycompany.centroveterinarioixtepec.gui.ingresos.pnlIngresos;
import com.mycompany.centroveterinarioixtepec.gui.mascotas.pnlMascotas;
import com.mycompany.centroveterinarioixtepec.gui.vacunas.pnlVacunas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Menu extends javax.swing.JFrame {

    JButton botonAnterior = null;

    public Menu() {
        initComponents();
        this.setSize(new Dimension(1200, 600));
        this.setTitle("Centro Veterinario Ixtepec - Menú");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JButton();
        btnDesparasitaciones = new javax.swing.JButton();
        btnVacunas = new javax.swing.JButton();
        btnMascotas = new javax.swing.JButton();
        btnCirugias = new javax.swing.JButton();
        btnAgenda = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        btnMenu = new javax.swing.JButton();
        pnlPrincipal = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        pnlMenu.setBackground(new java.awt.Color(49, 161, 186));

        jLabel1.setBackground(new java.awt.Color(49, 161, 186));
        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENÚ");

        btnClientes.setBackground(new java.awt.Color(178, 231, 234));
        btnClientes.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(102, 102, 102));
        btnClientes.setText("  Clientes");
        btnClientes.setBorder(null);
        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        btnDesparasitaciones.setBackground(new java.awt.Color(178, 231, 234));
        btnDesparasitaciones.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnDesparasitaciones.setForeground(new java.awt.Color(102, 102, 102));
        btnDesparasitaciones.setText("  Desparasitaciones");
        btnDesparasitaciones.setBorder(null);
        btnDesparasitaciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDesparasitaciones.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDesparasitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesparasitacionesActionPerformed(evt);
            }
        });

        btnVacunas.setBackground(new java.awt.Color(178, 231, 234));
        btnVacunas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnVacunas.setForeground(new java.awt.Color(102, 102, 102));
        btnVacunas.setText("  Vacunas");
        btnVacunas.setBorder(null);
        btnVacunas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVacunas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnVacunas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVacunasActionPerformed(evt);
            }
        });

        btnMascotas.setBackground(new java.awt.Color(178, 231, 234));
        btnMascotas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnMascotas.setForeground(new java.awt.Color(102, 102, 102));
        btnMascotas.setText("  Mascotas");
        btnMascotas.setBorder(null);
        btnMascotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMascotas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnMascotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMascotasActionPerformed(evt);
            }
        });

        btnCirugias.setBackground(new java.awt.Color(178, 231, 234));
        btnCirugias.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnCirugias.setForeground(new java.awt.Color(102, 102, 102));
        btnCirugias.setText("  Cirugías");
        btnCirugias.setBorder(null);
        btnCirugias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCirugias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnCirugias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCirugiasActionPerformed(evt);
            }
        });

        btnAgenda.setBackground(new java.awt.Color(178, 231, 234));
        btnAgenda.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnAgenda.setForeground(new java.awt.Color(102, 102, 102));
        btnAgenda.setText("  Agenda");
        btnAgenda.setBorder(null);
        btnAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgenda.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMascotas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDesparasitaciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVacunas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCirugias, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAgenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnMascotas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnDesparasitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnVacunas, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(btnAgenda, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(49, 161, 186));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        lblTitulo.setFont(new java.awt.Font("Headline R", 0, 28)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lblTitulo.setText("CENTRO VETERINARIO IXTEPEC");

        btnMenu.setBackground(new java.awt.Color(49, 184, 193));
        btnMenu.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\UNI\\Sem6\\Desarrollo e implementación de Sitemas de información\\Proyecto\\Recursos\\Recursos\\img\\menu.png")); // NOI18N
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pnlPrincipal.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed

        int posicion = pnlMenu.getX();
        if (posicion > -1) {
            Animacion.mover_izquierda(0, -200, 2, 2, pnlMenu);
            Animacion.mover_izquierda(200, 0, 2, 2, pnlPrincipal);
        } else {
            Animacion.mover_derecha(-200, 0, 2, 2, pnlMenu);
            Animacion.mover_derecha(0, 200, 2, 2, pnlPrincipal);
        }

    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        cambiarColorBoton(btnClientes);

        pnlClientes pClientes = new pnlClientes(pnlPrincipal);
        cambiarPanel(pClientes);

    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnMascotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMascotasActionPerformed

        cambiarColorBoton(btnMascotas);

        pnlMascotas pMascotas = new pnlMascotas(pnlPrincipal);
        cambiarPanel(pMascotas);

    }//GEN-LAST:event_btnMascotasActionPerformed

    private void btnDesparasitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesparasitacionesActionPerformed

        cambiarColorBoton(btnDesparasitaciones);

        pnlDesparasitaciones pDesparasitaciones = new pnlDesparasitaciones(pnlPrincipal);
        cambiarPanel(pDesparasitaciones);

    }//GEN-LAST:event_btnDesparasitacionesActionPerformed

    private void btnVacunasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVacunasActionPerformed

        cambiarColorBoton(btnVacunas);
        pnlVacunas pVacunas = new pnlVacunas(pnlPrincipal);
        cambiarPanel(pVacunas);


    }//GEN-LAST:event_btnVacunasActionPerformed

    private void btnCirugiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCirugiasActionPerformed

        cambiarColorBoton(btnCirugias);
        pnlIngresos pIngresos = new pnlIngresos(pnlPrincipal);
        cambiarPanel(pIngresos);

    }//GEN-LAST:event_btnCirugiasActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        btnClientes.doClick();
        btnClientes.setBackground(new Color(131, 215, 220));
        botonAnterior = btnClientes;
        btnMenu.doClick();

    }//GEN-LAST:event_formWindowOpened

    private void btnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgendaActionPerformed

        cambiarColorBoton(btnAgenda);

        LocalDate fechaActual = LocalDate.now();

        pnlAgenda pAgenda = new pnlAgenda(pnlPrincipal, fechaActual, fechaActual);
        cambiarPanel(pAgenda);

    }//GEN-LAST:event_btnAgendaActionPerformed

    public void cambiarColorBoton(JButton botonActual) {

        if (botonAnterior != null) {
            botonAnterior.setBackground(new Color(178, 231, 234));
        }
        botonAnterior = botonActual;
        botonActual.setBackground(new Color(131, 215, 220));

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
    private javax.swing.JButton btnAgenda;
    private javax.swing.JButton btnCirugias;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnDesparasitaciones;
    private javax.swing.JButton btnMascotas;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnVacunas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
