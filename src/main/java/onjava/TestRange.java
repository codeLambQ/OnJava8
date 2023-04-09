package onjava;
import java.util.Arrays;

import static onjava.Range.range;

public class TestRange {
  private static void show(int[] rng) {
    System.out.println(Arrays.toString(rng));
  }
  public static void main(String[] args) {
    show(range(10, 21, 3));
    show(range(21, 10, -3));
    show(range(-5, 5, -3));
    show(range(-5, 5, 3));
    show(range(10, 21));
    show(range(10));
  }
}
/* Output:
[10, 13, 16, 19]
[21, 18, 15, 12]
[]
[-5, -2, 1, 4]
[10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
*/
