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
			System.out.println("1. ���� ����");
			System.out.println("2. ���� ����");
			System.out.println("3. �л� ����");
			System.out.println("4. �а� ����");
			System.out.println("5. ������ ����");
			System.out.println("6. ���α׷� ����");
			
			System.out.print(">> ");		
			int choice = input.nextInt();
			
			switch (choice)
			{
				case 1:
					boolean Run1 = true;
					
					while(Run1)
					{
						System.out.println("------------------------------1. ���� ����------------------------------");
						System.out.println("1. ��ü ���� ���");
						System.out.println("2. ���� �߰�");
						System.out.println("3. ���� ����");
						System.out.println("4. ���� �˻�");
						System.out.println("5. �ڷ� ����");
						System.out.print(">> ");
						int choice1 = input.nextInt();
						
						switch(choice1)
						{
						case 1 :
							System.out.println("--------------------------1.1. ��ü ���� ���--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------1.2. ���� �߰�-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------1.3. ���� ����-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------1.4. ���� �˻�-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run1 = false;
							break;
							
						default :
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
					
				break;
			
				case 2:
					boolean Run2 = true;
					
					while(Run2)
					{
						System.out.println("------------------------------2. ���� ����------------------------------");
						System.out.println("1. ��ü ���� ���");
						System.out.println("2. ���� �߰�");
						System.out.println("3. ���� ����");
						System.out.println("4. ���� �˻�");
						System.out.println("5. �ڷ� ����");
						System.out.print(">> ");
						int choice2 = input.nextInt();
						
						switch(choice2)
						{
						case 1 :
							System.out.println("--------------------------2.1. ��ü ���� ���--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------2.2. ���� �߰�-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------2.3. ���� ����-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------2.4. ���� �˻�-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run2 = false;
							break;
							
						default :
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
					
				break;
			
				case 3: 

					boolean Run3 = true;
					
					while(Run3)
					{
						System.out.println("------------------------------3. �л� ����------------------------------");
						System.out.println("1. ��ü �л� ���");
						System.out.println("2. �л� �߰�");
						System.out.println("3. �л� ����");
						System.out.println("4. �л� �˻�");
						System.out.println("5. �ڷ� ����");
						System.out.print(">> ");
						int choice3 = input.nextInt();
						
						switch(choice3)
						{
						case 1 :
							System.out.println("--------------------------3.1. ��ü �л� ���--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------3.2. �л� �߰�-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------3.3. �л� ����-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------3.4. �л� �˻�-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run3 = false;
							break;
							
						default :
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
				break;
			
				case 4: 
					
					boolean Run4 = true;
					
					while(Run4)
					{
						System.out.println("------------------------------4. �а� ����------------------------------");
						System.out.println("1. ��ü �а� ���");
						System.out.println("2. �а� �߰�");
						System.out.println("3. �а� ����");
						System.out.println("4. �а� �˻�");
						System.out.println("5. �ڷ� ����");
						System.out.print(">> ");
						int choice4 = input.nextInt();
						
						switch(choice4)
						{
						case 1 :
							System.out.println("--------------------------4.1. ��ü �а� ���--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------4.2. �а� �߰�-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------4.3. �а� ����-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------4.4. �а� �˻�-----------------------------");
							Algo.Search(choice);
							break;
							
						case 5 :
							Run4 = false;
							break;
							
						default :
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
				break;
			
				case 5: 
					
					boolean Run5 = true;
					
					while(Run5)
					{
						System.out.println("------------------------------5. ������ ����------------------------------");
						System.out.println("1. ��ü ���� ���");
						System.out.println("2. ���� �߰�");
						System.out.println("3. ���� ����");
						System.out.println("4. ���� �˻�");
						System.out.println("5. �ڷ� ����");
						System.out.print(">> ");
						int choice5 = input.nextInt();
						
						switch(choice5)
						{
						case 1 :
							System.out.println("--------------------------5.1. ��ü ������ ���--------------------------");
							Algo.PrintAll(choice);
							break;
							
						case 2 :
							System.out.println("---------------------------5.2. ���� �߰�-----------------------------");
							Algo.Add(choice);
							break;
							
						case 3 :
							System.out.println("---------------------------5.3. ���� ����-----------------------------");
							Algo.Delete(choice);
							break;
							
						case 4 :
							System.out.println("---------------------------5.4. ���� �˻�-----------------------------");
							//print ���� �̸�
							//���� �̸� �Է�
							//���� ���� ���
							Algo.Search(choice);
							break;
							
						case 5 :
							Run5 = false;
							break;
							
						default :
							System.out.println("�߸� �Է��ϼ̽��ϴ�.");
						}
					}
				break;
			
				case 6: 
					Run0 = false;
					System.out.println("���α׷��� �����մϴ�.");
				break;
			
				default: 
					System.out.println("�߸� �����ϼ̽��ϴ�.");
			}
		}
	}
}