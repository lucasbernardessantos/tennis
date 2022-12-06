package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import control.Resultado;


public class ResultadoTeste {
	
	Resultado resultado;
	
	@Before
	public void setup() {
		resultado = new Resultado();		
	}
	
	@Test
	public void teste_resultado_1() {
		String[] jogos = {"v","v","v","v","v","v"};
		Assert.assertEquals(2, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_2() {
		String[] jogos = {"v","v","v","v","v","p"};
		Assert.assertEquals(1, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_3() {
		String[] jogos = {"v","v","v","v","p","p"};
		Assert.assertEquals(2, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_4() {
		String[] jogos = {"v","v","v","p","p","p"};
		Assert.assertEquals(2, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_5() {
		String[] jogos = {"v","v","p","p","p","p"};
		Assert.assertEquals(3, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_6() {
		String[] jogos = {"v","p","p","p","p","p"};
		Assert.assertEquals(3, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_7() {
		String[] jogos = {"p","p","p","p","p","p"};
		Assert.assertEquals(-1, resultado.resultado(jogos), 0);
	}
}
