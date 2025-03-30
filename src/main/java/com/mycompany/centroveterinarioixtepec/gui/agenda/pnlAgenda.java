package com.mycompany.centroveterinarioixtepec.gui.agenda;

import com.mycompany.centroveterinarioixtepec.entidades.Cita;
import com.mycompany.centroveterinarioixtepec.entidades.Controller;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class pnlAgenda extends javax.swing.JPanel {

    Controller control = null;
    LocalDate fechaActual = null;
    int año;
    int mes;
    int diaSeleccionado;
    JButton diaAntPresionado = null;
    Color colorBoton = null;
    int rojo;
    int azul;
    int verde;
    String codigoColor = null;
    JPanel pnlPrincipal = null;

    public pnlAgenda(JPanel pnlPrincipal, LocalDate fechaActual, LocalDate fechaCitas) {
        initComponents();
        control = new Controller();
        this.fechaActual = fechaActual;
        mostrarFecha();
        pnlDias.setLayout(new GridLayout(6, 7));
        crearCalendario(fechaActual.getYear(), fechaActual.getMonthValue());
        mostrarCitas(fechaCitas);
        diaSeleccionado = fechaActual.getDayOfMonth();
        this.pnlPrincipal = pnlPrincipal;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        pnlCalendario = new javax.swing.JPanel();
        lblMes = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnAdelante = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        pnlDias = new javax.swing.JPanel();
        lblCitas = new javax.swing.JLabel();
        scrollCitas = new javax.swing.JScrollPane();
        btnAgregarCita = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("AGENDA");

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(0, 0, 0));

        pnlCalendario.setBackground(new java.awt.Color(49, 161, 186));
        pnlCalendario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lblMes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lblMes.setForeground(new java.awt.Color(0, 0, 0));
        lblMes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        btnAtras.setBackground(new java.awt.Color(49, 185, 195));
        btnAtras.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(0, 0, 0));
        btnAtras.setText("<");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnAdelante.setBackground(new java.awt.Color(49, 185, 195));
        btnAdelante.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        btnAdelante.setForeground(new java.awt.Color(0, 0, 0));
        btnAdelante.setText(">");
        btnAdelante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdelanteActionPerformed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("L");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("M");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("M");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("J");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("V");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("S");

        jLabel7.setBackground(new java.awt.Color(0, 204, 204));
        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("D");

        javax.swing.GroupLayout pnlDiasLayout = new javax.swing.GroupLayout(pnlDias);
        pnlDias.setLayout(pnlDiasLayout);
        pnlDiasLayout.setHorizontalGroup(
            pnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        pnlDiasLayout.setVerticalGroup(
            pnlDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 360, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlCalendarioLayout = new javax.swing.GroupLayout(pnlCalendario);
        pnlCalendario.setLayout(pnlCalendarioLayout);
        pnlCalendarioLayout.setHorizontalGroup(
            pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(pnlCalendarioLayout.createSequentialGroup()
                .addGroup(pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCalendarioLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalendarioLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCalendarioLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCalendarioLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdelante))))
            .addComponent(jSeparator2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalendarioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlCalendarioLayout.setVerticalGroup(
            pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalendarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblMes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdelante, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlCalendarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        lblCitas.setBackground(new java.awt.Color(255, 255, 255));
        lblCitas.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 20)); // NOI18N
        lblCitas.setForeground(new java.awt.Color(0, 0, 0));
        lblCitas.setText("Citas para");

        btnAgregarCita.setBackground(new java.awt.Color(49, 161, 186));
        btnAgregarCita.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        btnAgregarCita.setText("Agregar cita");
        btnAgregarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pnlCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(92, 92, 92)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(scrollCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAgregarCita, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(364, 364, 364)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(scrollCitas, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAgregarCita)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        pnlDias.removeAll();

        if (mes != 1) {
            crearCalendario(año, mes - 1);
        } else {
            crearCalendario(año - 1, 12);
        }

    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAdelanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdelanteActionPerformed
        pnlDias.removeAll();

        if (mes != 12) {
            crearCalendario(año, mes + 1);
        } else {
            crearCalendario(año + 1, 1);
        }

    }//GEN-LAST:event_btnAdelanteActionPerformed

    private void btnAgregarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCitaActionPerformed

        frNuevaCita pantalla = new frNuevaCita(año, mes, diaSeleccionado, pnlPrincipal);

        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        pantalla.setPreferredSize(new Dimension(560, 537));

    }//GEN-LAST:event_btnAgregarCitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdelante;
    private javax.swing.JButton btnAgregarCita;
    private javax.swing.JButton btnAtras;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblCitas;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblMes;
    private javax.swing.JPanel pnlCalendario;
    private javax.swing.JPanel pnlDias;
    private javax.swing.JScrollPane scrollCitas;
    // End of variables declaration//GEN-END:variables

    private void mostrarFecha() {

        String strFechaActual = fechaActual.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE"));
        lblFecha.setText(strFechaActual);

        lblCitas.setText("Citas para " + strFechaActual);

    }

    private void crearCalendario(int año, int mes) {

        this.año = año;
        this.mes = mes;

        lblMes.setText(LocalDate.of(año, mes, 1).format(DateTimeFormatter.ofPattern("MMMM yyyy")));

        String[] diasSemana = new String[]{"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};

        String primerDia = String.valueOf((LocalDate.of(año, mes, 1).getDayOfWeek()));

        int j = 0;

        while (!primerDia.equals(diasSemana[j])) {
            JButton dia = crearDias("", "31B9C3");

            pnlDias.add(dia);

            j++;
        }

        int diasDelMes = YearMonth.of(año, mes).lengthOfMonth();
        String numDia;

        for (int i = 1; i <= diasDelMes; i++) {
            final int k = i;

            JButton dia;

            numDia = String.valueOf(i);

            if (año == fechaActual.getYear() && mes == fechaActual.getMonthValue() && i == fechaActual.getDayOfMonth()) {

                dia = crearDias(numDia, "31A1BA");

            } else if (control.validarFecha(String.valueOf(LocalDate.of(año, mes, i)))) {

                dia = crearDias(numDia, "83D7DC");

            } else {

                dia = crearDias(numDia, "31B9C3");

            }

            pnlDias.add(dia);
            LocalDate fechaSeleccionada = LocalDate.of(año, mes, i);

            dia.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    cambiarColorDia(dia);

                    mostrarCitas(fechaSeleccionada);

                    diaSeleccionado = k;

                }
            });

        }

        for (int i = 0; i < (42 - j - diasDelMes); i++) {

            JButton dia = crearDias("", "31B9C3");

            pnlDias.add(dia);

        }

    }

    private JButton crearDias(String numDia, String color) {

        JButton dia = new JButton(numDia);
        dia.setFont(new Font("Arial", Font.BOLD, 16));
        dia.setBackground(Color.decode("#" + color));
        dia.setForeground(Color.BLACK);
        dia.setBorder(BorderFactory.createEmptyBorder());
        dia.setPreferredSize(new Dimension(60, 60));

        if (numDia.equals("")) {
            dia.setEnabled(false);
        }

        return dia;

    }

    public void cambiarColorDia(JButton diaPresionado) {

        if (diaAntPresionado != null) {

            diaAntPresionado.setBackground(Color.decode(codigoColor));
        }
        diaAntPresionado = diaPresionado;

        colorBoton = diaAntPresionado.getBackground();
        rojo = colorBoton.getRed();
        verde = colorBoton.getGreen();
        azul = colorBoton.getBlue();
        codigoColor = String.format("#%02X%02X%02X", rojo, verde, azul);

        diaPresionado.setBackground(Color.decode("#B2E7EA"));

    }

    private void mostrarCitas(LocalDate fechaSeleccionada) {

        String strFechaCitas = fechaSeleccionada.format(DateTimeFormatter.ofPattern("dd MMMM yyyy, EEEE"));
        lblCitas.setText("Citas para " + strFechaCitas);
        
        List<Cita> listaCitas = control.traerCitas(String.valueOf(fechaSeleccionada));

        int filas = 6;

        if (listaCitas.size() > 6) {
            filas = listaCitas.size();
        }

        JPanel pnlCitas = new JPanel(new GridLayout(filas, 1, 10, 5));
        pnlCitas.setBackground(Color.WHITE);

        scrollCitas.setViewportView(pnlCitas);

        for (int i = 0; i < listaCitas.size(); i++) {
            final int j = i;
            final Cita objCita = listaCitas.get(i);

            JPanel pnlCita = new JPanel(new GridLayout(2, 2));
            pnlCita.setPreferredSize(new Dimension(400, 60));

            JLabel asunto = new JLabel(listaCitas.get(i).getAsunto());
            asunto.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
            asunto.setFont(new Font("Helvetica", Font.PLAIN, 16));
            asunto.setForeground(Color.BLACK);
            pnlCita.add(asunto);

            JCheckBox citaAtendida = new JCheckBox();
            citaAtendida.setBackground(null);
            if (listaCitas.get(i).getEstadoAtendida().equals("S")) {
                citaAtendida.setSelected(true);
            }

            citaAtendida.addItemListener(new ItemListener() {

                @Override
                public void itemStateChanged(ItemEvent e) {

                    Cita c = listaCitas.get(j);

                    if (citaAtendida.isSelected()) {
                        c.setEstadoAtendida("S");
                    } else {
                        c.setEstadoAtendida("N");
                    }

                    control.modificarCita(c);

                }

            });
            pnlCita.add(citaAtendida);

            JLabel horaCita = new JLabel("Hora de la cita: " + listaCitas.get(i).getHora());
            horaCita.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 0));
            horaCita.setFont(new Font("Helvetica", Font.PLAIN, 15));
            horaCita.setForeground(Color.DARK_GRAY);
            pnlCita.add(horaCita);
            pnlCitas.add(pnlCita);

            asunto.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {

                    if (e.getClickCount() == 2) {

                        frVerCita pantalla = new frVerCita(objCita, pnlPrincipal);

                        pantalla.setVisible(true);
                        pantalla.setLocationRelativeTo(null);
                        pantalla.setPreferredSize(new Dimension(560, 537));
                    }

                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            }
            );

        }

    }

}
