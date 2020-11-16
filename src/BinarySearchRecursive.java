import java.util.Scanner;

public class BinarySearchRecursive {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to perform a binary search on an int array.");
    System.out.println("Enter total number of elements: ");
    int length = scan.nextInt();
    int[] input = new int[length];

    System.out.printf("Enter %d integers %n", length);
    for (int i = 0; i < length; i++) {
      input[i] = scan.nextInt();
    }

    System.out.println("Please enter the number to be searched in the sorted array.");
    int key = scan.nextInt();
    int index = recursiveBinarySearch(input, key);

    if (index == -1) {
      System.out.printf("Sorry, %d is not found in the array %n", key);
    } else {
      System.out.printf("%d is found in the array at index %d %n", key, index);
    }
    scan.close();
  }
  public static int recursiveBinarySearch(int[] input, int key) {
    return binarySearch(input, 0, input.length - 1, key);
  }

  private static int binarySearch(int[] array, int start, int end,int target) {
    int middle = (start + end) / 2;
    if (end < start) {
      return -1;
    }
      if (target == array[middle]) {
        return middle;
      } else if (target < array[middle]) {
        return binarySearch(array, start, middle - 1, target);
      } else {
        return binarySearch(array, middle + 1, end, target);
      }
    }
  }
