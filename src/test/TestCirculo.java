package test;

import org.junit.Assert;
import org.junit.Test;

import figuras.Circulo;
import figuras.Punto;

public class TestCirculo {
	
	private Circulo c1 = new Circulo(new Punto(0,0),3);
	
	@Test
	public void contenido() {
		Punto p = new Punto(0,2);
		
		Assert.assertEquals(true, c1.contieneA(p));
	}
	
	@Test
	public void noContenido() {
		Punto p = new Punto(5,4);
		
		Assert.assertEquals(false, c1.contieneA(p));
	}
	
	@Test
	public void puntoEnBorde() {
		Punto p = new Punto(0,3);
		
		Assert.assertEquals(true, c1.contieneA(p));
	}
}
