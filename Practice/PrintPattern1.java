public class PrintPattern1 {
    public static void main(String[] args) {
       int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                if(j>n){
                    j = 1;
                }
                System.out.print(j+" ");
               
            }
        
            System.out.println();
        }
    }
}
