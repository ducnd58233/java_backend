public class Exercise1 {
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {2, 5, 7, 8};
    int[] merged = {0, 0, 0, 0, 0, 0, 0, 0};
    int k, i, j;
    k = i = j = 0;

    while (i < array1.length && j < array2.length) {
      if (array1[i] <= array2[j]) {
        merged[k] = array1[i];
        i++;
      } else {
        merged[k] = array2[j];
        j++;
      }
      k++;
    }

    if (i < array1.length) {
      while (i < array1.length) {
        merged[k] = array1[i];
        i++;
        k++;
      }
    }

    if (j < array2.length) {
      while (j < array2.length) {
        merged[k] = array2[j];
        j++;
        k++;
      }
    }

    for (int idx = 0; idx < merged.length; idx++) {
      System.out.printf("%d ", merged[idx]);
    }
  } 
}
