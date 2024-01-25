package agenda;

import java.util.ArrayList;

public class Agenda {

	//Atributos
	private ArrayList<Contacto> listadeContactos;
	
	public Agenda() {  //agenda vacia
		listadeContactos=new ArrayList<Contacto>();
	}

	public Agenda(ArrayList<Contacto> listadeContactos) { //para clonar una agenda
		super();
		this.listadeContactos = listadeContactos;
	}

	public ArrayList<Contacto> getListadeContactos() {
		return listadeContactos;
	}

	public void setListadeContactos(ArrayList<Contacto> listadeContactos) {
		this.listadeContactos = listadeContactos;
	}

	@Override
	public String toString() {
		return "Agenda [listadeContactos=" + listadeContactos + "]";
	}
	
	//añadir un contacto
	public void add(Contacto nuevo) {
		this.listadeContactos.add(nuevo);
	}
	
	//borrar un contacto
	public boolean delete(Contacto viejo) {
		return this.listadeContactos.remove(viejo);
	}
	
	//borrar un contacto, si me dan el nombre
	public boolean delete(String nombreViejo) {
		for (Contacto contacto : listadeContactos) {
			if (contacto.getNombre().equals(nombreViejo)) {
				this.delete(contacto);
				return true;
			}
		}
		return false;
	}
	
	

}
