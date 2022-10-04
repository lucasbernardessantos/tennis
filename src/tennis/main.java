package tennis;

import java.util.Scanner;

import control.Resultado;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resultado resultado = new Resultado();
		
		int jogos = 6, qntVitorias = 0;
		String[] jogosResultados = new String[6];
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < jogos; i++) {
			System.out.println("Resultado(V/P): ");
			
			String resultados = scanner.nextLine();
			jogosResultados[i] = resultados;
		}
		
		long grupo = resultado.resultado(jogosResultados);
		
		System.out.println(grupo);
	}
}