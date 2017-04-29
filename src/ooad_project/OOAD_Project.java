/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_project;


import Ammad.cars_data;
import Ammad.clearcon;
import Ammad.connection;
import Ammad.customer;
import EmployeeInfo.Employee;
import Vehicle_Info.Vehicle_Manipulation;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Muhammad zahid
 */
public class OOAD_Project {

    /**
     * @param args the command line arguments
     */
       public static void main(String[] args) throws IOException, InterruptedException, AWTException, SQLException, ClassNotFoundException {    
       Vehicle_Manipulation v = new Vehicle_Manipulation();
       Employee e = new Employee();
       Scanner input = new Scanner(System.in);
       
       System.out.println("1.Login as Admin");
       System.out.println("2.Login as Customer");
       int check = input.nextInt();
           if (check == 1) {
               AdminLogin A_L = new AdminLogin(); 
       System.out.print("Enter UserNAme :");
       String username = input.next();
       System.out.print("Enter Password :");
       String password = input.next();
       
           boolean validation = A_L.Admin_Login(username,password);   
           if (validation == true) {
           System.out.println("Login Successfully");
            
           while(true){
            
            DashBoard_Info d = new DashBoard_Info();
            d.Show();
            int a = input.nextInt();
            if (a==1) {
                System.out.println("1. Add Vehicle");
                System.out.println("2. Update Vehicle ");
                System.out.println("3. Delete Vehicle");
                System.out.println("4. View Vehicle");
                int b = input.nextInt();
                if (b==1) {
        System.out.print("Enter Vehicle Name :");
        String namee = input.next();
        System.out.print("Enter Vehicle Type :");
        String type = input.next();
        System.out.print("Enter Vehicle Price :");
        String price = input.next();
        System.out.print("Enter Vehicle colour :");
        String colour = input.next();
        System.out.print("Enter Vehicle Model :");
        String model = input.next();
        
        System.out.print("Enter Vehicle Engine Name :");
        String enginename = input.next();
        System.out.print("Enter engine power :");
        String power = input.next();
        System.out.print("Enter Vehicle priston :");
        String priston = input.next();
        System.out.print("Enter Vehicle fuel :");
        String fuel = input.next();
        
       // Addvehicle v = new Addvehicle();
        v.add(namee, type, price, colour, model, enginename, power, priston, fuel);
        System.out.println("Vehicle Added Successfully");
        //v.show();
              }
                else if(b==2)
                {
                     System.out.println("Enter ID of Vehicle for update data");
                     int res = input.nextInt();
                     v.update(res);
                     System.out.println("1. Enter Vehicle Name for update");
                     System.out.println("2. Enter Vehicle Type for update");
                     System.out.println("3. Enter Vehicle Price for update");
                     System.out.println("4. Enter Vehicle Colour for update");
                     System.out.println("5. Enter Vehicle Model for update");
                     System.out.println("6. Enter Vehicle Engine Name for update");
                     System.out.println("7. Enter Engine Power for update");
                     System.out.println("8. Enter Vehicle Priston for update");
                     System.out.println("9. Enter Vehicle Fuel for update");
                     
                     int ne = input.nextInt();
                     if (ne == 1) {
                         System.out.println("Enter New Vehicle Name");
                         String updatedname = input.next();
                         v.nameupdate(res, updatedname); 
                    }
                     else if (ne == 2) {
                         System.out.println("Enter New Vehicle Type");
                         String updatedtype = input.next();
                         v.typeupdate(res, updatedtype);
                    }
                     else if (ne == 3) {
                         System.out.println("Enter New Vehicle Price");
                         String updatedprice = input.next();
                         v.priceupdate(res,updatedprice );
                    }
                     else if (ne == 4) {
                         System.out.println("Enter New Vehicle Colour");
                         String updatedcolour = input.next();
                         v.colourupdate(res,updatedcolour);
                    }
                     else if (ne == 5) {
                         System.out.println("Enter New Vehicle Model");
                         String updatedmodel = input.next();
                         v.modelupdate(res,updatedmodel);
                    }
                     else if (ne == 6) {
                         System.out.println("Enter New Vehicle Engine Name");
                         String updatedEngine = input.next();
                          v.enginenameupdate(res,updatedEngine);
                    }
                     else if (ne == 7) {
                         System.out.println("Enter New Vehicle Engine power");
                         String updatedpower = input.next();
                         v.powerupdate(res,updatedpower);
                    }
                     else if (ne == 8) {
                         System.out.println("Enter New Vehicle Priston");
                         String updatedpriston = input.next();
                          v.pristonupdate(res,updatedpriston);
                    }
                     else if (ne == 9) {
                         System.out.println("Enter New Vehicle Fuel");
                         String updatedfuel = input.next();
                         v.fuelupdate(res,updatedfuel);
                    }
                     
                }
                else if (b==3)
                {
                    System.out.println("Enter ID for delete Vehivle");
                    int del = input.nextInt();
                    v.deletevehicle(del);
                }
                else if (b==4)
                {
                    v.show();
                }
            }
            else if (a==2)
            {
                System.out.println("1. Add Employee");
                System.out.println("2. Update Employee ");
                System.out.println("3. Delete Employee");
                System.out.println("4. View Employee");
                int b = input.nextInt();
                if (b ==1) {
                    
                    System.out.println("Enter Employee Name");
                    String name  = input.next();
                    System.out.println("Enter Employee Type");
                    String type  = input.next();
                    System.out.println("Enter Employee CNIC");
                    String cnic  = input.next();
                    System.out.println("Enter Employee Phone");
                    String phone  = input.next();
                    System.out.println("Enter Employee Address");
                    String address  = input.next();
                    e.Add(name, type, cnic, phone, address);
                    System.out.println("Employee Added Successfully");
                }
                else if (b == 2)
                {
                     System.out.println("Enter ID of Employee for update data");
                     int res = input.nextInt();
                     e.update(res);
                     System.out.println("1. Enter Employee Name for update");
                     System.out.println("2. Enter Employee Type for update");
                     System.out.println("3. Enter Employee CNIC for update");
                     System.out.println("4. Enter Employee Phone for update");
                     System.out.println("5. Enter Employee Address for update");
                         int ne = input.nextInt();
                     if (ne == 1) {
                         System.out.println("Enter New Employee Name");
                         String updatedname = input.next();
                         e.nameupdate(res, updatedname);
                    }
                     else if (ne == 2) {
                         System.out.println("Enter New Vehicle Type");
                         String updatedtype = input.next();
                         e.typeupdate(res, updatedtype);
                    }
                     else if (ne == 3) {
                         System.out.println("Enter New Employee CNIC");
                         String updatecnic = input.next();
                         e.cnicupdate(res, updatecnic);
                    }
                     else if (ne == 4) {
                         System.out.println("Enter New Employee Phone");
                         String updatephone = input.next();
                         e.phoneupdate(res,updatephone);
                    }
                     else if (ne == 5) {
                         System.out.println("Enter New Employee Address");
                         String updateaddress = input.next();
                         e.addressupdate(res,updateaddress);
                    }   
                      
                     
                }
                else if (b ==3)
                {
                     System.out.println("Enter ID for delete Employee");
                    int del = input.nextInt();
                    e.deleteemployee(del);
                }
                else if (b == 4)
                {
                    e.show();
                }
            }
            else if (a == 4)
            {
                break;
            }
            
        }
     }
        else{   
        System.out.println("Access denied");
        }  
               
    }
     else 
     {
               // TODO code application logic here
        System.out.println(connection.connect());
      //  Scanner input=new Scanner(System.in);
        clearcon clearscreen=new clearcon();
        customer cust=new customer();
        System.out.println("Welcome to Car Rental Management System ");
       
            System.out.println("1) Sign up \n2) Login");
            
        char action= (char)System.in.read();
        
        if(action=='1'){
            System.out.print("Your First Name: ");
            String fname=input.next();
            System.out.print("Your Last Name: ");
            String lname=input.next();
            System.out.print("Your Phone No: ");
            String phone=input.next();
            System.out.print("Your Resedential Address: ");
            String address=input.next();
            System.out.print("Your CNIC: ");
            String cnic=input.next();
            System.out.print("Your Account Password: ");
            String pass=input.next();
           Boolean status= cust.Signup(fname, lname, phone, address, cnic, pass);
           
           if(status==true)
           {
               System.out.println("Congratulations Your Account has been Created.");
               
           }
           else{
               System.out.println("Please Check your Details");
           
           
        }
            }
    
        
        if(action=='2'){
            System.out.print("Enter your Username: ");
            String username=input.next();
            System.out.print("Enter your Password: ");
            String password=input.next();
          clearscreen.clear();
         System.out.println(cust.login(username, password));  
         while(true){
             // clearscreen.threeclear();
         if(customer.id!=0){
             
             System.out.println("1: Show my Details");
             System.out.println("2: Book a car now");
             System.out.println("3: My Transactions");
             char login_action= (char)System.in.read();
                if(login_action=='1'){
                    cust.show_details();
                    System.out.println("press 0 for update your record");
                    
                    
                    int action2= input.nextInt();
                   if(action2==0){
            System.out.print("Your First Name:");
            String fname=input.next();
            System.out.print("Your Last Name:");
            String lname=input.next();
            System.out.print("Your Phone No");
            String phone=input.next();
            System.out.print("Your Resedential Address");
            String address=input.next();
            System.out.print("Your CNIC");
            String cnic=input.next();
            System.out.print("Your Account Password");
            String pass=input.next();
            Boolean status= cust.Update(fname, lname, phone, address, cnic, pass);
           
                if(status==true)
                {
                  System.out.println("Your Account Details has been updated");
                  continue;
                }
                else{
                    
                    System.out.println("Please Fill all fields");
                   continue;
                }
                }
                   if(action2==9){
                       continue;
                   }
                   
             }
                if(login_action=='2'){
                    cars_data cars=new cars_data();
                    cars.show_vehicle();
                    cars.vehicle_ids();   
                }
                if(login_action=='o'){
                    System.exit(1);
                }
         }
       }
        }

     }
       
       
       
       
       
       
           
    }
       
}
