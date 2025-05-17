package Model;

public class Jugador extends Persona {
    private String clubActual;
    private int posicion; //1=arquero, 2=defensor, 3=mediocampista, 4=delantero
    private int goles;
    private int tarjetasAmarillas;
    private int tarjetasRojas;
    
    public Jugador (){
    }
    
    public Jugador(String nombre, String apellido, Fecha fechaNac, String nacionalidad, String clubActual, int posicion, int goles, int tarjetasAmarillas, int tarjetasRojas) {
        super(nombre, apellido, fechaNac, nacionalidad);
        this.clubActual=clubActual;
        this.posicion=posicion;
        this.goles=goles;
        this.tarjetasAmarillas=tarjetasAmarillas;
        this.tarjetasRojas=tarjetasRojas;
    }

    public void setClubActual(String clubActual) {
        this.clubActual = clubActual;
    }
    
    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
    
    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    
    public String getClubActual() {
        return clubActual;
    }

    public int getPosicion() {
        return posicion;
    }

    public int getGoles() {
        return goles;
    }  

    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }

    public int getTarjetasRojas() {
        return tarjetasRojas;
    }

    @Override
    public String toString() {
        String nombrePosicion;
        switch (posicion) {
            case 1:
                nombrePosicion = "Arquero";
                break;
            case 2:
                nombrePosicion = "Defensor";
                break;
            case 3:
                nombrePosicion = "Mediocampista";
                break;
            case 4:
                nombrePosicion = "Delantero";
                break;
            default:
                nombrePosicion = "Posición desconocida"; // Por si hay un número inválido
                break;
        }
        return super.toString() + ", Club Actual: " + clubActual + ", Posición: " + nombrePosicion +
           ", Goles: " + goles + ", Tarjetas Amarillas: " + tarjetasAmarillas + 
           ", Tarjetas Rojas: " + tarjetasRojas;
}
}
