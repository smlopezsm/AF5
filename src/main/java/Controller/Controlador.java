package Controller;

import Model.Arbitro;
import Model.Fecha;
import Model.Jugador;
import Model.Persona;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
   
     private List<Persona>listado= new ArrayList<>();
     private Persona p;
     private Jugador j;
     private Arbitro a;
     
     public Controlador(){
         this.listado = new ArrayList<>();
         this.p=new Persona();
         this.j=new Jugador();
         this.a=new Arbitro();
     }
     
     public Controlador(List<Persona> listado) throws FileNotFoundException {
        this.listado = new ArrayList<>();
        this.p=null;
       //  precarga();
    }

     public List<Persona> getListaPersonas(){
        return listado;
     }
     
     public int cantPersonas(){
        return listado.size();
     }
     
     //setear persona/jugador/Arbitro
     public void setArbitro(Arbitro arbitro) {
        this.a = arbitro;
     }
     
     public void setPersona(Persona persona) {
        this.p = persona;
     }
     
      public void setJugador(Jugador jugador) {
        this.j = jugador;
     }
     
      
     // guarda archivo antes de salir del programa 
     public void guardarArchivo() {
    try (BufferedWriter bFw = new BufferedWriter(new FileWriter("Precarga.txt", false))) {
        for (Persona indice : listado) {
            StringBuilder linea = new StringBuilder();
            linea.append(indice.getNombre()).append(",")
                 .append(indice.getApellido()).append(",")
                 .append(indice.getNacionalidad()).append(",")
                 .append(indice.getFechaNac().getDia()).append(",")
                 .append(indice.getFechaNac().getMes()).append(",")
                 .append(indice.getFechaNac().getAnio());

            if (indice instanceof Jugador) {
                Jugador j = (Jugador) indice;
                linea.append(",")
                     .append(j.getClubActual()).append(",")
                     .append(j.getGoles()).append(",")
                     .append(j.getPosicion()).append(",")
                     .append(j.getTarjetasAmarillas()).append(",")
                     .append(j.getTarjetasRojas());
            } else if (indice instanceof Arbitro) {
                Arbitro a = (Arbitro) indice;
                linea.append(",")
                     .append(a.getInternacional()).append(",")
                     .append(a.getTarjetasSacadas());
            }

            bFw.write(linea.toString());
            bFw.newLine(); // separa registros por línea
        }
        System.out.println("Archivo guardado correctamente.");
    } catch (IOException e) {
        System.out.println("Error al guardar: " + e.getMessage());
    }
}
    
     public void precarga() throws FileNotFoundException{
        File prueba = new File("Precarga.txt");
        if (!prueba.exists()) {
            System.out.println("El archivo no existe.");
            return; // Salir del programa si no existe
        }

        Scanner lector = new Scanner(prueba);
        while(lector.hasNextLine()){
          String linea = lector.nextLine();
          try{    
            String[] partes = linea.split(",");
            //segun el tamanio del arreglo decide si cargar arbitro o jugador
            if(partes.length== 11){
                Jugador aux= new Jugador();
                aux.setNombre(partes[0].trim());
                aux.setApellido(partes[1].trim());
                aux.setNacionalidad(partes[2].trim());
                Fecha fechaNac= new Fecha(Integer.parseInt(partes[3].trim()),
                        Integer.parseInt(partes[4].trim()),Integer.parseInt(partes[5].trim()));
                aux.setFechaNac(fechaNac);
                aux.setClubActual(partes[6].trim());
                aux.setGoles(Integer.parseInt(partes[7].trim()));
                aux.setPosicion(Integer.parseInt(partes[8].trim()));
                aux.setTarjetasAmarillas(Integer.parseInt(partes[9].trim()));
                aux.setTarjetasRojas(Integer.parseInt(partes[10].trim()));

              this.listado.add(aux);
            }else if(partes.length== 8){
            Arbitro aux2= new Arbitro();
            aux2.setNombre(partes[0].trim());
            aux2.setApellido(partes[1].trim());
            aux2.setNacionalidad(partes[2].trim());
            Fecha fechaNacA= new Fecha(Integer.parseInt(partes[3].trim()),
                    Integer.parseInt(partes[4].trim()),Integer.parseInt(partes[5].trim()));
            aux2.setFechaNac(fechaNacA);
            aux2.setInternacional(Boolean.parseBoolean(partes[6].trim()));
            aux2.setTarjetasSacadas(Integer.parseInt(partes[7].trim()));

            this.listado.add(aux2);

            }
      
           System.out.println("prueba");
     
            }catch(NumberFormatException | IndexOutOfBoundsException e){
                System.out.println("error en al carga"+ linea);
            }
        }
     
     }
     
     public void CargarJugador(Jugador j){
     this.listado.add(j);    
     }
     
     public void CargarArbitro(Arbitro A){
     this.listado.add(A);
     }
      
     public void setNombrePersona(String nombre){
      if(this.p==null)
          this.p=new Persona();
      this.p.setNombre(nombre);
     }
     public void setApellidoPersona(String apellido){
         this.p.setApellido(apellido);
     }
     public void setNacionalidadPersona(String nacionalidad){
         this.p.setNacionalidad(nacionalidad);
     }
     public void setFechaNacimientoPersona(int dia, int mes, int anio){
         Fecha fechanac=new Fecha(dia,mes,anio);
         this.p.setFechaNac(fechanac);
     }
     public void setClubActualJugador(String equipo){
         this.j.setClubActual(equipo);
     }
     public void setPosicionJugador(int posicion){
         this.j.setPosicion(posicion);
     }
     public void setPosicionJugadorBuscado(Jugador jugadorBuscado,int posicion){
         jugadorBuscado.setPosicion(posicion);
     }
     public void setGolesJugador(int goles){
         this.j.setGoles(goles);
     }
     public void setGolesJugadorBuscado(Jugador jugadorBuscado,int goles){
         jugadorBuscado.setGoles(goles);
     }
     public void setTarjetasAmarillasJugador(int tarjetasamarillas){
         this.j.setTarjetasAmarillas(tarjetasamarillas);
     }
     public void setTarjetasAmarillasJugadorBuscado(Jugador jugadorBuscado,int tarjetasamarillas){
         jugadorBuscado.setTarjetasAmarillas(tarjetasamarillas);
     }
     public void setTarjetasRojasJugador(int tarjerasrojas){
         this.j.setTarjetasRojas(tarjerasrojas);
     }
     public void setTarjetasSacadasArbitro(int tarjetassacadas){
         this.a.setTarjetasSacadas(tarjetassacadas);
     }
     public void setTarjetasSacadasArbitroBuscado(Arbitro arbitroBuscado,int tarjetassacadas){
         arbitroBuscado.setTarjetasSacadas(tarjetassacadas);
     }
     public void setInternacional(boolean internacional){
         this.a.setInternacional(internacional);
     }
     public void setInternacionalBuscado(Arbitro arbitroBuscado,boolean internacional){
         arbitroBuscado.setInternacional(internacional);
     }
     public void setNombreJugador(String Nombre){
         this.j.setNombre(Nombre);
     }
     public void setApellidoJugador(String Apellido){
         this.j.setApellido(Apellido);
     }
     public void setNacionalidadJugador(String Nacionalidad){
         this.j.setNacionalidad(Nacionalidad);
     }
     public void setFechaNacimientoJugador(int dia, int mes, int anio){
         Fecha fechanac=new Fecha(dia, mes, anio);
         this.j.setFechaNac(fechanac);
     }
          public void setNombreArbitro(String Nombre){
         this.a.setNombre(Nombre);
     }
          public void setApellidoArbitro(String Apellido){
         this.a.setApellido(Apellido);
     }
     public void setNacionalidadArbitro(String Nacionalidad){
         this.a.setNacionalidad(Nacionalidad);
     }
     public void setFechaNacimientoArbitro(int dia, int mes, int anio){
         Fecha fechanac=new Fecha(dia, mes, anio);
         this.a.setFechaNac(fechanac);
     }
     
     //nombre persona/jugador/arbitro
     public String getNombreJugador(){
         return j.getNombre();
     }
     public String getNombreJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getNombre();
     }
     public String getNombreArbitro(){
         return a.getNombre();
     }
     public String getNombreArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getNombre();
     }  
     public String getNombrePersona(){
         return p.getNombre();
     }
     //Apellido persona/jugador/arbitro
     public String getApellidoJugador(){
         return j.getApellido();
     }
     public String getApellidoJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getApellido();
     }
     public String getApellidoArbitro(){
         return a.getApellido();
     }
     public String getApellidoArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getApellido();
     }
     public String getApellidoPersona(){
         return p.getApellido();
     }
     //Nacionalidad persona/jugador/arbitro
     public String getNacionalidadJugador(){
         return j.getNacionalidad();
     }
     public String getNacionalidadJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getNacionalidad();
     }
     public String getNacionalidadArbitro(){
         return a.getNacionalidad();
     }
     public String getNacionalidadArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getNacionalidad();
     }
     public String getNacionalidadPersona(){
         return p.getNacionalidad();
     }  
     //FechaN persona/jugador/arbitro
     public Fecha getFechaNacimientoJugador(){
         return j.getFechaNac();
     }
     public Fecha getFechaNacimientoJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getFechaNac();
     }
     public int getDiaNacimientoJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getFechaNac().getDia();
     }
     public int getMesNacimientoJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getFechaNac().getMes();
     }
     public int getAnioNacimientoJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getFechaNac().getAnio();
     }
     public Fecha getFechaNacimientoArbitro(){
         return a.getFechaNac();
     }
     public Fecha getFechaNacimientoArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getFechaNac();
     }
     public int getDiaNacimientoArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getFechaNac().getDia();
     }
     public int getMesNacimientoArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getFechaNac().getMes();
     }
     public int getAnioNacimientoArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getFechaNac().getAnio();
     }
     public Fecha getFechaNacimientoPersona(){
         return p.getFechaNac();
     }
     //getter jugador
     public String getClubActualJugador(){
         return j.getClubActual();
     }
     public String getClubActualJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getClubActual();
     }
     public String getPosicionJugador(){
         switch (j.getPosicion()) {
            case 1:
                return "Arquero";
            case 2:
               return "Defensor";

            case 3:
               return"Mediocampista";
            case 4:
                return "Delantero";
            default:
                return "Posición desconocida"; // Por si hay un número inválido
       }
     }
     public String getPosicionJugadorBuscado(Jugador jugadorBuscado){
         switch (jugadorBuscado.getPosicion()) {
            case 1:
                return "Arquero";
            case 2:
               return "Defensor";

            case 3:
               return"Mediocampista";
            case 4:
                return "Delantero";
            default:
                return "Posición desconocida"; // Por si hay un número inválido
       }
     }
     public int getGolesJugador(){
         return j.getGoles();
     }
     public int getGolesJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getGoles();
     }
     public int getTarjetasAmarillasJugador(){
         return j.getTarjetasAmarillas();
     }
     public int getTarjetasAmarillasJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getTarjetasAmarillas();
     }
     public int getTarjetasRojasJugador(){
         return j.getTarjetasRojas();
     }
     public int getTarjetasRojasJugadorBuscado(Jugador jugadorBuscado){
         return jugadorBuscado.getTarjetasRojas();
     }
     //Getter arbitro
     public int getTarjetasSacadasArbitro(){
         return a.getTarjetasSacadas();
     }
     public int getTarjetasSacadasArbitroBuscado(Arbitro arbitroBuscado){
         return arbitroBuscado.getTarjetasSacadas();
     }
     public String getArbitroInternacional(){
         if(a.getInternacional()== true){
          return "Si";
         }else{
           return "No";
         }
     }
     public String getArbitroInternacionalBuscado(Arbitro arbitroBuscado){
         if(arbitroBuscado.getInternacional()== true){
          return "Si";
         }else{
           return "No";
         }
     }
     
    public static class ArbitroNoEncontradoException extends Exception {
        public ArbitroNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
    public void AgregarArbitroALaLista(Arbitro a){
        listado.add(a);
    }
    public void AgregarJugadorALaLista(Jugador j){
        listado.add(j);
    }
    public Arbitro getArbitro(){
        return a;
    }
    public Jugador getJugador(){
        return j;
    }
    public Jugador getJugadorBuscado(Jugador jugadorBuscado){
        return jugadorBuscado;
    }
    
    public Arbitro buscarArbitro(String thatArbitro) throws ArbitroNoEncontradoException {
        for (Persona persona : listado) {
            if (persona instanceof Arbitro) {
                String nombreArbitro = persona.getNombre();
                if (nombreArbitro != null && nombreArbitro.trim().equalsIgnoreCase(thatArbitro.trim())) {
                    return (Arbitro) persona;
                }
            }
        }
        throw new ArbitroNoEncontradoException("Arbitro no encontrado");
    }
    
    public void imprimirArbitros() {
        if (listado == null) {
            System.out.println("La lista está null (no inicializada).");
            return;
        }
        if (listado.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (Persona persona : listado) {
            if (persona instanceof Arbitro) {
                System.out.println(((Arbitro) persona).toString());     
            }
        }
    }
    
    public static class JugadorNoEncontradoException extends Exception {
        public JugadorNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public Boolean arbitroYaCargado(String nombre, String apellido){
     for (Persona persona : listado) {
            if (persona instanceof Arbitro) {
                String apellidoArbitro= persona.getApellido();
                String nombreArbitro = persona.getNombre();
                if ((nombreArbitro != null && nombreArbitro.trim().equalsIgnoreCase(nombre.trim())) && (apellidoArbitro != null && apellidoArbitro.trim().equalsIgnoreCase(apellido.trim())) ) {
                    return true;
                }
            }
        }
        return false;
    }
      public Boolean jugadorYaCargado(String nombre, String apellido){
        for (Persona persona : listado) {
            if (persona instanceof Jugador) {
                String apellidoJugador= persona.getApellido();
                String nombreJugador = persona.getNombre();
                if ((nombreJugador != null && nombreJugador.trim().equalsIgnoreCase(nombre.trim())) && (apellidoJugador != null && apellidoJugador.trim().equalsIgnoreCase(apellido.trim())) ) {
                    return true;
                }
            }
        }
        return false;
    }

    public Jugador buscarJugador(String thatJugador) throws JugadorNoEncontradoException {
        for (Persona persona : listado) {
            if (persona instanceof Jugador) {
                String nombreJugador = persona.getNombre();
                if (nombreJugador != null && nombreJugador.trim().equalsIgnoreCase(thatJugador.trim())) {
                    return (Jugador) persona;
                }
            }
        }
        throw new JugadorNoEncontradoException("Jugador no encontrado");
    }
    
    public void imprimirJugadores() {
        if (listado == null) {
            System.out.println("La lista está null (no inicializada).");
            return;
        }
        if (listado.isEmpty()) {
            System.out.println("La lista está vacía.");
            return;
        }
        for (Persona persona : listado) {
            if (persona instanceof Jugador) {
                System.out.println(((Jugador) persona).toString());     
            }
        }
    }
    
    public void eliminarArbitro(Arbitro thatArbitro) throws ArbitroNoEncontradoException {
        this.listado.remove(thatArbitro); 
    }
    
    public void eliminarJugador(Jugador thatJugador) throws JugadorNoEncontradoException {
        this.listado.remove(thatJugador);
    }
    
}
