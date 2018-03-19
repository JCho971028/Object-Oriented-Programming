package PBL02;

import java.util.Scanner;

public class main
{
	public static void main(String[] args)
	{
		algomain Algo = new algomain();
		boolean Run0 = true;
		
		while(Run0)
		{
			Scanner input = new Scanner(System.in);
			
			System.out.println("=====================================================================");
			System.out.println("1. 교수 관리");
			System.out.println("2. 직원 관리");
			System.out.println("3. 학생 관리");
			System.out.println("4. 학과 관리");
			System.out.println("5. 교과목 관리");
			System.out.println("6. 프로그램 종료");
			
			System.out.print(">> ");		
			int choice = input.nextInt();
			
			switch (choice)
			{
				case 1:
					boolean Run1 = true;
					
					while(Run1)
					{
						System.out.println("------------------------------1. 교수 관리------------------------------");
						System.out.println("1. 전체 교수 출력");
						System.out.println("2. 교수 추가");
						System.out.println("3. 교수 삭제");
						System.out.println("4. 교수 검색");
						System.out.println("5. 뒤로 가기");
						System.out.print(">> ");
						int choice1 = input.nextInt();
						
						switch(choice1)
						{
						case 1 :
							System.out.println("--------------------------1.1. 전체 교수 출력--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------1.2. 교수 추가-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------1.3. 교수 삭제-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------1.4. 교수 검색-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run1 = false;
							break;
							
						default :
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					
				break;
			
				case 2:
					boolean Run2 = true;
					
					while(Run2)
					{
						System.out.println("------------------------------2. 직원 관리------------------------------");
						System.out.println("1. 전체 직원 출력");
						System.out.println("2. 직원 추가");
						System.out.println("3. 직원 삭제");
						System.out.println("4. 직원 검색");
						System.out.println("5. 뒤로 가기");
						System.out.print(">> ");
						int choice2 = input.nextInt();
						
						switch(choice2)
						{
						case 1 :
							System.out.println("--------------------------2.1. 전체 직원 출력--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------2.2. 직원 추가-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------2.3. 직원 삭제-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------2.4. 직원 검색-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run2 = false;
							break;
							
						default :
							System.out.println("잘못 입력하셨습니다.");
						}
					}
					
				break;
			
				case 3: 

					boolean Run3 = true;
					
					while(Run3)
					{
						System.out.println("------------------------------3. 학생 관리------------------------------");
						System.out.println("1. 전체 학생 출력");
						System.out.println("2. 학생 추가");
						System.out.println("3. 학생 삭제");
						System.out.println("4. 학생 검색");
						System.out.println("5. 뒤로 가기");
						System.out.print(">> ");
						int choice3 = input.nextInt();
						
						switch(choice3)
						{
						case 1 :
							System.out.println("--------------------------3.1. 전체 학생 출력--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------3.2. 학생 추가-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------3.3. 학생 삭제-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------3.4. 학생 검색-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run3 = false;
							break;
							
						default :
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				break;
			
				case 4: 
					
					boolean Run4 = true;
					
					while(Run4)
					{
						System.out.println("------------------------------4. 학과 관리------------------------------");
						System.out.println("1. 전체 학과 출력");
						System.out.println("2. 학과 추가");
						System.out.println("3. 학과 삭제");
						System.out.println("4. 학과 검색");
						System.out.println("5. 뒤로 가기");
						System.out.print(">> ");
						int choice4 = input.nextInt();
						
						switch(choice4)
						{
						case 1 :
							System.out.println("--------------------------4.1. 전체 학과 출력--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------4.2. 학과 추가-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------4.3. 학과 삭제-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------4.4. 학과 검색-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run4 = false;
							break;
							
						default :
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				break;
			
				case 5: 
					
					boolean Run5 = true;
					
					while(Run5)
					{
						System.out.println("------------------------------5. 교과목 관리------------------------------");
						System.out.println("1. 전체 과목 출력");
						System.out.println("2. 과목 추가");
						System.out.println("3. 과목 삭제");
						System.out.println("4. 과목 검색");
						System.out.println("5. 뒤로 가기");
						System.out.print(">> ");
						int choice5 = input.nextInt();
						
						switch(choice5)
						{
						case 1 :
							System.out.println("--------------------------5.1. 전체 교과목 출력--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------5.2. 과목 추가-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------5.3. 과목 삭제-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------5.4. 과목 검색-----------------------------");
							//print 과목 이름
							//과목 이름 입력
							//기초 정보 출력
							Algo.Search(choice);
							break;
							
						case 5 :
							Run5 = false;
							break;
							
						default :
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				break;
			
				case 6: 
					Run0 = false;
					System.out.println("프로그램을 종료합니다.");
				break;
			
				default: 
					System.out.println("잘못 선택하셨습니다.");
			}
		}
	}
}