/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelles.Etudiant;

/**
 *
 * @author Joubert
 */
@ManagedBean
@RequestScoped
public class EtudiantControl {

    private Etudiant etudiant;

     /**
     * Creates a new instance of EtudiantControl
     * @param etudiant
     */    
    public EtudiantControl(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    
   
    
    
//    public int addQuestion(String question){
//        int idNewQuestion;
//        //TODO
//        return idNewQuestion;
//    }
    
    public void deletQestion(String idQuestion){
        //TODO
    }
    
    public void payerIntervenant(){
        //TODO
    }
    
}
