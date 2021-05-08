/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmrabti.dao;

import com.elmrabti.entity.Client;
import com.elmrabti.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anase
 */
public class ClientDao {

    public boolean saveClient(Client c) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.save(c);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            if (t != null) {
                t.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    public List<Client> getAllClients() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            List<Client> list = session.createQuery("from Client").list();
            t.commit();
            return list;
        } catch (Exception e) {
            System.out.println(e);
            if (t != null) {
                t.rollback();
            }
        } finally {
            session.close();
        }

        return null;
    }

    public Client getClient(String code) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        Client client = null;
        try {
            t = session.beginTransaction();
            client = (Client) session.get(Client.class, code);
            t.commit();
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
        } finally {
            session.close();
        }
        return client;
    }
}
