import java.util.List;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;

class PascalsTriangle {
  // Generate the current line according to the two above
  public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> list = new ArrayList<>();
    for (int i = 0; i < numRows; i ++) {
      List<Integer> innerList = new ArrayList<>();
      innerList.add(1);

      if (i > 1) {
        for (int j = 1; j < i; j++) {
          innerList.add(list.get(i - 1).get(j - 1) + list.get(i - 1).get(j));
        }
      }

      if (i > 0) {
        innerList.add(1);
      }

      list.add(innerList);
    }
    return list;
  }

  public int[][] generateNestedArrays(int numRows) {
    int[][] list = new int[numRows][];
    for (int i = 0; i < numRows; i++) {
      int[] innerList = new int[i+1];

      innerList[0] =  1;

      if (i > 1) {
        for (int j = 1; j < i; j ++) {
          innerList[j] = list[i - 1][j - 1] + list[i - 1][j];
        }
      }

      innerList[i] = 1;

      list[i] = innerList;
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(new PascalsTriangle().generate(5));
    System.out.println(Arrays.deepToString(new PascalsTriangle().generateNestedArrays(5)));
  }
}