import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// 311/48ms/11.70%
class ThreeSum {
  public List<List<Integer>> threeSum(int[] nums) {
    Arrays.sort(nums);
    List<List<Integer>> list = new ArrayList<>();
    Set<Integer> targets = new HashSet<>();

    for (int target = 0; target < nums.length; target++) {
      if (!targets.contains(nums[target])) {
        Set<Integer> set = new HashSet<>();
        List<Integer> previousList = new ArrayList<>();

        for (int i = target + 1; i < nums.length; i++) {
          if (set.contains(-nums[target] - nums[i])) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(nums[target]);
            innerList.add(-nums[target] - nums[i]);
            innerList.add(nums[i]);

            if (!innerList.equals(previousList)) {
              list.add(innerList);
              previousList = innerList;
            }
          } else {
            set.add(nums[i]);
          }
        }
        targets.add(nums[target]);
      }
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(new ThreeSum().threeSum(new int[] {4, 0, -1, -1, -1, 2, 2, 2, 2, 0, 0, 0, -4}));
  }
}