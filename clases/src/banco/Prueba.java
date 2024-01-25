package banco;

public class Prueba {

	public static void main(String[] args) {
		// probar la clase cuentaCorriente
		
		//creamos un objeto cuentaCorriente
//		cuentaCorriente cuenta=new cuentaCorriente();
//		
//		cuenta.ingresar(100);
//		cuenta.retirar(30);
//		System.out.println(cuenta.dimeElSaldo());
		
		CuentaCorriente2 cuenta= new CuentaCorriente2("ES3458763478259", "Cesar", 0);
		
		System.out.println("El IBAN de la cuenta es: "+cuenta.getIban());
		cuenta.ingresar(200);
		cuenta.ingresar(100);
		System.out.println("Saldo: "+cuenta.getSaldo());
		
		CuentaCorriente2 cuenta2=new CuentaCorriente2("ES10101001");
		
		System.out.println(cuenta2.toString());
	}

}
