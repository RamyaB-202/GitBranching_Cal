public class ArrayMax {
  public static void main(String[] args) {
      int[] arr = {10, 324, 45, 90, 9808};
      System.out.println("Largest in given array is " + findLargest(arr));
  }

  static int findLargest(int[] arr) {
      int max = arr[0];
      for (int i = 1; i < arr.length; i++) {
          if (arr[i] > max) {
              max = arr[i];
          }
      }
      return max;
  }
}
