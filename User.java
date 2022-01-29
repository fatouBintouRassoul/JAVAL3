/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author Lenovo
 */
public class User {
    protected int id;
    protected String nomComplet;
    
    //Méthodes
        //Constructeurs
    public User(){
        
    }
    
    //Getters
    public int getId(){
        return this.id;
    }
    public String getNomComplet(){
        return this.nomComplet;
    }
    
    
    //Setters
    public void setId(int id){
        this.id=id;
    }
    public void setNomComplet(String nomComplet){
        this.nomComplet=nomComplet;
    }
}
