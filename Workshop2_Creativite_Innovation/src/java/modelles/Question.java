/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelles;

/**
 *
 * @author Joubert
 */
public class Question {
        
    private String dateQuestion;
    private String prixQuestion;  
    private String idGroupe;       
    private String idIntervenant;   

    public Question(String dateQuestion, String prixQuestion, String idGroupe, String idIntervenant) {
        this.dateQuestion = dateQuestion;
        this.prixQuestion = prixQuestion;
        this.idGroupe = idGroupe;
        this.idIntervenant = idIntervenant;
    }

    public String getDateQuestion() {
        return dateQuestion;
    }

    public void setDateQuestion(String dateQuestion) {
        this.dateQuestion = dateQuestion;
    }

    public String getPrixQuestion() {
        return prixQuestion;
    }

    public void setPrixQuestion(String prixQuestion) {
        this.prixQuestion = prixQuestion;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

    public String getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(String idIntervenant) {
        this.idIntervenant = idIntervenant;
    }
    
    
}
