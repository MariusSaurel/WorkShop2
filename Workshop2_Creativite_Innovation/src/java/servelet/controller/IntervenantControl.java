/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelles.Intervenant;

/**
 *
 * @author Joubert
 */
@ManagedBean
@RequestScoped
public class IntervenantControl {

    
    private Intervenant intervenant;
    
    /**
     * Creates a new instance of IntervenantControl
     * @param intervenant
     */
    public IntervenantControl(Intervenant intervenant) {
        this.intervenant = intervenant;
    }
   
    public void getHistoricIntervention(){
      //TODO      
    }
        
    public void demanderJeton(){
        //TODO   
    }
    
    public void imprimerHistoric(){
        //TODO   
    }
}
