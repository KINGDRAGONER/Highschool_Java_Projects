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
public class SortArray {
    private int nums[];
  
  public SortArray(int[] n)
  {
    nums = n;
  }
  
  public int[] sortIt()
  {
    int temp = 0;
    for(int c1 = 0; c1 < nums.length; c1++)
    {
      
      for(int c2 = c1 + 1; c2 < nums.length; c2++)
      {
        System.out.println("In sort: " + nums[c1] + " " + nums[c2]);
        if(nums[c1] > nums[c2])
        {
          temp = nums[c1];
          nums[c1] = nums[c2];
          nums[c2] = temp;
        }
      }
    }
    
    
    
    return nums;
  }
  
  
}