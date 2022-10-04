package teste;

import org.junit.Assert;
import org.junit.Test;

import control.Resultado;


public class ResultadoTeste {
	@Test
	public void teste_resultado() {
		Resultado resultado = new Resultado();
		String[] jogos = {"v","v","v","v","v","v"};
		Assert.assertEquals(1, resultado.resultado(jogos), 0);
	}
}
