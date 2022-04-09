/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Etudiant;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class DaoEtudiant {

    private Object objet;
    public int insert(Etudiant etudiant){
        int id=0;
        DaoMysql mysql = new DaoMysql();
        mysql.ouvrirConnexionBD();
        String SQL_INSERT = null;
        mysql.preparerRequete(SQL_INSERT);
        //PreparedStatement setString = mysql.getPs().setString(1,objet.getMatricule());
        //mysql.getPs().setString(2,objet.getTuteur());
        mysql.executeMisAJour();
        ResultSet rs = null;
        try {
            rs = mysql.getPs().getGeneratedKeys();
        } catch (SQLException ex) {
            Logger.getLogger(DaoEtudiant.etud.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            if (rs.next()){
                id = rs.getInt(1);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoEtudiant.etud.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(id);
        mysql.closeConnexion();
       return id;
    }

    private static class etud {

        private static String getName() {
            
        }

        public etud() {
        }
    }
}   
