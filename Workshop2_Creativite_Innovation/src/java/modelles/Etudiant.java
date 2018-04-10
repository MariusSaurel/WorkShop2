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
public class Etudiant extends User {
  
    private String idEtudiant;
    private String nomEtudiant;       
    private String nomJeuneFille;       
    private String prenomEtudiant;       
    private String specialiteEtudiant;         
    private String idGroupe;

    public Etudiant(String idEtudiant, String nomEtudiant, String nomJeuneFille, String prenomEtudiant, String specialiteEtudiant, String idGroupe) {
        super("Etudiant");
        this.idEtudiant = idEtudiant;
        this.nomEtudiant = nomEtudiant;
        this.nomJeuneFille = nomJeuneFille;
        this.prenomEtudiant = prenomEtudiant;
        this.specialiteEtudiant = specialiteEtudiant;
        this.idGroupe = idGroupe;
    }

    public String getIdEtudiant() {
        return idEtudiant;
    }

    public void setIdEtudiant(String idEtudiant) {
        this.idEtudiant = idEtudiant;
    }

    public String getNomEtudiant() {
        return nomEtudiant;
    }

    public void setNomEtudiant(String nomEtudiant) {
        this.nomEtudiant = nomEtudiant;
    }

    public String getNomJeuneFille() {
        return nomJeuneFille;
    }

    public void setNomJeuneFille(String nomJeuneFille) {
        this.nomJeuneFille = nomJeuneFille;
    }

    public String getPrenomEtudiant() {
        return prenomEtudiant;
    }

    public void setPrenomEtudiant(String prenomEtudiant) {
        this.prenomEtudiant = prenomEtudiant;
    }

    public String getSpecialiteEtudiant() {
        return specialiteEtudiant;
    }

    public void setSpecialiteEtudiant(String specialiteEtudiant) {
        this.specialiteEtudiant = specialiteEtudiant;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }
    
    
            
}
