/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entity.Admin;
import entity.Classe;
import entity.Etudiant;
import entity.Professeur;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public interface Iservice {
    //Use Case Gerer classe
    boolean ajoutClasse(Classe classe);
    boolean modifierClasse(Classe classe);
    boolean supprimerClasse(int id);
    ArrayList<Classe> ListerClasse();
    
    //Use Case Affecter classe
    boolean ajouterProfesseur(Professeur professeur);
    boolean affecterClasse(Professeur professeur, ArrayList<Classe> classes);
    
    //Use Case Lister professeur
    ArrayList<Professeur> ListerProfesseur();
        //On demande la liste des classes d'un professeur
    ArrayList<Classe> filtrerClasseProfesseur(Professeur professeur);
    
    //Se connecter
    Admin seConnecter(String login, String password);
    
    //Inscrire étudiant
    boolean ajouterEtudiant(Etudiant etudiant);
    boolean inscrireEtudiant(Etudiant etudiant, ArrayList<Classe> classes);
}
