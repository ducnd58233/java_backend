public class Exercise2 {
  public static void main(String[] args) {
    int[] arr = {20, 20, 30, 40, 50, 50, 50};
    int result = removeDuplicate(arr);
    System.out.printf("Result: %d\n", result);
  }

  static int removeDuplicate(int[] arr) {
    int count = 1;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] != arr[i - 1]) {
        count++;
      }
    }
    return count;
  }
}
