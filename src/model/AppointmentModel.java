/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kiYo
 */
public class AppointmentModel {
    private DefaultTableModel tableName;
    public AppointmentModel(DefaultTableModel tableName) {
        this.tableName=tableName;
    }

    public DefaultTableModel getTableName() {
        return tableName;
    }

    public void setTableName(DefaultTableModel tableName) {
        this.tableName = tableName;
    }
}
