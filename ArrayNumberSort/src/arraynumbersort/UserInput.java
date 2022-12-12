/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumbersort;
import java.util.Scanner;
/**
 *
 * @author kmunir
 */
public class UserInput 
{
    private Scanner kb;
    private int nums[];
    private int amount;
    public UserInput()
    
    {
    kb = new Scanner(System.in);
    System.out.println("how many numbers do you want?");
    amount = kb.nextInt();
    nums = new int[amount];
    
    }
    public int[] getNums()
    {
    for(int counter =0; counter < nums.length; counter++)
    {
    System.out.println("please enter a number");
    nums[counter]=kb.nextInt();
    }
    return nums;
    }
    
}
