package View;

import Controller.Controlador;
import javax.swing.JOptionPane;

public class CargaArbitro extends javax.swing.JPanel {

    public CargaArbitro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        TotalTarjetasSpn = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        diaBox = new javax.swing.JComboBox<>();
        txtNombreArbitro = new javax.swing.JTextField();
        AnioBox = new javax.swing.JComboBox<>();
        InternacionalBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        mesBox = new javax.swing.JComboBox<>();
        txtApellidoArbitro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNacionalidadArbitro = new javax.swing.JTextField();
        AgregarArbitroBtn = new javax.swing.JButton();
        LimpiarArbitroBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(723, 473));

        jLabel3.setText("Fecha de Nacimiento:");

        jLabel8.setText("Tarjetas Sacadas:");

        jLabel1.setText("Nombre:");

        TotalTarjetasSpn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Datos Del Arbitro:");

        jLabel6.setText("Internacional:");

        diaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBoxActionPerformed(evt);
            }
        });

        txtNombreArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreArbitroActionPerformed(evt);
            }
        });

        AnioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1950  ", "1951  ", "1952  ", "1953  ", "1954  ", "1955  ", "1956  ", "1957  ", "1958  ", "1959  ", "1960  ", "1961  ", "1962  ", "1963  ", "1964  ", "1965  ", "1966  ", "1967  ", "1968  ", "1969  ", "1970  ", "1971  ", "1972  ", "1973  ", "1974  ", "1975  ", "1976  ", "1977  ", "1978  ", "1979  ", "1980  ", "1981  ", "1982  ", "1983  ", "1984  ", "1985  ", "1986  ", "1987  ", "1988  ", "1989  ", "1990  ", "1991  ", "1992  ", "1993  ", "1994  ", "1995  ", "1996  ", "1997  ", "1998  ", "1999  ", "2000  ", "2001  ", "2002  ", "2003  ", "2004  ", "2005  ", "2006  ", "2007  ", "2008  ", "2009  ", "2010  ", "2011  ", "2012  ", "2013  ", "2014  ", "2015  ", "2016  ", "2017  ", "2018  ", "2019  ", "2020  ", "2021  ", "2022  ", "2023  ", "2024  ", "2025  ", "2026  ", "2027  ", "2028  ", "2029  ", "2030  ", "2031  ", "2032  ", "2033  ", "2034  ", "2035  ", "2036  ", "2037  ", "2038  ", "2039  ", "2040  ", "2041  ", "2042  ", "2043  ", "2044  ", "2045  ", "2046  ", "2047  ", "2048  ", "2049  ", "2050" }));
        AnioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnioBoxActionPerformed(evt);
            }
        });

        InternacionalBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        jLabel2.setText("Apellido:");

        mesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));
        mesBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mesBoxActionPerformed(evt);
            }
        });

        txtApellidoArbitro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoArbitroActionPerformed(evt);
            }
        });

        jLabel4.setText("Nacionalidad:");

        AgregarArbitroBtn.setText("Agregar");
        AgregarArbitroBtn.setPreferredSize(new java.awt.Dimension(159, 71));
        AgregarArbitroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarArbitroBtnActionPerformed(evt);
            }
        });

        LimpiarArbitroBtn.setText("Limpiar");
        LimpiarArbitroBtn.setPreferredSize(new java.awt.Dimension(159, 71));
        LimpiarArbitroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarArbitroBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AgregarArbitroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addComponent(LimpiarArbitroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNacionalidadArbitro)
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(InternacionalBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreArbitro)
                                .addGap(17, 17, 17))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(7, 7, 7)
                                .addComponent(txtApellidoArbitro))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(mesBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(AnioBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(4, 4, 4)
                        .addComponent(TotalTarjetasSpn)
                        .addGap(147, 147, 147)))
                .addGap(145, 145, 145))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreArbitro)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidoArbitro))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaBox)
                    .addComponent(mesBox)
                    .addComponent(AnioBox)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(InternacionalBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNacionalidadArbitro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TotalTarjetasSpn)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AgregarArbitroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                    .addComponent(LimpiarArbitroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE))
                .addGap(82, 82, 82))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void diaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaBoxActionPerformed

    private void AnioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnioBoxActionPerformed

    private void txtApellidoArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoArbitroActionPerformed

    private void txtNombreArbitroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreArbitroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreArbitroActionPerformed

    private void LimpiarArbitroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarArbitroBtnActionPerformed
        txtApellidoArbitro.setText("");
        txtNombreArbitro.setText("");
        txtNacionalidadArbitro.setText("");
        diaBox.setSelectedIndex(0);
        mesBox.setSelectedIndex(0);
        AnioBox.setSelectedIndex(0);
        InternacionalBox.setSelectedIndex(0);
        TotalTarjetasSpn.setValue(0);
        
    }//GEN-LAST:event_LimpiarArbitroBtnActionPerformed

    private void AgregarArbitroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarArbitroBtnActionPerformed
        String apellidoarbitro = txtApellidoArbitro.getText();
        String nombrearbitro = txtNombreArbitro.getText();
        String nacionalidadArbitro = txtNacionalidadArbitro.getText();
        int diaNac = (int) diaBox.getSelectedIndex();
        int mesNac = (int) mesBox.getSelectedIndex();
        int anioNac = (int) AnioBox.getSelectedIndex();
        Boolean internacionalArbitro = (Boolean) InternacionalBox.getSelectedItem();
        int totaltarj = (int) TotalTarjetasSpn.getValue();

        Controlador.AgregarArbitro(nombrearbitro, apellidoarbitro, nacionalidadArbitro, diaNac, mesNac, anioNac, internacionalArbitro, totaltarj);
        JOptionPane.showMessageDialog(this, "Arbitro Cargado Correctamente");
        //controlar todos los campos con try catch y solo mandar a AgregarArbitro si todos los campos están completos y si ese arbitro no existe todavía
    }//GEN-LAST:event_AgregarArbitroBtnActionPerformed

    private void mesBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mesBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mesBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarArbitroBtn;
    private javax.swing.JComboBox<String> AnioBox;
    private javax.swing.JComboBox<String> InternacionalBox;
    private javax.swing.JButton LimpiarArbitroBtn;
    private javax.swing.JSpinner TotalTarjetasSpn;
    private javax.swing.JComboBox<String> diaBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox<String> mesBox;
    private javax.swing.JTextField txtApellidoArbitro;
    private javax.swing.JTextField txtNacionalidadArbitro;
    private javax.swing.JTextField txtNombreArbitro;
    // End of variables declaration//GEN-END:variables
}
