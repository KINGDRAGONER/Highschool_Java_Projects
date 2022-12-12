/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrays;

/**
 *
 * @author kmunir
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int row2 = 10, col2 =10;
        // tow demensional array with 100 rows and and 100 colums
        String[][] info = new  String[row2][col2];
        //this is an "empty" 10x10 array of string, default value null.
        
        int [][] bingo =
        {  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,0},
           {16,17,18,19,20,21,22,23,24,25,26,27,28,29,30},
           {31,32,33,34,35,36,37,38,39,40,41,42,43,44,45},
           {46,47,48,49,50,51,52,53,54,55,56,57,58,59,60},
           {61,62,63,64,65,66,67,68,69,70,71,72,73,74,75} };
        System.out.println(bingo[0][15]);
        
        
        //----------------------LooK HERE-------------------------------••••••••
        int [][] bingo2 = new int [5][15];
        int num =1;
        
        for(int row = 0; row<5; row++)
        {
            for(int col = 0; col<15; col++)
            {
            bingo2[row][col]=num;
            num++;
            
            }
        }
        for(int row =0; row< 5; row++)
        {
       for(int col =0; col< 15; col++)
           
       {  
           System.out.print(bingo2[row][col]+ "\t");
       }
       System.out.println();
        }
        
        String word ="Ambition";
    String sub = word.substring(2,7);
    System.out.println(sub);
    }
    
    
}
