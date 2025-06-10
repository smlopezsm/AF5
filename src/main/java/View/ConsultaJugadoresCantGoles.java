package View;

import Controller.Controlador;
import Model.Persona;
import Model.Jugador;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultaJugadoresCantGoles extends javax.swing.JPanel {
    private Controlador ControladorLista= new Controlador();
    public ConsultaJugadoresCantGoles(Controlador ControladorLista) {
        initComponents();
        this.ControladorLista=ControladorLista;
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
                 if(controladorAux.getGolesJugador()> (int)cantGoles.getValue()){
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
          JOptionPane.showMessageDialog(null,"No se encontraron jugadores que superen la cantidad de :"+ (int)cantGoles.getValue()+" goles.");
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

        fondo = new javax.swing.JPanel();
        labelCantGoles = new javax.swing.JLabel();
        panelTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        cantGoles = new javax.swing.JSpinner();
        fondoBoton = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();

        labelCantGoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCantGoles.setText("Ingrese la cantidad de goles");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datos"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTabla.setViewportView(tabla);

        cantGoles.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

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

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(labelCantGoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cantGoles)
                        .addGap(60, 60, 60))))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(100, 100, 100))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelCantGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantGoles, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        CargarTabla(ControladorLista.getListaPersonas());
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonBuscarActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JSpinner cantGoles;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoBoton;
    private javax.swing.JLabel labelCantGoles;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
