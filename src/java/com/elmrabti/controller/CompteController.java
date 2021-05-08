/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmrabti.controller;

import com.elmrabti.dao.CompteDao;
import com.elmrabti.entity.Compte;
import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author anase
 */
public class CompteController extends ActionSupport {

    Compte compte = new Compte();
    CompteDao dao = new CompteDao();
    String em = "";
    String sm = "";

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public CompteDao getDao() {
        return dao;
    }

    public void setDao(CompteDao dao) {
        this.dao = dao;
    }

    public String getEm() {
        return em;
    }

    public void setEm(String em) {
        this.em = em;
    }

    public String getSm() {
        return sm;
    }

    public void setSm(String sm) {
        this.sm = sm;
    }

    public String addCompte() {
        compte.setCodeClient(compte.getCodeClient());
        //compte.setNumCompte(compte.getNumCompte());
        compte.setDateCreation(compte.getDateCreation());
        compte.setSolde(compte.getSolde());
        boolean status = dao.saveCompte(compte);
        if (status) {
            setSm("client saved succssfuly");
            return SUCCESS;
        } else {
            setEm("compte not saved");
            return INPUT;
        }
    }
    
    public String getCompteByNum(){
        compte.setNumCompte(compte.getNumCompte());
        Compte c = dao.getCompte(compte.getNumCompte());
        if(c != null){
           compte.setCodeClient(c.getCodeClient());
           compte.setDateCreation(c.getDateCreation());
           compte.setSolde(c.getSolde());
            return SUCCESS;
        }else{
            setEm("Compte not found");
            return INPUT;
        }
    }
}
