package PBL02;

import java.util.ArrayList;
import java.util.Scanner;

public class algomain {
	static ArrayList<thismain> ProList = new ArrayList<thismain>();
	static ArrayList<thismain> ClerkList = new ArrayList<thismain>();
	static ArrayList<thismain> StuList = new ArrayList<thismain>();
	static ArrayList<thismajor> MajorList = new ArrayList<thismajor>();
	static ArrayList<thissubject> SubList = new ArrayList<thissubject>();
	
//	thismain stu = new SubGrade();
//	SubGrade Stu = (SubGrade) stu;
	SubGrade Stu = new SubGrade();
	SubStudent Sub = new SubStudent();
	
	public algomain()
	{
		ProList.add(new thismain("�̸���", "10001", "010-1001-1001", "manheelee@naver.com", "��ǻ�Ͱ��а�", "20100001"));
		ProList.add(new thismain("�ҿ쿵", "10002", "010-1002-1002", "wooyoungso@naver.com", "��ǻ�Ͱ��а�", "20100002"));
		ProList.add(new thismain("������", "10003", "010-1003-1003", "einchoi@naver.com", "��ǻ�Ͱ��а�", "20100003"));
		ProList.add(new thismain("������", "10004", "010-1004-1004", "jinmanjung@naver.com", "������Ű��а�", "20100004"));
		ProList.add(new thismain("������", "10005", "010-1005-1005", "jeinbaek@naver.com", "������Ű��а�", "20100005"));
		ProList.add(new thismain("������", "10006", "010-1006-1006", "choongheenam@naver.com", "���������а�", "20100006"));
		
		ClerkList.add(new thismain("�ֽ���", "20001", "010-2001-2001", "bigbang01@naver.com", "��ǻ�Ͱ��а�", "20100001"));
		ClerkList.add(new thismain("���뼺", "20011", "010-2011-2011", "bigbang04@naver.com", "��ǻ�Ͱ��а�", "20100001"));
		ClerkList.add(new thismain("������", "20002", "010-2002-2002", "bigbang02@naver.com", "������Ű��а�", "20100002"));
		ClerkList.add(new thismain("�̽���", "20022", "010-2022-2022", "bigbang05@naver.com", "������Ű��а�", "20100002"));
		ClerkList.add(new thismain("������", "20003", "010-2003-2003", "bigbang03@naver.com", "���������а�", "20100003"));
		
		StuList.add(new thismain("������", "20160745", "010-2951-1028", "ckr971028@gmail.com", "��ǻ�Ͱ��а�"));
		Stu.setname(0, 0, 0, "��ǻ�Ͱ���"); //�л�,�б�,�����ε���,�����Է�
		Stu.setgrade(0, 0, 0, 4.2);		//�л�,�б�,�����ε���,�����Է�
		Stu.setname(0, 0, 1, "�����ΰ� ����");
		Stu.setgrade(0, 0, 1, 3.5);
		Stu.setname(0, 1, 0, "������ȣ����");
		Stu.setgrade(0, 1, 0, 4.5);
		Stu.setname(0, 1, 1, "�ǿ뿵��");
		Stu.setgrade(0, 1, 1, 4.0);
		StuList.add(new thismain("���翵", "20131183", "010-2168-5505", "codingbt@naver.com", "��ǻ�Ͱ��а�"));
		Stu.setname(1, 0, 0, "��ǻ�Ͱ���");
		Stu.setgrade(1, 0, 0, 4.5);
		Stu.setname(1, 0, 1, "�����ΰ� ����");
		Stu.setgrade(1, 0, 1, 4.5);
		Stu.setname(1, 1, 0, "������ȣ����");
		Stu.setgrade(1, 1, 0, 4.5);
		Stu.setname(1, 1, 0, "�ǿ뿵��");
		Stu.setgrade(1, 1, 0, 4.5);
		StuList.add(new thismain("������", "20160001", "010-0000-0000", "jungtong1@naver.com", "������Ű��а�"));
		Stu.setname(2, 0, 0, "��ǻ�Ͱ���");
		Stu.setgrade(2, 0, 0, 4.0);
		Stu.setname(2, 0, 1, "�����ΰ� ����");
		Stu.setgrade(2, 0, 1, 3.2);
		Stu.setname(2, 1, 0, "������ȣ����");
		Stu.setgrade(2, 1, 0, 3.0);
		Stu.setname(2, 1, 0, "�ǿ뿵��");
		Stu.setgrade(2, 1, 0, 4.5);
		StuList.add(new thismain("������", "20160002", "010-0001-0001", "jungtong2@naver.com", "������Ű��а�"));
		Stu.setname(3, 0, 0, "��ǻ�Ͱ���");
		Stu.setgrade(3, 0, 0, 3.5);
		Stu.setname(3, 0, 1, "�����ΰ� ����");
		Stu.setgrade(3, 0, 1, 3.5);
		Stu.setname(3, 1, 0, "������ȣ����");
		Stu.setgrade(3, 1, 0, 3.5);
		Stu.setname(3, 1, 0, "�ǿ뿵��");
		Stu.setgrade(3, 1, 0, 4.0);
		StuList.add(new thismain("������", "20160003", "010-0002-0002", "jungtong3@naver.com", "������Ű��а�"));
		Stu.setname(4, 0, 0, "��ǻ�Ͱ���");
		Stu.setgrade(4, 0, 0, 3.5);
		Stu.setname(4, 0, 1, "�����ΰ� ����");
		Stu.setgrade(4, 0, 1, 3.0);
		Stu.setname(4, 1, 0, "������ȣ����");
		Stu.setgrade(4, 1, 0, 3.0);
		Stu.setname(4, 1, 0, "�ǿ뿵��");
		Stu.setgrade(4, 1, 0, 4.0);
		StuList.add(new thismain("������", "20160004", "010-0004-0004", "gyangsen@naver.com", "���������а�"));
		Stu.setname(5, 0, 0, "��ǻ�Ͱ���");
		Stu.setgrade(5, 0, 0, 3.5);
		Stu.setname(5, 0, 1, "�����ΰ� ����");
		Stu.setgrade(5, 0, 1, 4.0);
		Stu.setname(5, 1, 0, "������ȣ����");
		Stu.setgrade(5, 1, 0, 3.0);
		Stu.setname(5, 1, 0, "�ǿ뿵��");
		Stu.setgrade(5, 1, 0, 4.5);
		
		MajorList.add(new thismajor("��ǻ�Ͱ��а�", "042-000-0000", "���������� ����� ������", "?", "�� ��", "hnucom@gmail.com", "www.hnucom.com"));
		MajorList.add(new thismajor("������Ű��а�", "042-111-1111", "���������� ����� ������", "?", "������", "hnu@gmail.com", "www.hnu.com"));
		MajorList.add(new thismajor("���������а�", "042-222-2222", "���������� ����� ������", "?", "������", "hnu@gmail.com", "www.hnu.com"));
		
		SubList.add(new thissubject("��ü�������α׷���", "�̸���", "090517"));
		Sub.setsubstudent(0, 0, "������");
		Sub.setsubstudent(0, 1, "���翵");
		SubList.add(new thissubject("���ռ����̷�", "�ҿ쿵", "090409"));
		Sub.setsubstudent(1, 0, "������");
		Sub.setsubstudent(1, 1, "���翵");
		Sub.setsubstudent(1, 2, "������");
		Sub.setsubstudent(1, 3, "������");
		Sub.setsubstudent(1, 4, "������");
		SubList.add(new thissubject("�����ͱ���", "������", "090522"));
		Sub.setsubstudent(2, 0, "������");
		SubList.add(new thissubject("���ڱ���", "������", "090419"));
		Sub.setsubstudent(3, 0, "������");
		Sub.setsubstudent(3, 1, "������");
		Sub.setsubstudent(3, 2, "������");
		Sub.setsubstudent(3, 3, "������");
	}
	
