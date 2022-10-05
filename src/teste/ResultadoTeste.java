package teste;

import org.junit.Assert;
import org.junit.Test;

import control.Resultado;


public class ResultadoTeste {
	@Test
	public void teste_resultado_1() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","v","v","v","v","v"};
		Assert.assertEquals(1, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_2() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","v","v","v","v","p"};
		Assert.assertEquals(1, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_3() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","v","v","v","p","p"};
		Assert.assertEquals(2, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_4() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","v","v","p","p","p"};
		Assert.assertEquals(2, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_5() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","v","p","p","p","p"};
		Assert.assertEquals(3, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_6() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","p","p","p","p","p"};
		Assert.assertEquals(3, resultado.resultado(jogos), 0);
	}
	
	@Test
	public void teste_resultado_7() {
		Resultado resultado = new Resultado();
		String[] jogos = {"p","p","p","p","p","p"};
		Assert.assertEquals(-1, resultado.resultado(jogos), 0);
	}
}
