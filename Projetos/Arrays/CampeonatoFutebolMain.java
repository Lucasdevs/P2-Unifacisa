package ListaArrays;

import java.util.Arrays;

public class MainCampeonatoDeFutebol {

	public static void main(String[] args) {
		CampeonatoDeFutebol a = new CampeonatoDeFutebol();
		a.adicionarTimes("Treze Campinense Botafogo Autoesporte");
		String[] jogos = a.criarCampeonato();
		System.out.println(Arrays.toString(jogos));
		

		
	}

}
