/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoHorses;
import model.HorsesModel;
import view.DepartmentHorses;
/**
 *
 * @author kiYo
 */
public class HorsesController {
    private HorsesModel model;
    private DepartmentHorses view;
    public HorsesController(HorsesModel model, DepartmentHorses view) {
        this.model=model;
        this.view=view;
    }

    public boolean allHorses(){
        daoHorses object=new daoHorses(model);
        return object.allHorses();
    }
}
