package desafioCapgemini.questao2;

import java.util.Scanner;

/*
 * @brief Executa o verificador de senha
 * */

public class MainSenha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		VerificaSenha verificaSenha = new VerificaSenha();

		System.out.println("Digite sua senha: ");
		String senha = sc.nextLine();

		System.out.print(verificaSenha.verificaSenha(senha));
		sc.close();
	}

}
