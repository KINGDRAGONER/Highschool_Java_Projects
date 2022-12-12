/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymaxremove;



public class Arraymaxremove 
{

//FOR THE TEST
    
    //!!! review ------------------------------
     /*
   static int arr[] = {10, 324, 45, 90, 9808};
      
     // Method to find maximum in arr[]
     static int largest()
     {
         int i;
          
         // Initialize maximum element
         int max = arr[0];
       
         // Traverse array elements from second and
         // compare every element with current max 
         for (i = 1; i < arr.length; i++)
             if (arr[i] > max)
                 max = arr[i];
       
         return max;
     }
    
    --------------------------------------------
    */
    ///REVIEW SHIFTING THE DAMN ZEROS TO THE END
    
    /*
        class PushZero
{
    // Function which pushes all zeros to end of an array.
    static void pushZerosToEnd(int arr[], int n)
    {
        int count = 0;  // Count of non-zero elements
 
        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < n; i++)
            if (arr[i] != 0)
                arr[count++] = arr[i]; // here count is
                                       // incremented
 
        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < n)
            arr[count++] = 0;
    }
 
   ≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠
    public static void main (String[] args)
    {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        pushZerosToEnd(arr, n);
        System.out.println("Array after pushing zeros to the back: ");
        for (int i=0; i<n; i++)
            System.out.print(arr[i]+" ");
    }
}
    */
    /*
    HIGHEST NUMBER RETURNED FROM ARRAY ≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠≠
    
    int highestNum = Integer.MIN_VALUE;
        for(int val : numbers)
        {
        if (val > highestnum)
        {highestNum = val;}
        }
       return  highestNum;
        }

    */
    public static void main(String[] args) 
    {
        
       
        
        
          String str = "0";
        str += str+0+8;
        System.out.println(str);
        
        String [] backpack = {"sword", "gun", "sniper"};
        String [] targets  = {"close human", "mid human","far human"};
        int numstarg[] = {1,2,5,8,9,113,43,353,21};
        System.out.println(backpack[0]+"\t"+targets[0]);
        
         System.out.println(numstarg[0]);
        // array locations are from the num placed inside [].
        /////////////////////////
        // ex for with loop array
        int[] ar = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int x;
        for (int i : ar) {
  
            // accessing each element of array
            x = i;
            System.out.print(x + " ");}
        ///////////////////////////////////////////
        //SWAPPING ELEMENTS EX)
        int[] numbers = {4,1,8,3,5};
        int src= 0;
        int dest =1;
        int temp = numbers[src]; // numbers [0]
         numbers[0]= numbers[1]; //numbers [0] is now 1
        numbers[1] = temp;
        for( int pos =0; pos< numbers.length; pos++)
        {
         System.out.println(numbers[pos] +" ");
         
         
        
        }
    }
    
    
    
}
