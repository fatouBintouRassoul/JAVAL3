/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class Inscription {
    private LocalDate dateIns;
    private int anneeIns;

    public Inscription() {
    }

    public LocalDate getDateIns() {
        return dateIns;
    }

    public void setDateIns(LocalDate dateIns) {
        this.dateIns = dateIns;
    }

    public int getAnneeIns() {
        return anneeIns;
    }

    public void setAnneeIns(int anneeIns) {
        this.anneeIns = anneeIns;
    }
    
    
    
}
