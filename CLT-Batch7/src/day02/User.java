package day02;


public class User 
{
		private String userID;
		private String userPassword;
		int age;
		
		

		

	

		//getter method is always returning values 
		public String getUserID() 
		{
			return userID;
		}
		
		public String getUserPassword() 
		{
			return userPassword;
		}
		
		public int getAge() 
		{
			return age;
		}
		
		
		
		//setter method is always void
		public void setUserID(String userID) 
		{
			this.userID = userID;
		}
		
		public void setUserPassword(String userPassword) 
		{
			this.userPassword = userPassword;
		}
		
		public void setAge(int age) 
		{
			this.age = age;
		}
		
	

}
