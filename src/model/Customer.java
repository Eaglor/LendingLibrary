package model;

public class Customer {
	private String firstName;
	private String surName;
	private String mailingName;
	private String phNr;
	private int customerID;
	private boolean isValid;
	
	public Customer(String firstName, String surName, String mailingName, String phNr, int customerID){
		this.firstName = firstName;
		this.surName = surName;
		this.mailingName = mailingName;
		this.phNr = phNr;
		this.customerID = customerID;
		setName(firstName, surName, mailingName);
	}
	private void setName(String firstName, String surName, String mailingName) {
		this.firstName = firstName;
		this.surName = surName;
		this.mailingName = getMailingName();
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getSurName() {
		return surName;
	}
	
	public String getMailingName(){
		return mailingName;
	}
	
}
