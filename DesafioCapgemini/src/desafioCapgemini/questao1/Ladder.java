package desafioCapgemini.questao1;

public class Ladder {

	public void ImprimirEscada(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
