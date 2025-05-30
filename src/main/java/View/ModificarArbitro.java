package View;

import Controller.Controlador;
import Controller.Controlador.ArbitroNoEncontradoException;
import Model.Arbitro;
import javax.swing.JOptionPane;

public class ModificarArbitro extends javax.swing.JPanel {
    
    
    private Controlador controladorAux = new Controlador();
    private Arbitro arbitroBuscado;
    public ModificarArbitro(Controlador controladorAux) {
        this.controladorAux=controladorAux;
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel6 = new javax.swing.JLabel();
        diaBox = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        anioBox = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        mesBox = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        nacionalidadTxt = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        jButton2.setText("Modificar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("Tarjetas Sacadas:");

        jLabel1.setText("Nombre:");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel6.setText("Internacional:");

        diaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBoxActionPerformed(evt);
            }
        });

        anioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1950  ", "1951  ", "1952  ", "1953  ", "1954  ", "1955  ", "1956  ", "1957  ", "1958  ", "1959  ", "1960  ", "1961  ", "1962  ", "1963  ", "1964  ", "1965  ", "1966  ", "1967  ", "1968  ", "1969  ", "1970  ", "1971  ", "1972  ", "1973  ", "1974  ", "1975  ", "1976  ", "1977  ", "1978  ", "1979  ", "1980  ", "1981  ", "1982  ", "1983  ", "1984  ", "1985  ", "1986  ", "1987  ", "1988  ", "1989  ", "1990  ", "1991  ", "1992  ", "1993  ", "1994  ", "1995  ", "1996  ", "1997  ", "1998  ", "1999  ", "2000  ", "2001  ", "2002  ", "2003  ", "2004  ", "2005  ", "2006  ", "2007  ", "2008  ", "2009  ", "2010  ", "2011  ", "2012  ", "2013  ", "2014  ", "2015  ", "2016  ", "2017  ", "2018  ", "2019  ", "2020  ", "2021  ", "2022  ", "2023  ", "2024  ", "2025  ", "2026  ", "2027  ", "2028  ", "2029  ", "2030  ", "2031  ", "2032  ", "2033  ", "2034  ", "2035  ", "2036  ", "2037  ", "2038  ", "2039  ", "2040  ", "2041  ", "2042  ", "2043  ", "2044  ", "2045  ", "2046  ", "2047  ", "2048  ", "2049  ", "2050" }));
        anioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioBoxActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jLabel2.setText("Apellido:");

        jLabel3.setText("Fecha de Nacimiento:");

        mesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nacionalidad:");

        jTextField3.setText("Nombre del árbitro...");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(310, 310, 310)
                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(318, 318, 318))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jTextField3)
                        .addGap(81, 81, 81)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(270, 270, 270)
                            .addComponent(diaBox, 0, 85, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(mesBox, 0, 109, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(anioBox, 0, 88, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(222, 222, 222)
                            .addComponent(jTextField1)
                            .addGap(120, 120, 120)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(18, 18, 18)
                            .addComponent(jTextField2))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(216, 216, 216)
                            .addComponent(nacionalidadTxt)
                            .addGap(78, 78, 78)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jComboBox1, 0, 136, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(274, 274, 274)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jSpinner3)
                            .addGap(148, 148, 148)))
                    .addGap(122, 122, 122)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 17, Short.MAX_VALUE)
                .addGap(126, 126, 126)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(111, 111, 111)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(30, 30, 30)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(diaBox)
                        .addComponent(mesBox)
                        .addComponent(anioBox))
                    .addGap(35, 35, 35)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nacionalidadTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGap(41, 41, 41)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(111, 111, 111)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String seleccion = (String) jComboBox1.getSelectedItem();
        Boolean internacionalArbitro = null;
        if ("Si".equals(seleccion)) {
            internacionalArbitro = true;
        } else if ("No".equals(seleccion)) {
            internacionalArbitro = false;
        }
        int totalTarj = (int) jSpinner3.getValue();
        controladorAux.setInternacionalBuscado(arbitroBuscado,internacionalArbitro);
        controladorAux.setTarjetasSacadasArbitroBuscado(arbitroBuscado,totalTarj);
        JOptionPane.showMessageDialog(this,"Arbitro Modificado exitosamente");          
    }//GEN-LAST:event_jButton2ActionPerformed

    private void diaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaBoxActionPerformed

    private void anioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioBoxActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        if (jTextField3.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Campo vacío", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try{
                this.arbitroBuscado = controladorAux.buscarArbitro(jTextField3.getText());
                jTextField1.setText(controladorAux.getNombreArbitroBuscado(arbitroBuscado));
                jTextField1.setEditable(false);
                jTextField2.setText(controladorAux.getApellidoArbitroBuscado(arbitroBuscado));
                jTextField2.setEditable(false);
                diaBox.setSelectedIndex(controladorAux.getDiaNacimientoArbitroBuscado(arbitroBuscado));
                diaBox.setEnabled(false);
                mesBox.setSelectedIndex(controladorAux.getMesNacimientoArbitroBuscado(arbitroBuscado));
                mesBox.setEnabled(false);
                int anioNacimiento = controladorAux.getAnioNacimientoArbitroBuscado(arbitroBuscado);
                for (int i = 0; i < anioBox.getItemCount(); i++) {
                    if (anioBox.getItemAt(i).trim().equals(String.valueOf(anioNacimiento))) {
                        anioBox.setSelectedIndex(i);
                        break;
                    }
                }
                anioBox.setEnabled(false);
                nacionalidadTxt.setText(controladorAux.getNacionalidadArbitroBuscado(arbitroBuscado));
                nacionalidadTxt.setEnabled(false);
                jComboBox1.setSelectedItem(controladorAux.getArbitroInternacionalBuscado(arbitroBuscado));
                jSpinner3.setValue(controladorAux.getTarjetasSacadasArbitroBuscado(arbitroBuscado)); 
            }catch (ArbitroNoEncontradoException e) {
                jTextField3.setText("");
                JOptionPane.showMessageDialog(this,e.getMessage(),"Árbitro no encontrado",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> anioBox;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> diaBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JComboBox<String> mesBox;
    private javax.swing.JTextField nacionalidadTxt;
    // End of variables declaration//GEN-END:variables
}
