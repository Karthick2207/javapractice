import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
          int b=sc.nextInt();
          if(a>b){
         System.out.printf("%d greater than %d",a,b);
          }
          else if(a<b) {
         System.out.printf("%d less than %d",a,b);
          }
          else if(a==b)
         System.out.printf("%d and %d are equal",a,b);
    }
}    
