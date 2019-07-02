import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ Agregar.class, AgregarOrdenado.class, Eliminar.class, Listar.class, Modificar.class })
public class AllTests {

}
