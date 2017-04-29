/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmployeeInfo;

/**
 *
 * @author Muhammad zahid
 */
public class EmployeeInfo {
    
    int ID;

   
    String employeename;
    String employeeType;
    String CNIC;
    String phone;
    String Address;
    
    public EmployeeInfo(int id ,String employeename , String employeetype , String CNIC , String phone , String Address)
    {
        this.ID= id;
        this.employeename = employeename;
        this.CNIC = CNIC;
        this.employeeType = employeetype;
        this.phone = phone;
        this.Address = Address;
        
    }
     public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getEmployeename() {
        return employeename;
    }

    public void setEmployeename(String employeename) {
        this.employeename = employeename;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    
}
