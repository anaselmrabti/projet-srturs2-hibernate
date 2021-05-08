/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmrabti.controller;

import com.elmrabti.dao.OperationDao;
import com.elmrabti.entity.Operation;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author anase
 */
public class OperationController extends ActionSupport{
    private Operation operation = new Operation();
    private OperationDao dao = new OperationDao();
    private List<Operation> operationList;
    private String em = "";
    private String sm = "";

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public OperationDao getDao() {
        return dao;
    }

    public void setDao(OperationDao dao) {
        this.dao = dao;
    }

    public List<Operation> getOperationList() {
        return operationList;
    }

    public void setOperationList(List<Operation> operationList) {
        this.operationList = operationList;
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
    
    public String afficherOperations(){
        operation.setNumCompte(operation.getNumCompte());
        operationList = dao.getOperations(operation.getNumCompte());
        return SUCCESS;
    }
    
    public String addOperation(){
        operation.setNumCompte(operation.getNumCompte());
        operation.setDateOperation(operation.getDateOperation());
        operation.setTypeMouvement(operation.getTypeMouvement());
        operation.setMontantMouvement(operation.getMontantMouvement());
        boolean status = dao.addOperation(operation);
        if(status){
            setSm("operation saved succssfuly");
            return SUCCESS;
        }else{
            setEm("Operation not saved");
            return INPUT;
        }
    }
    
}
