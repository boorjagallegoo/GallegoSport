package edu.cotarelo.views;

import edu.cotarelo.dao.mysql.MySQLUsuarioDAO;
import edu.cotarelo.dao.objects.UsuarioDAO;
import edu.cotarelo.fonts.Fuentes;
import edu.cotarelo.sistema.Sistema;
import javax.naming.NamingException;
import javax.swing.table.DefaultTableModel;

public class Usuarios extends javax.swing.JPanel {

    Fuentes tipoFuente;

    public Usuarios() {
        initComponents();
        InitStyles();
        LoadUsers();
    }

    private void InitStyles() {
        tipoFuente = new Fuentes();

        title.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 22));
        buscarUsuarios.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        tabla_usuarios.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 11));
        btn_delete.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_search.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_edit.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_add.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));

        // Intento de Placeholder
        buscarUsuarios.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de usuario a buscar.");
    }

    /**
     * Método que carga los usuarios desde la base de datos y los muestra en una
     * tabla.
     */
    private void LoadUsers() {
        try {
            // Se crea una instancia de UsuarioDAO que implementa MySQLUsuarioDAO.
            UsuarioDAO dao = new MySQLUsuarioDAO();
            // Se obtiene el modelo de la tabla de usuarios.
            DefaultTableModel model = (DefaultTableModel) tabla_usuarios.getModel();
            // Se recorren los usuarios obtenidos de la base de datos y se agregan al modelo de la tabla.
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getIdUsuario(), u.getNombre(), u.getApellidos(), u.getRol(), u.getClave()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        buscarUsuarios = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_usuarios = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Usuarios");

        btn_search.setBackground(new java.awt.Color(18, 90, 173));
        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Buscar");
        btn_search.setBorderPainted(false);
        btn_search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        tabla_usuarios.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tabla_usuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellidos", "Rol"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_usuarios.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_usuarios);

        btn_delete.setBackground(new java.awt.Color(18, 90, 173));
        btn_delete.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Borrar");
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(18, 90, 173));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Editar");
        btn_edit.setBorderPainted(false);
        btn_edit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        btn_add.setBackground(new java.awt.Color(18, 90, 173));
        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Nuevo");
        btn_add.setBorderPainted(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(buscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 580, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(btn_search))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(btn_delete, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title)
                .addGap(8, 8, 8)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_edit)
                        .addComponent(btn_add))
                    .addComponent(btn_delete)))
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

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // Se crea la accioón de llamar a la otra ventana al hacer click en el boton
        Sistema.ShowJPanel(new RegistrarUsuario());
    }//GEN-LAST:event_btn_addActionPerformed

    /**
     * Método que se ejecuta al hacer clic en el botón de borrar usuarios.
     * Elimina los usuarios seleccionados de la base de datos y de la tabla de
     * usuarios.
     *
     * @param evt Evento de acción generado al hacer clic en el botón.
     */
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        UsuarioDAO dao = new MySQLUsuarioDAO();
        DefaultTableModel model = (DefaultTableModel) tabla_usuarios.getModel();
        // Mostrar mensaje de alerta
        if (tabla_usuarios.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más usuarios a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            // Se recorren las filas seleccionadas en la tabla de usuarios.
            for (int i : tabla_usuarios.getSelectedRows()) {
                try {
                    int userId = (int) tabla_usuarios.getValueAt(i, 0);  // Se obtiene el ID del usuario de la primera columna de la fila seleccionada.
                    dao.eliminar(userId);  // Se llama al método eliminar de UsuarioDAO para eliminar el usuario de la base de datos.
                    model.removeRow(i);  // Se elimina la fila correspondiente al usuario de la tabla.
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    /**
     * Maneja el evento de clic en el botón de edición. Abre la interfaz de
     * registro de usuario con los detalles del usuario seleccionado en la
     * tabla.
     *
     * @param evt Objeto que representa el evento de acción.
     */
    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (tabla_usuarios.getSelectedRow() > -1) {
            try {
                int userId = (int) tabla_usuarios.getValueAt(tabla_usuarios.getSelectedRow(), 0);
                UsuarioDAO dao = new MySQLUsuarioDAO();
                Sistema.ShowJPanel(new RegistrarUsuario(dao.getUsuarioById(userId)));
            } catch (NamingException e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el usuario a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        try {
             UsuarioDAO dao = new MySQLUsuarioDAO();
            DefaultTableModel model = (DefaultTableModel) tabla_usuarios.getModel();
            // Se establece el número de filas en cero para limpiar la tabla antes de agregar nuevos datos
            model.setRowCount(0);
            dao.listar(buscarUsuarios.getText()).forEach((u) -> model.addRow(new Object[]{u.getIdUsuario(), u.getNombre(), u.getApellidos(), u.getRol(), u.getClave()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btn_searchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_search;
    private javax.swing.JTextField buscarUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_usuarios;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

}
