package edu.cotarelo.views;

import edu.cotarelo.fonts.Fuentes;
import java.awt.Color;

public class AltaClub extends javax.swing.JPanel {

    Fuentes tipoFuente;

    public AltaClub() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        tipoFuente = new Fuentes();

        jugadorLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        jugadorLbl.setForeground(Color.black);
        jugadorTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        clubLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        clubLbl.setForeground(Color.black);
        clubTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        btn_alta.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 18));

    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jugadorLbl = new javax.swing.JLabel();
        jugadorTxt = new javax.swing.JTextField();
        clubLbl = new javax.swing.JLabel();
        clubTxt = new javax.swing.JTextField();
        btn_alta = new javax.swing.JButton();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(750, 430));

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        jugadorLbl.setText("Jugador");

        jugadorTxt.setForeground(new java.awt.Color(204, 204, 204));
        jugadorTxt.setText("Ingrese el nombre del jugador");
        jugadorTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jugadorTxtMousePressed(evt);
            }
        });

        clubLbl.setText("Club");

        clubTxt.setForeground(new java.awt.Color(204, 204, 204));
        clubTxt.setText("Ingrese el nombre del club para fichar");
        clubTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                clubTxtMousePressed(evt);
            }
        });

        btn_alta.setBackground(new java.awt.Color(18, 90, 173));
        btn_alta.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btn_alta.setForeground(new java.awt.Color(255, 255, 255));
        btn_alta.setText("Alta");
        btn_alta.setBorderPainted(false);
        btn_alta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_alta.setMaximumSize(new java.awt.Dimension(90, 32));
        btn_alta.setMinimumSize(new java.awt.Dimension(90, 32));
        btn_alta.setPreferredSize(new java.awt.Dimension(90, 32));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/logoBalonFutbol.png"))); // NOI18N
        image.setPreferredSize(new java.awt.Dimension(1200, 1200));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clubLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugadorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jugadorLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jugadorLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jugadorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(clubLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(clubTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btn_alta, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 433, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jugadorTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jugadorTxtMousePressed
        if (jugadorTxt.getText().equals("Ingrese el nombre del jugador")) {
            jugadorTxt.setText("");
            jugadorTxt.setForeground(Color.black);
        }
        if (clubTxt.getText().isEmpty()) {
            clubTxt.setText("Ingrese el nombre del club para fichar");
            clubTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jugadorTxtMousePressed

    private void clubTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clubTxtMousePressed
           if (clubTxt.getText().equals("Ingrese el nombre del club para fichar")) {
            clubTxt.setText("");
            clubTxt.setForeground(Color.black);
        }
        if (jugadorTxt.getText().isEmpty()) {
            jugadorTxt.setText("Ingrese el nombre del jugador");
            jugadorTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_clubTxtMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_alta;
    private javax.swing.JLabel clubLbl;
    private javax.swing.JTextField clubTxt;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jugadorLbl;
    private javax.swing.JTextField jugadorTxt;
    // End of variables declaration//GEN-END:variables
}
