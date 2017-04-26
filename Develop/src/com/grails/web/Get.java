package com.grails.web;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Get {
	private String supplier;
    private int duedate;
    private String postatus;
    private int priority;
    private String items;
    private String shipfrom;
    private String transresp;
    private String country;
    private int ponumber;
    
    
 
    
    
    public String getSupplier() {
		return supplier;
	}





	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}





	public int getDuedate() {
		return duedate;
	}





	public void setDuedate(int duedate) {
		this.duedate = duedate;
	}





	public String getPostatus() {
		return postatus;
	}





	public void setPostatus(String postatus) {
		this.postatus = postatus;
	}





	public int getPriority() {
		return priority;
	}





	public void setPriority(int priority) {
		this.priority = priority;
	}





	public String getItems() {
		return items;
	}





	public void setItems(String items) {
		this.items = items;
	}





	public String getShipfrom() {
		return shipfrom;
	}





	public void setShipfrom(String shipfrom) {
		this.shipfrom = shipfrom;
	}





	public String getTransresp() {
		return transresp;
	}





	public void setTransresp(String transresp) {
		this.transresp = transresp;
	}





	public String getCountry() {
		return country;
	}





	public void setCountry(String country) {
		this.country = country;
	}





	public int getPonumber() {
		return ponumber;
	}





	public void setPonumber(int ponumber) {
		this.ponumber = ponumber;
	}





	@Override
	public String toString() {
		return "Get [supplier=" + supplier + ", duedate=" + duedate + ", postatus=" + postatus + ", priority="
				+ priority + ", items=" + items + ", shipfrom=" + shipfrom + ", transresp=" + transresp + ", country="
				+ country + ", ponumber=" + ponumber + "]";
	}





	/*public Get (ResultSet resultSet) throws SQLException
    {
        this.ponumber = resultSet.getInt("ponumber");
        this.duedate = resultSet.getInt("duedate");
        this.priority = resultSet.getInt("priority");
        this.country = resultSet.getString("country");
        this.transresp = resultSet.getString("transresp");
        this.supplier = resultSet.getString("supplier");
        this.postatus = resultSet.getString("postatus");
        this.items = resultSet.getString("items");
        this.shipfrom = resultSet.getString("shipfrom");
        
    }*/
}
