/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import daofile.daoView_Report;
import model.View_ReportTableModel;
import view.View_Report;

/**
 *
 * @author kiYo
 */
public class View_ReportTableController {
    private View_ReportTableModel model;
    private View_Report view;
    public View_ReportTableController(View_ReportTableModel model, View_Report view) {
        this.model=model;
        this.view=view;
    }

    public boolean allReports(){
        daoView_Report object=new daoView_Report(model);
        return object.allReports();
    }
}
