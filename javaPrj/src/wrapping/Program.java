package wrapping;

public class Program {

	public static void main(String[] args) {
		// new Integer(3).intValue();
		// int a = 3.intValue();

		// String s = new String("Hello").length();

		// String f = "hello".length();

		int n = 3;
		// �������� ���ڷ� �ٲٴ� ���.
		String s = Integer.toString(n);
		// �� ���� ���ڷ� �ٲٶ�
		String t = String.valueOf(n);

		double d = 3.4;
		String sd = Double.toString(d);

		// ���ڰ��� �Ǽ��� �ٲٴ� ���
		double b = Double.parseDouble(sd);

		/*
		 * String name1 = "������"; String name2 = "������";
		 * 
		 * System.out.println(name1 == name2);
		 */

		/*
		 * String name1 = "������"; String name2 = new String("������");
		 * 
		 * System.out.println(name1.equals(name2));
		 */

		/*
		 * String str = "hello"; String s2 = str.replace("l", "g");
		 * 
		 * System.out.println(str); System.out.println(s2);
		 */

		/*
		 * String str = "photo.jpg"; System.out.println(str.length()); //����
		 * System.out.println(str.indexOf(".")); //���� ��ġ //substring ���� �Ϻκи� ���� ������,
		 * ����������+1 System.out.println(str.substring(0, str.indexOf("."))); //�̸��� ����
		 * System.out.println(str.substring(str.indexOf("."),str.length() )); //���� ��ġ
		 * 
		 * int endIndex = str.indexOf(".");
		 * 
		 * System.out.println(str.substring(0, endIndex));
		 * System.out.println(str.substring(endIndex,str.length() )); //���� ��ġ
		 */
		//cvs���� = �޸��� ���е� ����
		/*String str = "photo.jpg";
		System.out.println(str.length()); // ����
		System.out.println(str.indexOf(".")); // ���� ��ġ //substring ���� �Ϻκи� ���� ������,
		// ����������+1 System.out.println(str.substring(0, str.indexOf("."))); //�̸��� ����
		System.out.println(str.substring(str.indexOf("."), str.length())); // ���� ��ġ

		int endIndex = str.indexOf(".");

		System.out.println(str.substring(0, endIndex));
		System.out.println(str.substring(endIndex, str.length())); // ���� ��ġ
*/		
		//cvs���� = �޸��� ���е� ����
		String str = "��ȣ��,���缮,�ŵ���,�輺��";
		String[] names = str.split(",");
		System.out.println(names[1]);

	}

}
