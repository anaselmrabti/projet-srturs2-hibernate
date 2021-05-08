/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elmrabti.dao;

import com.elmrabti.entity.Operation;
import com.elmrabti.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author anase
 */
public class OperationDao {

    public boolean addOperation(Operation o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try {
            t = session.beginTransaction();
            session.save(o);
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
    
    public List<Operation> getOperations(int num){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = null;
        try{
            t = session.beginTransaction();
            String hql = "from Operation O where O.numCompte = :num";
            Query query = session.createQuery(hql);
            query.setParameter("num", num);
            List<Operation> operations = query.list();
            t.commit();
            return operations;
        }catch(Exception e){
            System.out.println(e);
            if(t != null){
                t.rollback();
            }
        }finally{
            session.close();
        }
        return null;
    }
}
