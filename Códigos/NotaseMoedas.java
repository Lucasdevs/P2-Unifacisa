package Codes;

public class NotaseMoedas {
	public static void main (String[] args) {
        notas(50.75);
	}
    public static void notas(double val) {
        int notas100 = (int) (val / 100);
        val %= 100;
        int notas50 = (int) (val / 50);
        val %= 50;
        int notas20 = (int) (val / 20);
        val %= 20;
        int notas10 = (int) (val / 10);
        val %= 10;
        int notas5 = (int) (val / 5);
        val %= 5;
        int notas2 = (int) (val / 2);
        val %= 2;
        val *= 100;		
        int moeda1 = (int) (val/ 100);
        val = val % 100;
        int moeda2 = (int) (val/ 50);
        val = val % 50;
        int moeda3 = (int) (val/ 25);
        val = val % 25;
        int moeda4 = (int) (val/ 10);
        val = val % 10;
        int moeda5 = (int) (val/ 5);
        val = val % 5;
        int moeda6 = (int) (val/ 1);
        System.out.println("Notas:");
        System.out.printf("%d nota(s) de R$ 100,00\n", notas100);
        System.out.printf("%d nota(s) de R$ 50,00\n", notas50);
        System.out.printf("%d nota(s) de R$ 20,00\n", notas20);
        System.out.printf("%d nota(s) de R$ 10,00\n", notas10);
        System.out.printf("%d nota(s) de R$ 5,00\n", notas5);
        System.out.printf("%d nota(s) de R$ 2,00\n", notas2);
        System.out.println("Moedas:");
        System.out.printf("%d moeda(s) de R$ 1,00\n", moeda1);
        System.out.printf("%d moeda(s) de R$ 0,50\n", moeda2);
        System.out.printf("%d moeda(s) de R$ 0,25\n", moeda3);
        System.out.printf("%d moeda(s) de R$ 0,10\n", moeda4);
        System.out.printf("%d moeda(s) de R$ 0,05\n", moeda5);
        System.out.printf("%d moeda(s) de R$ 0,01\n", moeda6);
    }

}