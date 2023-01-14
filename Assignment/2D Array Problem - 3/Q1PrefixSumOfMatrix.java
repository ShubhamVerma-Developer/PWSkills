/*Q1 - Given a matrix arr[][] of integers, print the prefix sum matrix for it.
Input1:
n = 3
m = 3
[[1,2,3],[4,5,6],[7,8,9]]
Output1:
[[1,3,6],[5,13,25],[12,33,67]]

Input2:
n = 2
m = 3
[[1,0,1],[0,1,0]]
Output2:
[[1,1,2],[1,3, 5]]
*/


    import java.util.Scanner;

    public class Q1PrefixSumOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];    //7x7 Matrix

        for(int i=0; i<r; i++){                   
            for(int j=0; j<c; j++){
                Matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();



        inPlaceSum(Matrix, r, c);

        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }
        }


        static void inPlaceSum(int[][] Matrix, int r, int c){
            for (int i = 0; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    Matrix[i][j] += Matrix[i][j-1];
                }
            }
            for (int j=0; j < c; j++) {
                for (int i=1; i<r; i++) {
                    Matrix[i][j] += Matrix[i-1][j];
                } 
            }
        }

}


