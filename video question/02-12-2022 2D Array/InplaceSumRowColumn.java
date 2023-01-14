import java.util.Scanner;

public class InplaceSumRowColumn {
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
