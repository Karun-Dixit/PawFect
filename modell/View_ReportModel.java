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

    public static View_Report getUser() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



    String sec;

    public String getSec() {
        return sec;
    }

    public void setSec(String sec) {
        this.sec = sec;
    }
    public View_ReportModel(String text) {
        this.sec = text;
    }
}
