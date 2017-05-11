package com.EnitityClass;

import javax.persistence.*;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
@Entity(name="Destinat_address")
@PrimaryKeyJoinColumn(name = "ID")
public class Destinationadd extends Address {

    @Column
            String shipto;
    @Column
    String Delivery_Start_date;
    @Column
    String Delivery_End_date;

    public String getShipto() {
        return shipto;
    }

    public void setShipto(String shipto) {
        this.shipto = shipto;
    }

    public String getDelivery_Start_date() {
        return Delivery_Start_date;
    }

    public void setDelivery_Start_date(String delivery_Start_date) {
        Delivery_Start_date = delivery_Start_date;
    }

    public String getDelivery_End_date() {
        return Delivery_End_date;
    }

    public void setDelivery_End_date(String delivery_End_date) {
        Delivery_End_date = delivery_End_date;
    }
}
