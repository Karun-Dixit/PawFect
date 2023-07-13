/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoCats;
import model.EditCatsModel;
import view.EditCats;
/**
 *
 * @author kiYo
 */
public class EditCatsController {
    private EditCatsModel cmodel;
    private EditCats view;
    
    public EditCatsController(EditCatsModel cmodel, EditCats view){
        this.cmodel = cmodel;
        this.view = view;
        
    }
    public EditCatsController(EditCats view){
        this.view = view;
    }
    public boolean uptCats(){
        daoCats o=new daoCats(cmodel);
        return o.updateCats();
    }
    public boolean delCats(){
            daoCats dd=new daoCats(cmodel);
            return dd.deleteCats();
    }
    public boolean searchCats(){
        daoCats o=new daoCats(cmodel);
        return o.searchCats();
    }
}
