/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Etudiant;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DaoInscription {
    public int insert(int idEtudiant, int idClasse){
        return 0;
    }
    public int insert(Etudiant objet) {
        int id=0;
        DaoMysql mysql = new DaoMysql();
        mysql.ouvrirConnexionBD();
        mysql.preparerRequete(SQL_INSERT);
        try {
            mysql.getPs().setString(1,objet.getMatricule());
        } catch (SQLException ex) {
            Logger.getLogger(DaoEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            mysql.getPs().setString(2,objet.getTuteur());
        } catch (SQLException ex) {
            Logger.getLogger(DaoEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.executeMisAJour();
        ResultSet rs = null;
        try {
            rs = mysql.getPs().getGeneratedKeys();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEtudiant.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(id);
        mysql.closeConnexion();
       return id;
    }

}
