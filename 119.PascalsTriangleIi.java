import java.util.Arrays;

class PascalsTriangleIi {
  public int[] getRow(int rowIndex) {
    int[] list = new int[rowIndex];
    int[] previousList = new int[rowIndex];
    for (int i = 0; i < rowIndex; i++) {
      list[0] = 1;
      for (int j = 1; j < i; j++) {
        list[j] = previousList[j - 1] + previousList[j];
      }
      list[i] = 1;
      previousList = list.clone();
    }
    return list;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(new PascalsTriangleIi().getRow(Integer.parseInt(args[0]))));
  }
}