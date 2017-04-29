/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeInfo;

import Vehicle_Info.Vehicle;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import ooad_project.conn;

/**
 *
 * @author Muhammad zahid
 */
public class Employee 
{ 
    
    ArrayList<EmployeeInfo> list;
    Connection con;
    ResultSet se;
    CallableStatement storedprocedure;
    public void Add(String employeename,String employeeType,String CNIC,String phone,String Address) throws SQLException, ClassNotFoundException
    {
        con = conn.connn();
        storedprocedure = con.prepareCall("{call AddEmployee (? , ? , ? , ? , ?)}");
        storedprocedure.setString(1, employeename);
        storedprocedure.setString(2,employeeType );
        storedprocedure.setString(3,CNIC );
        storedprocedure.setString(4,phone );
        storedprocedure.setString(5,Address );
        storedprocedure.executeUpdate();
                
    }    
        public void deleteemployee(int id) throws SQLException, ClassNotFoundException
    {
           con = conn.connn();
           storedprocedure = con.prepareCall("{call deleteEmployee (?)}");
           storedprocedure.setInt(1, id);
           storedprocedure.executeUpdate();
    }
     public void show() throws SQLException, ClassNotFoundException
    {
       System.out.println("====================");  
       list = new ArrayList<EmployeeInfo>();
       con = conn.connn();
       storedprocedure = con.prepareCall("{call showemployee  ()}");
       se = storedprocedure.executeQuery();
       while (se.next())
       {
           EmployeeInfo v = new EmployeeInfo(se.getInt(1),se.getString(2),se.getString(3),se.getString(4),se.getString(5),se.getString(6));
           list.add(v);
       }        
        for (int i = 0; i <list.size() ; i++) {               
            System.out.println("ID :"+list.get(i).ID);
            System.out.println("EmployeeName :"+list.get(i).employeename);
            System.out.println("EmployeeType :"+list.get(i).employeeType);
            System.out.println("Phone :"+list.get(i).phone);
            System.out.println("CNIC :"+list.get(i).CNIC);
            System.out.println("Address :"+list.get(i).Address);
            System.out.println("====================");
        }
    }
         public void update(int a) throws SQLException, ClassNotFoundException
      {
        
     
        list = new ArrayList<EmployeeInfo>();
        con = conn.connn();
        storedprocedure = con.prepareCall("{call getbyidemployee(?)}");
        storedprocedure.setInt(1, a);
        se = storedprocedure.executeQuery();
         while (se.next())
         {
           EmployeeInfo v = new EmployeeInfo(se.getInt(1),se.getString(2),se.getString(3),se.getString(4),se.getString(5),se.getString(6));
           list.add(v);
         } 
          for (int i = 0; i <list.size() ; i++) {               
            System.out.println("ID :"+list.get(i).ID);
            System.out.println("EmployeeName :"+list.get(i).employeename);
            System.out.println("EmployeeType :"+list.get(i).employeeType);
            System.out.println("Phone :"+list.get(i).phone);
            System.out.println("CNIC :"+list.get(i).CNIC);
            System.out.println("Address :"+list.get(i).Address);
            System.out.println("====================");
        }
            
    }
         public void nameupdate(int res,String name) throws SQLException, ClassNotFoundException
       { 
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updateemployee (?,? ,?,?,?,?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, name);
        storedprocedure.setString(3, list.get(0).employeeType);
        storedprocedure.setString(4, list.get(0).CNIC);
        storedprocedure.setString(5, list.get(0).phone);
        storedprocedure.setString(6, list.get(0).Address);
        storedprocedure.executeUpdate();
      }
           public void typeupdate(int res,String type) throws SQLException, ClassNotFoundException
       { 
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updateemployee (?,? ,?,?,?,?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).employeename);
        storedprocedure.setString(3, type);
        storedprocedure.setString(4, list.get(0).CNIC);
        storedprocedure.setString(5, list.get(0).phone);
        storedprocedure.setString(6, list.get(0).Address);
        storedprocedure.executeUpdate();
      }
       public void cnicupdate(int res,String cnic) throws SQLException, ClassNotFoundException
       { 
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updateemployee (?,? ,?,?,?,?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).employeename);
        storedprocedure.setString(3, list.get(0).employeeType);
        storedprocedure.setString(4, cnic);
        storedprocedure.setString(5, list.get(0).phone);
        storedprocedure.setString(6, list.get(0).Address);
        storedprocedure.executeUpdate();
      }
         public void phoneupdate(int res,String phone) throws SQLException, ClassNotFoundException
       { 
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updateemployee (?,? ,?,?,?,?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).employeename);
        storedprocedure.setString(3, list.get(0).employeeType);
        storedprocedure.setString(4, list.get(0).CNIC);
        storedprocedure.setString(5, phone);
        storedprocedure.setString(6, list.get(0).Address);
        storedprocedure.executeUpdate();
      }
         public void addressupdate(int res,String address) throws SQLException, ClassNotFoundException
       { 
        con = conn.connn();
        storedprocedure = con.prepareCall("{call updateemployee (?,? ,?,?,?,?)}");
        storedprocedure.setInt(1, res);
        storedprocedure.setString(2, list.get(0).employeename);
        storedprocedure.setString(3, list.get(0).employeeType);
        storedprocedure.setString(4, list.get(0).CNIC);
        storedprocedure.setString(5, list.get(0).phone);
        storedprocedure.setString(6, address);
        storedprocedure.executeUpdate();
      }  
        
        
    
}
