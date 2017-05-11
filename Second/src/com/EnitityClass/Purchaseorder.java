package com.EnitityClass;

import javax.persistence.*;
import java.util.List;

/**
 * Created by Dhananjayan on 5/5/2017.
 */
@Entity
public class Purchaseorder implements Comparable<Purchaseorder>{
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
    Integer Ponumber;
    @Column
    String Status;
    @Column
    String Priority;
    @Column
    String Issue_date;
    @Column
    String Due_date;
    @Column
    String Seller;
    @Column
    String Billto;
    @Column
    String Transresp;
    @Column
    String Incoterms;
    @Column
    String Destignatedmode;
    @Column
    String carrier;
    @Column
    String Mustship;
    @Column

    @OneToMany(cascade=CascadeType.ALL)
    private List<Originadd> Originaddress;
    @Column
    @OneToMany(cascade=CascadeType.ALL)
    private List<Destinationadd> Destinationaddress;

    public Integer getPonumber() {
        return Ponumber;
    }

    public void setPonumber(Integer ponumber) {
        Ponumber = ponumber;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }

    public String getIssue_date() {
        return Issue_date;
    }

    public void setIssue_date(String issue_date) {
        Issue_date = issue_date;
    }

    public String getDue_date() {
        return Due_date;
    }

    public void setDue_date(String due_date) {
        Due_date = due_date;
    }

    public String getSeller() {
        return Seller;
    }

    public void setSeller(String seller) {
        Seller = seller;
    }

    public String getBillto() {
        return Billto;
    }

    public void setBillto(String billto) {
        Billto = billto;
    }

    public String getTransresp() {
        return Transresp;
    }

    public void setTransresp(String transresp) {
        Transresp = transresp;
    }

    public String getIncoterms() {
        return Incoterms;
    }

    public void setIncoterms(String incoterms) {
        Incoterms = incoterms;
    }

    public String getDestignatedmode() {
        return Destignatedmode;
    }

    public void setDestignatedmode(String destignatedmode) {
        Destignatedmode = destignatedmode;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getMustship() {
        return Mustship;
    }

    public void setMustship(String mustship) {
        Mustship = mustship;
    }

    public List<Originadd> getOriginaddress() {
        return Originaddress;
    }

    public void setOriginaddress(List<Originadd> originaddress) {
        Originaddress = originaddress;
    }

    public List<Destinationadd> getDestinationaddress() {
        return Destinationaddress;
    }

    public void setDestinationaddress(List<Destinationadd> destinationaddress) {
        Destinationaddress = destinationaddress;
  }

    @Override
    public int compareTo(Purchaseorder o) {
        return this.Priority.compareTo(o.Priority);
    }

  /*  @OneToMany(cascade = CascadeType.ALL)
    List<Address> addresses;

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }
*/
}
