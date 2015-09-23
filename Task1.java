import java.util.Scanner;

public class Task1
{
   public static void main()
   {
       Scanner in = new Scanner(System.in);
       
       System.out.println("Please enter an integer:");
       int number = in.nextInt();
       
       int factorial = 1;
       
       for(int i=2;i<=number;i++)
       {
           factorial = factorial*i;
       }
       
       System.out.println(factorial);
   }
}
