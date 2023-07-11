/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoDepartments;
import model.EditDogsModel;
import view.EditDogs;
/**
 *
 * @author Karun Dixit
 */
public class EditDogsController {
    private EditDogsModel emodel;
    private EditDogs view;
    
    public EditDogsController(EditDogsModel emodel, EditDogs view){
        this.emodel = emodel;
        this.view = view;
        
    }
    public EditDogsController(EditDogs view){
        this.view = view;
    }
    public boolean uptDogs(){
        daoDepartments o=new daoDepartments(emodel);
        return o.updateDogs();
    }
    public boolean delDogs(){
            daoDepartments dd=new daoDepartments(emodel);
            return dd.deleteDogs();
    }
    public boolean searchStaff(){
        daoDepartments o=new daoDepartments(emodel);
        return o.searchDogs();
    }
}
