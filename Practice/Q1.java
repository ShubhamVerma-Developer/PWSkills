import java.util.ArrayList;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < N; i++)
       {
        int square = arr[i] * arr[i];
        for (int j = 0; j < N; j++)
        {
            if (arr[j] == square)
            {
               System.out.println(arr[i]+" "); 
            }
        }
    }
}
}

    
    

