
package dicegameprogram;
import java.util.Scanner;
/**
 *
 * @author kmunir
 */

public class InputNumbers { 
    private Scanner kb;
  
    
public InputNumbers()
{
kb = new Scanner(System.in);
    
    
}
 public int getNum()
  {
   
    
    System.out.println("Enter a number from 1-10 ");
    int guess = kb.nextInt();
    
    return guess; 
  }
}