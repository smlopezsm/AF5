package View;
import Controller.Controlador;
import Model.Jugador;
import Model.Persona;
import java.util.List;
import javax.swing.JOptionPane;
public class ConsultaJugadoresPorEquipo extends javax.swing.JPanel {
    private Controlador controlLista= new Controlador();
    public ConsultaJugadoresPorEquipo() {
        initComponents();
    }
    public ConsultaJugadoresPorEquipo(Controlador controlLista) {
        initComponents();
        this.controlLista= controlLista;
        labelResultado.setVisible(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        fondo = new javax.swing.JPanel();
        labelEquipo = new javax.swing.JLabel();
        equipos = new javax.swing.JComboBox<>();
        fondoBoton = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        labelResultado = new javax.swing.JLabel();

        labelEquipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelEquipo.setText("Ingrese el equipo");

        equipos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boca Juniors", "River Plate", "Real Madrid", "Barcelona Fc", "San Martin de San Juan", "Estudiantes", "Juventud Unida", "Defensores", "Barracas Central", "Sol de Mayo" }));
        equipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equiposActionPerformed(evt);
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

        jPanel1.setLayout(new java.awt.GridBagLayout());

        labelResultado.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelResultado.setText("Resultado");
        jPanel1.add(labelResultado, new java.awt.GridBagConstraints());

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(labelEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(equipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(22, 22, 22))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(fondoBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(195, 195, 195))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipos, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 77, Short.MAX_VALUE)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
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
    
    private void cantJugadoresEquipos(List<Persona> listado){
        int cant=0;
         String equipoBuscar=equipos.getSelectedItem().toString();
        if (listado.size() == 0) {
           JOptionPane.showMessageDialog(null, "No se encontraron personas/árbitros cargados previamente");
        }else{
        for(Persona indice: listado){
            if(indice instanceof Jugador){
                Controlador controlListaAux= new Controlador();
               controlListaAux.setJugador((Jugador)indice);
               String equipoActual=controlListaAux.getClubActualJugador();
               if(equipoActual.equals(equipoBuscar)){
                 cant++;
               }
            }
         }
         if(cant>0){      
              labelResultado.setText(equipoBuscar+" Tiene "+cant+ "Jugadores Cargados.");
              labelResultado.setVisible(true);  
         }else{
               labelResultado.setText(equipoBuscar+" No tiene Jugadores Cargados.");
               labelResultado.setVisible(true);  
         }
        }
    
    
    }
    
    private void equiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equiposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equiposActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        // TODO add your handling code here:
        cantJugadoresEquipos(controlLista.getListaPersonas());
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_botonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JComboBox<String> equipos;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoBoton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelEquipo;
    private javax.swing.JLabel labelResultado;
    // End of variables declaration//GEN-END:variables
}
