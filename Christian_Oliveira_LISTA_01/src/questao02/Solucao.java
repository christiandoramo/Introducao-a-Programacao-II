package questao02;

public class Solucao {
	public Boolean buddyStrings(String A, String B) {
		Boolean podeTrocar = false;
		
		int i = 0;
			while (i < A.length() && !podeTrocar) {
				char x = A.toLowerCase().charAt(i);
				for (int j = i + 1; j < A.length(); j++) {
					char y = A.toLowerCase().charAt(j);
					StringBuilder sb = new StringBuilder(A); // stringbuilder compara A com B
					sb.setCharAt(j, x); //char x -> pos j
					sb.setCharAt(i, y); //char y -> pos i
					String palavraTrocada = sb.toString();
					
					if(palavraTrocada.equals(B)) {//só retorna igual se a string trocada de A = B
						podeTrocar = true;
					}
				}
				i++;
		}

		return podeTrocar;
	}
}
