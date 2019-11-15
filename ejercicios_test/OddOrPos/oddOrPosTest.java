import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class oddOrPosTest
{
   // this test passes
   @Test public void OneOdd()
   {
      int arr[] = {-4, -2, 7};
      assertEquals("OneOdd", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void NegativeOdd()
   {
      int arr[] = {-4, -2, -7};
      assertEquals("OneOdd", 1, oddOrPos.oddOrPos(arr));
   }

   @Test public void CountIsZero()
   {
      int arr[] = {-4, -8, -2};
      assertEquals("CountIsZero", 0, oddOrPos.oddOrPos(arr));
   }

   @Test public void CountIsThree()
   {
      int arr[] = {1, 4, 5};
      assertEquals("CountIsThree", 3, oddOrPos.oddOrPos(arr));
   }

   //
   // @Test(expected =  NullPointerException.class)
   // public void ListIsNull()
   // {
   //    int arr[] = null;
   //    countPositive.countPositive(arr);
   // }
}
