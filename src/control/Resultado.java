package control;

public class Resultado {

	public int resultado(String[] jogos) {
		
		int qntVitorias = 0;
		
		for(String resultado : jogos) {
			if(resultado.equals("v")) {
				System.out.println("Jogo: " + resultado);
				qntVitorias++;
			}
		}
		
		if(qntVitorias >= 5) {
			return 1;
		} else if (qntVitorias > 2 && qntVitorias < 5) {
			return 2;
		} else if (qntVitorias > 0 && qntVitorias < 3) {
			return 3;
		} else {
			return -1;
		}
		
	}
	
}