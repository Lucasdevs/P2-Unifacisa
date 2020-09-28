package br.cesed.si.p2.spotify;

public class Spotify {
	private Musica [] playlist;
	private int qtdmusicas;
	
	public Spotify(){
		this.playlist = new Musica[10];
		this.qtdmusicas = 0;
	}
	public Spotify(int num){
		this.playlist = new Musica [num];
		this.qtdmusicas = 0;
		
	}
	//saber quantas músicas existem no seu Spotify
	public int getQtdmusicas() {
		return qtdmusicas;
	}
	//adiciona musica
	public void addmusica(Musica x) {
		if(qtdmusicas == playlist.length) {
			Musica[] newplaylist = new Musica[2*playlist.length];
			for (int i = 0; i < newplaylist.length; i++) {
				newplaylist[i]=playlist[i];
			}
			this.playlist = newplaylist;
		}
	playlist[qtdmusicas] = x;
	qtdmusicas++;
	}
	//remove musica pelo nome
	private void removeMsc(String nome) {
		boolean deslocar = false;
		for (int i = 0; i < playlist.length; i++) {
			if(playlist[i].getNome().equals(nome)) {
				deslocar = true;				
			}
			if(deslocar) {
				this.playlist[i+1]=this.playlist[i];
			}
			
		}
	}
	//lista todas as musicas de um artista
	public Musica[] listaMsc(String artista) {
		int cont=0;
		for (Musica x : playlist) {
			if(x != null && x.getArtista().equals(artista)) {
				cont++;
			}
		}
		if(cont>0) {
			Musica [] ThisIsArtista = new Musica[cont];
			int local = 0;
			for (Musica x : playlist) {
				if(x != null && x.getArtista().equals(artista)) {
					ThisIsArtista[local]= x;
					local++;
				}
			}
			return ThisIsArtista;
		}
		else {
			return null;
		}
	}
	//lista todas as musicas de um mesmo ano
	public Musica[] musicasMesmoAno(int anoDeLancamento) {
		int cont=0;
		for (Musica x : playlist) {
			if(x != null && x.getAnoDeLancamento() == anoDeLancamento) {
				cont++;
			}
		}
		if(cont>0) {
			Musica [] MusicasAno = new Musica[cont];
			int local = 0;
			for (Musica x : playlist) {
				if(x != null && x.getAnoDeLancamento() == anoDeLancamento) {
					MusicasAno [local]= x;
					local++;
				}
			}
			return MusicasAno;
		}
		else {
			return null;
		}
	}
	//lista todas as musicas de um genero
	
	public Musica[] musicasGenero(Genero genero) {
		int cont=0;
		for (Musica x : playlist) {
			if(x != null && x.getGenero().equals(genero)) {
				cont++;
			}
		}
		if(cont>0) {
			Musica [] MusicasGenero = new Musica[cont];
			int local = 0;
			for (Musica x : playlist) {
				if(x != null && x.getGenero().equals(genero)) {
					MusicasGenero [local]= x;
					local++;
				}
			}
			return MusicasGenero;
		}
		else {
			return null;
		}
	}
	
	//retorna a musica de maior duração
	double MusicaMaisLonga(double duracao) {
		for (Musica x : playlist) {
			double maiorMusica = 0;
			if(x != null && x.getDuracao() > duracao) {
				maiorMusica = duracao;
			}
		return maiorMusica;
		}
	return duracao;
	}
	
	// retorna a maior musica
	public String MaiorMsc (String nome) {
		String MaisLonga = null;
		int cont = 1;
		for (int i = 0; i < playlist.length; i++) {
			if(playlist[cont].getDuracao() > playlist[i].getDuracao()){
				MaisLonga = playlist[cont].getNome();
				cont++;
			}
			else {
				MaisLonga = playlist[i].getNome();
			}
		}
	return MaisLonga;
	}
	
	// retorna a maior musica
	public String MenorMsc (String nome) {
		String MaisCurta = null;
		int cont = 1;
		for (int i = 0; i < playlist.length; i++) {
			if(playlist[cont].getDuracao() < playlist[i].getDuracao()){
				MaisCurta = playlist[cont].getNome();
				cont++;
			}
			else {
				MaisCurta = playlist[i].getNome();
			}
		}
		return MaisCurta;
	}		
}


