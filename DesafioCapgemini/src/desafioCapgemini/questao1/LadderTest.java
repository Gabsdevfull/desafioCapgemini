package desafioCapgemini.questao1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LadderTest {

	@Test
	@DisplayName("retornaQuatroCaracteresImpressos")
	void retornaQuatroCaracteresImpressos() {
		Ladder escada = new Ladder();
		assertEquals(4, escada.caracteresImpressos(2));
	}

	@Test
	@DisplayName("retornaVinteCincoCaracteresImpressos")
	void retornaVinteCincoCaracteresImpressos() {
		Ladder escada = new Ladder();
		assertEquals(25, escada.caracteresImpressos(5));
	}

	@Test
	@DisplayName("retornaVinteUmCaracteresImpressos")
	void retornaVinteUmCaracteresImpressos() {
		Ladder escada = new Ladder();
		assertEquals(1, escada.caracteresImpressos(1));
	}

}