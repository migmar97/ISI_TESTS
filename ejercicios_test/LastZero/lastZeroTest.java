import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class lastZeroTest
{
   // this test passes
   @Test public void ZeroInLast()
   {
      int arr[] = {0, 7, 0};
      assertEquals("Three positives", 2, lastZero.lastZero(arr));
   }

   @Test public void ZeroFirstPos()
   {
      int arr[] = {0, 7, 2};
      assertEquals("ZeroFirstPos", 0, lastZero.lastZero(arr));
   }

   @Test public void ZeroIsSecondPos()
   {
      int arr[] = {1, 0, 2};
      assertEquals("ZeroSecondPos", 1, lastZero.lastZero(arr));
   }

   //
   // @Test(expected =  NullPointerException.class)
   // public void ListIsNull()
   // {
   //    int arr[] = null;
   //    countPositive.countPositive(arr);
   // }
}
