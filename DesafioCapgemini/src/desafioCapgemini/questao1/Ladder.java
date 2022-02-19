package desafioCapgemini.questao1;

public class Ladder {
	
	/*
	 * @brief imprime n degrau com n astetiscos
	 * 
	 * @param recebe o numero de degrau e asterisco que vao ser impressos
	 * 
	 */

	public void ImprimirLadder(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0 ; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/*
	 * @brief conta o numero de impressoes
	 * 
	 * @parm param recebe o numero de asteristicos e espacos que vao ser impressos
	 * 
	 * @return int retona o numero de caracteres impressos
	 */
	
	public int caracteresImpressos(int n) {
		
		int caracteresImpressos = 0;
		for (int i = 0; i < n; i++) {
			for (int j = n - i - 1; j > 0 ; j--) {
				caracteresImpressos++;
			}
			for (int j = 0; j <= i; j++) {
				caracteresImpressos++;
			}
		}
		return caracteresImpressos;
	}
}