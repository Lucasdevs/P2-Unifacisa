package ListaArrays;

import java.util.Arrays;

public class CampeonatoDeFutebol {
	String[] times;

	public void adicionarTimes(String nomes) {
		times = nomes.split(" ");
	}

	public String[] criarCampeonato() {
		int qtdadeJogos = (this.times.length - 1) * 2;
		String[] campeonato = new String[qtdadeJogos];

		int iCamp = 0;
		for (int i = 0; i < times.length - 1; i++) {
			String timeCasa = times[i];
			for (int j = i + 1; j < times.length; j++) {
				String timeFora = times[j];

				campeonato[iCamp] = timeCasa + " X " + timeFora;
				iCamp++;
			}
		}
		return campeonato;
	}

}
