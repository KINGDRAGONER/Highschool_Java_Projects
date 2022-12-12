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
public class ExploringStringMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       UserInput ui = new UserInput();
       String user = ui.getPassword();
       GateKeeper gk = new GateKeeper(user);
       gk.checkPassword();
    }
    
}
