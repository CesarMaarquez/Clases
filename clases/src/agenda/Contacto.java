package agenda;

public class Contacto {

	//Atributos
	private String nombre;
	private long telefono;
	
	
	//Constructores
	public Contacto(String nombre, long telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}


	public Contacto(String nombre) {
		this.nombre = nombre;
	}


	public Contacto(long telefono) {
		super();
		this.telefono = telefono;
		this.nombre="Desconocido";
	}

	
	//Getters y Setters
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


	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + "]";
	}
	
	
	
	
	
	

}