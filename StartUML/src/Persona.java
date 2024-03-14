
import java.util.*;

/**
 * 
 */
public class Persona {

    /**
     * Default constructor
     */
    public Persona() {
    }

    private String dni;

    private String nombre;

    private String apellidos;

    private int edad;

    /**
     * @param dni 
     * @param nombre 
     * @param apellidos 
     * @param edad
     */
    public Persona(String dni, String nombre, String apellidos, int edad) {
        // TODO implement here
    	this.dni = dni;
    	this.nombre = nombre;
    	this.apellidos = apellidos;
    	this.edad = edad;
    }

    /**
     * Devuelve el dni de la persona
     * @param dni
     */
    public String getDni() {
        return this.dni;
    }

    /**
     * Establece el dni de la persona
     * @return
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Devuelve el nombre de la persona
     * @param nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Establece el nombre de la persona
     * @return
     */
    public void setNombre(String nombre) {
        // TODO implement here
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido de la persona
     * @param Apellidos
     */
    public String getApellidos() {
        return this.apellidos;
    }

    /**
     * Establece el apellido de la persona
     * @return
     */
    public void setApellidos(String Apellidos) {
        // TODO implement here
        this.apellidos = Apellidos;
    }

    /**
     * Devuelve la edad de la persona
     * @param edad
     */
    public int getEdad() {
        return this.edad;
    }

    /**
     * Establece la edad de la persona
     * @return
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
    

}