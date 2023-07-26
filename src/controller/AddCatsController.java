/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.AddCatsModel;
import view.AddCats;
import daofile.daoCats;
/**
 *
 * @author kiYo
 */
public class AddCatsController {
    private AddCatsModel cmodel;
    private AddCats view;
    
    public AddCatsController(AddCatsModel cmodel, AddCats view){
        this.cmodel = cmodel;
        this.view = view;
    }
    public AddCatsController(AddCats view){
        this.view = view;
    }
    public void addCats(){
        if(view.isvalid()){
            daoCats.saveToCats(
            cmodel.getName(),
            cmodel.getQualification(),
            cmodel.getType(),
            cmodel.getTiming()
            );
            view.insertData();
            
        }
    }
}
