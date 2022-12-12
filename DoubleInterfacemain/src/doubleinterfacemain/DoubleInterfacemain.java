/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doubleinterfacemain;

/**
 *
 * @author kmunir
 */
public class DoubleInterfacemain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //int dep,string lastN, String FirstN, Double sallary
        Printable p = new Employee(1,"Ethan","Fulton",13.5);
        p.print();
    }
    
}
