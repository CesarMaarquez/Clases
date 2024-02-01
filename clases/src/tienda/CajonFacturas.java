package tienda;

import java.util.ArrayList;

public class CajonFacturas {

	private ArrayList<Factura> facturas;

	public CajonFacturas(ArrayList<Factura> facturas) {
		super();
		this.facturas = facturas;
	}

	public CajonFacturas() {
		super();
		this.facturas = new ArrayList<Factura>();
	}

	public ArrayList<Factura> getFacturas() {
		return facturas;
	}

	public void setFacturas(ArrayList<Factura> facturas) {
		this.facturas = facturas;
	}
	
	public void add(Factura factura) {
		this.facturas.add(factura);
	}
	
	public Factura get(int numero) {   //buscar una factura por numero
		for (Factura factura : facturas) {
			if (factura.getNumero()==numero) {
				return factura;
			}
		}
		return null;
	}
	
	//obtener las facturas pendientes de cobro
	public ArrayList<Factura> getFacturasPendientes() {
		ArrayList<Factura> pendientes=new ArrayList<Factura>();
		for (Factura factura : facturas) {
			if (!factura.isPagada()) {
				pendientes.add(factura);
			}
		}
		return pendientes; 
	}
}
