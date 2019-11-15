import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class findLastTest
{
  // this test passes
  @Test public void findLast()
  {
     int arr[] = {0, 7, 0};
     assertEquals("SecondPos", 1, findLast.findLast(arr,7));
  }

  @Test public void NoPos()
  {
     int arr[] = {0, 7, 2};
     assertEquals("NoPos", -1, findLast.findLast(arr,4));
  }

  @Test public void FirstPos()
  {
     int arr[] = {1, 0, 2};
     assertEquals("FirstPos", 0, findLast.findLast(arr,1));
  }

   //
   // @Test(expected =  NullPointerException.class)
   // public void ListIsNull()
   // {
   //    int arr[] = null;
   //    countPositive.countPositive(arr);
   // }
}
