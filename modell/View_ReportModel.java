/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modell;

import view.View_Report;

/**
 *
 * @author sashwat
 */
public class View_ReportModel {
    private static String id;
 //To change body of generated methods, choose Tools | Templates.

    public View_ReportModel(String id) {
        View_ReportModel.id = id;
    }

//    public View_ReportModel() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    

    

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        View_ReportModel.id = id;
    }




  /*  String sec;

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    } */
    
}
