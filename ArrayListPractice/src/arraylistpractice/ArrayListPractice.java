/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpractice;

import java.util.ArrayList;
public class ArrayListPractice {
    public static void main(String[] args) {
      ArrayList<Integer> nums = new ArrayList<Integer>();
    
    for(int c = 0; c < 10; c++)
      nums.add(c); // add inserts an object at teh end of the list.
    // ArrayList ahve its own toString and can be printed without a loop
    System.out.println(nums + " original nums");
    
    /* to make a comy of an array, this is the syntax. ArrayList<Integer> nums2 = nums 
       makes a second access point to nums and not an entirely new ArrayList, any change 
       in nums2 is also made in nums :(
     */
    ArrayList<Integer> nums2 = new ArrayList<Integer>(nums);
    nums2.remove(3); //this removes the object in location 3
    System.out.println(nums2 + " nums2 after removing object at location 3");
    /*this removes all the even numbers in nums2, do not use int n = nums2.size() if you are removing objects
      just use nums2.size() as the limit
    */
    for(int c = 0; c < nums2.size(); c++)
    {
      int test = nums2.get(c);
        if(test % 2 == 0)
        {
           nums2.remove(c); 
           c--;
          //when you remove an item, make the conter go back 1 time as well if going in increasing order
        }
         
    }
    
    System.out.println(nums2 + " nums2 after removing even #s");
    
    
    nums2.add(2,24);
    System.out.println(nums2 + " this adds 24 in location 2 and moves the other objects over");
    
    nums2.set(0,19);
    System.out.println(nums2 + " this replaces the object in location zero with 19");
     // after creating teh two ArrayList separately, now you can do this syntax. 
    	nums2 = nums;
    	System.out.println(nums2 + " copying nums to nums 2");
    
    // this is  a better way of removing objects without worrying about both size and location adjustments
    for(int c = nums2.size() - 1; c >= 0; c--)
      if(nums2.get(c) % 2 == 0)
        nums2.remove(c); 
    
    System.out.println(nums2 + " this is removing even numbers going from highest to lowest spot");
   
    //when you remove and item make the corner go back to
    }
}
