package View;

import View.*;
import java.awt.BorderLayout;

public class Consulta extends javax.swing.JPanel {

    public Consulta() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        Botones = new javax.swing.JPanel();
        jugadoresPorGoles = new javax.swing.JButton();
        CantJugadoresPorEquipo = new javax.swing.JButton();
        jugadoresMaxExpulsion = new javax.swing.JButton();
        MostrarPersona = new javax.swing.JButton();
        arbitrosInternacional = new javax.swing.JButton();
        jugadoresPorPosicion1 = new javax.swing.JButton();
        consultaEspecifica = new javax.swing.JPanel();

        Botones.setBackground(new java.awt.Color(0, 51, 204));

        jugadoresPorGoles.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jugadoresPorGoles.setText("Jugadores por cantidad de goles");
        jugadoresPorGoles.setBorder(null);
        jugadoresPorGoles.setBorderPainted(false);
        jugadoresPorGoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresPorGolesActionPerformed(evt);
            }
        });

        CantJugadoresPorEquipo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        CantJugadoresPorEquipo.setText("Cantidad de jugadores por equipo");
        CantJugadoresPorEquipo.setBorder(null);
        CantJugadoresPorEquipo.setBorderPainted(false);
        CantJugadoresPorEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantJugadoresPorEquipoActionPerformed(evt);
            }
        });

        jugadoresMaxExpulsion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jugadoresMaxExpulsion.setText("Jugador con mas expulsiones");
        jugadoresMaxExpulsion.setBorder(null);
        jugadoresMaxExpulsion.setBorderPainted(false);
        jugadoresMaxExpulsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresMaxExpulsionActionPerformed(evt);
            }
        });

        MostrarPersona.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MostrarPersona.setText("Mostrar personas");
        MostrarPersona.setBorder(null);
        MostrarPersona.setBorderPainted(false);
        MostrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarPersonaActionPerformed(evt);
            }
        });

        arbitrosInternacional.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        arbitrosInternacional.setText("Árbitros con internacional");
        arbitrosInternacional.setBorder(null);
        arbitrosInternacional.setBorderPainted(false);
        arbitrosInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbitrosInternacionalActionPerformed(evt);
            }
        });

        jugadoresPorPosicion1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jugadoresPorPosicion1.setText("Jugadores por posición");
        jugadoresPorPosicion1.setBorder(null);
        jugadoresPorPosicion1.setBorderPainted(false);
        jugadoresPorPosicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresPorPosicion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jugadoresPorGoles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(CantJugadoresPorEquipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE)
            .addComponent(arbitrosInternacional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jugadoresMaxExpulsion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jugadoresPorPosicion1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MostrarPersona, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CantJugadoresPorEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jugadoresPorGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(arbitrosInternacional, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jugadoresMaxExpulsion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jugadoresPorPosicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(MostrarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        consultaEspecifica.setBackground(new java.awt.Color(51, 51, 255));
        consultaEspecifica.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(consultaEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Botones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(consultaEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void arbitrosInternacionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbitrosInternacionalActionPerformed
        consultaEspecifica.removeAll();
        consultaEspecifica.setLayout( new BorderLayout());
        consultaEspecifica.add(new ConsultaArbitroInternacional(),BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_arbitrosInternacionalActionPerformed

    private void CantJugadoresPorEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantJugadoresPorEquipoActionPerformed
        consultaEspecifica.removeAll();
        consultaEspecifica.setLayout( new BorderLayout());
        consultaEspecifica.add(new ConsultaJuagadoresPorEquipo(),BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_CantJugadoresPorEquipoActionPerformed

    private void jugadoresPorGolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresPorGolesActionPerformed
        consultaEspecifica.removeAll();
        consultaEspecifica.setLayout( new BorderLayout()); 
        consultaEspecifica.add(new ConsultaJugadoresCantGoles(),BorderLayout.CENTER);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_jugadoresPorGolesActionPerformed

    private void jugadoresMaxExpulsionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresMaxExpulsionActionPerformed
        consultaEspecifica.removeAll();
        consultaEspecifica.setLayout( new BorderLayout()); 
        consultaEspecifica.add(new ConsultaJugadorMasExpulsiones(),BorderLayout.CENTER);
        this.revalidate();
        this.repaint(); 
        
    }//GEN-LAST:event_jugadoresMaxExpulsionActionPerformed

    private void MostrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarPersonaActionPerformed
        consultaEspecifica.removeAll();
        consultaEspecifica.setLayout( new BorderLayout()); 
        consultaEspecifica.add(new  MostrarPersonas(),BorderLayout.CENTER);
        this.revalidate();
        this.repaint(); 
    }//GEN-LAST:event_MostrarPersonaActionPerformed

    private void jugadoresPorPosicion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugadoresPorPosicion1ActionPerformed
        consultaEspecifica.removeAll();
        consultaEspecifica.setLayout( new BorderLayout()); 
        consultaEspecifica.add(new  ConsultaJugadoresPorPosicion(),BorderLayout.CENTER);
        this.revalidate();
        this.repaint(); 
    }//GEN-LAST:event_jugadoresPorPosicion1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Botones;
    private javax.swing.JButton CantJugadoresPorEquipo;
    private javax.swing.JPanel Fondo;
    private javax.swing.JButton MostrarPersona;
    private javax.swing.JButton arbitrosInternacional;
    private javax.swing.JPanel consultaEspecifica;
    private javax.swing.JButton jugadoresMaxExpulsion;
    private javax.swing.JButton jugadoresPorGoles;
    private javax.swing.JButton jugadoresPorPosicion1;
    // End of variables declaration//GEN-END:variables
}
