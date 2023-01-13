import java.util.Scanner;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

      diagonalSum(mat,n);
    }

    static void diagonalSum(int[][] mat, int n){
        int sum1 = 0;
        int sum2 = 0;

        
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
	
			
				if (i == j)
					sum1 += mat[i][j];
	
				if ((i + j) == (n - 1))
					sum2 += mat[i][j];
			}
		
        }
       System.out.println(sum1 +" "+ sum2);
    }
    
}
