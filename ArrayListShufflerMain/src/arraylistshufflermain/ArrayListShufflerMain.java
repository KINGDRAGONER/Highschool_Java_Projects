/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistshufflermain;

import java.util.ArrayList;

/**
 *
 * @author kmunir
 */
public class ArrayListShufflerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<String>();
        words.add("Tokay");
        words.add("School");
        words.add("High");
        words.add("Laptop");
        words.add("and");
        words.add("Bruise");
        words.add("is");
        words.add("the");
       
        Shuffler s = new Shuffler(words);
         ArrayList<String> ranWords = new ArrayList<>();
         ranWords = s.randomize();
         
         System.out.println(ranWords);
        
    }
    
}
