/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ammad;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author Ammad
 */
public class transaction {
    private int order_id;
    private int customer_id;
    
    public void fetch_transaction() throws SQLException{
         String query="Select * from transaction";
        Statement st=connection.connection.createStatement();
       // ResultSet rs=st.executeQuery(query);
        st.execute(query);
        ResultSet re=st.getResultSet();
                
        if(re!=null){
           while(re.next()){
              System.out.println("Car No for Order: "+re.getString(9));
              System.out.println("Car: "+re.getString(1));
               System.out.println("Price: "+re.getString(2));
               System.out.println("Colour: "+re.getString(3));
               System.out.println("Model: "+re.getString(4));
               System.out.println("engine: "+re.getString(5));
               System.out.println("power: "+re.getString(6));
               System.out.println("priston: "+re.getString(7));
               System.out.println("fuel: "+re.getString(8));
               
           System.out.println("-------------------\n");
    }
    }
    }
     public Boolean addTransaction() throws SQLException{
        
        
        Statement st=connection.connection.createStatement();
        try{
      //  st.executeUpdate("INSERT INTO addTransaction(user_firstname,user_lastname,user_phone,user_address,user_cnic,user_pass) VALUES ('"+this.fname+"','"+this.lname+"','"+this.phone+"',"+this.address+",'"+this.cnic+"','"+this.pass+"')");
       //st.executeUpdate("INSERT INTO user_details(user_firstname,user_lastname,user_phone,user_address,user_cnic,user_pass) VALUES ('Ammad','Baig','3352257370','Naz','234234234','pass123')");
         return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
}
