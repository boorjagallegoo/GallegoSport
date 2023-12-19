package edu.cotarelo.views;

import edu.cotarelo.dao.mysql.MySQLJugadorDAO;
import edu.cotarelo.dao.objects.JugadorDAO;
import edu.cotarelo.domain.Jugador;
import edu.cotarelo.fonts.Fuentes;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.naming.NamingException;

public class RegistrarJugador extends javax.swing.JPanel {

    boolean isEdition = false; // Variable que indica si la aplicación se encuentra en modo de edición.
    Jugador playerEdition; // Variable que indica si la aplicación se encuentra en modo de edición.
    Fuentes tipoFuente;

    public RegistrarJugador() {
        initComponents();
        InitStyles();
    }

    public RegistrarJugador(Jugador jugador) {
        initComponents();
        isEdition = true;
        playerEdition = jugador;
        InitStyles();
    }

    private void InitStyles() {
        tipoFuente = new Fuentes();

        title.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 22));
        title.setForeground(Color.black);
        nameLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        nameLbl.setForeground(Color.black);
        apPLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        apPLbl.setForeground(Color.black);
        posiLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        posiLbl.setForeground(Color.black);

        nameTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        apPTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        posiTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        btn_registrar.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 18));

        if (isEdition) {
            title.setText("Editar Jugador");
            btn_registrar.setText("Guardar");
            // Si estamos en modo edición, se actualizan los campos de texto con los datos del jugador existente.
            if (playerEdition != null) {
                nameTxt.setText(playerEdition.getNombre());
                apPTxt.setText(playerEdition.getApellidos());
                posiTxt.setText(playerEdition.getPosicion());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        apPLbl = new javax.swing.JLabel();
        apPTxt = new javax.swing.JTextField();
        posiLbl = new javax.swing.JLabel();
        posiTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        image = new javax.swing.JLabel();
        btn_registrar = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        title.setText("Registrar nuevo Jugador");

        nameLbl.setText("Nombre");

        apPLbl.setText("Apellidos");

        posiLbl.setText("Posición");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/registrarNewJugador.png"))); // NOI18N
        image.setVerifyInputWhenFocusTarget(false);

        btn_registrar.setBackground(new java.awt.Color(18, 90, 173));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorderPainted(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apPLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posiLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(posiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(apPTxt, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(4, 4, 4)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(nameLbl)
                .addGap(6, 6, 6)
                .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(apPLbl)
                .addGap(6, 6, 6)
                .addComponent(apPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(posiLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(posiTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String nombre = nameTxt.getText();
        String ap = apPTxt.getText();
        String posi = posiTxt.getText();

        // Validaciones para los campos
        if (nombre.isEmpty() || ap.isEmpty() || posi.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            nameTxt.requestFocus();
            return;
        }

        // Si isEdition es verdadero, asigna playerEdition a jugador; si es falso, asigna una nueva instancia de Jugador.
        Jugador jugador = isEdition ? playerEdition : new edu.cotarelo.domain.Jugador();
        jugador.setNombre(nombre);
        jugador.setApellidos(ap);
        jugador.setPosicion(posi);

        try {
            JugadorDAO dao = new MySQLJugadorDAO();
            // Si no estamos en modo edición, se inserta el jugador usando dao.insertar(); de lo contrario, se modifica usando dao.modificar().
            if (!isEdition) {
                dao.insertar(jugador);
            } else {
                dao.modificar(jugador);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Jugador " + successMsg + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            nameTxt.setText("");
            apPTxt.setText("");
            posiTxt.setText("");
        } catch (HeadlessException | NamingException e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el jugador. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_registrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apPLbl;
    private javax.swing.JTextField apPTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel posiLbl;
    private javax.swing.JTextField posiTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
