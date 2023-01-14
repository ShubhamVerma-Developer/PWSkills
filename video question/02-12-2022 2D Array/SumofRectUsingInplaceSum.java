
/*  sum of rectangle using brute force approach and inplace approach

input like this
3 3
1 0 2 2

1 2 3
4 5 6
7 8 9

*/

import java.util.Scanner;
public class SumofRectUsingInplaceSum {
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
 
        System.out.println(sumOfRect1(Matrix, l1, r1, l2, r2));
        System.out.println(sumOfRect2(Matrix, l1, r1, l2, r2));
        
        
    }

    static int sumOfRect1(int[][] Matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        for (int i = l1; i <= l2; i++) {
            for (int j = r1; j <= r2 ; j++) {
                sum += Matrix[i][j];
            }
        }
        return sum;
    }

    static int sumOfRect2(int[][] Matrix, int l1, int r1, int l2, int r2){
        int sum = 0;
        inPlaceSum(Matrix);
        for (int i = l1; i <= l2; i++) {
                if(r1 >= 1)
                sum += Matrix[i][r2] - Matrix[i][r1-1];
                else
                    sum += Matrix[i][r2];
            }
            return sum;
        }
        
    


    
        static void inPlaceSum(int[][] Matrix){
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 1; j < Matrix[i].length; j++) {
                    Matrix[i][j] += Matrix[i][j-1];
                }
            }
            // for (int i = 1; i < Matrix.length; i++) {
            //     for (int j = 0; j < Matrix[i].length; j++) {
            //         Matrix[i][j] += Matrix[i-1][j];
            //     }
            // }
        }


}
