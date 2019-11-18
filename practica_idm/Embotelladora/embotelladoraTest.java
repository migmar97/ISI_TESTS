import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class embotelladoraTest
{
	 embotelladora embotelladora = new embotelladora();

   // this test passes
   @Test public void numero() throws NoSolution
   {
      assertEquals("necesito 2", 2, embotelladora.calculaBotellasPequenas(2,3,12));
   }

	 @Test public void otronumero() throws NoSolution
	 {
			assertEquals("necesito 0", 0, embotelladora.calculaBotellasPequenas(2,3,10));
	 }

	 @Test public void nohaypeq() throws NoSolution
	 {
		 try{
			 embotelladora.calculaBotellasPequenas(2,3,4);
		 }catch (NoSolution e){
			 return;
		 }
		 fail("NoSolution exception expected");

	 }

	 @Test public void otrocaso() throws NoSolution
	 {
			assertEquals("otro", 3, embotelladora.calculaBotellasPequenas(3,10,43));
	 }

}
