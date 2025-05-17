package View;

import javax.swing.table.DefaultTableModel;

public class ConsultaJugadorMasExpulsiones extends javax.swing.JPanel {

    public ConsultaJugadorMasExpulsiones() {
        initComponents();
    }
    private void cargartabla(){
    DefaultTableModel model = new DefaultTableModel();
     
     model.addColumn("nombre");
     model.addColumn("equipo");
     model.addColumn("posicion");
      model.addColumn("Tarjetas rojas");

     
    
      model.addRow(new Object[]{
      "Messi",
      "inter",
      "delantero",
      "10"
      });
     
     
     
     
     
      Tabla.setModel(model);
        
        // Crear el JScrollPane que contendrá la tabla
        panelTabla.setViewportView(Tabla);
      panelTabla.setVisible(true);

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jugadprExpulciones = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();
        panelTabla = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();

        jugadprExpulciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jugadprExpulciones.setText("Jugador con mas expulsiones");

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "equipo", "posición", "Tarjetas rojas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTabla.setViewportView(Tabla);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                .addGap(107, 107, 107))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jugadprExpulciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jugadprExpulciones)
                .addGap(37, 37, 37)
                .addComponent(botonBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
     
    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        cargartabla();
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JLabel jugadprExpulciones;
    private javax.swing.JScrollPane panelTabla;
    // End of variables declaration//GEN-END:variables
}
