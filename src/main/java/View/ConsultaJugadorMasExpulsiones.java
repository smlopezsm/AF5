package View;

import javax.swing.table.DefaultTableModel;
import Model.Jugador;
import Model.Persona;
import java.util.List;
import javax.swing.JOptionPane;
import Controller.Controlador;
public class ConsultaJugadorMasExpulsiones extends javax.swing.JPanel {
    
    private Controlador controladorLista= new Controlador(); 
    
    public ConsultaJugadorMasExpulsiones() {
        initComponents();
    }
    public ConsultaJugadorMasExpulsiones(Controlador controladorList) {
        initComponents();
        this. controladorLista= controladorList;
    }
   

    //Buscr jugador mas Expulciones
    private void BuscarMasExpulsiones(List<Persona> lista){
        int CantTarjetasRojas=0;
        Controlador MayorExpulsiones= new Controlador();
        if(lista.size()==0){
            JOptionPane.showMessageDialog(null, "No se encontraron personas/árbitros cargados previamente");
        }else{
         for(Persona indice:lista){
              if(indice instanceof Jugador){
                 Controlador controladorAux= new Controlador();
                 controladorAux.setJugador((Jugador)indice);
                 if( CantTarjetasRojas <  controladorAux.getTarjetasRojasJugador()){
                    CantTarjetasRojas=controladorAux.getTarjetasRojasJugador();
                    
                    MayorExpulsiones.setJugador((Jugador)indice);
             }
          }
         }
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
         
         
         model.addRow(new Object[]{
                 MayorExpulsiones.getNombreJugador(),
                 MayorExpulsiones.getApellidoJugador(),
                 MayorExpulsiones.getNacionalidadJugador(),
                 MayorExpulsiones.getFechaNacimientoJugador(),
                 MayorExpulsiones.getClubActualJugador(),
                 MayorExpulsiones.getGolesJugador(),
                 MayorExpulsiones.getPosicionJugador(),
                 MayorExpulsiones.getTarjetasAmarillasJugador(),
                 MayorExpulsiones.getTarjetasRojasJugador()
         });
         tabla.setModel(model);
       panelTabla.setViewportView(tabla);
       panelTabla.setVisible(true);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        bg = new javax.swing.JPanel();
        jugadprExpulciones = new javax.swing.JLabel();
        panelTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fondoBoton = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();

        jugadprExpulciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jugadprExpulciones.setText("Jugador con mas expulsiones");

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

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(96, 96, 96))
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jugadprExpulciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(176, 176, 176))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jugadprExpulciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
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
        BuscarMasExpulsiones(controladorLista.getListaPersonas());
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonBuscarActionPerformed
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JPanel fondoBoton;
    private javax.swing.JLabel jugadprExpulciones;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
