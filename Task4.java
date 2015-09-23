import java.util.Scanner;

public class Task4
{
    public static void main()
    {
        Scanner in = new Scanner(System.in);
       
        System.out.println("Please enter a string: ");
        String word = in.nextLine();
        
        for(int i = 0; i <= word.length()/2+1; i++)
        {
            for(int j = 0; j+i < word.length(); j++)
            {
                System.out.println(word.substring(j,j+i+1));
            }
        }
    }
}
