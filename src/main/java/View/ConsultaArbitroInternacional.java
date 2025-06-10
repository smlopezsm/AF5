package View;
import Controller.Controlador;
import javax.swing.table.DefaultTableModel;
import Model.*;
import java.util.List;
import javax.swing.JOptionPane;

public class ConsultaArbitroInternacional extends javax.swing.JPanel {
    
    private Controlador ControladorLista= new Controlador();
    
    public ConsultaArbitroInternacional() {
        initComponents();
       // panelTabla.setVisible(false);
    }
    
     public ConsultaArbitroInternacional( Controlador controladorLista) {
        initComponents();
        this.ControladorLista=controladorLista;
       // panelTabla.setVisible(false);
    }
    
     private void CargarTabla(List<Persona>  lista ){
       //muestra un mensje si la lista esta vacia, si no procede a realizar la consulta 
         if (lista.size() == 0) {
           JOptionPane.showMessageDialog(null, "No se encontraron personas/árbitros cargados previamente");
        }else{
           boolean encontrar= false;
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
        model.addColumn("Internacional");
        model.addColumn("Tarjetas sacadas");
      
        Controlador cantroladorAux= new   Controlador();
      
        for(Persona indice: lista ){
          
           if(indice instanceof  Arbitro){
             cantroladorAux.setArbitro((Arbitro) indice);
                if(cantroladorAux.getArbitroInternacional().equals("Si") ){
                 encontrar= true;
                 model.addRow(new Object[]{
                 cantroladorAux.getNombreArbitro(),
                 cantroladorAux.getApellidoArbitro(),
                 cantroladorAux.getNacionalidadArbitro(),
                 cantroladorAux.getFechaNacimientoArbitro(),
                 cantroladorAux.getArbitroInternacional(),
                 cantroladorAux.getTarjetasSacadasArbitro(),
         
              });
              }
            
          }
         
      }
     
      //mensaje si no encontro aebitro que cumpla la candicion, si la encontro crea la tabla
     if(encontrar== false ){
          JOptionPane.showMessageDialog(null, "No se encontraron personas/árbitros que cumplan con los requerimientos");
          }else{
          tabla.setModel(model);
        
        // Crear el JScrollPane que contendrá la tabla
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
        labelInternacional = new javax.swing.JLabel();
        panelTabla = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        fondoBoton = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();

        labelInternacional.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelInternacional.setText("Presione el boton para buscar árbitros con internacional");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Datos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        panelTabla.setViewportView(tabla);
        if (tabla.getColumnModel().getColumnCount() > 0) {
            tabla.getColumnModel().getColumn(0).setResizable(false);
        }

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
                .addGap(10, 10, 10)
                .addComponent(labelInternacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(137, 137, 137))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(labelInternacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fondoBoton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(46, 46, 46)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel fondoBoton;
    private javax.swing.JLabel labelInternacional;
    private javax.swing.JScrollPane panelTabla;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
