import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = input.nextLine();
    String reverse = "";
    int length = str.length();
    for (int i = length - 1; i >= 0; i--) {
      reverse = reverse + str.charAt(i);
    }
    if (str.equals(reverse)) {
      System.out.println(str + " is a palindrome.");
    } else {
      System.out.println(str + " is not a palindrome.");
    }
  }
}
