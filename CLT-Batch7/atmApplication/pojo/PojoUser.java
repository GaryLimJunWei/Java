package pojo;



import java.sql.PreparedStatement;

import atmDatabase.AtmDBConnection;
import bankDAO.UserChoiceDAO;
import bankDAO.UserChoiceDAOImpl;
import bankServices.MessagePrintServices;
import bankServices.MessagePrintServicesImpl;

public class PojoUser
{
	MessagePrintServices refMsg = new MessagePrintServicesImpl(); //up casting
	UserChoiceDAO refChoiceSvc = new UserChoiceDAOImpl();
	private double bankAmount;
	private String email,password,color;

	

	
	public MessagePrintServices getRefMsg() {
		return refMsg;
	}
	
	public UserChoiceDAO getRefChoiceSvc() {
		return refChoiceSvc;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getColor() {
		return color;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}

	public void depositAmount(double amt)
	{
		bankAmount += amt; 
	}
	
	public void withdrawAmount(double amt)
	{
		bankAmount -= amt;
	}
	
	private String DefaultEmail = "xyz@gmail.com";
	
	
	public void setBankAmount(double bankAmount) {
		this.bankAmount = bankAmount;
	}
	
	public void setDefaultEmail(String defaultEmail) {
		DefaultEmail = defaultEmail;
	}
	
	public double getBankAmount() {
		return bankAmount;
	}
	
	
	public String getDefaultEmail() {
		return DefaultEmail;
	}


	
	
	
	
	

}
