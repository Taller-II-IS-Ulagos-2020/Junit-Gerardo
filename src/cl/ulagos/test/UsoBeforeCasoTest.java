package cl.ulagos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import cl.ulagos.application.Identificador;

public class UsoBeforeCasoTest {
	@Test
	public void particionValida() {
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("a1");
		assertEquals(true, resultado);
	}
	
	@Test
	public void particionInvalida01() {
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("");
		assertEquals(false, resultado);		
	}
	
	@Test
	public void particionInvalida02() {
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("A1b2C3d");
		assertEquals(false, resultado);
		
	}
	
	@Test
	public void particionInvalida03() {
		Identificador id = new Identificador();
		boolean resultado = id.validarIdentificador("z#12");
		assertEquals(false, resultado);
	}

}
