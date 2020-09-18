package br.cesed.si.p2.carros;


public class Concessionaria {
	public static void main(String[] args) {
		
		Carros.promocao=false;
		
		Carros palio1 = new Carros("P�lio","Fiat",35000);
		Carros palio2 = new Carros("P�lio","Fiat","Prateado",35000,2,false,false,false,false);
		Carros civic = new Carros("Civic","Honda","Desconhecida",110000,4,true,true,true,true);
		Carros corolla = new Carros("Corolla","Toyota","Desconhecida",110000,4,true,true,false,true);
		Carros gol = new Carros("Gol","Volkswagen","Desconhecida",55000,4,true,true,true,true);
		
		System.out.println("Carros Sem Promo��o:"+"\n");
		System.out.println(palio1+"\n");
		System.out.println(palio2+"\n");
		System.out.println(civic+"\n");
		System.out.println(corolla+"\n");
		System.out.println(gol+"\n");
		
		Carros.promocao=true;
		
		System.out.println("Carros Com (10%) de Promo��o:"+"\n");
		System.out.println(palio1+"\n");
		System.out.println(palio2+"\n");
		System.out.println(civic+"\n");
		System.out.println(corolla+"\n");
		System.out.println(gol);
		
		// Se a vari�vel promo��o fosse uma vari�vel de inst�ncia teria que ser atribuido carro por carro o valor dessa vari�vel (True ou False),
		// Dessa forma, alguns carros da loja podiam estar em promo��o e outros n�o, diferente da vari�vel de classe, onde todos os carros saem
		// e entram de promo��o ao mesmo tempo atrav�s da vari�vel de classe que atribue de forma geral o valor (True ou False) pra todos os carros.
	}
		
}
