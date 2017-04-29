/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooad_project;

import java.util.ArrayList;

/**
 *
 * @author Muhammad zahid
 */
public class DashBoard {
   
    int ID;
    String dashboardcontent;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getDashboardcontent() {
        return dashboardcontent;
    }
    public void setDashboardcontent(String dashboardcontent) {
        this.dashboardcontent = dashboardcontent;
    }

    public DashBoard(int id , String dashboardcontent) {
       
        this.ID = id;
        this.dashboardcontent = dashboardcontent;
    }
    

    
   
    
    
}
