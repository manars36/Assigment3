import java.util.Random;

public class Task5
{
    public static void main()
    {
        Random coin = new Random();

        
        int result1, result2, iterations;
        int penny=0, amy=0, bernie=0;
        
        for(int i = 0; i <300; i++)
        {
            result1 = coin.nextInt(2);
            result2 = coin.nextInt(2);
            iterations = 2;
            
            System.out.print(result1);
            System.out.print(result2);
            
            while(result1!=result2)
            {
                iterations++;
                result1=result2;
                result2 = coin.nextInt(2);
                System.out.print(result2);
            }
            
            if(iterations%2==1){
                System.out.println(" Bernie wins");
                bernie++;
            }
            else if(result2==0){
                System.out.println(" Amy wins");
                amy++;
            }
            else{
                System.out.println(" Penny wins");
                penny++;
            }
        }
        
        System.out.println("Amy wins " + amy + " times");
        System.out.println("Penny wins " + penny + " times");
        System.out.println("Bernie wins " + bernie + " times");
    }
}
