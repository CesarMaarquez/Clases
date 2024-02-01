package tienda;

import java.util.ArrayList;

public class Stock {

	private ArrayList<Producto> productos;

	public Stock(ArrayList<Producto> productos) {
		super();
		this.productos = productos;
	}

	public Stock() {
		super();
		this.productos = new ArrayList<Producto>();
	}

	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	
	public void add(Producto producto) {
		productos.add(producto);
	}
	
	public void delete(Producto producto) {
		productos.remove(producto);
	}
	
	public Producto get(int codigo) {
		for (Producto producto : productos) {
			if (producto.getCodigo()==codigo) {
				return producto;
			}
		}
		return null;
	}
	
	public ArrayList<Producto> getAgotados() {
		ArrayList<Producto> agotados=new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if (producto.getCantidad()==0) {
				agotados.add(producto);
			}
		}
		return agotados;
	}
	
	public ArrayList<Producto> getBajoMinimo() {
		ArrayList<Producto> bajominimo=new ArrayList<Producto>();
		for (Producto producto : this.productos) {
			if (producto.getMinimo()>producto.getCantidad()) {
				bajominimo.add(producto);
			}
		}
		return bajominimo;
	}

	@Override
	public String toString() {
		return "Stock [productos=" + productos + "]";
	}
	
	

}
