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
public class Administrateur extends User {
    
    private String idAmind; 
    private String NomAdmin;
    private String MotdepasseAdmin;
    private String AdresseMailAdmin;

    public Administrateur(String idAmind, String NomAdmin, String MotdepasseAdmin, String AdresseMailAdmin) {
        super("Administrateur");
        this.idAmind = idAmind;
        this.NomAdmin = NomAdmin;
        this.MotdepasseAdmin = MotdepasseAdmin;
        this.AdresseMailAdmin = AdresseMailAdmin;
    }

    public String getIdAmind() {
        return idAmind;
    }

    public void setIdAmind(String idAmind) {
        this.idAmind = idAmind;
    }

    public String getNomAdmin() {
        return NomAdmin;
    }

    public void setNomAdmin(String NomAdmin) {
        this.NomAdmin = NomAdmin;
    }

    public String getMotdepasseAdmin() {
        return MotdepasseAdmin;
    }

    public void setMotdepasseAdmin(String MotdepasseAdmin) {
        this.MotdepasseAdmin = MotdepasseAdmin;
    }

    public String getAdresseMailAdmin() {
        return AdresseMailAdmin;
    }

    public void setAdresseMailAdmin(String AdresseMailAdmin) {
        this.AdresseMailAdmin = AdresseMailAdmin;
    }
    
    
}
