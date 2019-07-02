import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.basedatos.base.BaseDeDatos;
import tata.basedatos.dato.Dato;





public class Eliminar {

private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base=new BaseDeDatos();
		
		this.base.agregar(new Dato("1", "dato1"));
		this.base.agregar(new Dato("2", "dato2"));
		this.base.agregar(new Dato("3", "dato3"));
		this.base.agregar(new Dato("4", "dato4"));
		this.base.agregar(new Dato("5", "dato5"));
	}
	
	/*@Test
	public void cuandoElimina1EntoncesTrue() {
		
		int largo=this.base.listar().size();
		boolean respuesta=this.base.eliminar("2");
		System.out.println(largo);
		assertTrue(true);
	}*/
	
	@Test
	public void cuandoNoEliminarEntoncesFalse() {
		
		boolean respuesta=this.base.eliminar("asd");
		assertTrue(!respuesta);
	}

}
