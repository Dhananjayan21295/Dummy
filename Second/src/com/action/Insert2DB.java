package com.action;

import com.EnitityClass.Destinationadd;
import com.EnitityClass.Originadd;
import com.EnitityClass.Purchaseorder;
import com.form.Insert2DBForm;
//import po.Purchaseorder;
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
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.valueOf;


/**
 * Created by Dhananjayan on 5/5/2017.
 */
public class Insert2DB extends org.apache.struts.action.Action {
    static int count=0;
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



       Insert2DBForm insert =(Insert2DBForm) form;
        insert.setPonumber(request.getParameter("ponumber"));
        System.out.println(request.getParameter("ponumber"));
        insert.setStatus(request.getParameter("status"));
        insert.setPriority(request.getParameter("priority"));
        insert.setIssuedate(request.getParameter("poissuedate"));
        insert.setDuedate(request.getParameter("duedate"));
        insert.setSeller(request.getParameter("seller"));
        insert.setShipfrom(request.getParameter("shipfrom"));
        insert.setShipto(request.getParameter("shipto"));
        insert.setBillto(request.getParameter("billto"));
        insert.setTrans(request.getParameter("transresp"));
        insert.setIncoterms(request.getParameter("incoterms"));
        insert.setMustship(valueOf(Boolean.valueOf(request.getParameter("check"))));
        insert.setDesig(request.getParameter("designstedmode"));
        insert.setCarrier(request.getParameter("carrier"));
        insert.setDeliveryenddate(request.getParameter("deliverystart"));
        insert.setDeliverystartdate(request.getParameter("deliveryend"));
        insert.setPickupstartdate(request.getParameter("pickupstart"));
        insert.setPickupenddate(request.getParameter("pickupend"));
        insert.setCity(request.getParameter("city"));
        insert.setCountry(request.getParameter("country"));
        insert.setStreet(request.getParameter("street"));
        insert.setState(request.getParameter("state"));
        //insert.setName(request.getParameter("country"));


       Session session=getSession();
        Transaction tr=session.beginTransaction();
       try{
           System.out.println("querying all the managed entities...");

           List<Originadd> or=new ArrayList<>();
           Originadd origin=new Originadd();

           origin.setCity(insert.getCity());
           origin.setCountry(insert.getCountry());
           origin.setShipfrom(insert.getShipfrom());
           origin.setState(insert.getState());
           origin.setStreet(insert.getStreet());
           origin.setPickup_End_date(insert.getPickupenddate());
           origin.setPickup_Start_date(insert.getPickupstartdate());
           or.add(origin);

           List<Destinationadd>dr=new ArrayList<>();
           Destinationadd destination = new Destinationadd();

           destination.setCity(insert.getCity());
           destination.setCountry(insert.getCountry());
           destination.setShipto(insert.getShipto());
           destination.setState(insert.getState());
           destination.setStreet(insert.getStreet());
           destination.setDelivery_End_date(insert.getDeliveryenddate());
           destination.setDelivery_Start_date(insert.getDeliverystartdate());
           dr.add(destination);

           Purchaseorder entity=new Purchaseorder();
           entity.setPonumber(Integer.parseInt(request.getParameter("ponumber")));
           entity.setStatus(insert.getStatus());
           entity.setPriority(insert.getPriority());
           entity.setIssue_date(insert.getIssuedate());
           entity.setDue_date(insert.getDuedate());
           entity.setSeller(insert.getSeller());

           entity.setBillto(insert.getBillto());
           entity.setTransresp(insert.getTrans());
           entity.setIncoterms(insert.getIncoterms());
           entity.setMustship(insert.getMustship());
           entity.setDestignatedmode(insert.getDesig());
           entity.setCarrier(insert.getCarrier());

           entity.setDestinationaddress(dr);
           entity.setOriginaddress(or);

           session.save(entity);


           tr.commit();
           session.close();

       }catch (Exception e){
           e.printStackTrace();
       }finally {
           session.close();
       }

        return mapping.findForward(SUCCESS);
    }
}
