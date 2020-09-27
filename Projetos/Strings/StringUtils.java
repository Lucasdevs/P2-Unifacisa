package Exercício;

import java.util.Arrays;

public class StringUtils { 
	
	public static String formataAtributo(String atributo) {
			
			String atributoFormat = atributo.split(" ")[0];
			for (int i = 1; i < atributo.split(" ").length; i++){
				String palavra = atributo.split(" ")[i];
				int numLetra = palavra.charAt(0)-32;
				char letra = (char) numLetra;
				String letraM = Character.toString((char)numLetra);
				String primeira = palavra.substring(0,1);
			    palavra = palavra.replaceFirst(primeira,letraM);
			    atributoFormat += palavra;
			}
			return atributoFormat;	
	}
	
	public static String formataMetodo(String metodo) { 
		
		String metodoFormat = metodo.split(" ")[0];
		for (int i = 1; i < metodo.split(" ").length; i++) {
			String palavra = metodo.split(" ")[i];
			int numLetra = palavra.charAt(0)-32;
			char letra = (char) numLetra;
			String letraM = Character.toString((char)numLetra);
			String primeira = palavra.substring(0,1);
		    palavra = palavra.replaceFirst(primeira,letraM);
		    metodoFormat += palavra; 
		}
		return metodoFormat;	
	}
	
	public static String formataClasse(String classe) {
		classe = " "+ classe;
		String classeFormat = classe.split(" ")[0];
		for (int i = 1; i < classe.split(" ").length; i++) {
			String palavra = classe.split(" ")[i];
			int numLetra = palavra.charAt(0)-32;
			char letra = (char) numLetra;
			String letraM = Character.toString((char)numLetra);
			String primeira = palavra.substring(0,1);
		    palavra = palavra.replaceFirst(primeira,letraM);
		    classeFormat += palavra; 
		}
		return classeFormat;
		
	}
		
	public static String ordenaStrings(String palavra1, String palavra2) {
		String vetor[] = new String[2];
		   vetor[0] = palavra1;
		   vetor[1] = palavra2;	   
		   Arrays.sort(vetor);
		   return vetor[0]+" "+vetor[1];	   
	}

	public static boolean ehPalindromo(String palavra) {
		String invertida = new StringBuilder(palavra).reverse().toString();
		return palavra.contentEquals(invertida);
		}
	
	public static String transformaParaCaixaAlta(String palavra) {
		return palavra.toUpperCase();
	}

	public static int contaVogais(String frase) {
		String minusculas = frase.toLowerCase();
		int quantVogais = 0;
		char[] vogais = new char[] {'a','e','i','o','u'};
		for (int i = 0; i < minusculas.length(); i++) 
			for (int j = 0; j < vogais.length; j++) 
				if (vogais[j]== minusculas.charAt(i)) 				
					quantVogais+=1;	
		return quantVogais;
	}
	
	public static String removeEspaçosSuperfluos(String frase){
		for (int i = 0; i < frase.length(); i++) 
			frase= frase.replace("  "," ");
		frase = frase.trim();
		return frase;
	}

	public static int[] ocorrencias(String frase, String subPalavra) {
	
		int cont = 0;
		int[] posicoes = new int[subPalavra.length()];
		for (int i = 0; i < (frase.length()-subPalavra.length()); i++) 
			if(subPalavra.equals(frase.substring(i,i+subPalavra.length())))
				 posicoes[cont++]+=i;
		return posicoes;

		
		
}

	public static int binarioPraDecimal(String binario) {
		int decimal = 0;
		int cont = 0;
		for (int i = binario.length(); i >0 ; i--) 
			if(binario.charAt(i-1)=='1') {
				decimal+=Math.pow(2, cont);
				cont++;
			}
			else {
				cont++;
				}
		return decimal;
	}

	public static int getQtdadePalavras(String frase) {
		String[] frases = frase.split(" ");
		return frases.length;
	}

	public static int[] histogramaLetras(String frase) {
		 int alfa = 'z' - 'a' + 1; 
		 String frases = frase ;
		 int[] histograma = new int[alfa];
				String hist = frases.toLowerCase();
				for (int i = 0; i < hist.length(); i++) 
				{	char letra  = hist.charAt(i);
					if ('a' <= letra && letra <= 'z')
					{	histograma[letra - 'a']++;
					}
				}
				return histograma;
			
	}
}
