package com.finlabs.finexa.model;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.List;

public class UserInRedis implements Serializable {

	private static final long serialVersionUID = 1L;
	 private int id;
     private String username;
     private String emailID;
     private int clientID;
     private String clientName;
     private String clientEmailID;
     private BigInteger clientMobile;
     private String clientRETIREMENT_STATUS;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public int getClientID() {
		return clientID;
	}
	public void setClientID(int clientID) {
		this.clientID = clientID;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientEmailID() {
		return clientEmailID;
	}
	public void setClientEmailID(String clientEmailID) {
		this.clientEmailID = clientEmailID;
	}
	public BigInteger getClientMobile() {
		return clientMobile;
	}
	public void setClientMobile(BigInteger clientMobile) {
		this.clientMobile = clientMobile;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getClientRETIREMENT_STATUS() {
		return clientRETIREMENT_STATUS;
	}
	public void setClientRETIREMENT_STATUS(String clientRETIREMENT_STATUS) {
		this.clientRETIREMENT_STATUS = clientRETIREMENT_STATUS;
	}

}