package ListaArrays;

public class SistemaInterpol {
	String[] procurados;

	public void adicionarProcurados(String nomes) {
		procurados = nomes.split(" ");

	}

	public boolean ehProcurado(String nome) {
		boolean ehProcura = false;
		for (int i = 0; i < procurados.length; i++)
			if (procurados[i].equals(nome)) {
				ehProcura = true;
			}
		return ehProcura;
	}

}
