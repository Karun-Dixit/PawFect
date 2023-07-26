/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AddBirdsModel;
import view.AddBirds;
import daofile.daoBirds;
/**
 *
 * @author kiYo
 */
public class AddBirdsController {
    private AddBirdsModel cmodel;
    private AddBirds view;
    
    public AddBirdsController(AddBirdsModel cmodel, AddBirds view){
        this.cmodel = cmodel;
        this.view = view;
    }
    public AddBirdsController(AddBirds view){
        this.view = view;
    }
    public void addBirds(){
        if(view.isvalid()){
            daoBirds.saveToBirds(
            cmodel.getName(),
            cmodel.getQualification(),
            cmodel.getType(),
            cmodel.getTiming()
            );
            view.insertData();
            
        }
    }
}
