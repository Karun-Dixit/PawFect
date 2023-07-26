/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
/**
 *
 * @author kiYo
 */
public class View_ReportModel {
    private static String id;

    public View_ReportModel(String id) {
        View_ReportModel.id = id;
    }

    public static String getId() {
        return id;
    }

    public static void setId(String id) {
        View_ReportModel.id = id;
    }

    

   
}
