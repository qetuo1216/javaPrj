package reuse;

import java.util.Scanner;

	public class OmokProgram {
		
	public static void main(String[] args) {
	//�����ؾߵǴ� ���� �����͸� ����
		
		//int ox=0, oy=0;
		Omok omok=new Omok();

		//�⺻���� �ƴϸ� �ּҸ� �����Ѵ� �����̱⶧���� �ݵ�� new�� ���������� ��� ����	(�ν��Ͻ�ȭ)
		//������ ������� �ʴ� ��� null�� ����.													Omok omok=null;
		//
		OmokLib.printBoard();			

		OmokLib.input(omok);
		
		OmokLib.printBoard(omok);
			
	


	}

	
}