import java.util.Scanner;

public class Task3
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter an integer: ");
        int number = in.nextInt();
        
        for(int i = 0; i < number; i++)
        {
            for(int j = 0; j<number-i-1; j++) System.out.print(" ");
            
            for(int j = 0; j<2*i+1; j++) System.out.print("*");
            
            System.out.println();

        }
        
        for(int i = number - 2; i >= 0; i--)
        {
            for(int j = number-i-1; j > 0; j--) System.out.print(" ");
            
            for(int j = 2*i+1; j > 0; j--) System.out.print("*");
            
            System.out.println();
        }
    }
}
