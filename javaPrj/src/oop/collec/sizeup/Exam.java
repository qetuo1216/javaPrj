package oop.collec.sizeup;

public class Exam {
	// private = ĸ���� �����ϴ� �������� �����.
	// ĸ���� ������ ���
	private int kor;
	private int eng;
	private int math;

	public Exam() { // �������Լ� : ó���� �����ϸ� �ڵ����� 0���� �ʱ�ȭ�� �Ǵµ�, �ٸ� ���� �ʱ�ȭ�ϰ� ���� ��� ���
		/*
		 * kor =1; eng =1; math =1;
		 */// ���� ���� �ǹ̸� ���Ѵ�.
		this(0, 0, 0);
	}

	public Exam(int kor, int eng, int math) { // �����ε� ������ �Լ� : ���� �̸��ε� ���ڰ� �ٸ� ��� ���
		this.kor = kor; // �ڵ尡 �ߺ���. ����ȭ�� ��������.
		this.eng = eng;
		this.math = math;

	}

	public float avg() {
		// TODO Auto-generated method stub
		return total() / 3;
	}

	public int total() {
		// TODO Auto-generated method stub
		return kor + eng + math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}
