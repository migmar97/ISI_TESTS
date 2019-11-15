import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class countPositiveTest
{
   // this test passes
   @Test public void TwoPositives()
   {
      int arr[] = {2, 7, 0};
      assertEquals("Two positives", 2, countPositive.countPositive(arr));
   }

    // this test passes
   @Test public void FirstIsNotPositive()
   {
      int arr[] = {-2, 7, 2};
      assertEquals("FirstIsNotPositive", 2, countPositive.countPositive(arr));
   }

   @Test public void NoPositives()
   {
      int arr[] = {-2, -7, -2};
      assertEquals("NoPositives", 0, countPositive.countPositive(arr));
   }

   @Test(expected =  NullPointerException.class)
   public void ListIsNull()
   {
      int arr[] = null;
      countPositive.countPositive(arr);
   }
}
