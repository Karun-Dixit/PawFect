/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AddHorsesModel;
import view.AddHorses;
import daofile.daoHorses;
/**
 *
 * @author kiYo
 */
public class AddHorsesController {
    private AddHorsesModel hmodel;
    private AddHorses view;
    
    public AddHorsesController(AddHorsesModel hmodel, AddHorses view){
        this.hmodel = hmodel;
        this.view = view;
    }
    public AddHorsesController(AddHorses view){
        this.view = view;
    }
    public void addHorses(){
        if(view.isvalid()){
            daoHorses.saveToHorses(
            hmodel.getName(),
            hmodel.getQualification(),
            hmodel.getType(),
            hmodel.getTiming()
            );
            view.insertData();
            
        }
    }
}
