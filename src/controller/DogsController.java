/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoDogs;
import model.DogsModel;
import view.DepartmentDogs;

/**
 *
 * @author kiYo
 */
public class DogsController {
    private DogsModel model;
    private DepartmentDogs view;
    public DogsController(DogsModel model, DepartmentDogs view) {
        this.model=model;
        this.view=view;
    }

    public boolean allDogs(){
        daoDogs object=new daoDogs(model);
        return object.allDogs();
    }
}
