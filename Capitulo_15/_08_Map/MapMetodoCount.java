package Capitulo_15._08_Map;

import java.util.ArrayList;
import java.util.List;

import Capitulo_15._07_Stream.Colaborador;

public class MapMetodoCount {

	public static void main(String[] args) {

		List<Colaborador> listaColab = new ArrayList<>();
		
		listaColab.add(new Colaborador(2005, "Manuel da Silva", "Desenvolvedor", 3580.0));
		listaColab.add(new Colaborador(3018, "Joaquim Batista", "Desenvolvedor", 5500.0));
		listaColab.add(new Colaborador(1045, "Maria das Dores", "Analista", 6250.0));
		listaColab.add(new Colaborador(1780, "Jo�o Ricardo", "Desenvolvedor", 7100.0));
		listaColab.add(new Colaborador(5200, "Ana Maria", "Vendedor", 4100.0));
		listaColab.add(new Colaborador(3420, "Andr� de Souza", "Desenvolvedor", 5890.0));
		listaColab.add(new Colaborador(3999, "Bartolomeu Dias", "Analista", 6500.0));
		listaColab.add(new Colaborador(1920, "Rubens da Gama", "Coordenador", 12300.0));
		listaColab.add(new Colaborador(2389, "Cristov�o Col.", "Navegador", 3200.0));
		listaColab.add(new Colaborador(6300, "Pedro Alvares", "Explorador", 1350.0));
		
		System.out.println(
			listaColab.stream()
				.filter(f -> f.getSalario() > 5000)
				.count()
		);

	}

}
