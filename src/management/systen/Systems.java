/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package management.systen;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author hp
 */
public class Systems {
    Scanner in = new Scanner(System.in);
    Employee emp = new Employee();
    Accessories acc = new Accessories();
    
    ArrayList employeeList = new ArrayList();
    ArrayList accessoryList = new ArrayList();
    
    public boolean addEmployee(String name, String cnic, String email)
    {
        if(emp.setName(name)==true && emp.setEmail(email)==true && emp.setCNIC(cnic)==true)
        {
            employeeList.add(new Employee());
            return true;
        }
        return false;
    }
    
    public boolean removeEmployee(String name, String cnic , String email)
    {
        if(employeeList.indexOf(cnic)!= -1)
        {   
            employeeList.remove(employeeList.indexOf(name));
            employeeList.remove(employeeList.indexOf(cnic));
            employeeList.remove(employeeList.indexOf(email));
            return true;
        }
        return false;
    }
    
     public boolean updateEmployee(String name, String cnic , String email)
    {
        if(employeeList.indexOf(cnic)!= -1)
        {
           String Name = in.nextLine();
            if(emp.setName(Name) ==true)
            {
            employeeList.set(employeeList.indexOf(name),Name);
            }
            String CNic = in.nextLine();
            if(emp.setCNIC(CNic)==true)
            {
            employeeList.set(employeeList.indexOf(cnic),CNic);
            return true;
            }
            String Emails = in.nextLine();
            if(emp.setEmail(Emails)==true)
            {
            employeeList.set(employeeList.indexOf(email),Emails);
            }
            return true;
        }
        return false;
    }
     
      
    public boolean showEmployee(String name, String cnic , String email)
    {
        if(employeeList.indexOf(cnic)!= -1)
        {   
            return true;
        }
     return false;
     
    }
     public boolean addAccessory(String aname, int aCount)
    {
        if(acc.setName(aname)==true && acc.setCount(aCount) )
        {
            accessoryList.add(new Accessories());
            return true;
        }
        return false;
    }
     
      public boolean removeAccessory(String aname, int aCount)
    {
        if(accessoryList.indexOf(aname) != -1)
        {   
            accessoryList.remove(accessoryList.indexOf(aname));
            accessoryList.remove(accessoryList.indexOf(aCount));
            return true;
        }
        return false;
    }
      public boolean updateAccessory(String aname, String aCount)
    {
        if(accessoryList.indexOf(aname)!= -1)
        {   
            accessoryList.remove(accessoryList.indexOf(aname));
            accessoryList.remove(accessoryList.indexOf(aCount));
            
            return true;
        }
        return false;
    }
      
      
    
    
}
