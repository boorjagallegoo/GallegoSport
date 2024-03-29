package edu.cotarelo.sistema;

import edu.cotarelo.dao.factories.MySQLFactory;
import edu.cotarelo.dao.objects.UsuarioDAO;
import edu.cotarelo.domain.Usuario;
import edu.cotarelo.fonts.Fuentes;

import edu.cotarelo.views.*;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Locale;
import javax.naming.NamingException;
import javax.swing.table.DefaultTableModel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.text.AbstractDocument.Content;

/**
 * Clase que representa la interfaz gráfica del sistema.
 */
public class Sistema extends javax.swing.JFrame {

    int xMouse, yMouse;
    Fuentes tipoFuente;

    /**
     * Constructor de la clase Sistema. Inicializa los componentes de la
     * interfaz.
     */
    public Sistema() {
        initComponents();
        initStyles();
        SetDate();
        initContent();
    }

    private void initStyles() {
        tipoFuente = new Fuentes();

        slogan.setFont(tipoFuente.fuente(tipoFuente.roItalic, 0, 14));
        slogan.setForeground(Color.black);
        navText.setFont(tipoFuente.fuente(tipoFuente.roBlack, 0, 16));
        navText.setForeground(Color.white);
        dateText.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 24));
        dateText.setForeground(Color.white);
        appName.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 26));
        appName.setForeground(Color.white);

        btn_clubes.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 14));
        btn_usuarios.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 14));
        btn_jugadores.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 14));
        btn_partidos.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 14));
        btn_incidencias.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 14));
        btn_principal.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 14));
    }

    private void SetDate() {
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        dateText.setText(now.format(DateTimeFormatter.ofPattern("'Fecha,' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }

    private void initContent() {
        ShowJPanel(new Principal());
    }

    public static void ShowJPanel(JPanel pl) {
        pl.setSize(750, 430);
        pl.setLocation(0, 0);

        content.removeAll();
        content.add(pl, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }

    /**
     * Método para realizar el alta de un nuevo usuario.
     */
    /*
    private void altaUsuario() {
        // Obtiene la información del nuevo usuario desde la interfaz gráfica
        Usuario nuevo = new Usuario(usuarioAltaNombre.getText(), usuarioAltaApellidos.getText(),
                usuarioAltaContraseña.getText(), usuarioAltaRol.getSelectedItem().toString());

        // Crea una fábrica para obtener el DAO correspondiente
        MySQLFactory factoria = new MySQLFactory();
        UsuarioDAO e1DAO = factoria.getUsuarioDAO();

        try {
            // Intenta insertar el nuevo usuario en la base de datos
            int salida = e1DAO.insertar(nuevo);

            // Actualiza la interfaz según el resultado de la operación
            if (salida < 0) {
                usuarioRespuesta.setForeground(Color.red);
                usuarioRespuesta.setText("No se ha podido insertar.");
            } else {
                usuarioRespuesta.setForeground(Color.green);
                usuarioRespuesta.setText("El usuario " + usuarioAltaNombre.getText() + " "
                        + usuarioAltaApellidos.getText() + " ha sido insertado.");
                // Limpia los campos de la interfaz
                usuarioAltaNombre.setText("");
                usuarioAltaApellidos.setText("");
                usuarioAltaContraseña.setText("");
                usuarioAltaRol.setSelectedItem(0);
            }
        } catch (NamingException e) {
            // Captura la excepción y la registra en el log
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, e);
        }
    }
     */
    /**
     * Método para obtener y mostrar el listado de usuarios en la interfaz.
     */
    /*
    private void usuarioListado() {
        // Obtiene el modelo de la tabla de usuarios
        DefaultTableModel dm = (DefaultTableModel) tablaUsuarioListado.getModel();
        // Limpia los datos actuales de la tabla
        dm.getDataVector().removeAllElements();
        dm.fireTableDataChanged();

        // Crea una fábrica para obtener el DAO correspondiente
        MySQLFactory factoria = new MySQLFactory();
        UsuarioDAO usuarioDAO = factoria.getUsuarioDAO();

        try {
            // Obtiene la lista de usuarios de la base de datos
            ArrayList<Usuario> lista = usuarioDAO.getListaUsuarios(1);

            // Actualiza la interfaz según la existencia de usuarios en la lista
            if (lista == null || lista.isEmpty()) {
                usuarioRespuesta.setForeground(Color.blue);
                usuarioRespuesta.setText("No hay usuarios en la BBDD.");
            } else {
                // Llena la tabla con la información de los usuarios
                for (int i = 0; i < lista.size(); i++) {
                    Object[] auxObject = new Object[4];
                    auxObject[0] = lista.get(i).getNombre();
                    auxObject[1] = lista.get(i).getApellidos();
                    auxObject[2] = lista.get(i).getRol();
                    auxObject[3] = lista.get(i).getIdUsuario();
                    dm.addRow(auxObject);
                }
            }
        } catch (ClassNotFoundException e) {
            // Captura la excepción y la registra en el log
            Logger.getLogger(Sistema.class.getName()).log(Level.SEVERE, null, e);
        }
    } */
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        appName = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_principal = new javax.swing.JButton();
        btn_clubes = new javax.swing.JButton();
        btn_incidencias = new javax.swing.JButton();
        btn_usuarios = new javax.swing.JButton();
        btn_jugadores = new javax.swing.JButton();
        btn_partidos = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        navText = new javax.swing.JLabel();
        dateText = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        slogan = new javax.swing.JLabel();
        barraSuperior = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 700));
        setUndecorated(true);
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(1100, 700));
        background.setPreferredSize(new java.awt.Dimension(1100, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(13, 71, 161));
        Menu.setPreferredSize(new java.awt.Dimension(270, 431));

        appName.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        appName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appName.setText("Gallego Sport");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(160, 160, 160));

        btn_principal.setBackground(new java.awt.Color(21, 101, 192));
        btn_principal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_principal.setForeground(new java.awt.Color(255, 255, 255));
        btn_principal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/Btn_principal.png"))); // NOI18N
        btn_principal.setText("Principal");
        btn_principal.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_principal.setBorderPainted(false);
        btn_principal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_principal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_principal.setIconTextGap(13);
        btn_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_principalActionPerformed(evt);
            }
        });

        btn_clubes.setBackground(new java.awt.Color(21, 101, 192));
        btn_clubes.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_clubes.setForeground(new java.awt.Color(255, 255, 255));
        btn_clubes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/Btn_cash.png"))); // NOI18N
        btn_clubes.setText("Clubes");
        btn_clubes.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_clubes.setBorderPainted(false);
        btn_clubes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clubes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_clubes.setIconTextGap(13);
        btn_clubes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clubesActionPerformed(evt);
            }
        });

        btn_incidencias.setBackground(new java.awt.Color(21, 101, 192));
        btn_incidencias.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_incidencias.setForeground(new java.awt.Color(255, 255, 255));
        btn_incidencias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/Btn_Equipos.png"))); // NOI18N
        btn_incidencias.setText("Incidencias");
        btn_incidencias.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_incidencias.setBorderPainted(false);
        btn_incidencias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_incidencias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_incidencias.setIconTextGap(13);
        btn_incidencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_incidenciasActionPerformed(evt);
            }
        });

        btn_usuarios.setBackground(new java.awt.Color(21, 101, 192));
        btn_usuarios.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_usuarios.setForeground(new java.awt.Color(255, 255, 255));
        btn_usuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/Btn_Usuarios.png"))); // NOI18N
        btn_usuarios.setText("Usuarios");
        btn_usuarios.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_usuarios.setBorderPainted(false);
        btn_usuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_usuarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_usuarios.setIconTextGap(13);
        btn_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_usuariosActionPerformed(evt);
            }
        });

        btn_jugadores.setBackground(new java.awt.Color(21, 101, 192));
        btn_jugadores.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_jugadores.setForeground(new java.awt.Color(255, 255, 255));
        btn_jugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/Btn_Jugadores.png"))); // NOI18N
        btn_jugadores.setText("Jugadores");
        btn_jugadores.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_jugadores.setBorderPainted(false);
        btn_jugadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_jugadores.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_jugadores.setIconTextGap(13);
        btn_jugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jugadoresActionPerformed(evt);
            }
        });

        btn_partidos.setBackground(new java.awt.Color(21, 101, 192));
        btn_partidos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btn_partidos.setForeground(new java.awt.Color(255, 255, 255));
        btn_partidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/edu/cotarelo/imagenes/Btn_Partidos.png"))); // NOI18N
        btn_partidos.setText("Partidos");
        btn_partidos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 13, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_partidos.setBorderPainted(false);
        btn_partidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_partidos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_partidos.setIconTextGap(13);
        btn_partidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_partidosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(appName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(MenuLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addComponent(btn_usuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_jugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_partidos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_incidencias, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(btn_clubes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(17, 17, 17)))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(appName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_principal, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_clubes, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_incidencias, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_usuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_jugadores, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_partidos, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -7, -1, 720));

        Header.setBackground(new java.awt.Color(25, 118, 210));
        Header.setPreferredSize(new java.awt.Dimension(750, 150));

        navText.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        navText.setText("Administración/Control/Club");

        dateText.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        dateText.setText("Fecha, {dayname} {day} de Diciembre de {year}");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(navText, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(259, Short.MAX_VALUE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(navText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateText, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(268, 74, 840, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 740, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 233, 740, 410));

        slogan.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        slogan.setText("\"El fútbol es simple, pero es difícil jugar de forma simple.\"");
        background.add(slogan, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, 438, 30));

        barraSuperior.setBackground(new java.awt.Color(255, 255, 255));
        barraSuperior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barraSuperiorMouseDragged(evt);
            }
        });
        barraSuperior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barraSuperiorMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setAutoscrolls(true);
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
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
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barraSuperiorLayout = new javax.swing.GroupLayout(barraSuperior);
        barraSuperior.setLayout(barraSuperiorLayout);
        barraSuperiorLayout.setHorizontalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barraSuperiorLayout.createSequentialGroup()
                .addGap(0, 1060, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        barraSuperiorLayout.setVerticalGroup(
            barraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(barraSuperiorLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        background.add(barraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_principalActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_btn_principalActionPerformed

    private void btn_clubesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clubesActionPerformed
        ShowJPanel(new AltaClub());
    }//GEN-LAST:event_btn_clubesActionPerformed

    private void btn_incidenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_incidenciasActionPerformed
        ShowJPanel(new BajaClub());
    }//GEN-LAST:event_btn_incidenciasActionPerformed

    private void btn_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_usuariosActionPerformed
        ShowJPanel(new Usuarios());
    }//GEN-LAST:event_btn_usuariosActionPerformed

    private void btn_jugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jugadoresActionPerformed
        ShowJPanel(new Jugadores());
    }//GEN-LAST:event_btn_jugadoresActionPerformed

    private void btn_partidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_partidosActionPerformed
        ShowJPanel(new Partidos());
    }//GEN-LAST:event_btn_partidosActionPerformed

    private void barraSuperiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_barraSuperiorMousePressed

    private void barraSuperiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barraSuperiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_barraSuperiorMouseDragged

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitBtn.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitBtn.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

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
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sistema().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JLabel appName;
    private javax.swing.JPanel background;
    private javax.swing.JPanel barraSuperior;
    private javax.swing.JButton btn_clubes;
    private javax.swing.JButton btn_incidencias;
    private javax.swing.JButton btn_jugadores;
    private javax.swing.JButton btn_partidos;
    private javax.swing.JButton btn_principal;
    private javax.swing.JButton btn_usuarios;
    private static javax.swing.JPanel content;
    private javax.swing.JLabel dateText;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel navText;
    private javax.swing.JLabel slogan;
    // End of variables declaration//GEN-END:variables

}
