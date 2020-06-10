import java.util.stream.IntStream;


/**
 * @author Iv�n Duarte
 *
 */
public class Numerico {
	/**
	 * M�todo que saca el valor m�ximo de una lista ingresada en formato IntStream
	 * @param numeros son una lista de n�meros variados
	 * @return retorna un entero que es el valor m�ximo
	 */
	public static int numeroMayor(IntStream numeros) {
		return numeros.max().getAsInt();
	}
	
	
}
