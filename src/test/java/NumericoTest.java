import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NumericoTest {

	@Test
	void testMax() {
		IntStream numeros= IntStream.of(2,5,1,6,12);
		assertEquals(12,Numerico.numeroMayor(numeros));
	}
	
	@Test
	void testMin() {
		IntStream numeros= IntStream.of(1,3,20,4,12);
		assertEquals(1,Numerico.numeroMenor(numeros));
	}
	
	@Test
	void testSuma() {
		assertEquals(15, Numerico.suma(1, 5));
	}

}
