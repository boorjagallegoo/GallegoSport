package edu.cotarelo.views;

import edu.cotarelo.fonts.Fuentes;
import java.awt.Color;

public class BajaClub extends javax.swing.JPanel {

    Fuentes tipoFuente;

    public BajaClub() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        tipoFuente = new Fuentes();

        title.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 22));
        title.setForeground(Color.black);
        jugadorNombreLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        jugadorNombreLbl.setForeground(Color.black);
        clubNombreLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        clubNombreLbl.setForeground(Color.black);
        jugadorNombreTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        clubNombreTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        btn_baja.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        jugadorNombreLbl = new javax.swing.JLabel();
        jugadorNombreTxt = new javax.swing.JTextField();
        clubNombreLbl = new javax.swing.JLabel();
        clubNombreTxt = new javax.swing.JTextField();
        btn_baja = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setMinimumSize(new java.awt.Dimension(750, 430));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        title.setText("Incidencias");

        jugadorNombreLbl.setText("Jugador");

        jugadorNombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        jugadorNombreTxt.setText("Ingrese su nombre");
        jugadorNombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jugadorNombreTxtMousePressed(evt);
            }
        });

        clubNombreLbl.setText("Club");

        clubNombreTxt.setForeground(new java.awt.Color(204, 204, 204));
        clubNombreTxt.setText("Ingrese su club");
        clubNombreTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clubNombreTxtMousePressed(evt);
            }
        });

        btn_baja.setBackground(new java.awt.Color(18, 90, 173));
        btn_baja.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_baja.setForeground(new java.awt.Color(255, 255, 255));
        btn_baja.setText("Baja");
        btn_baja.setBorderPainted(false);
        btn_baja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        image.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/bajaLesion.jpeg"))); // NOI18N

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugadorNombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugadorNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubNombreLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(title)
                .addGap(39, 39, 39)
                .addComponent(jugadorNombreLbl)
                .addGap(12, 12, 12)
                .addComponent(jugadorNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clubNombreLbl)
                .addGap(12, 12, 12)
                .addComponent(clubNombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btn_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jugadorNombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugadorNombreTxtMousePressed
        if (jugadorNombreTxt.getText().equals("Ingrese su nombre")) {
            jugadorNombreTxt.setText("");
            jugadorNombreTxt.setForeground(Color.black);
        }
        if (clubNombreTxt.getText().isEmpty()) {
            clubNombreTxt.setText("Ingrese su club");
            clubNombreTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jugadorNombreTxtMousePressed

    private void clubNombreTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clubNombreTxtMousePressed
         if (clubNombreTxt.getText().equals("Ingrese su club")) {
            clubNombreTxt.setText("");
            clubNombreTxt.setForeground(Color.black);
        }
        if (jugadorNombreTxt.getText().isEmpty()) {
            jugadorNombreTxt.setText("Ingrese su nombre");
            jugadorNombreTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_clubNombreTxtMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_baja;
    private javax.swing.JLabel clubNombreLbl;
    private javax.swing.JTextField clubNombreTxt;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jugadorNombreLbl;
    private javax.swing.JTextField jugadorNombreTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
