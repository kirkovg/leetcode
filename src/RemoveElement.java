import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Problem 27.
 */
public class RemoveElement {
  public int removeElement(int[] nums, int val) {
    int size = nums.length;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        nums[i] = Integer.MAX_VALUE;
        size--;
      }
    }
    Arrays.sort(nums);
    return size;
  }

  public static void main(String[] args) {
    int[] arr = {0,1,2,2,3,0,4,2};
    System.out.println(new RemoveElement().removeElement(arr, 2));
    System.out.println(Arrays.stream(arr).mapToObj(String::valueOf).collect(Collectors.joining(", ")));
  }
}
