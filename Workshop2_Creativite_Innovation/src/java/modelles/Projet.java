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
public class Projet {    
        
    private int idProjet;
    private String nomProjet;
    private String descriptionProjet;       
    private String objetProjet;    
    private Date dateDebutProjet;
    private Date dateFinProjet;

    public Projet(int idProjet, String nomProjet, String descriptionProjet, String objetProjet, Date dateDebutProjet, Date dateFinProjet) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.descriptionProjet = descriptionProjet;
        this.objetProjet = objetProjet;
        this.dateDebutProjet = dateDebutProjet;
        this.dateFinProjet = dateFinProjet;
    }

    public int getIdProjet() {
        return idProjet;
    }

    public void setIdProjet(int idProjet) {
        this.idProjet = idProjet;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getDescriptionProjet() {
        return descriptionProjet;
    }

    public void setDescriptionProjet(String descriptionProjet) {
        this.descriptionProjet = descriptionProjet;
    }

    public String getObjetProjet() {
        return objetProjet;
    }

    public void setObjetProjet(String objetProjet) {
        this.objetProjet = objetProjet;
    }

    public Date getDateDebutProjet() {
        return dateDebutProjet;
    }

    public void setDateDebutProjet(Date dateDebutProjet) {
        this.dateDebutProjet = dateDebutProjet;
    }

    public Date getDateFinProjet() {
        return dateFinProjet;
    }

    public void setDateFinProjet(Date dateFinProjet) {
        this.dateFinProjet = dateFinProjet;
    }
    
    
}
