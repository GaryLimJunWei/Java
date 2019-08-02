package pojo;

import java.util.ArrayList;
import java.util.List;

import questions.Questions;

public class User
{
	private String ans;
	private int score;
	List<Questions> question = new ArrayList<Questions>();
	
	public void setAns(String ans) 
	{
		this.ans = ans;
	}
	
	public String getAns() 
	{
		return ans;
	}
	
	public int getScore(int score) {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
}
