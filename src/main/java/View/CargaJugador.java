package View;

import Controller.Controlador;
import Model.Jugador;
import Model.Persona;
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTextField;

public class CargaJugador extends javax.swing.JPanel {

    private Controlador ControladorLista = new Controlador();
    List<Persona>lista=new ArrayList<>();
    public CargaJugador(Controlador ControladorList) {
        initComponents();
        this.ControladorLista = ControladorList;
        minimoJuadores(ControladorLista.getListaPersonas());
    }
    
    private int comprobar(List<Persona> listado,String equipoBuscar){
    int cant=0;
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
        
        } 
        return cant;
    }
    
    private void minimoJuadores(List<Persona> listado){
    boolean cumpleMinimo=true;
    String equipo="";
    for(int i=1;i<equipoBox.getItemCount();i++){
    if( comprobar(listado, equipoBox.getItemAt(i))<5){
    cumpleMinimo=false;
    equipo=equipo+","+equipoBox.getItemAt(i);
    }
    
    }
    if(!cumpleMinimo){
     JOptionPane.showMessageDialog(null,"hay equipos con menos de 5 jugadores, los cuales son:"+equipo+" por favor carge la cantida de equipos correcta");
    }
    }
    
    private boolean excedeMaximoJugadores(List<Persona> listado,String equipo){
     int cant=comprobar(listado,equipo);
     if(cant==7){
     return true;
     }else{
     return false;
     }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombrejugador = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoJugador = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        diaBox = new javax.swing.JComboBox<>();
        AnioBox = new javax.swing.JComboBox<>();
        mesBox = new javax.swing.JComboBox<>();
        txtNacionalidadJugador = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        equipoBox = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        PosicionJugadorBox = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        CantGolesSpn = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        TarjetasAmarillasJugadorSpn = new javax.swing.JSpinner();
        jLabel9 = new javax.swing.JLabel();
        TarjetasRojasJugadorspn = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        Limpiarbtn = new javax.swing.JButton();
        nacionalidadBox = new javax.swing.JComboBox<>();

        jLabel1.setText("Nombre:");

        txtNombrejugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrejugadorActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellido:");

        txtApellidoJugador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoJugadorActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Nacimiento:");

        diaBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        diaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diaBoxActionPerformed(evt);
            }
        });

        AnioBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año", "1950  ", "1951  ", "1952  ", "1953  ", "1954  ", "1955  ", "1956  ", "1957  ", "1958  ", "1959  ", "1960  ", "1961  ", "1962  ", "1963  ", "1964  ", "1965  ", "1966  ", "1967  ", "1968  ", "1969  ", "1970  ", "1971  ", "1972  ", "1973  ", "1974  ", "1975  ", "1976  ", "1977  ", "1978  ", "1979  ", "1980  ", "1981  ", "1982  ", "1983  ", "1984  ", "1985  ", "1986  ", "1987  ", "1988  ", "1989  ", "1990  ", "1991  ", "1992  ", "1993  ", "1994  ", "1995  ", "1996  ", "1997  ", "1998  ", "1999  ", "2000  ", "2001  ", "2002  ", "2003  ", "2004  ", "2005  ", "2006  ", "2007  ", "2008  ", "2009  ", "2010  ", "2011  ", "2012  ", "2013  ", "2014  ", "2015  ", "2016  ", "2017  ", "2018  ", "2019  ", "2020  ", "2021  ", "2022  ", "2023  ", "2024  ", "2025  ", "2026  ", "2027  ", "2028  ", "2029  ", "2030  ", "2031  ", "2032  ", "2033  ", "2034  ", "2035  ", "2036  ", "2037  ", "2038  ", "2039  ", "2040  ", "2041  ", "2042  ", "2043  ", "2044  ", "2045  ", "2046  ", "2047  ", "2048  ", "2049  ", "2050" }));
        AnioBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnioBoxActionPerformed(evt);
            }
        });

        mesBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        txtNacionalidadJugador.setText("Nacionalidad:");

        jLabel5.setText("Club Actual:");

        equipoBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Boca Juniors", "River Plate", "Real Madrid", "Barcelona Fc", "San Martin de San Juan", "Estudiantes", "Juventud Unida", "Defensores", "Barracas Central", "Sol de Mayo" }));
        equipoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Posición:");

        PosicionJugadorBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Arquero", "Defensor", "Mediocampista", "Delantero" }));

        jLabel7.setText("Cantidad de Goles:");

        CantGolesSpn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel8.setText("Tarjetas Amarillas:");

        TarjetasAmarillasJugadorSpn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel9.setText("Tarjetas Rojas:");

        TarjetasRojasJugadorspn.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Datos Del Jugador:");

        BtnAgregar.setText("Agregar");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        Limpiarbtn.setText("Limpiar");
        Limpiarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarbtnActionPerformed(evt);
            }
        });

        nacionalidadBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Afganistán", "Albania", "Alemania", "Andorra", "Angola", "Antigua y Barbuda", "Arabia Saudita", "Argelia", "Argentina", "Armenia", "Australia", "Austria", "Azerbaiyán", "Bahamas", "Bangladés", "Barbados", "Baréin", "Bélgica", "Belice", "Benín", "Bielorrusia", "Birmania (Myanmar)", "Bolivia", "Bosnia y Herzegovina", "Botsuana", "Brasil", "Brunéi", "Bulgaria", "Burkina Faso", "Burundi", "Bután", "Cabo Verde", "Camboya", "Camerún", "Canadá", "Catar", "Chad", "Chile", "China", "Chipre", "Colombia", "Comoras", "Corea del Norte", "Corea del Sur", "Costa de Marfil", "Costa Rica", "Croacia", "Cuba", "Dinamarca", "Dominica", "Ecuador", "Egipto", "El Salvador", "Emiratos Árabes Unidos", "Eritrea", "Eslovaquia", "Eslovenia", "España", "Estados Unidos", "Estonia", "Esuatini", "Etiopía", "Filipinas", "Finlandia", "Fiyi", "Francia", "Gabón", "Gambia", "Georgia", "Ghana", "Granada", "Grecia", "Guatemala", "Guinea", "Guinea-Bisáu", "Guinea Ecuatorial", "Guyana", "Haití", "Honduras", "Hungría", "India", "Indonesia", "Irak", "Irán", "Irlanda", "Islandia", "Islas Marshall", "Islas Salomón", "Israel", "Italia", "Jamaica", "Japón", "Jordania", "Kazajistán", "Kenia", "Kirguistán", "Kiribati", "Kuwait", "Laos", "Lesoto", "Letonia", "Líbano", "Liberia", "Libia", "Liechtenstein", "Lituania", "Luxemburgo", "Madagascar", "Malasia", "Malaui", "Maldivas", "Malí", "Malta", "Marruecos", "Mauricio", "Mauritania", "México", "Micronesia", "Moldavia", "Mónaco", "Mongolia", "Montenegro", "Mozambique", "Namibia", "Nauru", "Nepal", "Nicaragua", "Níger", "Nigeria", "Noruega", "Nueva Zelanda", "Omán", "Países Bajos", "Pakistán", "Palaos", "Panamá", "Papúa Nueva Guinea", "Paraguay", "Perú", "Polonia", "Portugal", "Reino Unido", "República Centroafricana", "República Checa", "República del Congo", "República Democrática del Congo", "República Dominicana", "Ruanda", "Rumanía", "Rusia", "San Cristóbal y Nieves", "San Marino", "San Vicente y las Granadinas", "Santa Lucía", "Santo Tomé y Príncipe", "Senegal", "Serbia", "Seychelles", "Sierra Leona", "Singapur", "Siria", "Somalia", "Sri Lanka", "Sudáfrica", "Sudán", "Sudán del Sur", "Suecia", "Suiza", "Surinam", "Tailandia", "Tanzania", "Tayikistán", "Timor Oriental", "Togo", "Tonga", "Trinidad y Tobago", "Túnez", "Turkmenistán", "Turquía", "Tuvalu", "Ucrania", "Uganda", "Uruguay", "Uzbekistán", "Vanuatu", "Vaticano", "Venezuela", "Vietnam", "Yemen", "Yibuti", "Zambia", "Zimbabue" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(176, 176, 176)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(196, 196, 196))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(114, 114, 114)
                        .addComponent(Limpiarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombrejugador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoJugador))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNacionalidadJugador)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nacionalidadBox, 0, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(12, 12, 12)
                                .addComponent(PosicionJugadorBox, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(equipoBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CantGolesSpn)))
                    .addGroup(javax.swing.GroupLayout.Alignment.CENTER, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(20, 20, 20)
                                .addComponent(TarjetasAmarillasJugadorSpn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9)
                                .addGap(11, 11, 11)
                                .addComponent(TarjetasRojasJugadorspn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diaBox, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(AnioBox, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombrejugador)
                    .addComponent(jLabel2)
                    .addComponent(txtApellidoJugador))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(diaBox)
                    .addComponent(mesBox)
                    .addComponent(AnioBox)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipoBox)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNacionalidadJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nacionalidadBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PosicionJugadorBox)
                        .addComponent(CantGolesSpn)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TarjetasAmarillasJugadorSpn)
                    .addComponent(TarjetasRojasJugadorspn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Limpiarbtn, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                    .addComponent(BtnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AnioBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnioBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnioBoxActionPerformed

    private void diaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diaBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diaBoxActionPerformed

    private void txtApellidoJugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoJugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoJugadorActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        try {
            
            String nombreJgdor = txtNombrejugador.getText();
            if (nombreJgdor.isEmpty()) {
                JOptionPane.showMessageDialog(this, "¡Ingrese Nombre!");
                return;
            }
            String apeJgdor = txtApellidoJugador.getText();
            if (apeJgdor.isEmpty()) {
                JOptionPane.showMessageDialog(this, "¡Ingrese Apellido!");
                return;
            }
            String nacioJgdor = nacionalidadBox.getSelectedItem().toString().trim();
            if (nacioJgdor.isEmpty()) {
                JOptionPane.showMessageDialog(this, "¡Ingrese Nacionalidad!");
                return;
            }

            int diaNac = (int) diaBox.getSelectedIndex();
            int mesNac = (int) mesBox.getSelectedIndex();
            int anioNac = Integer.parseInt(AnioBox.getSelectedItem().toString().trim());

            if (diaNac == 0 || mesNac == 0 || anioNac == 0) {
                JOptionPane.showMessageDialog(this, "¡Ingrese una Fecha de Nacimiento Valida!");
                return;
            }

            String equipo = equipoBox.getSelectedItem().toString();
            if (equipoBox.getSelectedItem().equals("-")) {
                JOptionPane.showMessageDialog(this, "Seleccione un Equipo");
                return;
            }

            int posicion = (int) PosicionJugadorBox.getSelectedIndex();

            if (PosicionJugadorBox.getSelectedIndex() == 0) {
                JOptionPane.showMessageDialog(this, "Seleccione una posicion Valida");
                return;
            }

            int cantgoles = (int) CantGolesSpn.getValue();
            if (cantgoles < 0) {
                JOptionPane.showMessageDialog(this, "¡Los goles no pueden ser menores a 0!");
                return;
            }

            int tarjR = (int) TarjetasRojasJugadorspn.getValue();
            if (tarjR < 0) {
                JOptionPane.showMessageDialog(this, "¡Las Tarjetas Rojas no pueden ser menores a 0!");
                return;
            }

            int tarjA = (int) TarjetasAmarillasJugadorSpn.getValue();
            if (tarjA < 0) {
                JOptionPane.showMessageDialog(this, "¡Las Tarjetas Amarillas no pueden ser menores a 0!");
                return;
            }

            Controlador controladorAux = new Controlador();

            controladorAux.setNombreJugador(nombreJgdor);
            controladorAux.setApellidoJugador(apeJgdor);
            controladorAux.setNacionalidadJugador(nacioJgdor);
            controladorAux.setFechaNacimientoJugador(diaNac, mesNac, anioNac);
            controladorAux.setClubActualJugador(equipo);
            controladorAux.setPosicionJugador(posicion);
            controladorAux.setGolesJugador(cantgoles);
            controladorAux.setTarjetasRojasJugador(tarjR);
            controladorAux.setTarjetasAmarillasJugador(tarjA);
            
            if(excedeMaximoJugadores(ControladorLista.getListaPersonas(),controladorAux.getClubActualJugador())){
            JOptionPane.showMessageDialog(null, "El euipo ya cuenta con 7 jugadores no de puede agregar otro mas.");
            
            }else{
            if (ControladorLista.jugadorYaCargado(controladorAux.getNombreJugador(),controladorAux.getApellidoJugador()) == true) {
                JOptionPane.showMessageDialog(null, "Este Jugador Ya Esta Cargado", "Error", JOptionPane.ERROR_MESSAGE);
                limpiarPantalla();
            } else {
                ControladorLista.AgregarJugadorALaLista(controladorAux.getJugador());
                limpiarPantalla();
                JOptionPane.showMessageDialog(this, "Jugador Cargado Correctamente");

            }

            
            }
            

            

        } catch (ClassCastException e) {
            JOptionPane.showMessageDialog(this, "Error de conversión de datos: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato numérico inválido: " + e.getMessage());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(this, "Algunos campos no fueron seleccionados correctamente." + e.getMessage());
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error inesperado: " + e.getMessage());

        }
       

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void equipoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_equipoBoxActionPerformed

    private void txtNombrejugadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrejugadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrejugadorActionPerformed

    private void LimpiarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarbtnActionPerformed
       limpiarPantalla();
    }//GEN-LAST:event_LimpiarbtnActionPerformed

    public JComboBox<String> getAnioBox() {
        return AnioBox;
    }

    public JButton getBtnAgregar() {
        return BtnAgregar;
    }

    public JSpinner getCantGolesSpn() {
        return CantGolesSpn;
    }

    public JButton getLimpiarbtn() {
        return Limpiarbtn;
    }

    public JComboBox<String> getPosicionJugadorBox() {
        return PosicionJugadorBox;
    }

    public JSpinner getTarjetasAmarillasJugadorSpn() {
        return TarjetasAmarillasJugadorSpn;
    }

    public JSpinner getTarjetasRojasJugadorspn() {
        return TarjetasRojasJugadorspn;
    }

    public JComboBox<String> getDiaBox() {
        return diaBox;
    }

    public JComboBox<String> getEquipoBox() {
        return equipoBox;
    }

    public JComboBox<String> getMesBox() {
        return mesBox;
    }

    public JComboBox<String> getNacionalidadTxt() {
        return nacionalidadBox;
    }

    public JTextField getTxtApellidoJugador() {
        return txtApellidoJugador;
    }

    public JLabel getTxtNacionalidadJugador() {
        return txtNacionalidadJugador;
    }

    public JTextField getTxtNombrejugador() {
        return txtNombrejugador;
    }
    public void limpiarPantalla(){
        txtNombrejugador.setText("");
        txtApellidoJugador.setText("");
        nacionalidadBox.setSelectedIndex(0);
        diaBox.setSelectedIndex(0);
        mesBox.setSelectedIndex(0);
        AnioBox.setSelectedIndex(0);
        equipoBox.setSelectedIndex(0);
        PosicionJugadorBox.setSelectedIndex(0);
        CantGolesSpn.setValue(0);
        TarjetasAmarillasJugadorSpn.setValue(0);
        TarjetasRojasJugadorspn.setValue(0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> AnioBox;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JSpinner CantGolesSpn;
    private javax.swing.JButton Limpiarbtn;
    private javax.swing.JComboBox<String> PosicionJugadorBox;
    private javax.swing.JSpinner TarjetasAmarillasJugadorSpn;
    private javax.swing.JSpinner TarjetasRojasJugadorspn;
    private javax.swing.JComboBox<String> diaBox;
    private javax.swing.JComboBox<String> equipoBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> mesBox;
    private javax.swing.JComboBox<String> nacionalidadBox;
    private javax.swing.JTextField txtApellidoJugador;
    private javax.swing.JLabel txtNacionalidadJugador;
    private javax.swing.JTextField txtNombrejugador;
    // End of variables declaration//GEN-END:variables
}
