import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void newTestReverseInPlace(){
    int [] arr1 = {1, 4, 6};
    ArrayExamples.reverseInPlace(arr1);
    assertArrayEquals(new int[]{6, 4, 1}, arr1);
  }

  @Test
  public void newTestReversed(){
    int [] arr1 = {1, 4, 6};
    assertArrayEquals(new int[]{6, 4, 1}, ArrayExamples.reversed(arr1));
  }

}
