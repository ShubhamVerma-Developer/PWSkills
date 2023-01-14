import java.util.Scanner;

public class SumOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int l1 = sc.nextInt(); 
        int r1 = sc.nextInt(); 
        int l2 = sc.nextInt();    
        int r2 = sc.nextInt();   
        int[][] Matrix = new int[r][c];    //7x7 Matrix

        for(int i=0; i<r; i++){                   
            for(int j=0; j<c; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
 
        System.out.println(sumOfRect(Matrix, l1, r1, l2, r2));


    }

 

    static int sumOfRect(int[][] Matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2 ; j++) {
                sum += Matrix[i][j];
            }
        }
        return sum;
    }
}
