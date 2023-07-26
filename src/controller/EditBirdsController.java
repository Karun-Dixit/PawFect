/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoBirds;
import model.EditBirdsModel;
import view.EditBirds;
/**
 *
 * @author kiYo
 */
public class EditBirdsController {
    private EditBirdsModel cmodel;
    private EditBirds view;
    
    public EditBirdsController(EditBirdsModel cmodel, EditBirds view){
        this.cmodel = cmodel;
        this.view = view;
        
    }
    public EditBirdsController(EditBirds view){
        this.view = view;
    }
    public boolean uptBirds(){
        daoBirds o=new daoBirds(cmodel);
        return o.updateBirds();
    }
    public boolean delBirds(){
            daoBirds dd=new daoBirds(cmodel);
            return dd.deleteBirds();
    }
    public boolean searchBirds(){
        daoBirds o=new daoBirds(cmodel);
        return o.searchBirds();
    }
}
