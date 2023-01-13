/*Q5 - Write a Java program to swap two numbers with the help of a third variable. 
Sample Input : 2,3
Sample Output : 3,2*/

public class Q5SwapTwoNum {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int temp;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a +" "+b);  //3 2
    }
}
