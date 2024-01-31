package clinica;

import java.util.ArrayList;

public class ListaDeEspera {

	private ArrayList<Paciente> listaDePacientes;

	public ListaDeEspera(ArrayList<Paciente> listaDePacientes) {
		super();
		this.listaDePacientes = listaDePacientes;
	}

	public ListaDeEspera() {
		super();
		this.listaDePacientes=new ArrayList<Paciente>();   //creo un arraylist en blanco
	}

	public ArrayList<Paciente> getListaDePacientes() {
		return listaDePacientes;
	}

	public void setListaDePacientes(ArrayList<Paciente> listaDePacientes) {
		this.listaDePacientes = listaDePacientes;
	}
	
	//add paciente
	//borrar paciente
	//atender a un paciente, retorna el paciente que mas tiempo lleva esperando, y lo elimina de la lista
	//colar a un paciente en una posicion concreta
	//tamaño de la lista de espera
	
	public void add(Paciente paciente) {
		this.listaDePacientes.add(paciente);
	}
	
	public void delete(Paciente paciente) {
		this.listaDePacientes.remove(paciente);
	}
	
	public Paciente atender() {
		Paciente paciente=this.listaDePacientes.get(0);
		this.listaDePacientes.remove(0);
		return paciente ;
	}
	
	public void colar(int posicion, Paciente paciente) {
		if (posicion>=this.listaDePacientes.size() || posicion<0) {
			//si la posicion no es correcta, lo añado al final
			this.listaDePacientes.add(paciente);
		} 
		else {
			this.listaDePacientes.add(posicion, paciente);
		}
		
	}
	
	public int length() {
		return listaDePacientes.size();
	}

	@Override
	public String toString() {
		return "ListaDeEspera [listaDePacientes=" + listaDePacientes + "]";
	}
	
	
	
	

}
