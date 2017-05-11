package com.EnitityClass;

import javax.persistence.*;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
@Entity(name="Origin_address")
@PrimaryKeyJoinColumn(name = "ID")
public class Originadd extends Address{
    @Column
    String shipfrom;
    @Column
    String Pickup_Start_date;
    @Column
    String Pickup_End_date;

    public String getShipfrom() {
        return shipfrom;
    }

    public void setShipfrom(String shipfrom) {
        this.shipfrom = shipfrom;
    }

    public String getPickup_Start_date() {
        return Pickup_Start_date;
    }

    public void setPickup_Start_date(String pickup_Start_date) {
        Pickup_Start_date = pickup_Start_date;
    }

    public String getPickup_End_date() {
        return Pickup_End_date;
    }

    public void setPickup_End_date(String pickup_End_date) {
        Pickup_End_date = pickup_End_date;
    }
}
