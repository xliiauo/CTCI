class RemoveDuplicates {
  // decompose problem: remove duplicate, use counter to allow two duplicates
  public int removeDuplicates(int[] nums) {
    int current = 0;
    int counter = 0;
    for (int i = 1; i < nums.length; i++) {
      if (nums[current] != nums[i]) {
        nums[++current] = nums[i];
        counter = 0;
      } else if (couter < 1) {
        nums[++current] = nums[i];
        counter++;
      }
    }
    return ++current;
  }
}