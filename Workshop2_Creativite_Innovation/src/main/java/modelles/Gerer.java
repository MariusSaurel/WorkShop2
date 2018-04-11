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
public class Gerer {
    
    private String idAdmin;
    private int idProject;
    private String idIntervenant;
    private String idGroupe;

    public Gerer(String idAdmin, int idProject, String idIntervenant, String idGroupe) {
        this.idAdmin = idAdmin;
        this.idProject = idProject;
        this.idIntervenant = idIntervenant;
        this.idGroupe = idGroupe;
    }

    public String getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(String idAdmin) {
        this.idAdmin = idAdmin;
    }

    public int getIdProject() {
        return idProject;
    }

    public void setIdProject(int idProject) {
        this.idProject = idProject;
    }

    public String getIdIntervenant() {
        return idIntervenant;
    }

    public void setIdIntervenant(String idIntervenant) {
        this.idIntervenant = idIntervenant;
    }

    public String getIdGroupe() {
        return idGroupe;
    }

    public void setIdGroupe(String idGroupe) {
        this.idGroupe = idGroupe;
    }

         
}
