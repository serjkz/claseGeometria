package test;

import org.junit.Assert;
import org.junit.Test;

import figuras.Punto;

public class TestPunto {
	Punto p1 = new Punto(8,6);
	Punto p2 = new Punto(4,3);
	
	@Test
	public void distanciaCorrecta() {
		//Assert.assertEquals(6, p1.calcularDistanciaA(p2),0); //6
		
		Assert.assertEquals(5, p1.calcularDistanciaA(p2),0);
	}
}
