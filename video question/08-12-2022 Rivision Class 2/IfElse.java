import java.util.Scanner;

class IfElse{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+" is largest Among three");
            }
            else{
                System.out.println(c+" is largest among three");
            }
        }
        else{
            if(b>c){
                System.out.println(b+" is largest among three");
            }
            else{
                System.out.println(c+" is largest among three");
            }
        }
    }
}