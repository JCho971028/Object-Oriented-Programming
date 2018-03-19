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
		ProList.add(new thismain("이만희", "10001", "010-1001-1001", "manheelee@naver.com", "컴퓨터공학과", "20100001"));
		ProList.add(new thismain("소우영", "10002", "010-1002-1002", "wooyoungso@naver.com", "컴퓨터공학과", "20100002"));
		ProList.add(new thismain("최의인", "10003", "010-1003-1003", "einchoi@naver.com", "컴퓨터공학과", "20100003"));
		ProList.add(new thismain("정진만", "10004", "010-1004-1004", "jinmanjung@naver.com", "정보통신공학과", "20100004"));
		ProList.add(new thismain("백제인", "10005", "010-1005-1005", "jeinbaek@naver.com", "정보통신공학과", "20100005"));
		ProList.add(new thismain("남충희", "10006", "010-1006-1006", "choongheenam@naver.com", "광센서공학과", "20100006"));
		
		ClerkList.add(new thismain("최승현", "20001", "010-2001-2001", "bigbang01@naver.com", "컴퓨터공학과", "20100001"));
		ClerkList.add(new thismain("강대성", "20011", "010-2011-2011", "bigbang04@naver.com", "컴퓨터공학과", "20100001"));
		ClerkList.add(new thismain("권지용", "20002", "010-2002-2002", "bigbang02@naver.com", "정보통신공학과", "20100002"));
		ClerkList.add(new thismain("이승현", "20022", "010-2022-2022", "bigbang05@naver.com", "정보통신공학과", "20100002"));
		ClerkList.add(new thismain("동영배", "20003", "010-2003-2003", "bigbang03@naver.com", "광센서공학과", "20100003"));
		
		StuList.add(new thismain("조재은", "20160745", "010-2951-1028", "ckr971028@gmail.com", "컴퓨터공학과"));
		Stu.setname(0, 0, 0, "컴퓨터개론"); //학생,학기,과목인덱스,과목입력
		Stu.setgrade(0, 0, 0, 4.2);		//학생,학기,성적인덱스,성적입력
		Stu.setname(0, 0, 1, "현대인과 성서");
		Stu.setgrade(0, 0, 1, 3.5);
		Stu.setname(0, 1, 0, "정보보호개론");
		Stu.setgrade(0, 1, 0, 4.5);
		Stu.setname(0, 1, 1, "실용영어");
		Stu.setgrade(0, 1, 1, 4.0);
		StuList.add(new thismain("임재영", "20131183", "010-2168-5505", "codingbt@naver.com", "컴퓨터공학과"));
		Stu.setname(1, 0, 0, "컴퓨터개론");
		Stu.setgrade(1, 0, 0, 4.5);
		Stu.setname(1, 0, 1, "현대인과 성서");
		Stu.setgrade(1, 0, 1, 4.5);
		Stu.setname(1, 1, 0, "정보보호개론");
		Stu.setgrade(1, 1, 0, 4.5);
		Stu.setname(1, 1, 0, "실용영어");
		Stu.setgrade(1, 1, 0, 4.5);
		StuList.add(new thismain("박진명", "20160001", "010-0000-0000", "jungtong1@naver.com", "정보통신공학과"));
		Stu.setname(2, 0, 0, "컴퓨터개론");
		Stu.setgrade(2, 0, 0, 4.0);
		Stu.setname(2, 0, 1, "현대인과 성서");
		Stu.setgrade(2, 0, 1, 3.2);
		Stu.setname(2, 1, 0, "정보보호개론");
		Stu.setgrade(2, 1, 0, 3.0);
		Stu.setname(2, 1, 0, "실용영어");
		Stu.setgrade(2, 1, 0, 4.5);
		StuList.add(new thismain("이유진", "20160002", "010-0001-0001", "jungtong2@naver.com", "정보통신공학과"));
		Stu.setname(3, 0, 0, "컴퓨터개론");
		Stu.setgrade(3, 0, 0, 3.5);
		Stu.setname(3, 0, 1, "현대인과 성서");
		Stu.setgrade(3, 0, 1, 3.5);
		Stu.setname(3, 1, 0, "정보보호개론");
		Stu.setgrade(3, 1, 0, 3.5);
		Stu.setname(3, 1, 0, "실용영어");
		Stu.setgrade(3, 1, 0, 4.0);
		StuList.add(new thismain("최윤지", "20160003", "010-0002-0002", "jungtong3@naver.com", "정보통신공학과"));
		Stu.setname(4, 0, 0, "컴퓨터개론");
		Stu.setgrade(4, 0, 0, 3.5);
		Stu.setname(4, 0, 1, "현대인과 성서");
		Stu.setgrade(4, 0, 1, 3.0);
		Stu.setname(4, 1, 0, "정보보호개론");
		Stu.setgrade(4, 1, 0, 3.0);
		Stu.setname(4, 1, 0, "실용영어");
		Stu.setgrade(4, 1, 0, 4.0);
		StuList.add(new thismain("곽신정", "20160004", "010-0004-0004", "gyangsen@naver.com", "광센서공학과"));
		Stu.setname(5, 0, 0, "컴퓨터개론");
		Stu.setgrade(5, 0, 0, 3.5);
		Stu.setname(5, 0, 1, "현대인과 성서");
		Stu.setgrade(5, 0, 1, 4.0);
		Stu.setname(5, 1, 0, "정보보호개론");
		Stu.setgrade(5, 1, 0, 3.0);
		Stu.setname(5, 1, 0, "실용영어");
		Stu.setgrade(5, 1, 0, 4.5);
		
		MajorList.add(new thismajor("컴퓨터공학과", "042-000-0000", "대전광역시 대덕구 오정동", "?", "이 극", "hnucom@gmail.com", "www.hnucom.com"));
		MajorList.add(new thismajor("정보통신공학과", "042-111-1111", "대전광역시 대덕구 오정동", "?", "정진만", "hnu@gmail.com", "www.hnu.com"));
		MajorList.add(new thismajor("광센서공학과", "042-222-2222", "대전광역시 대덕구 오정동", "?", "남충희", "hnu@gmail.com", "www.hnu.com"));
		
		SubList.add(new thissubject("객체지향프로그래밍", "이만희", "090517"));
		Sub.setsubstudent(0, 0, "조재은");
		Sub.setsubstudent(0, 1, "임재영");
		SubList.add(new thissubject("융합설계이론", "소우영", "090409"));
		Sub.setsubstudent(1, 0, "조재은");
		Sub.setsubstudent(1, 1, "임재영");
		Sub.setsubstudent(1, 2, "박진명");
		Sub.setsubstudent(1, 3, "이유진");
		Sub.setsubstudent(1, 4, "최윤지");
		SubList.add(new thissubject("데이터구조", "최의인", "090522"));
		Sub.setsubstudent(2, 0, "조재은");
		SubList.add(new thissubject("전자기학", "류성한", "090419"));
		Sub.setsubstudent(3, 0, "박진명");
		Sub.setsubstudent(3, 1, "이유진");
		Sub.setsubstudent(3, 2, "최윤지");
		Sub.setsubstudent(3, 3, "곽신정");
	}
	
	public void PrintAll(int i)		//전체목록출력 	i=교수,직원,학생,학과,교과목 분류
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
			System.out.println("잘못 선택하셨습니다.");
			break;
		}
	
	}

	public void Add(int i)		//추가 메소드
	{
		switch(i)
		{
		case 1:
			Scanner add1 = new Scanner(System.in);
			System.out.print("교수의 이름을 입력하세요 : ");
			String Name1 = add1.next();
			System.out.print("교수의 사번을 입력하세요 : ");
			String Id1 = add1.next();
			System.out.print("교수의 전화번호를 입력하세요 : ");
			String Telnum1 = add1.next();
			System.out.print("교수의 이메일을 입력하세요 : ");
			String Email1 = add1.next();
			System.out.print("교수의 학과를 입력하세요 : ");
			String From1 = add1.next();
			System.out.print("교수의 입사일을 입력하세요 : ");
			String In1 = add1.next();
			
			ProList.add(new thismain(Name1, Id1, Telnum1, Email1, From1, In1));
			System.out.println("\n정상적으로 저장되었습니다.");
			break;
			
		case 2:
			Scanner add2 = new Scanner(System.in);
			System.out.print("직원의 이름을 입력하세요 : ");
			String Name2 = add2.next();
			System.out.print("직원의 사번을 입력하세요 : ");
			String Id2 = add2.next();
			System.out.print("직원의 전화번호를 입력하세요 : ");
			String Telnum2 = add2.next();
			System.out.print("직원의 이메일을 입력하세요 : ");
			String Email2 = add2.next();
			System.out.print("직원의 부서를 입력하세요 : ");
			String From2 = add2.next();
			System.out.print("직원의 입사일을 입력하세요 : ");
			String In2 = add2.next();
			
			ClerkList.add(new thismain(Name2, Id2, Telnum2, Email2, From2, In2));
			System.out.println("\n정상적으로 저장되었습니다.");
			break;
			
		case 3:
			Scanner add3 = new Scanner(System.in);
			System.out.print("학생의 이름을 입력하세요 : ");
			String Name3 = add3.next();
			System.out.print("학생의 학번을 입력하세요 : ");
			String Id3 = add3.next();
			System.out.print("학생의 전화번호를 입력하세요 : ");
			String Telnum3 = add3.next();
			System.out.print("학생의 이메일을 입력하세요 : ");
			String Email3 = add3.next();
			System.out.print("학생의 학과를 입력하세요 : ");
			String From3 = add3.next();
			
			StuList.add(new thismain(Name3, Id3, Telnum3, Email3, From3));
			System.out.println("\n정상적으로 저장되었습니다.");
			break;
			
		case 4:
			Scanner add4 = new Scanner(System.in);
			System.out.print("학과의 이름을 입력하세요 : ");
			String Name4 = add4.next();
			System.out.print("학과의 전화번호를 입력하세요 : ");
			String Telnum4 = add4.next();
			System.out.print("학과의 주소를 입력하세요 : ");
			String Address4 = add4.next();
			System.out.print("학과의 조교명을 입력하세요 : ");
			String Assist4 = add4.next();
			System.out.print("학과의 교수명을 입력하세요 : ");
			String Professor4 = add4.next();
			System.out.print("학과의 이메일을 입력하세요 : ");
			String Email4 = add4.next();
			System.out.print("학과의 웹주소를 입력하세요 : ");
			String Web4 = add4.next();
			
			MajorList.add(new thismajor(Name4, Telnum4, Address4, Assist4, Professor4, Email4, Web4));
			System.out.println("\n정상적으로 저장되었습니다.");
			break;
			
		case 5:
			Scanner add5 = new Scanner(System.in);
			System.out.print("과목의 이름을 입력하세요 : ");
			String Name5 = add5.next();
			System.out.print("과목의 교수를 입력하세요 : ");
			String Professor5 = add5.next();
			System.out.print("과목의 강의실을 입력하세요 : ");
			String Clas5 = add5.next();
			
			SubList.add(new thissubject(Name5, Professor5, Clas5));
			System.out.println("\n정상적으로 저장되었습니다.");
			break;
		default :
			System.out.println("잘못 선택하셨습니다.");
			break;
		}
	}
	
	public void Delete(int i)		//삭제 메소드
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
			
			System.out.print("삭제할 교수의 이름을 입력하세요 : ");
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
				System.out.println("정상적으로 삭제되었습니다.");
			}
			else
			{
				System.out.println("입력하신 교수의 정보가 존재하지 않습니다.");
			}
			break;
			
		case 2:
			for(thismain Clerk : ClerkList )
			 {
		            System.out.println(Clerk);
		     }
			
			System.out.print("삭제할 직원의 이름을 입력하세요 : ");
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
				System.out.println("정상적으로 삭제되었습니다.");
			}
			else
			{
				System.out.println("입력하신 직원의 정보가 존재하지 않습니다.");
			}
			break;
			
		case 3:
			for(thismain Student : StuList )
			 {
		            System.out.println(Student);
		     }
			System.out.print("삭제할 학생의 이름을 입력하세요 : ");
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
				System.out.println("정상적으로 삭제되었습니다.");
			}
			else
			{
				System.out.println("입력하신 학생의 정보가 존재하지 않습니다.");
			}
			break;
			
		case 4:					
			int index = 0;
			String name = null, id = null, telnum = null, email = null, in = null;
			for(thismajor Major : MajorList )
			 {
		            System.out.println(Major.getName());
		     }
			System.out.print("삭제할 학과의 이름을 입력하세요 : ");
			String name4 = del.next();
			
			for(thismajor MajorInfo : MajorList)
			{
				if(MajorInfo.getName().equals(name4))
				{
					System.out.println("소속학과 교수 및 학생들의 소속을 지정하세요.");
					
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
							
							System.out.print("'"+Professor.getName()+"' 교수가 새로 소속될 학과를 입력하세요 : ");
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
							
							System.out.print("'"+Clerk.getName()+"' 직원이 새로 소속될 학과를 입력하세요 : ");
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
							
							System.out.print("'"+Student.getName()+"' 학생이 새로 소속될 학과를 입력하세요 : ");
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
				System.out.println("정상적으로 삭제되었습니다.");
			}
			else
			{
				System.out.println("입력하신 학과의 정보가 존재하지 않습니다.");
				break;
			}
			break;
			
		case 5:
			for(thissubject Subject : SubList )
			 {
		            System.out.println(Subject);
		     }
			System.out.print("삭제할 과목의 이름을 입력하세요 : ");
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
				System.out.println("정상적으로 삭제되었습니다.");
			}
			else
			{
				System.out.println("입력하신 과목의 정보가 존재하지 않습니다.");
			}
			break;
		default :
			System.out.println("잘못 선택하셨습니다.");
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
			System.out.print("상세내용을 볼 교수이름을 입력하세요 : ");
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
			
			
			System.out.print("교수 정보를 변경하시겠습니까? (y/n) : ");
			String yon1 = search.next();
			
			if(yon1.equals("y"))
			{
				System.out.println("변경할 정보를 선택하세요.");
				System.out.println("1. 전화번호     2. 이메일     3. 소속 학과     4. 입사일 ");
				System.out.print(">> ");
				int choice = search.nextInt(); 
				
				switch(choice)
				{
				case 1:
					System.out.println("변경할 전화번호를 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 2:
					System.out.println("변경할 이메일을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 3:
					System.out.println("변경할 소속 학과를 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 4:
					System.out.println("변경할 입사일을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				default :
					System.out.println("잘못 선택하셨습니다.");
					break;
				}
			}
			
			else if(yon1.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
				break;
			
		case 2:

			for(thismain Clerk : ClerkList )
			 {
		            System.out.println(Clerk);
		     }
			System.out.print("상세내용을 볼 직원이름을 입력하세요 : ");
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
			
			System.out.print("직원 정보를 변경하시겠습니까? (y/n) : ");
			String yon2 = search.next();
			
			if(yon2.equals("y"))
			{
				System.out.println("변경할 정보를 선택하세요.");
				System.out.println("1. 전화번호     2. 이메일     3. 소속 부서     4. 입사일 ");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("변경할 전화번호를 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 2:
					System.out.println("변경할 이메일을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 3:
					System.out.println("변경할 소속 부서를 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 4:
					System.out.println("변경할 입사일을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				default :
					System.out.println("잘못 선택하셨습니다.");
					break;
				}
			}
			
			else if(yon2.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			break;
				
		case 3:
			
			for(thismain Student : StuList )
			 {
		            System.out.println(Student);
		     }
			System.out.print("상세내용을 볼 학생이름을 입력하세요 : ");
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
			//학기별 성적 출력
			
			System.out.print("학생 정보를 변경하시겠습니까? (y/n) : ");
			String yon3 = search.next();
			
			if(yon3.equals("y"))
			{
				System.out.println("변경할 정보를 선택하세요.");
				System.out.println("1. 전화번호     2. 이메일     3. 소속 학과     4. 학기별 성적 ");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("변경할 전화번호를 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 2:
					System.out.println("변경할 이메일을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 3:
					System.out.print("변경할 소속 학과를 입력하세요 : ");
					String modfrom = search.next();
					
					StuList.set(index, (new thismain(name, id, telnum, email, modfrom)));

					for(thismain Student : StuList)
					{
						if(Student.getName().equals(name3))
						{
							System.out.println(Student);
						}
					}
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 4:
					System.out.print("성적 변경할 과목이름을 입력하세요 : ");
					String modname = search.next();
					
					for(int y=0 ; y<8 ; y++)
					{
						for(int z=0 ; z<3 ; z++)
						{
							String SubName = Stu.getname(index, y, z);
							
							if((modname.equals(SubName)))
							{
								System.out.print("성적을 입력하세요 : ");
								double modgrade = search.nextDouble();
								Stu.setgrade(index, y, z, modgrade);
								System.out.println("변경이 완료되었습니다.");
								Stu.ModPrint(index, y, z);
							}
							break;
						}
						break;
					}
					//학기별 성적 변경
					break;
					
				default :
					System.out.println("잘못 선택하셨습니다.");
					break;
				}
			}
			
			else if(yon3.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			break;
			
		case 4:
			for(thismajor Major : MajorList )
			 {
		            System.out.println(Major);
		     }
			System.out.print("상세내용을 볼 학과이름을 입력하세요 : ");
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
			
			System.out.println("소속 교수 및 직원,학생 목록입니다.");
			System.out.println("▽교수 목록");
			for(thismain Professor : ProList)
			{
				if(Professor.getFrom().equals(name4))
				{
					System.out.println("["+Professor.getId()+"\t\t"+Professor.getName()+"]");
				}
			}
			System.out.println("▽직원 목록");
			for(thismain Clerk : ClerkList)
			{
				if(Clerk.getFrom().equals(name4))
				{
					System.out.println("["+Clerk.getId()+"\t\t"+Clerk.getName()+"]");
				}
			}
			System.out.println("▽학생 목록");
			for(thismain Student : StuList)
			{
				if(Student.getFrom().equals(name4))
				{
					System.out.println("["+Student.getId()+"\t"+Student.getName()+"]");
				}
			}
			
			System.out.print("학과 정보를 변경하시겠습니까? (y/n) : ");
			String yon4 = search.next();
			
			if(yon4.equals("y"))
			{
				System.out.println("변경할 정보를 선택하세요.");
				System.out.println("1. 전화번호     2. 조교     3. 교수     4. 이메일     5. 주소     6. 웹주소");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("변경할 전화번호를 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 2:
					System.out.println("변경할 조교를 입력하세요.");
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
							System.out.println("변경이 완료되었습니다.");
						}
							
						else
							if(MajorList.size()-1 == a)
								System.out.println("존재하지 않는 이름입니다.");
					}
					
					break;
					
				case 3:
					System.out.println("변경할 교수를 입력하세요.");
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
							System.out.println("변경이 완료되었습니다.");
						}
							
						else
							if(MajorList.size()-1 == a)
								System.out.println("존재하지 않는 이름입니다.");
					}
					break;
					
				case 4:
					System.out.println("변경할 이메일을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 5:
					System.out.println("변경할 주소을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				case 6:
					System.out.println("변경할 주소을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				default :
					System.out.println("잘못 선택하셨습니다.");
					break;
				}
			}
			
			else if(yon4.equals("n"))
			{
				break;
			}
			
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			break;
			
		case 5:
			for(thissubject Subject : SubList )
			 {
		            System.out.println(Subject);
		     }
			System.out.print("상세내용을 볼 과목이름을 입력하세요 : ");
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
			
			System.out.print("과목 정보를 변경하시겠습니까? (y/n) : ");
			String yon5 = search.next();
			
			if(yon5.equals("y"))
			{
				System.out.println("변경할 정보를 선택하세요.");
				System.out.println("1. 담당 교수     2. 강의실");
				System.out.print(">> ");
				int choice = search.nextInt();
				
				switch(choice)
				{
				case 1:
					System.out.println("변경할 교수를 입력하세요.");
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
							System.out.println("변경이 완료되었습니다.");
						}
							
						else
							if(SubList.size()-1 == a)
								System.out.println("존재하지 않는 이름입니다.");
					}
					break;
					
				case 2:
					System.out.println("변경할 강의실을 입력하세요.");
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
					System.out.println("변경이 완료되었습니다.");
					break;
					
				default :
					System.out.println("잘못 선택하셨습니다.");
					break;
				}
			}
			
			else if(yon5.equals("n"))
			{
				System.out.print("과목별 수강생 관리를 하겠습니까? (y/n) : ");
				String yon51 = search.next();
				
				if(yon51.equals("y"))
				{
					System.out.println("1. 수강생 확인     2. 수강생 추가     3. 수강생 삭제");
					System.out.print(">> ");
					int choice = search.nextInt();
					
					switch(choice)
					{
					case 1:
						System.out.println("'"+name5+"' 과목의 수강생입니다.");
						Sub.Print(index);
						break;
						
					case 2:
						System.out.println("▽ '"+name5+"' 과목의 수강생 목록");
						Sub.Print(index);
						System.out.print("추가할 학생의 이름을 입력하세요 : ");
						String addname = search.next();
						Sub.setsubstudent(index, 6, addname);
						System.out.println("수강생추가가 완료되었습니다.");
						System.out.println("▽ '"+name5+"' 과목의 추가된 수강생 목록");
						Sub.Print(index);
						break;
						
					case 3:
						int x = 0;
						System.out.println("▽ '"+name5+"' 과목의 수강생 목록");
						Sub.Print(index);
						System.out.print("삭제할 학생의 이름을 입력하세요 : ");
						String delname = search.next();
						x = Sub.Delete(index, delname);
						Sub.setsubstudent(index, x, null);
						System.out.println("▽ '"+name5+"' 과목의 삭제된 수강생 목록");
						Sub.Print(index);
						break;
						
					default :
						System.out.println("잘못 선택하셨습니다.");
						break;
					}
				}
				else if(yon51.equals("n"))
				{
					break;
				}
				else
				{
					System.out.println("잘못 입력하셨습니다.");
				}
				break;
			}
			
			else
			{
				System.out.println("잘못 입력하셨습니다.");
			}
			break;
			
		default :
			System.out.println("잘못 선택하셨습니다.");
			break;
		}
	}
}