	public void PrintAll(int i)		//��ü������ 	i=����,����,�л�,�а�,������ �з�
	{
		switch(i)
		{
		case 1:
			for(thismain Professor : ProList )
			 {
		            System.out.println(Professor);
		     }
			break;
			
		case 2:
			for(thismain Clerk : ClerkList )
			 {
		            System.out.println(Clerk);
		     }
			break;
			
		case 3:
			for(thismain Student : StuList )
			 {
		            System.out.println(Student);
		     }
			break;
			
		case 4:
			for(thismajor Major : MajorList )
			 {
		            System.out.println(Major);
		     }
			break;
			
		case 5:
			for(thissubject Subject : SubList )
			 {
		            System.out.println(Subject);
		     }
			break;
		default :
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}
	
	}

	public void Add(int i)		//�߰� �޼ҵ�
	{
		switch(i)
		{
		case 1:
			Scanner add1 = new Scanner(System.in);
			System.out.print("������ �̸��� �Է��ϼ��� : ");
			String Name1 = add1.next();
			System.out.print("������ ����� �Է��ϼ��� : ");
			String Id1 = add1.next();
			System.out.print("������ ��ȭ��ȣ�� �Է��ϼ��� : ");
			String Telnum1 = add1.next();
			System.out.print("������ �̸����� �Է��ϼ��� : ");
			String Email1 = add1.next();
			System.out.print("������ �а��� �Է��ϼ��� : ");
			String From1 = add1.next();
			System.out.print("������ �Ի����� �Է��ϼ��� : ");
			String In1 = add1.next();
			
			ProList.add(new thismain(Name1, Id1, Telnum1, Email1, From1, In1));
			System.out.println("\n���������� ����Ǿ����ϴ�.");
			break;
			
		case 2:
			Scanner add2 = new Scanner(System.in);
			System.out.print("������ �̸��� �Է��ϼ��� : ");
			String Name2 = add2.next();
			System.out.print("������ ����� �Է��ϼ��� : ");
			String Id2 = add2.next();
			System.out.print("������ ��ȭ��ȣ�� �Է��ϼ��� : ");
			String Telnum2 = add2.next();
			System.out.print("������ �̸����� �Է��ϼ��� : ");
			String Email2 = add2.next();
			System.out.print("������ �μ��� �Է��ϼ��� : ");
			String From2 = add2.next();
			System.out.print("������ �Ի����� �Է��ϼ��� : ");
			String In2 = add2.next();
			
			ClerkList.add(new thismain(Name2, Id2, Telnum2, Email2, From2, In2));
			System.out.println("\n���������� ����Ǿ����ϴ�.");
			break;
			
		case 3:
			Scanner add3 = new Scanner(System.in);
			System.out.print("�л��� �̸��� �Է��ϼ��� : ");
			String Name3 = add3.next();
			System.out.print("�л��� �й��� �Է��ϼ��� : ");
			String Id3 = add3.next();
			System.out.print("�л��� ��ȭ��ȣ�� �Է��ϼ��� : ");
			String Telnum3 = add3.next();
			System.out.print("�л��� �̸����� �Է��ϼ��� : ");
			String Email3 = add3.next();
			System.out.print("�л��� �а��� �Է��ϼ��� : ");
			String From3 = add3.next();
			
			StuList.add(new thismain(Name3, Id3, Telnum3, Email3, From3));
			System.out.println("\n���������� ����Ǿ����ϴ�.");
			break;
			
		case 4:
			Scanner add4 = new Scanner(System.in);
			System.out.print("�а��� �̸��� �Է��ϼ��� : ");
			String Name4 = add4.next();
			System.out.print("�а��� ��ȭ��ȣ�� �Է��ϼ��� : ");
			String Telnum4 = add4.next();
			System.out.print("�а��� �ּҸ� �Է��ϼ��� : ");
			String Address4 = add4.next();
			System.out.print("�а��� �������� �Է��ϼ��� : ");
			String Assist4 = add4.next();
			System.out.print("�а��� �������� �Է��ϼ��� : ");
			String Professor4 = add4.next();
			System.out.print("�а��� �̸����� �Է��ϼ��� : ");
			String Email4 = add4.next();
			System.out.print("�а��� ���ּҸ� �Է��ϼ��� : ");
			String Web4 = add4.next();
			
			MajorList.add(new thismajor(Name4, Telnum4, Address4, Assist4, Professor4, Email4, Web4));
			System.out.println("\n���������� ����Ǿ����ϴ�.");
			break;
			
		case 5:
			Scanner add5 = new Scanner(System.in);
			System.out.print("������ �̸��� �Է��ϼ��� : ");
			String Name5 = add5.next();
			System.out.print("������ ������ �Է��ϼ��� : ");
			String Professor5 = add5.next();
			System.out.print("������ ���ǽ��� �Է��ϼ��� : ");
			String Clas5 = add5.next();
			
			SubList.add(new thissubject(Name5, Professor5, Clas5));
			System.out.println("\n���������� ����Ǿ����ϴ�.");
			break;
		default :
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}
	}
	
