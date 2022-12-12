/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraynumbersort;

/**
 *
 * @author kmunir
 */
public class ArrayNumberSort {
public static void main(String[] args) 
  {
    
    UserInput ui = new UserInput();
    int nums[] = ui.getNums();
    
    for(int n : nums) //for each
    {
      System.out.println("The numbers are: \n" + n);
    }
    
    SortArray sa = new SortArray(nums);
    int numSort[] = sa.sortIt();
    
    System.out.println("The sorted array is");
     for(int n : numSort) //for each
    {
      System.out.print(n + " ");
    }
   
      
      
    
  }
}
