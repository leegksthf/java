package co.yedam.app;

import java.util.Scanner;

/*
 * ����ȯ: ĳ��Ʈ������ (Ÿ��)
 * ������: byte < short < int < long
 * �Ǽ���: 				float < double
 * 
 * ��Ʈ��  ---------> byte	Byte.parseByte(����)
 * 					short	Short.parseShort(����)
 * 					int		Integar.parseInt
 *					long 
 *					float
 *					double
 *					char
 *					boolean
 *		<--------- Byte.balueOf()
 *					
 */
public class CastTest {

	public static void main(String[] args) {
		// �ڵ�����ȯ
		int a = 10;
		long b = a;
		
		// ��������ȯ
		a = (int)b;
		
		// char(����) <-> int(�ڵ�)
		char c = 'Z';
		System.out.println((int)c);
		int d = 97;
		System.out.println((char)d);
		
		// �Ǽ�(�⺻: double) <-> ����(int)
		double e = 10.5;
		long f = (long)e;
		System.out.println(f);
									//�� ���� �� ū ������ ��ȯ��
		double g = 5 + 10.5;		//5(int)�� 10.5(double) �� double�� �� ũ�� ����
		String h = "hi" + 5;		//st�� int �� st�� �� ũ�� ����
		System.out.println(h);
		System.out.println("hi" + 5 + 10);		
		System.out.println(5 + 10 + "hi");		//�տ������� ���Ǳ� ������ 5(int)+10(int), 15(int)+"hi"(string)(string���� ��ȯ)
		
		//���������� �������� ����
		double i = (double)5 / 2;
		System.out.println(i);
		
		//��Ʈ�� -> int
		String s1= "123";
		int j = Integer.parseInt(s1);
		
		//int -> ��Ʈ��
		String s2 = String.valueOf(123);				//int 123 �Ұ�
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("�Է�:");
		String greet = scanner.next();
		
		System.out.println(greet);
	}

}
