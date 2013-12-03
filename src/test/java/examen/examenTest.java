package examen;
import static org.junit.Assert.*;
import java.util.*;
import java.io.*;
import org.junit.Before;
import org.junit.Test;

public class examenTest {
	private anho a;
	@Before
	public void setup() {
		a = new anho();
	}

	@Test
	public void verificarQueVerificarSiDosNumerosSonDivisiblesFuncione(){
		assertEquals(false,a.verificarDivisibles(15,2));
		assertEquals(true,a.verificarDivisibles(16,8));
	}

	@Test
	public void verificaranhoBisiestoDivisibleEntre4yNoEntre100() {
		assertEquals(false,a.anhoBisiesto(2000));
		assertEquals(true,a.anhoBisiesto(1924));
		assertEquals(false,a.anhoBisiesto(1513));
	}
}
