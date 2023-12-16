package edu.cotarelo.views;

import edu.cotarelo.dao.mysql.MySQLClubDAO;
import edu.cotarelo.dao.mysql.MySQLJugadorDAO;
import edu.cotarelo.dao.objects.ClubDAO;
import edu.cotarelo.dao.objects.JugadorDAO;
import edu.cotarelo.fonts.Fuentes;
import edu.cotarelo.sistema.Sistema;
import javax.naming.NamingException;
import javax.swing.table.DefaultTableModel;

public class AllClubes extends javax.swing.JPanel {

    Fuentes tipoFuente;

    public AllClubes() {
        initComponents();
        InitStyles();
        LoadClubs();
    }

    /**
     * Método que carga los CLUBS desde la base de datos y los muestra en una
     * tabla.
     */
    private void LoadClubs() {
        try {
            ClubDAO dao = new MySQLClubDAO();
            DefaultTableModel model = (DefaultTableModel) tabla_clubs.getModel();
            dao.listar().forEach((u) -> model.addRow(new Object[]{u.getNombre(), u.getDescripcion(), u.getCampo()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void InitStyles() {
        tipoFuente = new Fuentes();

        title.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 22));
        buscarClubs.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 12));
        tabla_clubs.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 11));
        btn_delete.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_search.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_edit.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_add.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));

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
        buscarClubs = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clubs = new javax.swing.JTable();
        btn_delete = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMinimumSize(new java.awt.Dimension(750, 430));

        title.setText("Clubs");

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

        tabla_clubs.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tabla_clubs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Descripción", "Campo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_clubs.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabla_clubs);

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
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
                .addComponent(buscarClubs, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btn_search))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(btn_add)
                .addGap(11, 11, 11)
                .addComponent(btn_edit)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delete))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title)
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarClubs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_add)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_delete)
                        .addComponent(btn_edit))))
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
        Sistema.ShowJPanel(new RegistrarClub());
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        JugadorDAO dao = new MySQLJugadorDAO();
        DefaultTableModel model = (DefaultTableModel) tabla_clubs.getModel();
        if (tabla_clubs.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más clubs a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : tabla_clubs.getSelectedRows()) {
                try {
                    int userId = (int) tabla_clubs.getValueAt(i, 0);
                    dao.eliminar(userId);
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        if (tabla_clubs.getSelectedRow() > -1) {
            try {
                int jugadorid = (int) tabla_clubs.getValueAt(tabla_clubs.getSelectedRow(), 0);
                JugadorDAO dao = new MySQLJugadorDAO();
                Sistema.ShowJPanel(new RegistrarJugador(dao.getJugadorById(jugadorid)));
            } catch (NamingException e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el usuario a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        /**
         * Actualiza la tabla de jugadores en la interfaz gráfica según la
         * búsqueda realizada.
         *
         * @param buscarJugadores El texto utilizado para filtrar la búsqueda de
         * jugadores.
         */
        try {
            JugadorDAO dao = new MySQLJugadorDAO();
            DefaultTableModel model = (DefaultTableModel) tabla_clubs.getModel();
            // Se establece el número de filas en cero para limpiar la tabla antes de agregar nuevos datos
            model.setRowCount(0);
            dao.listar(buscarClubs.getText()).forEach((u) -> model.addRow(new Object[]{u.getIdJugador(), u.getNombre(), u.getApellidos(), u.getPosicion()}));
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
    private javax.swing.JTextField buscarClubs;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_clubs;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
