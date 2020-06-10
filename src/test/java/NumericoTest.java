import static org.junit.jupiter.api.Assertions.*;

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

}
