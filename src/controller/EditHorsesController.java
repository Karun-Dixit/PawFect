/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoHorses;
import model.EditHorsesModel;
import view.EditHorses;
/**
 *
 * @author kiYo
 */
public class EditHorsesController {
    private EditHorsesModel cmodel;
    private EditHorses view;
    
    public EditHorsesController(EditHorsesModel cmodel, EditHorses view){
        this.cmodel = cmodel;
        this.view = view;
        
    }
    public EditHorsesController(EditHorses view){
        this.view = view;
    }
    public boolean uptHorses(){
        daoHorses o=new daoHorses(cmodel);
        return o.updateHorses();
    }
    public boolean delHorses(){
            daoHorses dd=new daoHorses(cmodel);
            return dd.deleteHorses();
    }
    public boolean searchHorses(){
        daoHorses o=new daoHorses(cmodel);
        return o.searchHorses();
    }
}
