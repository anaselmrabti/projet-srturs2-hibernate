/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmrabti.dao;

import com.elmrabti.entity.Compte;
import com.elmrabti.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anase
 */
public class CompteDao {

    public boolean saveCompte(Compte c) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.save(c);
            t.commit();
            return true;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
        } finally {
            session.close();
        }
        return false;
    }

    public Compte getCompte(int num) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            Compte c = (Compte) session.get(Compte.class, num);
            t.commit();
            return c;
        } catch (Exception e) {
            if (t != null) {
                t.rollback();
            }
        } finally {
            session.close();
        }
        return null;
    }
}
