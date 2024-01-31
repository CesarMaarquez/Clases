package rectangulo;

public class Rectangulo {

	private long alto;
	private long ancho;
	
	
	//constructores
	public Rectangulo() {
		super();
		this.alto = 10;
		this.ancho = 20;
	}


	public Rectangulo(long alto, long ancho) {
		super();
		if (alto>=0 && ancho>=0) {
			this.alto = alto;
			this.ancho = ancho;
		}
		else {
			this.alto=10;
			this.ancho=20;
		}
		
	}


	public long getAlto() {
		return alto;
	}


	public void setAlto(long alto) {
		if (alto>=0) {
			this.alto = alto;
		}
	}


	public long getAncho() {
		return ancho;
	}


	public void setAncho(long ancho) {
		if (ancho>=0) {
			this.ancho = ancho;
		}
	}
	
	public long area() {
		return this.ancho*this.alto;
	}
	
	public long perimetro() {
		return (this.ancho)*2+(this.alto)*2;
	}
	
	public boolean isVertical() {
		if (this.alto>this.ancho) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isHorizontal() {
		if (this.ancho>this.alto) {
			return true;
		}
		else {
			return false;
		}
	}


	@Override
	public String toString() {
		return "Rectangulo [alto=" + alto + ", ancho=" + ancho + "]";
	}
	
	public String dibujar() {
		String resultado="";
		for (int i = 0; i < this.alto; i++) {
			for (int j = 0; j < this.ancho; j++) {
				resultado+="* ";
			}
			resultado+="\n";
		}
		return resultado;
	}
	
	
	
	
	

}
