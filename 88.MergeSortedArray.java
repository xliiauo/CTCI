import java.util.Arrays;

class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int a = m - 1;
    int b = n - 1;
    if (m == 0) {
      System.arraycopy(nums2, 0, nums1, 0, n);
    } else if (n == 0) {
      System.arraycopy(nums1, 0, nums1, 0, m);
    } else {
      for (int i = m + n - 1; i >= 0; i--) {
        if (nums1[a] > nums2[b]) {
          nums1[i] = nums1[a];
          if (--a < 0) {
            System.arraycopy(nums2, 0, nums1, 0, b+1);
            break;
          }
        } else {
          nums1[i] = nums2[b];
          if (--b < 0) break;
        }
      }
    }
    System.out.println(Arrays.toString(nums1));
  }

  public void mergeStyled(int[] nums1, int m, int[] nums2, int n) {
    int a = m - 1;
    int b = n - 1;
    int c = m + n - 1;
    while (c >= 0) {
      if (a >=0 && b >= 0) {
        if (nums1[a] > nums2[b]) {
          nums1[c] = nums1[a];
          a--;
        } else {
          nums1[c] = nums2[b];
          b--;
        }
      } else if (a >= 0) {
        nums1[c] = nums1[a];
        a--;
      } else if (b >= 0) {
        nums1[c] = nums2[b];
        b--;
      }
      c--;
    }
    System.out.println(Arrays.toString(nums1));
  }

  public static void main(String[] args) {
    int[] nums1 = new int[10];
    nums1[0] = 2;
    nums1[1] = 0;
    nums1[2] = 3;
    int[] nums2 = new int[] {1};
    new MergeSortedArray().mergeStyled(nums1, 1, nums2, 1);
  }
}