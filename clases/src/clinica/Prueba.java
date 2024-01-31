package clinica;

public class Prueba {

	public static void main(String[] args) {
		ListaDeEspera lista=new ListaDeEspera();
		
		Paciente p1=new Paciente("8763254A", "José", "Adeslas");
		Paciente p2=new Paciente("8711254A", "Carla", "Adeslas");
		Paciente p3=new Paciente("8760004H", "Ramón", "Sanitas");
		Paciente p4=new Paciente("0066324A", "EIeouh", "Adeslas");
		Paciente p5=new Paciente("3257101M", "keryg", "uerfygb");
		
		lista.add(p3);
		lista.add(p2);
		lista.add(p1);
		
		System.out.println(lista);
		
		System.out.println("Turno de: "+lista.atender());
		System.out.println(lista);
		
		lista.colar(1, p5);
		System.out.println(lista);

	}

}
