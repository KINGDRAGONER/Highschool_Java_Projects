/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exploringstringmethods;

/**
 *
 * @author kmunir
 */
public class GateKeeper {
    private String password = "password",user;
    
    public GateKeeper(String p)
    {
    user =p;
    }
    public void checkPassword()
    {
    if(password.equals(user))
    System.out.println("YOU SHALL PASS");
    else 
System.out.println("nerd");
}
    

    
}
