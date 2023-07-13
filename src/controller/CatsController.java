/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import daofile.daoCats;
import model.CatsModel;
import view.DepartmentCats;
/**
 *
 * @author kiYo
 */
public class CatsController {
    private CatsModel model;
    private DepartmentCats view;
    public CatsController(CatsModel model, DepartmentCats view) {
        this.model=model;
        this.view=view;
    }

    public boolean allCats(){
        daoCats object=new daoCats(model);
        return object.allCats();
    }
}
