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
public class Intervenant extends User {
            
    private String idIntervenant;
    private String nomIntervenant;     
    private String domaineExpertise;      
    private int soldeCumuleJeton;

    public Intervenant(String idIntervenant, String nomIntervenant, String domaineExpertise, int soldeCumuleJeton) {
        super("Intervenant");
        this.idIntervenant = idIntervenant;
        this.nomIntervenant = nomIntervenant;
        this.domaineExpertise = domaineExpertise;
        this.soldeCumuleJeton = soldeCumuleJeton;
    }

    public String getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(String idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    public String getNomIntervenant() {
        return nomIntervenant;
    }

    public void setNomIntervenant(String nomIntervenant) {
        this.nomIntervenant = nomIntervenant;
    }

    public String getDomaineExpertise() {
        return domaineExpertise;
    }

    public void setDomaineExpertise(String domaineExpertise) {
        this.domaineExpertise = domaineExpertise;
    }

    public int getSoldeCumuleJeton() {
        return soldeCumuleJeton;
    }

    public void setSoldeCumuleJeton(int soldeCumuleJeton) {
        this.soldeCumuleJeton = soldeCumuleJeton;
    }
    
    
}
