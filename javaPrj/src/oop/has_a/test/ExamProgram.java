package oop.has_a.test;

import java.util.Scanner;

public class ExamProgram {
	public static void main(String[] args) {
		Exam exam = new Exam();
		ExamConsole console = new ExamConsole();

		console.setExam(exam);

		int menu = 0;
		while (true) {
			menu = input(menu);

			switch (menu) {
			case 1:
				console.input();
				break;
			case 2:
				console.output();
				break;

			default:
				break;
			}
		}
	}

	private static int input(int menu) {
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("������������������������������������������������������������������");
		System.out.println("��         					   ���� �޴�                                    ��");
		System.out.println("������������������������������������������������������������������");

		System.out.println("\t 1.���� �Է�  ");
		System.out.println("\t 2.���� ���");
		System.out.println("\t 3.����");
		System.out.print("\t ���� > ");
		menu = scan.nextInt();
		return menu;
	}
}
