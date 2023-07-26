/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoBirds;
import model.BirdsModel;
import view.DepartmentBirds;
/**
 *
 * @author kiYo
 */
public class BirdsController {
    private BirdsModel model;
    private DepartmentBirds view;
    public BirdsController(BirdsModel model, DepartmentBirds view) {
        this.model=model;
        this.view=view;
    }

    public boolean allBirds(){
        daoBirds object=new daoBirds(model);
        return object.allBirds();
    }
}
