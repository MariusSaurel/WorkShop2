/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelles;

import java.util.Date;

/**
 *
 * @author Joubert
 */
public class Groupe {
            
    private String idGroupe;
    private String nomGroupe;       
    private Date dateCreationGroupe;       
    private String capaciteGroupe;       
    private int soldeJeton; 

    public Groupe(String idGroupe, String nomGroupe, Date dateCreationGroupe, String capaciteGroupe, int soldeJeton) {
        this.idGroupe = idGroupe;
        this.nomGroupe = nomGroupe;
        this.dateCreationGroupe = dateCreationGroupe;
        this.capaciteGroupe = capaciteGroupe;
        this.soldeJeton = soldeJeton;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getNomGroupe() {
        return nomGroupe;
    }

    public void setNomGroupe(String nomGroupe) {
        this.nomGroupe = nomGroupe;
    }

    public Date getDateCreationGroupe() {
        return dateCreationGroupe;
    }

    public void setDateCreationGroupe(Date dateCreationGroupe) {
        this.dateCreationGroupe = dateCreationGroupe;
    }

    public String getCapaciteGroupe() {
        return capaciteGroupe;
    }

    public void setCapaciteGroupe(String capaciteGroupe) {
        this.capaciteGroupe = capaciteGroupe;
    }

    public int getSoldeJeton() {
        return soldeJeton;
    }

    public void setSoldeJeton(int soldeJeton) {
        this.soldeJeton = soldeJeton;
    }
    
    
}
