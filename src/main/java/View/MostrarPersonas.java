package View;
import Controller.Controlador;
import Model.*;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class MostrarPersonas extends javax.swing.JPanel {
    private Controlador ControladorLista= new Controlador();
    public MostrarPersonas(Controlador ControladorLista) {
        initComponents();
     this.ControladorLista=ControladorLista;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        botonJugadores = new javax.swing.JButton();
        botonArbitro = new javax.swing.JButton();
        botonPersonas = new javax.swing.JButton();
        scrollTabla = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        botonJugadores.setText("Jugadores");
        botonJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonJugadoresActionPerformed(evt);
            }
        });

        botonArbitro.setText("Árbitros");
        botonArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonArbitroActionPerformed(evt);
            }
        });

        botonPersonas.setText("Personas");
        botonPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonasActionPerformed(evt);
            }
        });

        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Datos"
            }
        ));
        scrollTabla.setViewportView(tablaDatos);

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                    .addGroup(fondoLayout.createSequentialGroup()
                        .addComponent(botonJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonPersonas, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(botonArbitro, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(botonJugadores, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(scrollTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
    }// </editor-fold>//GEN-END:initComponents
    //
    private void TablaArbitro(List<Persona> lista){
         if (lista.size() == 0) {
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
      model.addColumn("Nacionalidad");
      model.addColumn("Fecha de Nacimiento");
      model.addColumn("Internacional");
      model.addColumn("Tarjetas sacadas");
      
      Controlador ControladorAux= new Controlador();
      
      for(Persona indice: lista ){
          
          if(indice instanceof  Arbitro){
             ControladorAux.setArbitro((Arbitro) indice);
             model.addRow(new Object[]{
               ControladorAux.getNombreArbitro(),
               ControladorAux.getApellidoArbitro(),
               ControladorAux.getNacionalidadArbitro(),
               ControladorAux.getFechaNacimientoArbitro(),
               ControladorAux.getArbitroInternacional(),
               ControladorAux.getTarjetasSacadasArbitro(),
         
              });
          }
      }
      tablaDatos.setModel(model);
      scrollTabla.setViewportView(tablaDatos);
      scrollTabla.setVisible(true);
         }
    }
    //tabla jugador
    private void TablaJugador(List<Persona> lista){
        if (lista.size() == 0) {
           JOptionPane.showMessageDialog(null, "No se encontraron personas/jugadores cargados previamente");
        }else{ 
      DefaultTableModel model = new DefaultTableModel() {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false; // Hace que ninguna celda sea editable
        }
    };
      model.addColumn("Nombre");
      model.addColumn("Apellido");
      model.addColumn("Nacionalidad");
      model.addColumn("Fecha de Nacimiento");
      model.addColumn("Equipo");
      model.addColumn("Cantidad de goles");
      model.addColumn("Posición");
      model.addColumn("Tarjetas amarillas");
      model.addColumn("Tarjetas Rojas");
      
      Controlador ControladorAux= new Controlador();
      
      for(Persona indice: lista ){
          
          if(indice instanceof  Jugador){
             ControladorAux.setJugador((Jugador) indice);
             model.addRow(new Object[]{
                ControladorAux.getNombreJugador(),
                ControladorAux.getApellidoJugador(),
                ControladorAux.getNacionalidadJugador(),
                ControladorAux.getFechaNacimientoJugador(),
                ControladorAux.getClubActualJugador(),
                ControladorAux.getGolesJugador(),
                ControladorAux.getPosicionJugador(),
                ControladorAux.getTarjetasAmarillasJugador(),
                ControladorAux.getTarjetasRojasJugador()
         
              });
          }
      }
      
      tablaDatos.setModel(model);
      scrollTabla.setViewportView(tablaDatos);
      scrollTabla.setVisible(true);
      
        }
    }

    //tabla personas
    private void TablaPersona(List<Persona> lista){
         if (lista.size() == 0) {
           JOptionPane.showMessageDialog(null, "No se encontraron personas cargadas previamente");
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
      
      Controlador ControladorAux= new Controlador();
      
      for(Persona indice: lista ){
        ControladorAux.setPersona(indice);
       model.addRow(new Object[]{
         ControladorAux.getNombrePersona(),
         ControladorAux.getApellidoPersona(),
         ControladorAux.getNacionalidadPersona(),
         ControladorAux.getFechaNacimientoPersona()
       
      
      });
      }
      tablaDatos.setModel(model);
      scrollTabla.setViewportView(tablaDatos);
      scrollTabla.setVisible(true);
         }
    }
    
    
    private void botonArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonArbitroActionPerformed
        // TODO add your handling code here:
        TablaArbitro(ControladorLista.getListaPersonas());
         this.revalidate(); // Asegurar que los componentes se actualicen
         this.repaint(); 
    }//GEN-LAST:event_botonArbitroActionPerformed

    private void botonJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonJugadoresActionPerformed
        // TODO add your handling code here:
         TablaJugador(ControladorLista.getListaPersonas());
         this.revalidate(); // Asegurar que los componentes se actualicen
         this.repaint(); 
    }//GEN-LAST:event_botonJugadoresActionPerformed

    private void botonPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPersonasActionPerformed
        // TODO add your handling code here:
        TablaPersona(ControladorLista.getListaPersonas());
        this.revalidate(); // Asegurar que los componentes se actualicen
        this.repaint(); 
    }//GEN-LAST:event_botonPersonasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonArbitro;
    private javax.swing.JButton botonJugadores;
    private javax.swing.JButton botonPersonas;
    private javax.swing.JPanel fondo;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
