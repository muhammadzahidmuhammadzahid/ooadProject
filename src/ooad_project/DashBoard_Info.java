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
public class DashBoard_Info {
 
    ArrayList<DashBoard> arr;  
    public DashBoard_Info() {
         arr = new ArrayList<DashBoard>();
    }
    public void Add()
    {
        arr.add(new DashBoard(1,"Vehicle Info"));
        arr.add(new DashBoard(2,"Employee Info"));
        //arr.add(new DashBoard(3,"View Reports"));
        arr.add(new DashBoard(3,"Customers Details"));
        arr.add(new DashBoard(4,"Log_Out"));   
    }
    public void Show()
    {
        Add();
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).ID+" "+arr.get(i).dashboardcontent);
        }
    }
}
