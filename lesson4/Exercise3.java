public class Exercise3 {
  public static void main(String[] args) {
    int[] arr = {49, 1, 2, 200, 2, 3, 4, 5, 8, 9, 10};
    int result = longestConsecutive(arr);

    System.out.printf("Result: %d\n", result);
  }

  static int longestConsecutive(int[] arr) {
    int result = 0;
    int currentLength = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      if (arr[i + 1] - 1 == arr[i]) {
        currentLength += 1;
      } else {
        result = Math.max(result, currentLength);
        currentLength = 1;
      }
    }
    result = Math.max(result, currentLength);
    return result;
  }
}
