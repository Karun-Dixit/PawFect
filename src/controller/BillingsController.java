/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import daofile.daoBillings;
import daofile.daoBillings;
import model.BillingsModel;
import view.Billings;

/**
 *
 * @author kiYo
 */
public class BillingsController {
    private BillingsModel smodel;
    private Billings view;
    
    public BillingsController(BillingsModel smodel, Billings view){
        this.smodel = smodel;
        this.view = view;
    }
    public BillingsController(Billings view){
        this.view = view;
    }
    public boolean searchBillings(){
        daoBillings o=new daoBillings(smodel);
        return o.searchBillings();
    }
    
}
