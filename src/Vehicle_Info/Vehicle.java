/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehicle_Info;

/**
 *
 * @author Muhammad zahid
 */
public class Vehicle {
    
    public Vehicleinfo vi;
    public Vehicle_engine ve;

        public Vehicle(int ID ,String name , String type , String price , String colour , String model , String enginename , String power,String priston,String fuel) { 
        vi = new Vehicleinfo();
        ve = new Vehicle_engine();
        this.vi.ID = ID;
        this.vi.name = name;
        this.vi.vehicletype = type;
        this.vi.price = price;
        this.vi.vehiclecolour = colour;
        this.vi.Model = model;
        this.ve.enginename = enginename;
        this.ve.power = power;
        this.ve.priston = priston;
        this.ve.fuel = fuel;   
    }

    public Vehicleinfo getVi() {
        return vi;
    }

    public void setVi(Vehicleinfo vi) {
        this.vi = vi;
    }

    public Vehicle_engine getVe() {
        return ve;
    }

    public void setVe(Vehicle_engine ve) {
        this.ve = ve;
    }
    
    
    
}
