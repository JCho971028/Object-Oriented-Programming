package PBL02;

import java.util.Scanner;

public class thismain
{
	public String Name;
	public String Id;
	public String Telnum;
	public String Email;
	public String From;
	public String In;
	
	public thismain()
	{
		
	}
	
	public thismain(String Name, String Id, String Telnum, String Email, String From)	//학생 생성자
	{
		this.Name = Name;
		this.Id = Id;
		this.Telnum = Telnum;
		this.Email = Email;
		this.From = From;
	}
	
	public thismain(String Name, String Id, String Telnum, String Email, String From, String In)	//교수,직원 생성자
	{
		this(Name, Id, Telnum, Email, From);
		this.In = In;
	}
	
	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String getId()
	{
		return Id;
	}
	
	public void setId(String Id)
	{
		this.Id = Id;
	}
	
	public String getTelnum()
	{
		return Telnum;
	}
	
	public void setTelnum(String Telnum)
	{
		this.Telnum = Telnum;
	}
	
	public String getEmail()
	{
		return Email;
	}
	
	public void setEmail(String Email)
	{
		this.Email = Email;
	}
	
	public String getFrom()
	{
		return From;
	}
	
	public void setFrom(String From)
	{
		this.From = From;
	}
	
	public String getIn()
	{
		return In;
	}
	
	public void setIn(String In)
	{
		this.In = In;
	}
	
	@Override
	public String toString() {
		
		if(In != null)
		{
			return "[ "+Name+" ] [ "+Id+" ] [ "+Telnum+" ] [ "+Email+" ] [ "+From+" ] [ "+In+" ]";
		}
		else
		{
			return "[ "+Name+" ] [ "+Id+" ] [ "+Telnum+" ] [ "+Email+" ] [ "+From+" ]";
		}
	}
}

class SubGrade extends thismain
	{
		public String Grade_name[][][] = new String[100][8][3];		//[학생][학기][과목이름]
		public double Grade_grade[][][] = new double[100][8][3];	//[학생][학기][성적]
		public String name;
		public String grade;
		
		public SubGrade(String Name, String Id, String Telnum, String Email, String From, String In)
		{
			super(Name, Id, Telnum, Email, From, In);
		}
		
		public SubGrade()
		{
		
		}
		
		public String getname()
		{
			return name;
		}
		
		public void setname(String name)
		{
			this.name = name;
		}
		
		public String getgrade()
		{
			return grade;
		}
		
		public void setgrade(String grade)
		{
			this.grade = grade;
		}
		
		public String getname(int a, int b, int c)
		{
			return Grade_name[a][b][c];
		}
		
		public void setname(int a, int b, int c, String name)
		{
			Grade_name[a][b][c] = name;
		}
		
		public double getgrade(int a, int b, int c)
		{
			return Grade_grade[a][b][c];
		}
		
		public void setgrade(int a, int b, int c, double grade)
		{
			Grade_grade[a][b][c] = grade;
		}
		
		public void Print(int index)
		{
			for(int i=0 ; i<8 ; i++)
			{
				for(int j=0 ; j<3 ; j++)
				{
					if(Grade_grade[index][i][j] == 0)
						continue;
					System.out.println(i+1+"학기의 '"+getname(index,i,j)+"' 과목의 성적은 "+getgrade(index,i,j)+"점 입니다.");
				}
			}
		}
		
		public void ModPrint(int index, int a, int b)
		{
			System.out.println(a+1+"학기의 '"+getname(index,a,b)+"' 과목의 변경된 성적은 "+getgrade(index,a,b)+"점 입니다.");
		}
	}