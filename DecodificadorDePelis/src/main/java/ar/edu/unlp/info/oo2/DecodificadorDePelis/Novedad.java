package ar.edu.unlp.info.oo2.DecodificadorDePelis;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Novedad implements Sugerible {

	@Override
	public List<Pelicula> sugerir(List<Pelicula> peliculas, List<Pelicula> reproducidas) {
		return peliculas
		.stream()
		.filter(p->!reproducidas.contains(p))
		.sorted(Comparator.comparingInt(Pelicula::getAnoEstreno))
		.limit(3)
		.collect(Collectors.toList());
	}

}
