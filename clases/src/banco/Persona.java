package banco;

public class Persona {
	
	//Atributos
	private String nombre;
	private String dni;
	private long telefono;
	
	//Constructor
	public Persona(String nombre, String dni, long telefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.telefono = telefono;
	}
	
	//Getters y setters
	public Persona(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}
	
	
	

}
