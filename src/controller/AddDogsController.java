/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.AddDogsModel;
import view.AddDogs;
import daofile.daoDepartments;
/**
 *
 * @author Karun Dixit
 */
public class AddDogsController {
    private AddDogsModel dmodel;
    private AddDogs view;
    
    public AddDogsController(AddDogsModel dmodel, AddDogs view){
        this.dmodel = dmodel;
        this.view = view;
    }
    public AddDogsController(AddDogs view){
        this.view = view;
    }
    public void addDogs(){
        if(view.isvalid()){
            daoDepartments.saveToDogs(
            dmodel.getName(),
            dmodel.getQualification(),
            dmodel.getType(),
            dmodel.getTiming()
            );
            view.insertData();
            
        }
    }
}
