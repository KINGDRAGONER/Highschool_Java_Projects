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
public class Employee implements Printable,DepartmentConstants
{
    private int department;
    private String lastName,firstName;
    private double salary;
    public Employee(int dept, String lastN,String firstN,double pay)
    {
    department = dept;
    lastName = lastN;
    firstName = firstN;
    salary =pay;
    }
    public void print()
    {
    System.out.println("name:\t\t"+firstName+""+lastName);
    System.out.println("Salary:\t\t$"+salary);
    
    String dep ="";
    if(department == ADMIN)
        dep ="Administration";
    else if (department== EDITORIAL)
        dep="Editorial";
    else if(department== MARKETING)
        dep ="Marketing";
    
        System.out.println("department:\t"+dep);
    }
}
