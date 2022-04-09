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
            public ArrayList<Etudiant> selectAll() {
        ArrayList<Etudiant> etudiants = new ArrayList();
        DaoMysql mysql = new DaoMysql();
        mysql.ouvrirConnexionBD();
        mysql.preparerRequete(SQL_SELECTALL);
        ResultSet rs = mysql.executeSelect();
        try {
            while(rs.next()){
                Etudiant etud = new Etudiant();
                etud.setId(rs.getInt("idEtudiant"));
                etud.setMatricule(rs.getString("matricule"));
                etud.setTuteur(rs.getString("tuteur"));
                etudiants.add(etud);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DaoClasse.class.getName()).log(Level.SEVERE, null, ex);
        }
        mysql.closeConnexion();
        return etudiants;
    }
        }
    }
   
