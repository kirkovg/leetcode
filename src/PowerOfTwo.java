/**
 * Problem 231.
 */
public class PowerOfTwo {
  public boolean isPowerOfTwo(int n) {
    if (n < 1) {
      return false;
    }

    while (n % 2 == 0) {
      n = n / 2;
    }

    return n == 1;
  }

  public static void main(String[] args) {
    System.out.println(new PowerOfTwo().isPowerOfTwo(16));
  }
}
