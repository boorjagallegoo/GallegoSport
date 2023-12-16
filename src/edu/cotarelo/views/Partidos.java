package edu.cotarelo.views;

import edu.cotarelo.fonts.Fuentes;

public class Partidos extends javax.swing.JPanel {

    Fuentes tipoFuente;

    public Partidos() {
        initComponents();
        InitStyles();
    }

    private void InitStyles() {
        tipoFuente = new Fuentes();

        title.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 22));
        tabla_partidos.setFont(tipoFuente.fuente(tipoFuente.roRegular, 0, 11));
        btn_actu.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
        btn_crear.setFont(tipoFuente.fuente(tipoFuente.roBold, 0, 16));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_partidos = new javax.swing.JTable();
        btn_actu = new javax.swing.JButton();
        btn_crear = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 430));

        background.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Partidos");

        tabla_partidos.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        tabla_partidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Club1 ID", "Club2 ID", "Fecha de partido"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_partidos.getTableHeader().setReorderingAllowed(false);
        tabla_partidos.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tabla_partidosInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_partidos);

        btn_actu.setBackground(new java.awt.Color(18, 90, 173));
        btn_actu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_actu.setForeground(new java.awt.Color(255, 255, 255));
        btn_actu.setText("Actualizar");
        btn_actu.setBorderPainted(false);
        btn_actu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_actu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actuActionPerformed(evt);
            }
        });

        btn_crear.setBackground(new java.awt.Color(18, 90, 173));
        btn_crear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_crear.setForeground(new java.awt.Color(255, 255, 255));
        btn_crear.setText("Crear");
        btn_crear.setBorderPainted(false);
        btn_crear.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(447, 447, 447)
                            .addComponent(btn_crear, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_actu, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(backgroundLayout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_actu)
                    .addComponent(btn_crear))
                .addGap(7, 7, 7))
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

    private void tabla_partidosInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tabla_partidosInputMethodTextChanged
        //nothing
    }//GEN-LAST:event_tabla_partidosInputMethodTextChanged

    private void btn_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crearActionPerformed
       
    }//GEN-LAST:event_btn_crearActionPerformed

    private void btn_actuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_actuActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_actu;
    private javax.swing.JButton btn_crear;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_partidos;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
