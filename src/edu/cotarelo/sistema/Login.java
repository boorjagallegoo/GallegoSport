package edu.cotarelo.sistema;

import edu.cotarelo.dao.factories.MySQLFactory;
import edu.cotarelo.dao.objects.UsuarioDAO;
import edu.cotarelo.domain.Usuario;
import edu.cotarelo.fonts.Fuentes;
import java.awt.Color;
import javax.naming.NamingException;
import javax.swing.JOptionPane;

/**
 * Clase que representa la interfaz de inicio de sesión del sistema.
 */
public class Login extends javax.swing.JFrame {

    Fuentes tipoFuente;
    int xMouse, yMouse;

    /**
     * Constructor de la clase Login. Inicializa los componentes de la interfaz.
     */
    public Login() {
        initComponents();
        initStyles();
        setLocationRelativeTo(null);  // Centrar la ventana en el medio de la pantalla
    }

    private void initStyles() {
        tipoFuente = new Fuentes();

        title.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 22));
        labelUser.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 16));
        labelPass.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 16));
        loginPass.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        loginNombre.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));

        loginBtnTxt.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 18));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        logoImagen = new javax.swing.JLabel();
        fondoDerecho = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        labelIcon = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        loginNombre = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        labelPass = new javax.swing.JLabel();
        loginPass = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        loginBtn = new javax.swing.JPanel();
        loginBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(800, 500));
        background.setMinimumSize(new java.awt.Dimension(800, 500));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/NEWWww.png"))); // NOI18N
        logoImagen.setMaximumSize(new java.awt.Dimension(200, 200));
        logoImagen.setMinimumSize(new java.awt.Dimension(200, 200));
        logoImagen.setPreferredSize(new java.awt.Dimension(200, 200));
        background.add(logoImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 300, 500));

        fondoDerecho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/fondoDerecho.jpg"))); // NOI18N
        background.add(fondoDerecho, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -4, 300, 510));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(exitTxt.getFont().deriveFont(exitTxt.getFont().getSize()+12f));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        background.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        labelIcon.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/logoLetrasGS.png"))); // NOI18N
        background.add(labelIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 340, 100));

        title.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        title.setText("INICIAR SESIÓN");
        background.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        labelUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelUser.setText("USUARIO");
        background.add(labelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        loginNombre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginNombre.setForeground(new java.awt.Color(204, 204, 204));
        loginNombre.setText("Ingrese su nombre de usuario");
        loginNombre.setBorder(null);
        loginNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginNombreMousePressed(evt);
            }
        });
        background.add(loginNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 440, 40));
        background.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 283, 440, 20));

        labelPass.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        labelPass.setText("CONTRASEÑA");
        background.add(labelPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        loginPass.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        loginPass.setForeground(new java.awt.Color(204, 204, 204));
        loginPass.setText("********");
        loginPass.setBorder(null);
        loginPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                loginPassMousePressed(evt);
            }
        });
        background.add(loginPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 440, 40));
        background.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 440, 20));

        loginBtn.setBackground(new java.awt.Color(18, 90, 173));
        loginBtn.setForeground(new java.awt.Color(18, 90, 173));

        loginBtnTxt.setBackground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        loginBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        loginBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginBtnTxt.setText("ENTRAR");
        loginBtnTxt.setToolTipText("");
        loginBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnTxtMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout loginBtnLayout = new javax.swing.GroupLayout(loginBtn);
        loginBtn.setLayout(loginBtnLayout);
        loginBtnLayout.setHorizontalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        loginBtnLayout.setVerticalGroup(
            loginBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        background.add(loginBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 130, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitBtn.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitBtn.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void loginNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginNombreMousePressed
        if (loginNombre.getText().equals("Ingrese su nombre de usuario")) {
            loginNombre.setText("");
            loginNombre.setForeground(Color.black);
        }
        if (String.valueOf(loginPass.getPassword()).isEmpty()) {
            loginPass.setText("********");
            loginPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_loginNombreMousePressed

    private void loginPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPassMousePressed
        if (String.valueOf(loginPass.getPassword()).equals("********")) {
            loginPass.setText("");
            loginPass.setForeground(Color.black);
        }
        if (loginNombre.getText().isEmpty()) {
            loginNombre.setText("Ingrese su nombre de usuario");
            loginNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_loginPassMousePressed

    private void loginBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnTxtMouseClicked
        // Verifica que se haya proporcionado un nombre de usuario y una contraseña
        if (!loginNombre.getText().equals("") && !String.valueOf(loginPass.getPassword()).equals("")
                && !loginNombre.getText().equals("Introuduzca su nombre de usuario")) {

            // Obtiene el nombre de usuario y la contraseña
            String usuarioNombre = loginNombre.getText();
            String usuarioPass = new String(loginPass.getPassword());

            // Crea una fábrica para obtener el DAO correspondiente
            MySQLFactory factoria = new MySQLFactory();
            UsuarioDAO usuarioDAO = factoria.getUsuarioDAO();
            Usuario elUser = null;

            try {
                // Intenta obtener el usuario de la base de datos
                elUser = usuarioDAO.getUsuarioByNombreContraseña(usuarioNombre, usuarioPass);

                // Muestra un mensaje según el resultado de la validación
                if (elUser == null) {
                    JOptionPane.showMessageDialog(null, "Usuario incorrecto.");
                } else {
                    // Si las credenciales son correctas, pasa a la siguiente pantalla
                    JOptionPane.showMessageDialog(null, "Autentificado como: " + elUser.getNombre());

                    // Código para pasar a la siguiente pantalla (ajusta según tu implementación)
                    Sistema sistema = new Sistema();
                    sistema.setVisible(true);
                    dispose(); // Cierra la pantalla actual
                }
            } catch (NamingException e) {
                // Captura la excepción y la imprime en la consola
                e.printStackTrace();
            }
        } else {
            // Muestra un mensaje si no se proporcionaron nombre de usuario y contraseña
            JOptionPane.showMessageDialog(null, "Debe indicar el nombre de usuario y la contraseña.");
        }
    }//GEN-LAST:event_loginBtnTxtMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel fondoDerecho;
    private javax.swing.JPanel header;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel labelIcon;
    private javax.swing.JLabel labelPass;
    private javax.swing.JLabel labelUser;
    private javax.swing.JPanel loginBtn;
    private javax.swing.JLabel loginBtnTxt;
    private javax.swing.JTextField loginNombre;
    private javax.swing.JPasswordField loginPass;
    private javax.swing.JLabel logoImagen;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
