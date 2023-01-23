import java.util.Arrays;

public class PerfectSquares {
  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 10};
    int[] newArr = removeNonSquares(arr);
    if (newArr.length == 0) {
        System.out.println("-1");
    } else {
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Array with only perfect squares: " + Arrays.toString(newArr));
    }
  }

  public static int[] removeNonSquares(int[] arr) {
    int[] newArr = new int[arr.length];
    int newArrIndex = 0;
    for (int i = 0; i < arr.length; i++) {
      if (isPerfectSquare(arr[i])) {
        newArr[newArrIndex++] = arr[i];
      }
    }
    return Arrays.copyOf(newArr, newArrIndex);
  }

  public static boolean isPerfectSquare(int num) {
    int sqrt = (int) Math.sqrt(num);
    return sqrt * sqrt == num;
  }
}
