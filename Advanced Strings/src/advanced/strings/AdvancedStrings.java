/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package advanced.strings;

/**
 *
 * @author kmunir
 */
public class AdvancedStrings {

 
    public static void main(String[] args) {
        //printf is a modified method that lets you format varibles at the same time
      /*  int month =9, day=28,year =2020;
        double price =1.2893;
        String m= "September";
        
        System.out.printf("\n%02d/%02d/%d/n",month,day,year);
        System.out.printf("Price = $%.2f",price);
        
        System.out.printf("\n%S", m); */
      // " " is for string and ' ' is for char
        char g = '1';
        boolean result = Character.isDigit(g);
        System.out.println(result);
        
        NumberOfDidgits n = new NumberOfDidgits("I rolled a natural 20 and 2020 is a natural 1");
        int digits = n.countNumberOfDidgits();
        
        System.out.println("The number of digits is:"+digits);
        
    }
    
}
