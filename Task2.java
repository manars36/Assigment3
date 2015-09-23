import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Task2
{
   public static void main() throws FileNotFoundException
   {
        File file= new File("words.txt");
        Scanner in = new Scanner(file);
        
        String word = in.nextLine();
        String firstWord = word;
        
        int counterWords=0;
        int counterBigger=0;
        
        while(!word.equals("-1"))
        {   
            counterWords++;
            if(word.compareTo(firstWord)>0) counterBigger++;
            System.out.println(counterWords);
            word = in.next();
        }
       
        
        System.out.println("There were " + counterWords + " words in the file");
        System.out.println(counterBigger + " were bigger then first one");
        
        in.close();
   }
}
