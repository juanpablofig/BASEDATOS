import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.basedatos.base.BaseDeDatos;
import tata.basedatos.dato.Dato;




public class Agregar {

	private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base=new BaseDeDatos();
	}

	@Test
	public void cuandoAgregarDatoDistintoNullntoncesTrue() {
		boolean retorno=this.base.agregar(new Dato("id1", "datos1"));
		assertTrue("si agregar distinto de null entonce diviese ser true :" + retorno ,retorno==true);
	}
	
	@Test
	public void cuandoAgregarDatoMayor1entoncesTrue() {
		boolean retorno=this.base.agregar(new Dato("id1", "datos1"));
		assertTrue("si agregar distinto de null entonce diviese ser true :" + retorno ,retorno==true);
	}
	
	

}
