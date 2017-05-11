package com.EnitityClass;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
@Entity
@Inheritance(strategy =InheritanceType.JOINED)
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    @Column
    String Street;
    @Column
    String City;
    @Column
    String State;
    @Column
    String Country;



    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }



    /*@OneToMany(cascade = CascadeType.ALL)
    List<Originadd> originAddress;

    @OneToMany(cascade = CascadeType.ALL)
    List<Destinationadd> destinationAddress;


    public List<Originadd> getOriginAddress() {
        return originAddress;
    }

    public void setOriginAddress(List<Originadd> originAddress) {
        this.originAddress = originAddress;
    }
    public List<Destinationadd> getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(List<Destinationadd> destinationAddress) {
        this.destinationAddress = destinationAddress;
    }*/



}
