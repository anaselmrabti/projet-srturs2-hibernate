/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmrabti.controller;

import com.elmrabti.dao.ClientDao;
import com.elmrabti.entity.Client;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author anase
 */
public class ClientController extends ActionSupport{
    
    private List<Client> clientList;
    private ClientDao dao = new ClientDao();
    private Client client = new Client();
    private String em = "";
    private String sm = "";

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }

    public ClientDao getDao() {
        return dao;
    }

    public void setDao(ClientDao dao) {
        this.dao = dao;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
    

    @Override
    public String execute() throws Exception {
        this.clientList = dao.getAllClients();
        return SUCCESS;
    }
    
    public String addClient(){
        client.setCodeClient(client.getCodeClient());
        client.setNomClient(client.getNomClient());
        client.setAdresseClient(client.getAdresseClient());
        boolean status = dao.saveClient(client);
        if(status){
            setSm("client saved succssfuly");
            return SUCCESS;
        }else{
            setEm("client not saved");
            return INPUT;
        }
    }
    
    public String getClientByCode(){
        client.setCodeClient(client.getCodeClient());
        Client c = dao.getClient(client.getCodeClient());
        if(c != null){
            client.setCodeClient(c.getCodeClient());
            client.setNomClient(c.getNomClient());
            client.setAdresseClient(c.getAdresseClient());
            return SUCCESS;
        }else{
            setEm("Client not found");
            return INPUT;
        }
    }
}
