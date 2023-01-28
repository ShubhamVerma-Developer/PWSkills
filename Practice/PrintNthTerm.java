//Write a program to print n terms of the following series and also print the sum and average of the series.
import java.util.Scanner;
class PrintNthTerm{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 33;
        int nthTerm = 7;

        int sum = 0;
        int add = 1;

        for (int i = 1; i <=nthTerm ; i++) {
            System.out.print(num+", ");
            sum += num;
            num += add;
            add++;
        }
        double avg = sum/nthTerm;
        System.out.println("\nThe Sum of the series is : "+sum);
        System.out.println("The Average of the series is : "+avg);
    }
}


