package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Algoritmos;

class TestAlgoritmo {

	@Test
	void sumatorioAlgoritmo() {
		double sumatorioEsperado = 10;
		double sumatorioObtenido = Algoritmos.sumatorio(4);
		assertEquals(sumatorioEsperado, sumatorioObtenido);
	}
	@Test
	void factorialAlgoritmo() {
		double factorialEsperado = 120;
		double factorialObtenido = Algoritmos.factorial(5);
		assertEquals(factorialEsperado, factorialObtenido);
	}
	
}
