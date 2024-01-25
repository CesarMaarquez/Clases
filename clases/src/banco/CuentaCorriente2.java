package banco;

public class CuentaCorriente2 {

	//Atributos
	private String iban;
	private String titular;
	private double saldo;
	
	//Constructor: método que se ejecuta cuando se crea el objeto
	public CuentaCorriente2(String iban, String titular, double saldo) {
		this.iban=iban;
		this.titular=titular;
		this.saldo=saldo;
	}
	
	
	
	public CuentaCorriente2(String iban, String titular) {
		this.iban = iban;
		this.titular = titular;
		this.saldo=0;
	}
	



	public CuentaCorriente2(String iban) {
		this.iban = iban;
		this.titular="Sin titular";
	}



	//Métodos
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getIban() {
		return iban;
	}
	public double getSaldo() {
		return saldo;
	}
	
	//Métodos hechos a mano
	public void ingresar(double cantidad) {
		saldo+=cantidad;
	}
	
	public void retirar(double cantidad) {
		if (cantidad<=saldo) {
			saldo-=cantidad;
			System.out.println("Retirada completada");
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}



	@Override
	public String toString() {
		return "CuentaCorriente2 [iban=" + iban + ", titular=" + titular + ", saldo=" + saldo + "]";
	}
	
	//toString
	

}