	public void Delete(int i)		//���� �޼ҵ�
	{
		ArrayList<thismain> DelmainList = new ArrayList<thismain>();
		ArrayList<thismajor> DelmajorList = new ArrayList<thismajor>();
		ArrayList<thissubject> DelsubList = new ArrayList<thissubject>();
		Scanner del = new Scanner(System.in);
		switch(i)
		{
		case 1:
			for(thismain Professor : ProList )
			 {
		            System.out.println(Professor);
		     }
			
			System.out.print("������ ������ �̸��� �Է��ϼ��� : ");
			String name1 = del.next();
			
			for(thismain ProInfo : ProList)
			{
				if(ProInfo.getName().equals(name1))
				{
					DelmainList.add(ProInfo);
				}
			}
			
			if(DelmainList.size()==1)
			{
				ProList.remove(DelmainList.get(0));
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("�Է��Ͻ� ������ ������ �������� �ʽ��ϴ�.");
			}
			break;
			
		case 2:
			for(thismain Clerk : ClerkList )
			 {
		            System.out.println(Clerk);
		     }
			
			System.out.print("������ ������ �̸��� �Է��ϼ��� : ");
			String name2 = del.next();
			
			for(thismain ClerkInfo : ClerkList)
			{
				if(ClerkInfo.getName().equals(name2))
				{
					DelmainList.add(ClerkInfo);
				}
			}
			
			if(DelmainList.size()==1)
			{
				ClerkList.remove(DelmainList.get(0));
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("�Է��Ͻ� ������ ������ �������� �ʽ��ϴ�.");
			}
			break;
			
		case 3:
			for(thismain Student : StuList )
			 {
		            System.out.println(Student);
		     }
			System.out.print("������ �л��� �̸��� �Է��ϼ��� : ");
			String name3 = del.next();
			
			for(thismain StuInfo : StuList)
			{
				if(StuInfo.getName().equals(name3))
				{
					DelmainList.add(StuInfo);
				}
			}
			
			if(DelmainList.size()==1)
			{
				StuList.remove(DelmainList.get(0));
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("�Է��Ͻ� �л��� ������ �������� �ʽ��ϴ�.");
			}
			break;
			
		case 4:					
			int index = 0;
			String name = null, id = null, telnum = null, email = null, in = null;
			for(thismajor Major : MajorList )
			 {
		            System.out.println(Major.getName());
		     }
			System.out.print("������ �а��� �̸��� �Է��ϼ��� : ");
			String name4 = del.next();
			
			for(thismajor MajorInfo : MajorList)
			{
				if(MajorInfo.getName().equals(name4))
				{
					System.out.println("�Ҽ��а� ���� �� �л����� �Ҽ��� �����ϼ���.");
					
					for(thismain Professor : ProList)
					{
						if(Professor.getFrom().equals(name4))
						{
							index = ProList.indexOf(Professor);
							name = Professor.getName();
							id = Professor.getId();
							telnum = Professor.getTelnum();
							email = Professor.getEmail();
							in = Professor.getIn();
							
							System.out.print("'"+Professor.getName()+"' ������ ���� �Ҽӵ� �а��� �Է��ϼ��� : ");
							String modFrom = del.next();
							ProList.set(index, (new thismain(name, id, telnum, email, modFrom, in)));
						}
					}
					for(thismain Clerk : ClerkList)
					{
						if(Clerk.getFrom().equals(name4))
						{
							index = ClerkList.indexOf(Clerk);
							name = Clerk.getName();
							id = Clerk.getId();
							telnum = Clerk.getTelnum();
							email = Clerk.getEmail();
							in = Clerk.getIn();
							
							System.out.print("'"+Clerk.getName()+"' ������ ���� �Ҽӵ� �а��� �Է��ϼ��� : ");
							String modFrom = del.next();
							ClerkList.set(index, (new thismain(name, id, telnum, email, modFrom, in)));
						}
					}
					for(thismain Student : StuList)
					{
						if(Student.getFrom().equals(name4))
						{
							index = StuList.indexOf(Student);
							name = Student.getName();
							id = Student.getId();
							telnum = Student.getTelnum();
							email = Student.getEmail();
							
							System.out.print("'"+Student.getName()+"' �л��� ���� �Ҽӵ� �а��� �Է��ϼ��� : ");
							String modFrom = del.next();
							StuList.set(index, (new thismain(name, id, telnum, email, modFrom)));
						}
					}
					DelmajorList.add(MajorInfo);
				}
				
			}
			
			if(DelmajorList.size()==1)
			{
				MajorList.remove(DelmajorList.get(0));
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("�Է��Ͻ� �а��� ������ �������� �ʽ��ϴ�.");
				break;
			}
			break;
			
		case 5:
			for(thissubject Subject : SubList )
			 {
		            System.out.println(Subject);
		     }
			System.out.print("������ ������ �̸��� �Է��ϼ��� : ");
			String name5 = del.next();
			
			for(thissubject SubInfo : SubList)
			{
				if(SubInfo.getName().equals(name5))
				{
					DelsubList.add(SubInfo);
				}
			}
			
			if(DelsubList.size()==1)
			{
				SubList.remove(DelsubList.get(0));
				System.out.println("���������� �����Ǿ����ϴ�.");
			}
			else
			{
				System.out.println("�Է��Ͻ� ������ ������ �������� �ʽ��ϴ�.");
			}
			break;
		default :
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}
	}

