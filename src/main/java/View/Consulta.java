package View;

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
        arbitrosInternacional = new javax.swing.JButton();
        jugadoresPorPosicion1 = new javax.swing.JButton();
        consultaEspecifica = new javax.swing.JPanel();

        jugadoresPorGoles.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jugadoresPorGoles.setText("Jugadores x cant. goles");
        jugadoresPorGoles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jugadoresPorGoles.setPreferredSize(new java.awt.Dimension(140, 18));
        jugadoresPorGoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresPorGolesActionPerformed(evt);
            }
        });

        CantJugadoresPorEquipo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        CantJugadoresPorEquipo.setText("Cant. jug x equipo");
        CantJugadoresPorEquipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        CantJugadoresPorEquipo.setPreferredSize(new java.awt.Dimension(140, 18));
        CantJugadoresPorEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantJugadoresPorEquipoActionPerformed(evt);
            }
        });

        jugadoresMaxExpulsion.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jugadoresMaxExpulsion.setText("Jugador c. + expulsiones");
        jugadoresMaxExpulsion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jugadoresMaxExpulsion.setPreferredSize(new java.awt.Dimension(140, 18));
        jugadoresMaxExpulsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresMaxExpulsionActionPerformed(evt);
            }
        });

        arbitrosInternacional.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        arbitrosInternacional.setText("Árbitros c. internacional");
        arbitrosInternacional.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        arbitrosInternacional.setPreferredSize(new java.awt.Dimension(140, 18));
        arbitrosInternacional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbitrosInternacionalActionPerformed(evt);
            }
        });

        jugadoresPorPosicion1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jugadoresPorPosicion1.setText("Jugadores x posición");
        jugadoresPorPosicion1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        jugadoresPorPosicion1.setPreferredSize(new java.awt.Dimension(140, 18));
        jugadoresPorPosicion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugadoresPorPosicion1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BotonesLayout = new javax.swing.GroupLayout(Botones);
        Botones.setLayout(BotonesLayout);
        BotonesLayout.setHorizontalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BotonesLayout.createSequentialGroup()
                .addComponent(CantJugadoresPorEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jugadoresPorGoles, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(arbitrosInternacional, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jugadoresMaxExpulsion, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jugadoresPorPosicion1, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
        );
        BotonesLayout.setVerticalGroup(
            BotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(CantJugadoresPorEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jugadoresPorGoles, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(arbitrosInternacional, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jugadoresMaxExpulsion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jugadoresPorPosicion1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        consultaEspecifica.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout FondoLayout = new javax.swing.GroupLayout(Fondo);
        Fondo.setLayout(FondoLayout);
        FondoLayout.setHorizontalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(consultaEspecifica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        FondoLayout.setVerticalGroup(
            FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FondoLayout.createSequentialGroup()
                .addComponent(Botones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1)
                .addComponent(consultaEspecifica, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
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
    private javax.swing.JButton arbitrosInternacional;
    private javax.swing.JPanel consultaEspecifica;
    private javax.swing.JButton jugadoresMaxExpulsion;
    private javax.swing.JButton jugadoresPorGoles;
    private javax.swing.JButton jugadoresPorPosicion1;
    // End of variables declaration//GEN-END:variables
}
