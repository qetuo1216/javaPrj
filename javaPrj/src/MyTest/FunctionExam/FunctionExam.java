package MyTest.FunctionExam;

import java.awt.Window;
import java.io.IOException;
import java.util.Scanner;

import Functions.Exam;

public class FunctionExam {
	public static void main(String[] args) {

		Exam[] exams = new Exam[3];
		
		for(int i=0;i<3;i++) {
			exams[i]= new Exam();
		}
		

		Scanner scan = new Scanner(System.in);

		�����ư���: while (true) {

			int menu=0;
			
			menu = print(menu);

			switch (menu) {

			case 1:Exam.input(exams);
				break;

			case 2:Exam.print(exams);
				break;

			case 3:
				break �����ư���;

			default:
				System.out.println("�߸��Ǿ����ϴ�. \n��ȣ�� 1���� 3������ ��밡��");
			}
		}
	}

	private static int print(int menu) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� �޴�            ��");
		System.out.println("������������������������������������������������������������������");

		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		menu = scan.nextInt();
		return menu;
	}

	
}
