package View;
import Model.Jugador;
import Model.Persona;
import Controller.Controlador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaJugadoresPorPosicion extends javax.swing.JPanel {
   private Controlador controladorLista= new Controlador();
    public ConsultaJugadoresPorPosicion(Controlador controladorLista) {
        initComponents();
        this.controladorLista=  controladorLista;
    }
    private void CargarTabla(List<Persona> lista){
           boolean jugadorEncontrado=false;
        if(lista.size()==0){
            JOptionPane.showMessageDialog(null, "No se encontraron personas/árbitros cargados previamente");
        }else{
             DefaultTableModel model = new DefaultTableModel() {
             @Override
             public boolean isCellEditable(int row, int column) {
                  return false; // Hace que ninguna celda sea editable
              }
         };
         model.addColumn("Nombre");
         model.addColumn("Apellido");
         model.addColumn("Nacinalidad");
         model.addColumn("Fecha de Nacimiento");
         model.addColumn("Equipo");
         model.addColumn("Cant goles");
         model.addColumn("Posición");
         model.addColumn("Tarjetas amarillas");
         model.addColumn("Tarjetas Rojas");
         
         for(Persona indice:lista){
              if(indice instanceof Jugador){
                 Controlador controladorAux= new Controlador();
                 controladorAux.setJugador((Jugador)indice);
                 if(controladorAux.getPosicionJugador().equals(posiciones.getSelectedItem())){
                  model.addRow(new Object[]{
                  controladorAux.getNombreJugador(),
                  controladorAux.getApellidoJugador(),
                  controladorAux.getNacionalidadJugador(),
                  controladorAux.getFechaNacimientoJugador(),
                  controladorAux.getClubActualJugador(),
                  controladorAux.getGolesJugador(),
                  controladorAux.getPosicionJugador(),
                  controladorAux.getTarjetasAmarillasJugador(),
                  controladorAux.getTarjetasRojasJugador()
                 });
                 jugadorEncontrado=true; 
             }
          }
         }
        
         
        if(!jugadorEncontrado){
          JOptionPane.showMessageDialog(null,"No se encontraron jugadores que superen la cantidad de :"+" goles.");
        }else{
         tabla.setModel(model);
       panelTabla.setViewportView(tabla);
       panelTabla.setVisible(true);
        }
       }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bg = new javax.swing.JPanel();
        labelPosicion = new javax.swing.JLabel();
        posiciones = new javax.swing.JComboBox<>();
        fondoBoton = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        panelTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        labelPosicion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelPosicion.setText("ingrese la posición");

        posiciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Arquero", "Defensor", "Mediocampista", "Delantero" }));
        posiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                posicionesActionPerformed(evt);
            }
        });

        fondoBoton.setLayout(new java.awt.GridBagLayout());

        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        fondoBoton.add(botonBuscar, gridBagConstraints);

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "equipo", "posición", "Cant goles"
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
        panelTabla.setViewportView(tabla);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(labelPosicion, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(85, 85, 85)
                .addComponent(posiciones, 0, 172, Short.MAX_VALUE)
                .addGap(16, 16, 16))
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(88, 88, 88))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(bgLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(posiciones, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addComponent(labelPosicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                .addGap(307, 307, 307))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addContainerGap(151, Short.MAX_VALUE)
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
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
     
    private void posicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_posicionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_posicionesActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        CargarTabla(controladorLista.getListaPersonas());
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JPanel fondoBoton;
    private javax.swing.JLabel labelPosicion;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JComboBox<String> posiciones;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
