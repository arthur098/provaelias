package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Valores;

public class ValoresTest {

	@Test
	public void insTrueTest() {
		Valores valores = new Valores();
		assertTrue(valores.ins(1));
	}
	
	@Test
	public void insValorNegativoTest() {
		Valores valores = new Valores();
		assertFalse(valores.ins(-1));
	}

	@Test
	public void insFalseTest() {
		Valores valores = new Valores();
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(4);
		valores.ins(5);
		valores.ins(6);
		valores.ins(7);
		valores.ins(8);
		valores.ins(9);
		valores.ins(10);

		assertFalse(valores.ins(11));
	}

	@Test
	public void delTrueTest() {
		Valores valores = new Valores();
		valores.ins(4);
		assertTrue(valores.del(4) == 4);
	}
	
	@Test
	public void delListaVaziaTest() {
		Valores valores = new Valores();
		assertTrue(valores.del(6) == -1);
	}
	
	@Test
	public void delValorInexistenteTest() {
		Valores valores = new Valores();
		assertTrue(valores.del(2) == -1);
	}

	@Test
	public void sizeTest() {
		Valores valores = new Valores();
		assertTrue(valores.size() >= 0);
	}

	@Test
	public void meanTrueTest() {
		Valores valores = new Valores();
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(4);
		valores.ins(5);		
		assertEquals(3, valores.mean(), 0.01);
	}
	
	@Test
	public void meanListaVaziaTest() {
		Valores valores = new Valores();
		assertTrue(valores.mean() == 0);
	}

	@Test
	public void lowerTest() {
		Valores valores = new Valores();
		
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(4);
		valores.ins(5);
		
		assertTrue(valores.lower() == 1);
	}
	
	@Test
	public void lowerListaVaziaTest() {
		Valores valores = new Valores();
		assertTrue(valores.lower() == -1);
	}

	@Test
	public void greaterTest() {
		Valores valores = new Valores();
		
		valores.ins(1);
		valores.ins(2);
		valores.ins(3);
		valores.ins(4);
		valores.ins(5);
		
		assertTrue(valores.greater() == 5);
	}
	
	@Test
	public void greaterListaVaziaTest() {
		Valores valores = new Valores();
		assertTrue(valores.greater() == -1);
	}
}
