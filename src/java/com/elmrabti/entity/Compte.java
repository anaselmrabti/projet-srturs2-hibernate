package com.elmrabti.entity;
// Generated Apr 26, 2021 12:50:47 AM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Compte generated by hbm2java
 */
public class Compte  implements java.io.Serializable {


     private Integer numCompte;
     private String codeClient;
     private Date dateCreation;
     private double solde;

    public Compte() {
    }

    public Compte(String codeClient, Date dateCreation, double solde) {
       this.codeClient = codeClient;
       this.dateCreation = dateCreation;
       this.solde = solde;
    }
   
    public Integer getNumCompte() {
        return this.numCompte;
    }
    
    public void setNumCompte(Integer numCompte) {
        this.numCompte = numCompte;
    }
    public String getCodeClient() {
        return this.codeClient;
    }
    
    public void setCodeClient(String codeClient) {
        this.codeClient = codeClient;
    }
    public Date getDateCreation() {
        return this.dateCreation;
    }
    
    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    public double getSolde() {
        return this.solde;
    }
    
    public void setSolde(double solde) {
        this.solde = solde;
    }




}


