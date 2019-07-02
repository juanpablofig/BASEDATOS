import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import tata.basedatos.base.BaseDeDatos;
import tata.basedatos.dato.Dato;


public class Listar {

private BaseDeDatos base;
	
	@Before
	public void setUp() throws Exception {
		this.base=new BaseDeDatos();
	}

	@Test
	public void cuandoAgregarEntoncesListarSize0() {
		int largo=this.base.listar().size();
		assertTrue("Es de :" +  largo + " Pero deberia ser 0", largo==0);
	}
	
	@Test
	public void cuandoAgregar1EntoncesListarSize1() {
		Dato dato=new Dato("id1", "Dato1");
		this.base.agregar(dato);
		int largo=this.base.listar().size();
		assertTrue("Es largo : " +  largo + " Pero deberia ser 1", largo==1);
	}
	
	@Test
	public void cuandoAgregar3EntoncesListarSize3() {
		Dato dato1=new Dato("id1", "Dato1");
		Dato dato2=new Dato("id2", "Dato2");
		Dato dato3=new Dato("id13", "Dato3");
		this.base.agregar(dato1);
		this.base.agregar(dato2);
		this.base.agregar(dato3);
		int largo=this.base.listar().size();
		assertTrue("Es largo : " +  largo + " Pero deberia ser 3", largo==3);
	}
	

}
