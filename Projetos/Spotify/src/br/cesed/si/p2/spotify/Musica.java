package br.cesed.si.p2.spotify;

public class Musica extends Object{
	private String nome, artista,letra;
	private int anoDeLancamento, numVezReproduzida;
	private double duracao;
	private Genero genero;
	
	public Musica(String nome,String artista,String letra,int anoDeLancamento, int numVezReproduzida, double duracao, Genero genero) {
		this.nome = nome;
		this.artista = artista;
		this.letra = letra;
		this.anoDeLancamento = anoDeLancamento;
		this.numVezReproduzida=numVezReproduzida;
		this.duracao=duracao;
		this.genero= genero;
	}
	
	public Musica() {
	}
	
	
	public int getAnoDeLancamento() {
		return anoDeLancamento;
	}
	public String getArtista() {
		return artista;
	}
	public double getDuracao() {
		return duracao;
	}
	public int getNumVezReproduzida() {
		return numVezReproduzida;
	}
	public String getNome() {
		return nome;
	}
	public String getLetra() {
		return letra;
	}
	public Genero getGenero() {
		return genero;
	}
	
	@Override
	public String toString() {
		String saida=" ";
		saida+="Nome: "+nome+" Artista: "+artista+" Letra: "+letra+" Gênero: "+genero+" Duração: "+duracao+" min"+" Lançamento:"+anoDeLancamento+" Reproduções: "+numVezReproduzida;
		return saida;
	}
	public void tocarMusica() {
		this.numVezReproduzida++;
	}

}
