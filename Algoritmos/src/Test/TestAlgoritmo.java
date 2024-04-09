package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Modelo.Algoritmos;

class TestAlgoritmo {

	static Algoritmos a1;

	@Test
	void sumatorioAlgoritmo() {
		double sumatorioEsperado = 10;
		double sumatorioObtenido = Algoritmos.sumatorio(4);
		assertEquals(sumatorioEsperado, sumatorioObtenido);
	}
}
