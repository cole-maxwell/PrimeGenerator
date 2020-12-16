package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import java.util.LinkedList;
import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {
	@Test
	public void verifyItems() {
		Object[] expected = {2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L, 23L, 29L, 31L,
				37L, 41L, 43L, 47L, 53L, 59L, 61L, 67L, 71L, 73L, 79L, 83L, 89L, 97L};
		PrimeGenerator gen = new PrimeGenerator(1, 100);
		gen.generatePrimes();
		LinkedList<Long> primes = gen.getPrimes();
		Object[] actual = primes.toArray();
		assertArrayEquals(expected, actual);
	}
	@Test
	public void verifyRange() {
		boolean result;
		PrimeGenerator gen = new PrimeGenerator(1, 100);
		if(gen.from >= 1 && gen.to > gen.from){
			result = true;
		}else{
			result = false;
		}
		assertTrue(result);
	}
}