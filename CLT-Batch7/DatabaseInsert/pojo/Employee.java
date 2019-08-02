package pojo;

import service.databaseService;

public class Employee 
{
	int id;
	String password,dob;
	databaseService refSvc = new databaseService();
	
	public databaseService getRefSvc() {
		return refSvc;
	}
	
	public void setRefSvc(databaseService refSvc) {
		this.refSvc = refSvc;
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getDob() {
		return dob;
	}
	
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	
	


}
