import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.basedatos.base.BaseDeDatos;
import tata.basedatos.dato.Dato;




public class Modificar {

	private BaseDeDatos base;
	@Before
	public void setUp() throws Exception {
		this.base=new BaseDeDatos();
		this.base.agregar(new Dato("1", "dato1"));
		
	}

	/*@Test
	public void CuandoModificarEntoncesTrue() {
		Dato dato1=new Dato("1", "dato1");
		boolean respuesta=this.base.modificar(dato1);
		assertTrue(respuesta);
	}*/
	
	@Test
	public void CuandoNoModificarEntoncesFalse() {
		Dato dato1=new Dato("1", "dato1");
		boolean resultado=this.base.modificar(dato1);
		assertFalse(resultado);
	}

}
