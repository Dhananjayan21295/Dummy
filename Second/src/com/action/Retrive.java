package com.action;

import com.EnitityClass.Purchaseorder;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
public class Retrive extends org.apache.struts.action.Action {
    private Integer count;
    private final static String SUCCESS="success";
    private static final SessionFactory ourSessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();

            ourSessionFactory = configuration.buildSessionFactory();
        } catch (Throwable ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {

        Session session=getSession();

        Transaction transaction= session.beginTransaction();
               // List<Purchaseorder> gets = session.createQuery("  FROM Purchaseorder ").list();

        String sql = "FROM Purchaseorder ";
        org.hibernate.query.Query query = session.createQuery(sql);
        query.setFirstResult(Insert2DB.count * 3);
        Insert2DB.count++;
        System.out.println("*&*&*&*&*&*&*&*&*&");
        query.setMaxResults(3);
        List<Purchaseorder> gets = query.list();
        List<Purchaseorder>po=new ArrayList<>();
        for(int i=0;i<gets.size();i++){
            System.out.println("qwertyuiopasdfghjkl:"+i);
            Purchaseorder por=(Purchaseorder)gets.get(i);
            po.add(por);
        }
        Collections.sort(po);

       /* for(Purchaseorder Get :gets) {
                    System.out.println(Get.toString());

                }*/
        transaction.commit();
        session.close();
        request.setAttribute("gets", gets);
        return mapping.findForward(SUCCESS);
    }
}
