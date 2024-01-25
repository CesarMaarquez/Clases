package agenda;

public class AgendaconArray {

	//Atributos
	private Contacto[] contactos;
	
	//Constructores
	public AgendaconArray(Contacto[] contactos) {   //constructor que recibe un array ya preparado
		super();
		this.contactos = contactos;
	}
	
	public AgendaconArray() {   //constructor para preparar una agenda vacia
	this.contactos=new Contacto[200];
	}
	
	public AgendaconArray(int tamaño) {   //constructor que crea una agenda de un tamaño determinado
		this.contactos=new Contacto[tamaño];
	}

	public Contacto[] getContactos() {
		return contactos;
	}

	public void setContactos(Contacto[] contactos) {
		this.contactos = contactos;
	}
	
	//metodo para buscar un contacto por nombre
	public Contacto getContacto(String nombre) {
		for (Contacto contacto : contactos) {
			if (contacto.getNombre().equals(nombre)) {
				return contacto;
			}
		}
		return null;
	}
	
	//metodo para eliminar un contact, a traves de nombre
	public boolean removeContacto(String nombre) {
		for (int i = 0; i < contactos.length; i++) {
			if (contactos[i].getNombre().equals(nombre)) {
				contactos[i]=null;  //borro el contacto
				return true;
			}
		}
		return false;
	}
	
	//y muchos metodos mas...
	
	
	

}
