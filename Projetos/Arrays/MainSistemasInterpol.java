package ListaArrays;

public class MainSistemasInterpol {

	public static void main(String[] args) {
		SistemaInterpol aqui = new SistemaInterpol();
		aqui.adicionarProcurados("Phulano Syckrano Bheltranno");
		System.out.println(aqui.ehProcurado("Syckrano"));
	}

}
