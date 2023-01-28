//write a method to print n x n pattern as given below if n = 5, where  1<=n<=12
public class PrintPattern {
    public static void main(String[] args) {
        int n = 5;
        int num = 10;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num+" ");
                num++;
            }
            num++;
            System.out.println();
        }
    }
}
