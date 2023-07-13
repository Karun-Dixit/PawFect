/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AddRabbitsModel;
import view.AddRabbits;
import daofile.daoRabbits;
/**
 *
 * @author kiYo
 */
public class AddRabbitsController {
    private AddRabbitsModel cmodel;
    private AddRabbits view;
    
    public AddRabbitsController(AddRabbitsModel cmodel, AddRabbits view){
        this.cmodel = cmodel;
        this.view = view;
    }
    public AddRabbitsController(AddRabbits view){
        this.view = view;
    }
    public void addRabbits(){
        if(view.isvalid()){
            daoRabbits.saveToRabbits(
            cmodel.getName(),
            cmodel.getQualification(),
            cmodel.getType(),
            cmodel.getTiming()
            );
            view.insertData();
            
        }
    }
}
