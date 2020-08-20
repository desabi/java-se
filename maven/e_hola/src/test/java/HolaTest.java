import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HolaTest {
	
   @Test
   public void testSaludar() {
      Hola h = new Hola();
      String mensaje = h.saludar();
      assertEquals("Hola mundo", mensaje);
   }
   
}

