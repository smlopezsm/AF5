package Model;

public class Arbitro extends Persona{
    private int tarjetasSacadas;
    private boolean internacional;
   
    public Arbitro(){
    }
    
    public Arbitro(String nombre, String apellido, Fecha fechaNac, String nacionalidad,int tarjetasSacadas,boolean internacional) {
        super(nombre, apellido, fechaNac, nacionalidad);
        this.internacional=internacional;
        this.tarjetasSacadas=tarjetasSacadas;
    }

    public void setTarjetasSacadas(int tarjetasSacadas) {
        this.tarjetasSacadas = tarjetasSacadas;
    }

    public void setInternacional(boolean internacional) {
        this.internacional = internacional;
    }
    
    public int getTarjetasSacadas() {
        return tarjetasSacadas;
    }
    
    public boolean getInternacional() {
        return internacional;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tarjetas Sacadas: " + tarjetasSacadas + ", Internacional: " + (internacional?"Si.":"No.");
    }
    
    
}
