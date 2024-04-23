package Model;

public class Persona {
	private String nombre;
	private String apellidos;
	private int edad;
	/**
	 * Constructor de persona. Crea un objeto que representa a una persona
	 * @param nombre de la persona
	 * @param apellidos de la persona
	 * @param edad de la persona debe de estar entre o y 140
	 * @throws IllegalArgumentException
	 */
	public Persona (String nombre, String apellidos, int edad) {
		if (edad < 0 || edad > 130) {
			throw new IllegalArgumentException("La edad debe estar entre 0 y 130");
		}
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
	}

	/**
	 * Este metodo muestra si la persona es mayor o menor de edad o jubilada
	 * @return un mensaje que identifica si la persona 
	 * es menor o mayor de edad o jubilado.
	 */
	public String mostrarEdad() {
		String frase = " ";
		if (this.edad < 18) {
			frase = "Menor de edad";
		} else if (this.edad >= 18 && this.edad < 65){
			frase = "Mayor de edad";
		} else {
			frase = "Jubilado";
		}
		return frase;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
