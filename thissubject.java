package PBL02;

public class thissubject
{
	public String Name;
	public String Professor;
	public String Clas;
	//학과 생성자
	public thissubject (String Name, String Professor, String Clas)
	{
		this.Name = Name;
		this.Professor = Professor;
		this.Clas = Clas;
	}

	public String getName()
	{
		return Name;
	}
	
	public void setName(String Name)
	{
		this.Name = Name;
	}
	
	public String getProfessor()
	{
		return Professor;
	}
	
	public void setProfessor(String Professor)
	{
		this.Professor = Professor;
	}
	
	public String getClas()
	{
		return Clas;
	}
	
	public void setClas(String Clas)
	{
		this.Clas = Clas;
	}
	
	@Override
	public String toString() {
		
		if(Name.length()>7)
		{
			return "[ " +Name+" ] [ "+Professor+" ] [ "+Clas+" ]";
		}
		
		else
		{
			return "[ " +Name+" ]\t [ "+Professor+" ] [ "+Clas+" ]";
		}
		
	}
}

class SubStudent
{
	public String list[][] = new String [20][10];	//[과목분류][학생인덱스]
	public String name;
	
	public SubStudent()
	{
		
	}
	
	public SubStudent(String[][] list, String name)
	{
		this.list = list;
		this.name = name;
	}
	
	public String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public String getsubstudent(int a, int b)
	{
		return list[a][b];
	}
	
	public void setsubstudent(int a, int b, String name)
	{
		list[a][b] = name;
	}
	
	public void Print(int index)
	{
		for(int i=0 ; i<10 ; i++)
		{
			if(list[index][i] == null)
				continue;
			System.out.println("["+getsubstudent(index,i)+"]");
		}
	}
	
	public int Delete(int index, String input)
	{
		int j = 0;
		for(int i=0 ; i<10 ; i++)
		{
			if(input.equals(list[index][i]))
			{
				j = i;
				break;
			}
		}
		
		return j;
	}
}
