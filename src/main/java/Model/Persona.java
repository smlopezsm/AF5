package Model;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected Fecha fechaNac;
    protected String nacionalidad;
        
    public Persona() {
    }

    public Persona(String nombre, String apellido, Fecha fechaNac, String nacionalidad) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.fechaNac = fechaNac;
	this.nacionalidad = nacionalidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setFechaNac(Fecha fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Fecha getFechaNac() {
        return fechaNac;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return String.format(
            "Nombre: %s, Apellido: %s, Fecha Nacimiento: %s, Nacionalidad: %s",
            nombre, apellido, fechaNac.toString(), nacionalidad);

    }
}