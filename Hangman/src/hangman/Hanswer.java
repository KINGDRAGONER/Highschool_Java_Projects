/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman;

/**
 *
 * @author kmunir
 */
public class Hanswer {
     private String answer;
    private StringBuffer partiallyFilled;
    private StringBuffer lettersTried;
    
    public Hanswer(String word)
    {
        answer = word;
        int x = word.length();
        StringBuffer partiallyFilled = new StringBuffer(10);
        for(int i = 0; i<word.length(); i++)
            partiallyFilled.append("-");
        StringBuffer lettersTried = new StringBuffer(10);
        lettersTried.append("");
    }
    
    String getWord()
    {
        return answer;
    }
    
    String getGuessed()
    {
        return partiallyFilled.toString();
    }
    
    String getTried()
    {
        return lettersTried.toString();
    }
    
    int tryLetter(char letter)
    {
        for(int i=0; i<answer.length();i++)
        {
            if(answer.charAt(i)==letter)
            {
                partiallyFilled.setCharAt(i, letter);
                lettersTried.append(letter);
                
            }
        }
         return 1;
    }
}
