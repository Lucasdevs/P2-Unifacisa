package br.cesed.si.p2.basicos;

import java.util.Scanner;

public class Problema3 {
	public static void main (String[] args){
		
		Scanner entrada = new Scanner(System.in);
		String nome = entrada.next();
		double pre�o = entrada.nextDouble();
		
		if(pre�o>0 && pre�o<100) {
			pre�o*=0.95;
			System.out.println("Nome: "+nome);
			System.out.println("Pre�o: R$ "+pre�o);
		}else if(pre�o>=100 && pre�o<500 ){
			pre�o*=0.90;
			System.out.println("Nome: "+nome);
			System.out.println("Pre�o: R$ "+pre�o);	
		}else {
			pre�o*=0.85;
			System.out.println("Nome: "+nome);
			System.out.println("Pre�o: R$ "+pre�o);	
		}
	}
}
