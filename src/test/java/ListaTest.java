import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaTest {

	@Test
	void testBuscar() {
		List<String> datos = Arrays.asList("Rosa", "Margarita", "Tulipan");
		assertTrue(Lista.buscar(datos, "Margarita"));
		assertFalse(Lista.buscar(datos, "Violeta"));
	}
	
	@Test
	void testContar() {
		List<String> datos = Arrays.asList("Rosa", "Margarita", "Tulipan");
		assertEquals(3,Lista.contar(datos));
		assertEquals(5,Lista.contar(datos));
	}
	
	@Test
	void testOrdenar() {
		List<String> datos = Arrays.asList("Rosa", "Margarita", "Tulipan");
		List<String> ordenado = Arrays.asList("Margarita", "Rosa", "Tulipan");
		assertTrue(Lista.ordenar(datos).equals(ordenado));
	}
	
	@Test
	void testHacerMayuscula() {
		List<String> resultado = Arrays.asList("Rosa", "Margarita", "Tulipan");
		List<String> datos = Arrays.asList("rosa", "margarita", "tulipan");
		assertTrue(Lista.hacerMayuscula(datos).equals(resultado));
	}
	
	@Test
	void testEliminarDuplicados() {
		List<String> resultado = Arrays.asList("Rosa", "Margarita", "Tulipan");
		List<String> datos = Arrays.asList("Rosa", "Rosa", "Margarita", "Margarita", "Tulipan", "Tulipan");
		assertTrue(Lista.eliminarDuplicados(datos).equals(resultado));
	}

}
