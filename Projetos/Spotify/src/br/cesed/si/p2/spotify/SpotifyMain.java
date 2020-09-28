package br.cesed.si.p2.spotify;


public class SpotifyMain {
	public static void main (String[] args) {
		
		Spotify Exemplo = new Spotify(5);
		
		Exemplo.addmusica(new Musica("Song","Jason","damn boy",2010,5,2.5,Genero.POP));
		Exemplo.addmusica(new Musica("Sunshine","Jack","right or left",2012,13,3.5,Genero.ROCK));
		Exemplo.addmusica(new Musica("Way out","Ross","i love that",2016,12,2.0,Genero.JAZZ));
		Exemplo.addmusica(new Musica("Only","Ben","Hey Hey Hey",2019,10,4.0,Genero.FUNK));
		Exemplo.addmusica(new Musica("Say yes","Call","Yes,Yes",2020,15,5.0,Genero.RAP));
		
		}
	
	//INFELIZMENTE NÃO CONSEGUÍ CONCLUIR O PROJETO A TEMPO.
}
