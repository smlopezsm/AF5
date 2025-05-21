package Controller;

import Model.Arbitro;
import Model.Fecha;
import Model.Jugador;

public class Controlador {
    //HAY QUE PREGUNTAR SI A ESTA CLASE CONTROLADOR HAY QUE HACERLE CONSTRUCTOR, SETTERS, GETTERS O COMO ES LA MOVIDA
    public static void AgregarJugador(String nombreJgdor, String apeJgdor, String nacioJgdor,
        int diaNac, int mesNac, int anioNac, String equipo,
        int posicion, int cantgoles, int tarjR, int tarjA) {
        Fecha fecha = new Fecha(diaNac, mesNac, anioNac);
        Jugador jugador = new Jugador();
        jugador.setNombre(nombreJgdor);
        jugador.setApellido(apeJgdor);
        jugador.setNacionalidad(nacioJgdor);
        jugador.setFechaNac(fecha);
        jugador.setClubActual(equipo);
        jugador.setGoles(cantgoles);
        jugador.setPosicion(posicion);
        jugador.setTarjetasAmarillas(tarjA);
        jugador.setTarjetasRojas(tarjR);
        //bien, ahora estoy hay que agregarlo al Arraylist en el main con add
    }

    public static void AgregarArbitro(String nombreArbitro, String apellidoArbitro, String nacionalidadArbitro, int dia,
        int mes, int anio, Boolean internacional, int tarjetassacadas) {
            Fecha fecha = new Fecha(dia, mes, anio);
            Arbitro arbitro = new Arbitro();
            arbitro.setNombre(nombreArbitro);
            arbitro.setApellido(apellidoArbitro);
            arbitro.setNacionalidad(nacionalidadArbitro);
            arbitro.setFechaNac(fecha);
            arbitro.setInternacional(internacional);
            arbitro.setTarjetasSacadas(tarjetassacadas);
            //esto tambien, hay que agregarlo al Arraylist en el main con add
    }
    
    public static class ArbitroNoEncontradoException extends Exception {
        public ArbitroNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public static Arbitro buscarArbitro(String thatArbitro) throws ArbitroNoEncontradoException{
        for (Arbitro arbitroActual : arbitros) {//acá no estoy seguro si es arbitros o personas
            if (thatArbitro.equals(arbitroActual.getNombre())) {
                return arbitroActual;
            }
        }
        throw new ArbitroNoEncontradoException("Arbitro no encontrado");
    }
    
    public static class JugadorNoEncontradoException extends Exception {
        public JugadorNoEncontradoException(String mensaje) {
            super(mensaje);
        }
    }
    
    public static Jugador buscarJugador(String thatJugador) throws JugadorNoEncontradoException{
        for (Jugador jugadorActual : jugadores) {//acá no estoy seguro si es jugadores o personas
            if (thatJugador.equals(jugadorActual.getNombre())) {
                return jugadorActual;
            }
        }
        throw new JugadorNoEncontradoException("Jugador no encontrado");
    }
    
    public static void eliminarArbitro(Arbitro thatArbitro) throws ArbitroNoEncontradoException {
        arbitros.remove(thatArbitro);//acá no estoy seguro si es arbitros o personas
    }
    
    public static void eliminarJugador(Jugador thatJugador) throws JugadorNoEncontradoException {
        jugadores.remove(thatJugador);//acá no estoy seguro si es jugadores o personas
    }
    
}
