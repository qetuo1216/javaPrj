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

		나돌아갈래: while (true) {

			int menu=0;
			
			menu = print(menu);

			switch (menu) {

			case 1:input(exams);
				break;

			case 2:print(exams);
				break;

			case 3:
				break 나돌아갈래;

			default:
				System.out.println("잘못되었습니다. \n번호는 1부터 3까지만 사용가능");
			}
		}
	}

	

	private static int print(int menu) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         메인 메뉴            │");
		System.out.println("└───────────────────────────────┘");

		System.out.println("\t 1.성적 입력  ");
		System.out.println("\t 2.성적 출력");
		System.out.println("\t 3.종료");
		System.out.print("\t 선택 > ");
		menu = scan.nextInt();
		return menu;
	}



	private static void print(Exam[] exams) {
		// TODO Auto-generated method stub
		int total;
		float avg;

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         성적 출력                                   │");
		System.out.println("└───────────────────────────────┘");

		for (int i = 0; i < 3; i++) {
			int kor = 0;
			int eng = 0;
			int math = 0;
			
			kor = exams.;
			total = kor + eng + math;
			avg = total / 3.0f;
			System.out.printf("국어 : %3d \n", kor);
			// 정수값일 때만 진수를 표기가 가능 %d 10진수, %c 문자, %s 문자열
			System.out.printf("영어 : %3d \n", eng);
			System.out.printf("수학 : %3d \n", math);
			System.out.printf("총점 : %3d \n", total);
			System.out.printf("평균 : %5.2f \n", avg);

		}
		
	}

	private static void input(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("┌───────────────────────────────┐");
		System.out.println("│         성적 입력                                   │");
		System.out.println("└───────────────────────────────┘");

		for (int i = 0; i < 3; i++) {
			do {
				if (kor < 0 || kor > 100)
					System.out.println("유효하지 않은 범위입니다.");

				System.out.print("\t국어 :  \n");
				kor = scan.nextInt();
			} while (kor < 0 || kor > 100);

			do {
				if (eng < 0 || eng > 100)
					System.out.println("유효하지 않은 범위입니다.");

				System.out.print("\t영어 :  \n");
				eng = scan.nextInt();
			} while (eng < 0 || eng > 100);

			do {
				if (math < 0 || math > 100)
					System.out.println("유효하지 않은 범위입니다.");

				System.out.print("\t수학 :  \n");
				math = scan.nextInt();
			} while (math < 0 || math > 100);

			exams[i]. = kor;
			engs[i] = eng;
			maths[i] = math;
		}
		
	}
}
