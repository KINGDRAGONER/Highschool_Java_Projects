/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploringstringmethods;
import java.util.Scanner;
/**
 *
 * @author kmunir
 */
public class UserInput {
    private Scanner kb;
    public UserInput()
    {
    kb= new Scanner(System.in);

    }
    public String getPassword()
    {
    System.out.println("Whats the password?");
    String pw = kb.nextLine();
    return pw;
    }
    
}
