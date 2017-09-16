package test;

import org.junit.Assert;
import org.junit.Test;

import figuras.Punto;

public class TestPunto {
	
	@Test
	public void distanciaCorrecta() {
		//Assert.assertEquals(6, p1.calcularDistanciaA(p2),0); //6
		Punto p1 = new Punto(8,6);
		Punto p2 = new Punto(4,3);
		
		Assert.assertEquals(5, p1.calcularDistanciaA(p2),0);
	}
	
	@Test
	public void contenidoEnProyX() {
		Punto p1 = new Punto(2,8);
		Punto p2 = new Punto(9,4);
		Punto p3 = new Punto(4,7);
		
		Assert.assertEquals(true, p3.enIntervaloProyX(p1, p2));
	}
	
	@Test
	public void contenidoEnProyY() {
		Punto p1 = new Punto(2,8);
		Punto p2 = new Punto(9,4);
		Punto p3 = new Punto(4,7);
		
		Assert.assertEquals(true, p3.enIntervaloProyY(p2, p1));
	}
}
