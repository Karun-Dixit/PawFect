/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import daofile.daoView_Report;
import model.View_Report1Model;
import view.View_Report;

/**
 *
 * @author kiYo
 */
public class View_ReportController {
    private View_Report1Model smodel;
    private View_Report view;
    
    public View_ReportController(View_Report1Model smodel, View_Report view){
        this.smodel = smodel;
        this.view = view;
    }
    public View_ReportController(View_Report view){
        this.view = view;
    }
    public boolean searchView_Report(){
        daoView_Report o=new daoView_Report(smodel);
        return o.searchView_Report();
    }
    public boolean uptView_Report(){
        daoView_Report o=new daoView_Report(smodel);
        return o.updateView_Report();
    }
    public boolean delView_Report(){
            daoView_Report dd=new daoView_Report(smodel);
            return dd.deleteView_Report();
    }
}

