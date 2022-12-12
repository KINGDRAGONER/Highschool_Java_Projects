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
public class Die {/*this class should randomly generate an int number from 1 to 10 (inclusive) 
    and return the int value to the main so you can send it to "Compare"
  */
    
    private int  number;

    
    
    public  int grn ()
    {
        
        
    int counter =0;
    
    while(counter < 1 )
    {
      number = (int)(Math.random()*10+1);
     counter++; // counter = counter +1;
        
        
       
  
        
    }
        return number;


}
    
}
