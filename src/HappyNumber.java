import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Problem 202.
 */
public class HappyNumber {
  private List<Long> getDigits(long n) {
    List<Long> digits = new ArrayList<>();
    while (n != 0) {
      digits.add(n % 10L);
      n = n / 10;
    }
    return digits;
  }

  public boolean isHappy(int n) {
    Set<Long> alreadyVisited = new HashSet<>();
    long num = n;
    while (num != 1) {
      List<Long> digits = getDigits(num);
      num = 0;
      for (Long digit : digits) {
        num +=  digit * digit;
      }
      if (alreadyVisited.contains(num)) {
        return false;
      } else {
        alreadyVisited.add(num);
      }
    }
    return true;
  }

  public static void main(String[] args) {
    System.out.println(new HappyNumber().isHappy(2));
  }
}
