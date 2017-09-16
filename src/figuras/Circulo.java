package figuras;

public class Circulo {
	private Punto centro;
	private double radio;
	
	public Circulo(Punto centro,double radio) {
		this.centro = centro;
		this.radio = radio;
	}
	
	public boolean contieneA(Punto punto) {
		return this.centro.calcularDistanciaA(punto) <= this.radio;
	}
}
