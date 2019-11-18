import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class romanNumeralTest
{
		romanNumeral romanNumeral = new romanNumeral();

   // this test passes
   @Test public void numero() throws InvalidParameter
   {
      assertEquals("numero 495", 495, romanNumeral.convierte("CDXCV"));
   }

	 @Test public void OTROnumero() throws InvalidParameter
	 {
			assertEquals("numero 2484", 2484, romanNumeral.convierte("MMCDLXXXIV"));
	 }

	 @Test ()
	 public void romanoInvalido() throws InvalidParameter
	 {
		 try{
			 romanNumeral.convierte("Z");
		 }catch (InvalidParameter e){
			 return;
		 }

		 fail("InvalidParameter expected");
	 }
}
