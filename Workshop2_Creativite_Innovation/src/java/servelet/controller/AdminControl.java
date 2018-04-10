/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servelet.controller;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Joubert
 */
@ManagedBean
@RequestScoped
public class AdminControl {

    private String idAdmin;

    
    /**
     * Creates a new instance of AdminControl
     */
    public AdminControl(String idAdmin) {
        this.idAdmin = idAdmin;
    }
    
    
    public int creatNewProject(int name, String desc,String object){
        int idNewProject;
        // TODO
        return idNewProject;
    }
    
    public int creatNewGroup(String name,String capacity,int sold){
        int idNewGroup;
        // TODO
        return idNewGroup;
    }
    
    public int creatStudent(String name,String youngGirlname,String firstName,String speciality,String idGroup){
        int idNewStudent;
        // TODO
        return idNewGroup;
    }
    
    public void addStudentsToGroup(String idGroup,List<String> idStudents){
        int iMax = idStudents.size();
        
        for(int i = 0; i < iMax; i++){
            this.addStudentToGroup(idGroup,idStudents.get(i));
        }
        
    }
    
    public void addStudentToGroup(String idGroup,String idStudent){
        //TODO
    }
    
    public int addIntervenant(String nomIntervenant, String domainExpertise,int soldCumulJeton){
        //TODO
    }
    
    public void addIntervenantToProject(int idProject,String idIntervenant){
        //TODO
    }
    
    
}
