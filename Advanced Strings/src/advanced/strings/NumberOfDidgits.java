/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package advanced.strings;


public class NumberOfDidgits {
    private String message = " I rolled a natural 20 and 2020 is a natural 1";
    
    public NumberOfDidgits(String m)
    {
    message = m;
    }
    public int  countNumberOfDidgits()
    {
        // buffer still wack but go back to the edit anology 
        StringBuffer s = new StringBuffer("Test for Test"); 
        
        // delete is used to well delete positions 
        s.delete(5,8);
      int wow =  s.length();
    
        System.out.println( s +" the length is " + wow);
    int size = message.length();
    System.out.println("length is:"+ size);
    //size 01 becuase positions of letters start from zero and end at 1 less than length
    boolean isDigit = false;
    int noOfDigits= 0;
    for(int counter =0; counter < size; counter++)
    {
    isDigit = Character.isDigit(message.charAt(counter));
    if (isDigit)
        noOfDigits++;
    }
    return noOfDigits;
    }
}
