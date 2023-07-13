/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoRabbits;
import model.RabbitsModel;
import view.DepartmentRabbits;
/**
 *
 * @author kiYo
 */
public class RabbitsController {
    private RabbitsModel model;
    private DepartmentRabbits view;
    public RabbitsController(RabbitsModel model, DepartmentRabbits view) {
        this.model=model;
        this.view=view;
    }

    public boolean allRabbits(){
        daoRabbits object=new daoRabbits(model);
        return object.allRabbits();
    }
}
