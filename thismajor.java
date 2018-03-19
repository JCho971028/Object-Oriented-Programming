package PBL02;

import java.util.Scanner;

public class thismajor
{
	public String Name;
	public String Telnum;
	public String Address;
	public String Assist;
	public String Professor;
	public String Email;
	public String Website;
	//교과목 생성자
	public thismajor (String Name, String Telnum, String Assist, String Professor, String Email, String Address, String Website)
	{
		this.Name = Name;
		this.Telnum = Telnum;
		this.Address = Address;
		this.Assist = Assist;
		this.Professor = Professor;
		this.Email = Email;
		this.Website = Website;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}

	public String getTelnum()
	{
		return Telnum;
	}
	
	public void setTelnum(String Telnum)
	{
		this.Telnum = Telnum;
	}
	
	public String getAddress()
	{
		return Address;
	}
	
	public void setAddress(String Address)
	{
		this.Address = Address;
	}
	
	public String getAssist()
	{
		return Assist;
	}
	
	public void setAssist(String Assist)
	{
		this.Assist = Assist;
	}
	
	public String getProfessor()
	{
		return Professor;
	}
	
	public void setProfessor(String Professor)
	{
		this.Professor = Professor;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getWebsite()
	{
		return Website;
	}
	
	public void setWebsite(String Website)
	{
		this.Website = Website;
	}
	
	@Override
	public String toString() {
	
		return "[ " +Name+" ] [ "+Telnum+" ] [ "+Assist+" ] [ "+Professor+" ] [ "+Email+" ] [ "+Address+" ] [ "+Website+" ]";
	}
}

