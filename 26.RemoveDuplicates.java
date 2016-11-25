import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

class RemoveDuplicates {
  public int removeDuplicatesHashSet(int[] nums) {
    int current = 0;
    Set<Integer> hashset = new HashSet<>();
    for (int num : nums) {
      if (!hashset.contains(num)) {
        nums[current] = num;
        current++;
        hashset.add(num);
      }
    }
    return current;
  }

  // As this is a sorted array, we can use this characteristic.
  public int removeDuplicatesSortedTwoPointers(int[] nums) {
    int current = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[current] != nums[i]) {
        current++;
        nums[current] = nums[i];
      }
    }
    return ++current;
  }
}