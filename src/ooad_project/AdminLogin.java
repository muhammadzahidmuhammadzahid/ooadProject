/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_project;

/**
 *
 * @author Muhammad zahid
 */
public class AdminLogin {
    
    public boolean Admin_Login(String UserName,String Password)
    {
        Admin A = new Admin();
        A.setUserName(UserName);
        A.setPassword(Password);
        String U_N =  A.getUserName();
        String Pass =  A.getPassword();
        if (U_N.equals("admin") && Pass.equals("admin")) {
            return true;
        }
        else{
          return false;
        }
        
      
    }
    
}
