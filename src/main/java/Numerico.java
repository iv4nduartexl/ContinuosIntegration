import java.util.Spliterator;
import java.util.stream.IntStream;


/**
 * @author Iv�n Duarte
 *
 */
public class Numerico {
	/**
	 * M�todo que saca el valor m�ximo de una lista ingresada en formato IntStream
	 * @param numeros son una lista de n�meros enteros variados
	 * @return retorna un entero que es el valor m�ximo
	 */
	public static int numeroMayor(IntStream numeros) {
		return numeros.max().getAsInt();
	}
	
	/**
	 * Método que saca el valor minimo de una lista ingresada en formato IntStream
	 * @param numeros son una lista de numeros enteros variados
	 * @return retorna un entero que es el valor mínimo
	 */
	public static int numeroMenor(IntStream numeros) {
		return numeros.min().getAsInt();
	}
	
	/**
	 * Método que suma un rango de números incluyendo los que están dentro de los mínimos y máximos
	 * @param min valor mínimo del rango
	 * @param max valor máximo del rango
	 * @return retorna la suma de todos los valores en forma de entero
	 */
	public static int suma(int min, int max) {
		return IntStream.rangeClosed(min, max).sum();
	}
}
