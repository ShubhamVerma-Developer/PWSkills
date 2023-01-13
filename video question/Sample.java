
import java.util.*;
public  class Sample
{
int array[][] = new int[10][10]; 
int sum =0;
int i , j ;
 void func()
{
Scanner sc = new Scanner(System.in);
for(i=0;i<10;i++)
{
for(j=0;j<10;j++)
{
array[i][j]= sc.nextInt();
}
}

for(i=0;i<10;i++)
{
sum=sum+array[i][i];
}
System.out.println(sum);
}


  public static void main (String []argus)
{
Sample obj = new Sample();
obj.func(); 

}
}