/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet.controller;

import java.io.IOException;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelles.Administrateur;
import modelles.User;

/**
 *
 * @author Joubert
 */
@ManagedBean
@RequestScoped
public class AdminControl {

    private Administrateur administrateur;
    
    
    private User loggedUser;
    
    /**
     * Creates a new instance of AdminControl
     * @param administrateur
     */
    public AdminControl(Administrateur administrateur) {
        this.administrateur = administrateur;
    }
    
    private void connection(HttpServletRequest request, HttpServletResponse response) throws IOException{
                
        switch (loggedUser.getType()) {
            case "Administrateur":
                Administrateur loggedAdmin = (Administrateur) this.loggedUser;
                System.out.println("IdAmind : " +loggedAdmin.getIdAmind());
                response.sendRedirect( "resources/pages/test.html"); 
                
                break;
            case "Etudiant":
                
                response.sendRedirect( "resources/pages/etudiant.html"); 
                
                break;
            case "Intervenant":
                
                response.sendRedirect( "resources/pages/intervenant.html"); 
                
                break;
            default:
                
                
                break;
        }
    }
    
    public void updatedata ()
    {
        
    }
    
    public void createnewgroupe ()
    {
        
    }
    
    public void createnewevenement ()
    {
        
    }
    
    public void createnewintervenant ()
    {
        
    }
    
    
    
//    public int creatNewProject(int name, String desc,String object){
//        int idNewProject;
//        // TODO
//        return idNewProject;
//    }
//    
//    public void deletProject(String idProject){
//        // TODO
//    }
//    
//    public int creatNewGroup(String name,String capacity,int sold){
//        int idNewGroup;
//        // TODO
//        return idNewGroup;
//    }
//    
//    public void deletGroup(String idGroup){
//        //TODO
//    }
//    
//    public int creatStudent(String name,String youngGirlname,String firstName,String speciality,String idGroup){
//        int idNewStudent;
//        // TODO
//        return idNewGroup;
//    }
//    
//    public void deletStudent(String idStudent){
//        //TODO
//    }
//    
//    public void addStudentsToGroup(String idGroup,List<String> idStudents){
//        int iMax = idStudents.size();
//        
//        for(int i = 0; i < iMax; i++){
//            this.addStudentToGroup(idGroup,idStudents.get(i));
//        }
//        
//    }
//    
//    public void addStudentToGroup(String idGroup,String idStudent){
//        //TODO
//    }
//    
//    public int addIntervenant(String nomIntervenant, String domainExpertise,int soldCumulJeton){
//        //TODO
//    }
//    
    public void deletIntervenant(String IdIntervenant){
        //TODO
    }
    
    public void addIntervenantToProject(/*TODO*/ ){
        //TODO
    }
    
    // public void 
    
}
