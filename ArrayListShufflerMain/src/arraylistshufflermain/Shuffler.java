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
//allways make a coppy and mondify it never destroy

public class Shuffler 
{
    private ArrayList<String> words,shuffled;
    
    public Shuffler(ArrayList<String> w)
    {
    
        words = w;
    shuffled = new ArrayList<>();
    }
    //allways have to declare what it has to return
    public ArrayList<String> randomize()
    {
        //randomally pick 5 of the words and make a sentence out of them
        //withought repeat
        int random =0;
        
        
        
        for(int c = 0; c<2; c++)
        {
        random = (int)(Math.random() * words.size());
        
        shuffled.add(words.get(random));
        words.remove(random);
        }
    return shuffled;
    
    }
    
}
