package desafioCapgemini.questao1;

import java.util.Scanner;

/** Classe MainLadder onde executamos nosso algoritmo.
 * 
 * @author Gabriel Varandas
 *
 */

public class MainLadder {

	public static void main(String[] args) {

		/*
		 * @brief impreme uma escada com n degraus e n arteiscos por degrau
		 * centralizado a direita
		 * */
		
		System.out.print("N = ");
		Scanner sc = new Scanner(System.in);

		Ladder escada = new Ladder();
		int number = sc.nextInt();

		escada.ImprimirLadder(number);
		sc.close();
	}
}