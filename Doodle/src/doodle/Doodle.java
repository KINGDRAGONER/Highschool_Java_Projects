/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doodle;

/**
 *
 * @author kmunir
 */
import java.util.Scanner;
public class Doodle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
       System.out.println("what day of the week is it today?");
        String day = kb. nextLine();
        
        System.out.println("Today is " + day);
        
        System.out.println("What day of the month is it?");
        
        int dayofmonth = kb.nextInt();
        System.out.println("today is "+ day + " \n the day number is "+
                dayofmonth);
        
    }
    
}
