/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabeticalorder;

/**
 *
 * @author kmunir
 */
public class AlphabeticalOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String n1 ="Troy";
        String n2 = "Jonathan";
        String n3 = "Christain";
        String temp = "";
        int comp = n1.compareToIgnoreCase(n2);
        
        System.out.println("comp: "+ comp);
        if(n1.compareToIgnoreCase(n2)>0)
        {
        temp = n1;
        n1= n2;
        n2 =temp;
        }
        if (n1.compareToIgnoreCase(n3)>0)
        {
        temp = n1;
        n1= n3;
        n3 =temp;
        
        }
        if(n2.compareToIgnoreCase(n3)>0)
        {
        temp = n2;
        n2=n3;
        n3 =temp;
        
        }
        System.out.println("In Order; "+ n1+" "+n2+" "+n3);
    }
    
}
 