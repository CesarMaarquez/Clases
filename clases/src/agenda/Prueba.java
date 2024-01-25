package agenda;

public class Prueba {

	public static void main(String[] args) {
		
		Contacto javier=new Contacto("Javier", 678987654);
		
//		AgendaconArray agenda1=new AgendaconArray();
//		AgendaconArray agenda2=new AgendaconArray(47);
//		AgendaconArray agenda3=new AgendaconArray(null);
		
		Agenda agenda=new Agenda();
		
		agenda.add(javier);
		

	}

}
