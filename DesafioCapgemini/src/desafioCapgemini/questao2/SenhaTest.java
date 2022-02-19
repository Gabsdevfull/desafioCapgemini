package desafioCapgemini.questao2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SenhaTest {

	@Test
	@DisplayName("retornaDois")
	void retornaDois() {
		String str = "2222";
		VerificaSenha senhaForte = new VerificaSenha();
		assertEquals(2, senhaForte.verificaSenha(str));
	}

	@Test
	@DisplayName("retornaZero")
	void retornaZero() {
		String str = "123@aB";
		VerificaSenha senhaForte = new VerificaSenha();
		assertEquals(0, senhaForte.verificaSenha(str));
	}

	@Test
	@DisplayName("FaltaDoisCaracteres")
	void FaltaDoisCaracteres() {
		String str = "3@aB";
		VerificaSenha senhaForte = new VerificaSenha();
		assertEquals(2, senhaForte.verificaSenha(str));
	}

	@Test
	@DisplayName("FaltaTresCaracteres")
	void FaltaTresCaracteres() {
		String str = "Ya3";
		VerificaSenha senhaForte = new VerificaSenha();
		assertEquals(3, senhaForte.verificaSenha(str));
	}
}