	public void Search(int i)
	{
		Scanner search = new Scanner(System.in);
		int index = 0;
		String name = null, id = null, telnum = null, email = null, from = null, in = null, assist = null, professor = null, web = null, clas = null, address = null;
		
		switch (i)
		{
		case 1:
			
			for(thismain Professor : ProList )
			 {
		            System.out.println(Professor);
		     }
			System.out.print("�󼼳����� �� �����̸��� �Է��ϼ��� : ");
			String name1 = search.next();
			
			for(thismain Professor : ProList)
			{
				if(Professor.getName().equals(name1))
				{
					System.out.println(Professor);
					index = ProList.indexOf(Professor);
					
					name = Professor.getName();
					id = Professor.getId();
					telnum = Professor.getTelnum();
					email = Professor.getEmail();
					from = Professor.getFrom();
					in = Professor.getIn();
				}
			}
				
			for(thissubject Subject : SubList)
			{
				if(Subject.getProfessor().equals(name1))
				{
					System.out.println("["+Subject.getName()+"\t"+Subject.getClas()+"]");
				}
			}
			
			
			System.out.print("���� ������ �����Ͻðڽ��ϱ�? (y/n) : ");
			String yon1 = search.next();
			
			if(yon1.equals("y"))
			{
				System.out.println("������ ������ �����ϼ���.");
				System.out.println("1. ��ȭ��ȣ     2. �̸���     3. �Ҽ� �а�     4. �Ի��� ");
				System.out.print(">> ");
				int choice = search.nextInt(); 
				
				switch(choice)
				{
				case 1:
					System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���.");
					System.out.print(">> ");
					String modtelnum = search.next();
					
					ProList.set(index, (new thismain(name, id, modtelnum, email, from, in)));
					
					for(thismain Professor : ProList)
					{
						if(Professor.getName().equals(name1))
						{
							System.out.println(Professor);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 2:
					System.out.println("������ �̸����� �Է��ϼ���.");
					System.out.print(">> ");
					String modemail = search.next();
					
					ProList.set(index, (new thismain(name, id, telnum, modemail, from, in)));
					
					for(thismain Professor : ProList)
					{
						if(Professor.getName().equals(name1))
						{
							System.out.println(Professor);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 3:
					System.out.println("������ �Ҽ� �а��� �Է��ϼ���.");
					System.out.print(">> ");
					String modfrom = search.next();
					
					ProList.set(index, (new thismain(name, id, telnum, email, modfrom, in)));
					
					for(thismain Professor : ProList)
					{
						if(Professor.getName().equals(name1))
						{
							System.out.println(Professor);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 4:
					System.out.println("������ �Ի����� �Է��ϼ���.");
					System.out.print(">> ");
					String modin = search.next();
					
					ProList.set(index, (new thismain(name, id, telnum, email, from, modin)));
					
					for(thismain Professor : ProList)
					{
						if(Professor.getName().equals(name1))
						{
							System.out.println(Professor);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				default :
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
			}
			
			else if(yon1.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
				break;
			
		case 2:

			for(thismain Clerk : ClerkList )
			 {
		            System.out.println(Clerk);
		     }
			System.out.print("�󼼳����� �� �����̸��� �Է��ϼ��� : ");
			String name2 = search.next();
			
			for(thismain Clerk : ClerkList)
			{
				if(Clerk.getName().equals(name2))
				{
					System.out.println(Clerk);
					index = ClerkList.indexOf(Clerk);
					
					name = Clerk.getName();
					telnum = Clerk.getTelnum();
					email = Clerk.getEmail();
					from = Clerk.getFrom();
					in = Clerk.getIn();
				}
			}
			
			System.out.print("���� ������ �����Ͻðڽ��ϱ�? (y/n) : ");
			String yon2 = search.next();
			
			if(yon2.equals("y"))
			{
				System.out.println("������ ������ �����ϼ���.");
				System.out.println("1. ��ȭ��ȣ     2. �̸���     3. �Ҽ� �μ�     4. �Ի��� ");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���.");
					System.out.print(">> ");
					String modtelnum = search.next();
					
					ClerkList.set(index, (new thismain(name, id, modtelnum, email, from, in)));
					
					for(thismain Clerk : ClerkList)
					{
						if(Clerk.getName().equals(name2))
						{
							System.out.println(Clerk);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 2:
					System.out.println("������ �̸����� �Է��ϼ���.");
					System.out.print(">> ");
					String modemail = search.next();
					
					ClerkList.set(index, (new thismain(name, id, telnum, modemail, from, in)));
					
					for(thismain Clerk : ClerkList)
					{
						if(Clerk.getName().equals(name2))
						{
							System.out.println(Clerk);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 3:
					System.out.println("������ �Ҽ� �μ��� �Է��ϼ���.");
					System.out.print(">> ");
					String modfrom = search.next();
					
					ClerkList.set(index, (new thismain(name, id, telnum, email, modfrom, in)));

					for(thismain Clerk : ClerkList)
					{
						if(Clerk.getName().equals(name2))
						{
							System.out.println(Clerk);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 4:
					System.out.println("������ �Ի����� �Է��ϼ���.");
					System.out.print(">> ");
					String modin = search.next();
					
					ClerkList.set(index, (new thismain(name, id, telnum, email, from, modin)));
					
					for(thismain Clerk : ClerkList)
					{
						if(Clerk.getName().equals(name2))
						{
							System.out.println(Clerk);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				default :
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
			}
			
			else if(yon2.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			break;
				
		case 3:
			
			for(thismain Student : StuList )
			 {
		            System.out.println(Student);
		     }
			System.out.print("�󼼳����� �� �л��̸��� �Է��ϼ��� : ");
			String name3 = search.next();
			
			for(thismain Student : StuList)
			{
				if(Student.getName().equals(name3))
				{
					System.out.println(Student);
					index = StuList.indexOf(Student);
					
					name = Student.getName();
					id = Student.getId();
					telnum = Student.getTelnum();
					email = Student.getEmail();
					from = Student.getFrom();
				}
			}
			Stu.Print(index);
			//�б⺰ ���� ���
			
			System.out.print("�л� ������ �����Ͻðڽ��ϱ�? (y/n) : ");
			String yon3 = search.next();
			
			if(yon3.equals("y"))
			{
				System.out.println("������ ������ �����ϼ���.");
				System.out.println("1. ��ȭ��ȣ     2. �̸���     3. �Ҽ� �а�     4. �б⺰ ���� ");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���.");
					System.out.print(">> ");
					String modtelnum = search.next();
					
					StuList.set(index, (new thismain(name, id, modtelnum, email, from)));
					
					for(thismain Student : StuList)
					{
						if(Student.getName().equals(name3))
						{
							System.out.println(Student);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 2:
					System.out.println("������ �̸����� �Է��ϼ���.");
					System.out.print(">> ");
					String modemail = search.next();
					
					StuList.set(index, (new thismain(name, id, telnum, modemail, from)));
					
					for(thismain Student : StuList)
					{
						if(Student.getName().equals(name3))
						{
							System.out.println(Student);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 3:
					System.out.print("������ �Ҽ� �а��� �Է��ϼ��� : ");
					String modfrom = search.next();
					
					StuList.set(index, (new thismain(name, id, telnum, email, modfrom)));

					for(thismain Student : StuList)
					{
						if(Student.getName().equals(name3))
						{
							System.out.println(Student);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 4:
					System.out.print("���� ������ �����̸��� �Է��ϼ��� : ");
					String modname = search.next();
					
					for(int y=0 ; y<8 ; y++)
					{
						for(int z=0 ; z<3 ; z++)
						{
							String SubName = Stu.getname(index, y, z);
							
							if((modname.equals(SubName)))
							{
								System.out.print("������ �Է��ϼ��� : ");
								double modgrade = search.nextDouble();
								Stu.setgrade(index, y, z, modgrade);
								System.out.println("������ �Ϸ�Ǿ����ϴ�.");
								Stu.ModPrint(index, y, z);
							}
							break;
						}
						break;
					}
					//�б⺰ ���� ����
					break;
					
				default :
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
			}
			
			else if(yon3.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			break;
			
		case 4:
			for(thismajor Major : MajorList )
			 {
		            System.out.println(Major);
		     }
			System.out.print("�󼼳����� �� �а��̸��� �Է��ϼ��� : ");
			String name4 = search.next();
			
			for(thismajor Major : MajorList)
			{
				if(Major.getName().equals(name4))
				{
					System.out.println(Major);
					index = MajorList.indexOf(Major);
					
					name = Major.getName();;
					telnum = Major.getTelnum();
					assist = Major.getAssist();
					professor = Major.getProfessor();
					email = Major.getEmail();
					address = Major.getAddress();
					web = Major.getWebsite();
				}
			}
			
			System.out.println("�Ҽ� ���� �� ����,�л� ����Դϴ�.");
			System.out.println("�䱳�� ���");
			for(thismain Professor : ProList)
			{
				if(Professor.getFrom().equals(name4))
				{
					System.out.println("["+Professor.getId()+"\t\t"+Professor.getName()+"]");
				}
			}
			System.out.println("������ ���");
			for(thismain Clerk : ClerkList)
			{
				if(Clerk.getFrom().equals(name4))
				{
					System.out.println("["+Clerk.getId()+"\t\t"+Clerk.getName()+"]");
				}
			}
			System.out.println("���л� ���");
			for(thismain Student : StuList)
			{
				if(Student.getFrom().equals(name4))
				{
					System.out.println("["+Student.getId()+"\t"+Student.getName()+"]");
				}
			}
			
			System.out.print("�а� ������ �����Ͻðڽ��ϱ�? (y/n) : ");
			String yon4 = search.next();
			
			if(yon4.equals("y"))
			{
				System.out.println("������ ������ �����ϼ���.");
				System.out.println("1. ��ȭ��ȣ     2. ����     3. ����     4. �̸���     5. �ּ�     6. ���ּ�");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("������ ��ȭ��ȣ�� �Է��ϼ���.");
					System.out.print(">> ");
					String modtelnum = search.next();
					
					MajorList.set(index, (new thismajor(name, modtelnum, assist, professor, email, address, web)));
					
					for(thismajor Major : MajorList)
					{
						if(Major.getName().equals(name4))
						{
							System.out.println(Major);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 2:
					System.out.println("������ ������ �Է��ϼ���.");
					System.out.print(">> ");
					String modassist = search.next();
					
					for (int a = 0 ; a<MajorList.size() ; a++)
					{
						if(ClerkList.get(0).equals(modassist))
						{
							MajorList.set(index, (new thismajor(name, telnum, modassist, professor, email, address, web)));
							
							for(thismajor Major : MajorList)
							{
								if(Major.getName().equals(name4))
								{
									System.out.println(Major);
								}
							}
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						}
							
						else
							if(MajorList.size()-1 == a)
								System.out.println("�������� �ʴ� �̸��Դϴ�.");
					}
					
					break;
					
				case 3:
					System.out.println("������ ������ �Է��ϼ���.");
					System.out.print(">> ");
					String modprofessor = search.next();
					
					for (int a = 0 ; a<MajorList.size() ; a++)
					{
						if(ProList.get(0).equals(modprofessor))
						{
							MajorList.set(index, (new thismajor(name, telnum, assist, modprofessor, email, address, web)));
							
							for(thismajor Major : MajorList)
							{
								if(Major.getName().equals(name4))
								{
									System.out.println(Major);
								}
							}
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						}
							
						else
							if(MajorList.size()-1 == a)
								System.out.println("�������� �ʴ� �̸��Դϴ�.");
					}
					break;
					
				case 4:
					System.out.println("������ �̸����� �Է��ϼ���.");
					System.out.print(">> ");
					String modemail = search.next();
					
					MajorList.set(index, (new thismajor(name, telnum, assist, professor, modemail, address, web)));
					
					for(thismajor Major : MajorList)
					{
						if(Major.getName().equals(name4))
						{
							System.out.println(Major);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 5:
					System.out.println("������ �ּ��� �Է��ϼ���.");
					System.out.print(">> ");
					String modaddress = search.next();
					
					MajorList.set(index, (new thismajor(name, telnum, assist, professor, email, modaddress, web)));
					
					for(thismajor Major : MajorList)
					{
						if(Major.getName().equals(name4))
						{
							System.out.println(Major);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				case 6:
					System.out.println("������ �ּ��� �Է��ϼ���.");
					System.out.print(">> ");
					String modweb = search.next();
					
					MajorList.set(index, (new thismajor(name, telnum, assist, professor, email, address, modweb)));
					
					for(thismajor Major : MajorList)
					{
						if(Major.getName().equals(name4))
						{
							System.out.println(Major);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				default :
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
			}
			
			else if(yon4.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			break;
			
		case 5:
			for(thissubject Subject : SubList )
			 {
		            System.out.println(Subject);
		     }
			System.out.print("�󼼳����� �� �����̸��� �Է��ϼ��� : ");
			String name5 = search.next();
			
			for(thissubject Subject : SubList)
			{
				if(Subject.getName().equals(name5))
				{
					System.out.println(Subject);
					index = SubList.indexOf(Subject);
					
					name = Subject.getName();
					professor = Subject.getProfessor();
					clas = Subject.getClas();
				}
			}
			
			System.out.print("���� ������ �����Ͻðڽ��ϱ�? (y/n) : ");
			String yon5 = search.next();
			
			if(yon5.equals("y"))
			{
				System.out.println("������ ������ �����ϼ���.");
				System.out.println("1. ��� ����     2. ���ǽ�");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("������ ������ �Է��ϼ���.");
					System.out.print(">> ");
					String modprofessor = search.next();
					
					for (int a = 0 ; a<MajorList.size() ; a++)
					{
						if(ProList.get(0).equals(modprofessor))
						{
							SubList.set(index, (new thissubject(name, modprofessor, clas)));
							
							for(thissubject Subject : SubList)
							{
								if(Subject.getName().equals(name5))
								{
									System.out.println(Subject);
								}
							}
							System.out.println("������ �Ϸ�Ǿ����ϴ�.");
						}
							
						else
							if(SubList.size()-1 == a)
								System.out.println("�������� �ʴ� �̸��Դϴ�.");
					}
					break;
					
				case 2:
					System.out.println("������ ���ǽ��� �Է��ϼ���.");
					System.out.print(">> ");
					String modclas = search.next();
					
					SubList.set(index, (new thissubject(name, professor, modclas)));
					
					for(thissubject Subject : SubList)
					{
						if(Subject.getName().equals(name5))
						{
							System.out.println(Subject);
						}
					}
					System.out.println("������ �Ϸ�Ǿ����ϴ�.");
					break;
					
				default :
					System.out.println("�߸� �����ϼ̽��ϴ�.");
					break;
				}
			}
			
			else if(yon5.equals("n"))
			{
				System.out.print("���� ������ ������ �ϰڽ��ϱ�? (y/n) : ");
				String yon51 = search.next();
				
				if(yon51.equals("y"))
				{
					System.out.println("1. ������ Ȯ��     2. ������ �߰�     3. ������ ����");
					System.out.print(">> ");
					int choice = search.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("'"+name5+"' ������ �������Դϴ�.");
						Sub.Print(index);
						break;
						
					case 2:
						System.out.println("�� '"+name5+"' ������ ������ ���");
						Sub.Print(index);
						System.out.print("�߰��� �л��� �̸��� �Է��ϼ��� : ");
						String addname = search.next();
						Sub.setsubstudent(index, 6, addname);
						System.out.println("�������߰��� �Ϸ�Ǿ����ϴ�.");
						System.out.println("�� '"+name5+"' ������ �߰��� ������ ���");
						Sub.Print(index);
						break;
						
					case 3:
						int x = 0;
						System.out.println("�� '"+name5+"' ������ ������ ���");
						Sub.Print(index);
						System.out.print("������ �л��� �̸��� �Է��ϼ��� : ");
						String delname = search.next();
						x = Sub.Delete(index, delname);
						Sub.setsubstudent(index, x, null);
						System.out.println("�� '"+name5+"' ������ ������ ������ ���");
						Sub.Print(index);
						break;
						
					default :
						System.out.println("�߸� �����ϼ̽��ϴ�.");
						break;
					}
				}
				else if(yon51.equals("n"))
				{
					break;
				}
				else
				{
					System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				}
				break;
			}
			
			else
			{
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
			break;
			
		default :
			System.out.println("�߸� �����ϼ̽��ϴ�.");
			break;
		}
	}
}
