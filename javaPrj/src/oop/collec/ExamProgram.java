package oop.collec;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		
		///////////Exam exam = new Exam(1,1,1);//� ������ ��üȭ�Ҷ� ��ȣ()�� �� ������� ��ü�� �ʱ�ȭ�� ���ؼ� ���
		
		//compossition : ���� - ��ü��
		//ExamConsole console = new ExamConsole();
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		//association : ���� - ������ -�����ڸ� �̿��ϱ� ������ ��ǰ�� ��ǰ�� �ɾƳ��� �ٵ� �ٲ㳥 �� ����
		//Exam exam = new Exam();
		//ExamConsole comsole = new ExamConsole(exam);

		////////////////////////////////////////////////////////////////////////////////////////////////////
		//association : ���� - ������ -�����ڸ� �̿��ϱ� ������ ��ǰ�� ��ǰ�� �ɾƳ��� �ٲ� �� �ִ�.
		Exam exam = new Exam();
		
		//dependency ��ǰ : ��ü�� ��������� �� ��ǰ�̴�.
		//injection ����
		//dependency injection�� �ϴ� ��.
		ExamConsole console = new ExamConsole();
		
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
	
		
		int menu = 0;

		// 1���θŴ� ���, ����
		��: while (true) 
		{
			menu = input(menu);

			switch (menu) 
			{
				case 1:
					console.input();
					break;
				case 2:
					console.print();
					break;
				case 3:
					break ��;
			}
			
		}
		
	}

	// ��ü�� ������ ��Ÿ���� �ʱ� ������ �ٲ� �ʿ䰡 ����.
	public static int input(int menu) {
		
		Scanner scan = new Scanner(System.in);
		
				
		System.out.println("������������������������������������������������������������������");
		System.out.println("��      ���� �޴�                ��");
		System.out.println("������������������������������������������������������������������");

		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		
		menu = scan.nextInt();
		
		return menu;
	}

}
