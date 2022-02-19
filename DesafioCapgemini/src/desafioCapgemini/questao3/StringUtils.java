package desafioCapgemini.questao3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringUtils {

	public List<List<String>> geradorNSubstring(String palavra) {

		List<List<String>> listaDesubstring = new ArrayList<>();
		for (int i = 0; i < palavra.length(); i++) {
			listaDesubstring.add(new ArrayList<String>(i));
			for (int j = i + 1; j < palavra.length() + 1; j++) {
				listaDesubstring.get(i).add(palavra.substring(i, j));
			}
		}
		return listaDesubstring;
	}

	public int compararSubstring(List<List<String>> listaDesubstring) {
		
		int quantosSaoAnagrama = 0;
		List<String> listaAnagramasRepetidoEmOrdem = new ArrayList<>();
		for (int i = 0; i < listaDesubstring.size(); i++) {
			for (int j = 0; j < listaDesubstring.get(i).size(); j++) {

				char[] chars = listaDesubstring.get(i).get(j).toCharArray();
				Arrays.sort(chars);
				String sorted = new String(chars);
				listaAnagramasRepetidoEmOrdem.add(sorted);
			}
		}

		return contarAnagramasRepetidos(listaAnagramasRepetidoEmOrdem);
	}

	public int contarAnagramasRepetidos(List<String> listaAnagramasRepetido) {

		int contador = 0;

		int i = 0;
		while (i < listaAnagramasRepetido.size()) {
			int j = i + 1;
			while (j < listaAnagramasRepetido.size()) {
				if (listaAnagramasRepetido.get(i).equals(listaAnagramasRepetido.get(j))) {
					contador++;
					break;
				}
				j++;
			}
			i++;
		}
		return contador;
	}
}
