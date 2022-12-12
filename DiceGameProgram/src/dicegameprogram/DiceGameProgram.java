/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dicegameprogram;

/**
 *
 * @author kmunir
 */
public class DiceGameProgram {

     
    
    public static void main(String[] args) {
       InputNumbers in= new InputNumbers();
       int guess = in.getNum();
   Die d = new Die();
   int random = d.grn();
   Compare c = new Compare(guess,random);
   boolean math = c.compareNum();
   if(math == true)
    { 
    System.out.println("You guessed the number right!");
    }
     else
    {
     System.out.println("The number was " + random + "\n ,try again ");
    }
        
//int counter =0;
        //your program should ask the user for a number from 1 to 10
        // your program should randomly generate a number from 1 to 10
        //your program must compare the user with the number you generated
        //if the guess and the random are the same - tell the user "you guessed right"
        //else "your guess is wrong"
        
        //classes -inputNumbers,Die(randomly generate number), Compare
       // while(counter < 10 )
            
        {
            //int num = (int)(Math.random()*10+1);
        //(int) is casting it changes the double to a integer
       // System.out.println("Random number "+ num);
       // counter++; // counter = counter +1;
        //System.out.println("counter= "+ counter);
        }
        
        
        
        
        
        // six sided dice
        
        
    }
    
}
