import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class Lista {
	/**
	 * Método para buscar si una palabra está dentro de la lista de elementos
	 * @param lista la lista donde se va a buscar
	 * @param valor lo que se desea encontrar
	 * @return devuelve verdadero si encontró o falso si no lo encontró
	 */
	public static boolean buscar(List<String> lista, String valor) {
		return lista.stream().anyMatch(dato->dato.equals(valor));
	}
	
	/**
	 * Método que devuelve cuantos elementos se encuentran en la lista
	 * @param lista lista que será donde se van a contar los elementos
	 * @return devuelve un long que contiene cuantos elementos hay en la lista
	 */
	public static long contar(List<String> lista) {
		return lista.stream().count();
	}
	
	/**
	 * Método para ordenar una lista desordenada
	 * @param lista una lista desordenada de datos de tipo String
	 * @return la misma lista pero ordenada alfabéticamente
	 */
	public static List<String> ordenar(List<String> lista) {
		return lista.stream().sorted().collect(Collectors.toList());
	}
	
	/**
	 * Método para convertir la primera letra de cada elemento de la lista en mayúscula
	 * @param lista la lista que contiene los elementos que serán transformados
	 * @return retorna la misma lista en el mismo orden pero con la primera letra de cada elemento en mayúscula
	 */
	public static List<String> hacerMayuscula(List<String> lista) {
		return lista.stream().map(elemento -> Character.toUpperCase(elemento.charAt(0)) + elemento.substring(1)).collect(Collectors.toList());
	}
	
	/**
	 * Método para eliminar los elementos duplicados en una lista
	 * @param lista contiene los elementos de la lista
	 * @return regresa la misma lista pero con los elementos duplicados eliminados
	 */
	public static List<String> eliminarDuplicados(List<String> lista) {
		return lista.stream().distinct().collect(Collectors.toList());
	}
}
