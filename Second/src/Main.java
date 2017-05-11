import com.EnitityClass.Address;
import com.EnitityClass.Destinationadd;
import com.EnitityClass.Originadd;
import com.EnitityClass.Purchaseorder;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
public class Main {
   // private static final SessionFactory ourSessionFactory;

   /* static {
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
    }*/

    public static void main(final String[] args) throws Exception {
   //     final Session session = getSession();
        try {
            //Transaction tx=session.beginTransaction();


/*

            List<Originadd> home=new ArrayList<Originadd>();
            Originadd homeaddress=new Originadd();
            homeaddress.setPickup_Start_date("dfghj");
            homeaddress.setPickup_End_date("dfgh");

            List<Destinationadd> office=new ArrayList<Destinationadd>();
            Destinationadd officeaddress=new Destinationadd();
            officeaddress.setDelivery_Start_date("ecrv");
            officeaddress.setDelivery_End_date("dcfvg");

            home.add(homeaddress);
            session.persist(homeaddress);
            office.add(officeaddress);
            session.persist(officeaddress);

            List<Address> addressList=new ArrayList<Address>();
            Address ad=new Address();
            ad.setRef_name("abcd");
            ad.setCity("bengaluru");
            ad.setState("Karnataka");
            ad.setCountry("India");
            ad.setOriginAddress(home);
            ad.setDestinationAddress(office);

            addressList.add(ad);
            session.persist(ad);


            Purchaseorder order=new Purchaseorder();
            order.setPonumber(12345);
            order.setStatus("NEW");
            order.setPriority("LOSER");
            order.setIssue_date("21-07-1995");
            order.setDue_date("05-08-1998");
            order.setSeller("ramupandi");
            order.setBillto("qwert");
            order.setTransresp("welcome");
            order.setIncoterms("designatedmode");
            order.setCarrier("rtehsg");
            order.setMustship("true");
            order.setDestinationaddress(office);
            order.setOriginaddress(home);

            session.persist(order);

*/

        /*tx.commit();
        session.close();*/

    }
        catch(Exception e){
        e.printStackTrace();
    }
        finally {
       // session.close();
        System.exit(0);
    }
}
}