package edu.cotarelo.views;

import edu.cotarelo.dao.mysql.MySQLUsuarioDAO;
import edu.cotarelo.dao.objects.UsuarioDAO;
import edu.cotarelo.domain.Usuario;
import edu.cotarelo.fonts.Fuentes;
import java.awt.Color;
import java.awt.HeadlessException;
import javax.naming.NamingException;

public class RegistrarUsuario extends javax.swing.JPanel {

    boolean isEdition = false; // Variable que indica si la aplicación se encuentra en modo de edición.
    Usuario userEdition; // Variable que indica si la aplicación se encuentra en modo de edición.

    Fuentes tipoFuente;

    public RegistrarUsuario() {
        initComponents();
        InitStyles();
    }

    /**
     * Constructor de la clase que inicializa la interfaz gráfica, estilos y
     * establece el modo de edición con la información del usuario
     * proporcionado.
     *
     * @param usuario Objeto de la clase Usuario que se utilizará para la
     * edición.
     */
    public RegistrarUsuario(Usuario usuario) {
        initComponents();
        isEdition = true;
        userEdition = usuario;
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
        passLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        passLbl.setForeground(Color.black);
        rolLbl.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 14));
        rolLbl.setForeground(Color.black);

        nameTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        apPTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        passTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        rolTxt.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        btn_registrar.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 18));

        // Verifica si la aplicación está en modo de edición.
        if (isEdition) {
            // Si está en modo de edición, actualiza el título y el texto del botón.
            title.setText("Editar Usuario");
            btn_registrar.setText("Guardar");

            // Verifica si hay información para editar.
            if (userEdition != null) {
                // Si hay información de usuario, establece los campos de texto con los valores existentes.
                nameTxt.setText(userEdition.getNombre());
                apPTxt.setText(userEdition.getApellidos());
                passTxt.setText(userEdition.getClave());
                rolTxt.setText(userEdition.getRol());
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        apPLbl = new javax.swing.JLabel();
        apPTxt = new javax.swing.JTextField();
        passLbl = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_registrar = new javax.swing.JButton();
        rolLbl = new javax.swing.JLabel();
        rolTxt = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        image = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(750, 430));

        title.setText("Registrar nuevo Usuario");

        nameLbl.setText("Nombre");

        apPLbl.setText("Apellidos");

        passLbl.setText("Contraseña");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        btn_registrar.setBackground(new java.awt.Color(18, 90, 173));
        btn_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_registrar.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrar.setText("Registrar");
        btn_registrar.setBorderPainted(false);
        btn_registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
            }
        });

        rolLbl.setText("Rol");

        rolTxt.setToolTipText("");

        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/registrarNewUser.png"))); // NOI18N
        image.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(apPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(title, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                        .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apPLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rolLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(image)
                .addGap(33, 33, 33))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(image, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(nameLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(apPLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(apPTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(passLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rolLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(rolTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(30, 30, 30)
                            .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(11, 11, 11))))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        String nombre = nameTxt.getText();
        String apP = apPTxt.getText();
        char[] passChars = passTxt.getPassword(); // Utiliza getPassword() para obtener la contraseña como char[]
        String pass = new String(passChars); // Convierte char[] a String
        String rol = rolTxt.getText();

        // Validaciones para los campos
        if (nombre.isEmpty() || apP.isEmpty() || pass.isEmpty() || rol.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            nameTxt.requestFocus();
            return;
        }

        // Si se trata de una edición "isEdition" asignale a la varible user lo que traigas en la variable global "userEdition"
        Usuario user = isEdition ? userEdition : new Usuario();
        user.setNombre(nombre);
        user.setApellidos(apP);
        user.setClave(pass);
        user.setRol(rol);

        try {
            UsuarioDAO dao = new MySQLUsuarioDAO();

            if (!isEdition) {
                dao.insertar(user);
            } else {
                dao.modificar(user);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Usuario " + successMsg + " exitosamente. \n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            // Si la operación fue de registro, limpia los campos de texto.
            nameTxt.setText("");
            apPTxt.setText("");
            passTxt.setText("");
            rolTxt.setText("");

        } catch (HeadlessException | NamingException e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un error al " + errorMsg + " el usuario. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btn_registrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apPLbl;
    private javax.swing.JTextField apPTxt;
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_registrar;
    private javax.swing.JLabel image;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JLabel passLbl;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel rolLbl;
    private javax.swing.JTextField rolTxt;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
