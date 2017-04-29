/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle_Info;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import static javax.swing.UIManager.getString;
import ooad_project.conn;

/**
 *
 * @author Muhammad zahid
 */
public class Vehicle_Manipulation {
    
    ArrayList<Vehicle> list;
    Connection con;
    ResultSet se;
    CallableStatement storedprocedure;
    
    
    public Vehicle_Manipulation()
    {
         list = new ArrayList<Vehicle>();
    }
    public void add(String name , String type , String price , String colour , String model , String enginename , String power,String priston,String fuel) throws SQLException, ClassNotFoundException
    {
        con = conn.connn();
        storedprocedure = con.prepareCall("{call Addvehicle (? , ? , ? , ? , ? , ? , ? , ? , ?)}");
        storedprocedure.setString(1, name);
        storedprocedure.setString(2, type);
        storedprocedure.setString(3, price);
        storedprocedure.setString(4, colour);
        storedprocedure.setString(5, model);
        storedprocedure.setString(6, enginename);
        storedprocedure.setString(7, power);
        storedprocedure.setString(8, priston);
        storedprocedure.setString(9, fuel);
        storedprocedure.executeUpdate();
    }
    public void show() throws SQLException, ClassNotFoundException
    {
       System.out.println("====================");  
       list = new ArrayList<Vehicle>();
       con = conn.connn();
       storedprocedure = con.prepareCall("{call selectall ()}");
       se = storedprocedure.executeQuery();
       while (se.next())
       {
           Vehicle v = new Vehicle(se.getInt(1),se.getString(2),se.getString(3),se.getString(4),se.getString(5),se.getString(6),se.getString(7),se.getString(8),se.getString(9),se.getString(10));
           list.add(v);
       }        
       
        for (int i = 0; i <list.size() ; i++) {
                        
            System.out.println("ID :"+list.get(i).vi.ID);
            System.out.println("Name :"+list.get(i).vi.name);
            System.out.println("Type :"+list.get(i).vi.vehicletype);
            System.out.println("Price :"+list.get(i).vi.price);
            System.out.println("Colour :"+list.get(i).vi.vehiclecolour);
            System.out.println("Model :"+list.get(i).vi.Model);
            System.out.println("Engine :"+list.get(i).ve.enginename);
            System.out.println("Power :"+list.get(i).ve.power);
            System.out.println("Priston :"+list.get(i).ve.priston);
            System.out.println("Fuel :"+list.get(i).ve.fuel); 
            System.out.println("====================");
        }
       
    }
    public void update(int a) throws SQLException, ClassNotFoundException
    {
        
     
        list = new ArrayList<Vehicle>();
        con = conn.connn();
        storedprocedure = con.prepareCall("{call getbyid(?)}");
        storedprocedure.setInt(1, a);
        se = storedprocedure.executeQuery();
        
         while (se.next())
         {
           Vehicle v = new Vehicle(se.getInt(1),se.getString(2),se.getString(3),se.getString(4),se.getString(5),se.getString(6),se.getString(7),se.getString(8),se.getString(9),se.getString(10));
           list.add(v);
         } 
          for (int i = 0; i <list.size() ; i++) {   
            System.out.println("ID :"+list.get(i).vi.ID);
            System.out.println("Name :"+list.get(i).vi.name);
            System.out.println("Type :"+list.get(i).vi.vehicletype);
            System.out.println("Price :"+list.get(i).vi.price);
            System.out.println("Colour :"+list.get(i).vi.vehiclecolour);
            System.out.println("Model :"+list.get(i).vi.Model);
            System.out.println("Engine :"+list.get(i).ve.enginename);
            System.out.println("Power :"+list.get(i).ve.power);
            System.out.println("Priston :"+list.get(i).ve.priston);
            System.out.println("Fuel :"+list.get(i).ve.fuel); 
            System.out.println("===================="); 
        }
            
    }   
    public void nameupdate(int res,String name) throws SQLException, ClassNotFoundException
    { 
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model);
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
    }
     public void typeupdate(int res,String type) throws SQLException, ClassNotFoundException
     {
        con = conn.connn();
    storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
    storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, type);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model);
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
     }
      public void priceupdate(int res,String price) throws SQLException, ClassNotFoundException
      {
            con = conn.connn();
        storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model);
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
      }
     public void colourupdate(int res,String colour) throws SQLException, ClassNotFoundException
    {
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, colour);
        storedprocedure.setString(6, list.get(0).vi.Model);
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
    }
      public void modelupdate(int res,String model) throws SQLException, ClassNotFoundException
      {
       con = conn.connn();
       storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
       storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, model);
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
      }
       public void enginenameupdate(int res,String enginename) throws SQLException, ClassNotFoundException
      {
        con = conn.connn();
       storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
       storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model );
        storedprocedure.setString(7, enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
      }
       public void powerupdate(int res,String power) throws SQLException, ClassNotFoundException
      {
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model );
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
      }
         public void pristonupdate(int res,String priston) throws SQLException, ClassNotFoundException
      {
        con = conn.connn();
       storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
       storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model );
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, priston);
        storedprocedure.setString(10, list.get(0).ve.fuel);
        storedprocedure.executeUpdate();
      }
            public void fuelupdate(int res,String fuel) throws SQLException, ClassNotFoundException
      {
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updatevehicle (?,? , ? , ? , ? , ? , ? , ? , ? , ?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).vi.name);
        storedprocedure.setString(3, list.get(0).vi.vehicletype);
        storedprocedure.setString(4, list.get(0).vi.price);
        storedprocedure.setString(5, list.get(0).vi.vehiclecolour);
        storedprocedure.setString(6, list.get(0).vi.Model );
        storedprocedure.setString(7, list.get(0).ve.enginename);
        storedprocedure.setString(8, list.get(0).ve.power);
        storedprocedure.setString(9, list.get(0).ve.priston);
        storedprocedure.setString(10, fuel);
        storedprocedure.executeUpdate();
      }
            public void deletevehicle(int id) throws SQLException, ClassNotFoundException
            {
           con = conn.connn();
           storedprocedure = con.prepareCall("{call deletevehicle (?)}");
           storedprocedure.setInt(1, id);
           storedprocedure.executeUpdate();
            }
            
    
    
    
    
    
    
}
