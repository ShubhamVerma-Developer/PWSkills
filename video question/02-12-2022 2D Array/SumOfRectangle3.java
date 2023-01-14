import java.util.Scanner;
public class SumOfRectangle3{
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
        System.out.println(sumOfRect3(Matrix, l1, r1, l2, r2));
        
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

        static int sumOfRect3(int[][] Matrix, int l1, int r1, int l2, int r2){
            int ans = 0, sum = 0, up = 0, left = 0, leftUp = 0;
            inPlaceSum1(Matrix);
            sum = Matrix[l2][r2];
            if(r1 >= 1){
            left = Matrix[l2][r1-1];
            }
            if(l1 >= 1){
            up = Matrix[l1-1][r2];
            }
            if(l1 >= 1 && r1 >= 1){
            leftUp = Matrix[l1 - 1][r1 -1];
            }
            ans = sum - up - left + leftUp;
            return ans;
       
        }
        
    
        static void inPlaceSum(int[][] Matrix){
            for (int i = 0; i < Matrix.length; i++) {
                for (int j = 1; j < Matrix[i].length; j++) {
                    Matrix[i][j] += Matrix[i][j-1];
                }
            }
           
        }

        static void inPlaceSum1(int[][] Matrix){
            int r = Matrix.length;
            int c = Matrix[0].length;

            for (int i = 0; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    Matrix[i][j] += Matrix[i][j-1];
                }
            }
            for (int j = 0; j < c; j++) {
                for (int i = 1; i < r; i++) {
                    Matrix[i][j] += Matrix[i-1][j];
                } 
            }
        }

}