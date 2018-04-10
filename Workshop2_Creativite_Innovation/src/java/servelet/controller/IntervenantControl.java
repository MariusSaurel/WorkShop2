/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Joubert
 */
@ManagedBean
@RequestScoped
public class IntervenantControl {

    
    private String idIntervenant;
    private String idGroup;
    
    /**
     * Creates a new instance of IntervenantControl
     */
    public IntervenantControl(String idIntervenant) {
        this.idIntervenant = idIntervenant;
    }
   
    public int addQuestion(String question){
        int idNewQuestion;
        //TODO
        return idNewQuestion;
    }
        
    
}
