/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoRabbits;
import model.EditRabbitsModel;
import view.EditRabbits;
/**
 *
 * @author kiYo
 */
public class EditRabbitsController {
    private EditRabbitsModel cmodel;
    private EditRabbits view;
    
    public EditRabbitsController(EditRabbitsModel cmodel, EditRabbits view){
        this.cmodel = cmodel;
        this.view = view;
        
    }
    public EditRabbitsController(EditRabbits view){
        this.view = view;
    }
    public boolean uptRabbits(){
        daoRabbits o=new daoRabbits(cmodel);
        return o.updateRabbits();
    }
    public boolean delRabbits(){
            daoRabbits dd=new daoRabbits(cmodel);
            return dd.deleteRabbits();
    }
    public boolean searchRabbits(){
        daoRabbits o=new daoRabbits(cmodel);
        return o.searchRabbits();
    }
}
