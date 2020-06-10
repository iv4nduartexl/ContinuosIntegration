
import java.util.stream.IntStream;


/**
 * @author Iván Duarte
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
	
	
	/**
	 * Método para ver si se encuentra en la lista un número mayor al que se ingresó
	 * @param numeros son los valores que van a ser comparador para dar el resultado
	 * @param mayor es el parametro que se va a comparar con la lista para obtener el mayor resultado
	 * @return regresa un true si hay un número mayor o false si no lo hay
	 */
	public static boolean hayMayor(IntStream numeros,int mayor) {
		return numeros.anyMatch(num->num > mayor);
	}
	
	/**
	 * Método para calcular el producto de varios números ingresados
	 * @param numeros lista de números que van a ser multiplicados
	 * @return regresa el resultado de toda la multiplicación en form de entero
	 */
	public static int producto(IntStream numeros) {
		return numeros.reduce((a, b) -> (a * b)).getAsInt();
	}
}
