package figuras;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double thatX,double thatY) {
		this.x = thatX;
		this.y = thatY;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double calcularDistanciaA(Punto punto) {
		return Math.sqrt(Math.pow(this.x - punto.x,2) + Math.pow(this.y - punto.y,2));
	}
	
	public boolean enIntervaloProyX(Punto p1,Punto p2) {
		return p1.x <= this.x && this.x <= p2.x;
	}
	
	public boolean enIntervaloProyY(Punto p1,Punto p2) {
		return p1.y <= this.y && this.y <= p2.y;
	}
}
