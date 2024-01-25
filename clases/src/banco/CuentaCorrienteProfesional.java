package banco;

public class CuentaCorrienteProfesional {

	//Atributos
	private String iban;
	private Persona titular;
	private double saldo;
	
	
	//constructor
	public CuentaCorrienteProfesional(String iban, Persona titular, double saldo) {
		this.iban = iban;
		this.titular = titular;
		this.saldo = saldo;
	}


	public CuentaCorrienteProfesional(String iban, Persona titular) {
		this.iban = iban;
		this.titular = titular;
	}


	public CuentaCorrienteProfesional(String iban) {
		this.iban = iban;
	}


	
	
	//getters y setters
	public Persona getTitular() {
		return titular;
	}


	public void setTitular(Persona titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String getIban() {
		return iban;
	}


	@Override
	public String toString() {
		return "CuentaCorrienteProfesional [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//metodos hechos a mano
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	public boolean retirar(double cantidad) {
		if (cantidad<=saldo) {
			saldo-=cantidad;
			return true;
		} 
		else {
			return false;
		}
	}
	

}
