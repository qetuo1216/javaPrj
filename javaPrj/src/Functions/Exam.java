package Functions;

import java.util.Scanner;

public class Exam {
	int kors;
	int engs;
	int maths;

	public static void print(Exam[] exams) {

		int total;
		float avg;

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� ���                                   ��");
		System.out.println("������������������������������������������������������������������");

		for (int i = 0; i < 3; i++) {
			int kor = 0;
			int eng = 0;
			int math = 0;

			total = kor + eng + math;
			avg = total / 3.0f;
			System.out.printf("���� : %3d \n", kor);
			// �������� ���� ������ ǥ�Ⱑ ���� %d 10����, %c ����, %s ���ڿ�
			System.out.printf("���� : %3d \n", eng);
			System.out.printf("���� : %3d \n", math);
			System.out.printf("���� : %3d \n", total);
			System.out.printf("��� : %5.2f \n", avg);

		}

	}

	public static void input(Exam[] exams) {
		Scanner scan = new Scanner(System.in);
		int kor = 0;
		int eng = 0;
		int math = 0;

		System.out.println("������������������������������������������������������������������");
		System.out.println("��         ���� �Է�                                   ��");
		System.out.println("������������������������������������������������������������������");

		for (int i = 0; i < 3; i++) {
			do {
				if (kor < 0 || kor > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				kor = scan.nextInt();
			} while (kor < 0 || kor > 100);

			do {
				if (eng < 0 || eng > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				eng = scan.nextInt();
			} while (eng < 0 || eng > 100);

			do {
				if (math < 0 || math > 100)
					System.out.println("��ȿ���� ���� �����Դϴ�.");

				System.out.print("\t���� :  \n");
				math = scan.nextInt();
			} while (math < 0 || math > 100);

			exams[i].kors = kor;
			exams[i].engs = eng;
			exams[i].maths = math;

		}
	}
}
