/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magicsquares;

/**
 *
 * @author kmunir
 */
public class MagicSquares {

  public static  int[] sumOfEachRow(int[][] square)
    {
        int[] rowS = new int [square.length];
        for(int i=0; i< square [0].length;i++)
        {int sum=0;
        for (int a=0;a<square[0].length;a++)
        {
        sum +=square[i][a];
        }
        rowS[i]= sum;
        }
    return rowS;
    }
 
   static int[] getColumn(int[][] square,int c)
   {
   int[] col = new int [square.length];
        for(int i2=0; i2< square.length;i2++)
        {
            col[i2] = square[i2][c];
        
        }
    return col;
   
   }
static   int[] sumOfEachColumn(int[][] square)
   {
   int[] cSum =new int [square[0].length];
   int[] col = new int [square[0].length];
  
   for(int i=0; i<square[0].length;i++)
   { int sum =0;
   col =getColumn(square,i);
  
        for (int a=0;a<square[0].length;a++)
        {
        sum +=col[a];
        }
        cSum[i]= sum;
   }
   return cSum;
   }
   
   static int sumOfDescendingDiagonal(int[][] square)
   {
   int sum =0;
        for(int a=0; a<square.length;a++)
        {
        sum += square[a][a];
        }
        return sum;
   }
   
   static int sumOfAscendingDiagonal(int[][] square)
   {
   int r=square.length-1;
   int cl=0;
   int sum =0;
   while (r>=0)
   {
   sum += square[r][cl];
   cl++;
   r--;
           }
   return sum;
   }
   
   static boolean isMagicSquare(int[] rowSum, int[] colSum, int ascendingDiagonal, int descendingDiagonal)
   {
       int c =0;
   int size = rowSum.length+colSum.length+2;
   int[] fsum = new int [size];
   boolean magicsquare = false;
   for(int a2: rowSum)
   {
   fsum[c] =a2;
          c++; 
   }
   fsum[c]=ascendingDiagonal;
   fsum[c+1]=descendingDiagonal;
   
   System.out.println("\n sums");
   for(int a2: fsum )
    {
        System.out.print(a2+" ");
        System.out.println();
        
    }
   for(int i=0; i<fsum.length-1;i++)
   {
   if(fsum[c]==fsum[c+1])
   {magicsquare =true;}
   else
   {
   magicsquare= false;
   break;
   }
   }
   return magicsquare;
   }
   
    public static void main(String[] args)
    {
        int [][] square ={{7,1,4,6},{2,8,5,3},{5,3,2,8},{4,6,7,1}};
        int[] rowS = sumOfEachRow(square);
       
        System.out.println("sum rows");
    
        for(int a:rowS)
        {System.out.print(a+" ");
        System.out.println();}
        
    
    int[] colS =sumOfEachColumn(square);
        System.out.println("sum col");
        for(int a:colS)
        {System.out.print(a+" ");
        System.out.println();}
        
        int sumdes = sumOfDescendingDiagonal(square);
        int sumac = sumOfAscendingDiagonal(square);
        
        System.out.print("Sum decending: "+ sumdes);
        System.out.print("Sum acending: "+ sumac);
        
        boolean magicsquares = isMagicSquare(rowS,colS,sumac,sumdes);
        System.out.println("Magic Square: "+ magicsquares);
    }

}