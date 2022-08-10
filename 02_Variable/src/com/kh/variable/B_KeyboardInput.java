package com.kh.variable;

import java.util.Scanner;

//����ڰ� Keyboard�� �Է��� ���� Variable�� ����ϴ� ���
public class B_KeyboardInput {
	
	public void inputTest1() {
		/*
		 * Scanner Class
		 * Java���� �̹� �����ϰ� �ִ� ��Ű��(java.util.Scanner)
		 * Scanner Class�ȿ� �ۼ��Ǿ��ִ� Method�� ȣ���Ͽ� ����Ѵ�.
		 * => sc.Method��();
		 */
		
		// 1. �ٸ� Package, Class���� Method�� ȣ���� ��쿡�� �뺯�� �̸��� ���� ����(new)
		// 2. import�� �ۼ� 
		Scanner sc = new Scanner(System.in);
		// System.in : Ű����� �Է¹��� ���� byte������ �޾Ƶ��̰ڴٴ� �ǹ��̴�.
		// [����] ��½ÿ��� System.out������ ���.
		
		// ������� ��������(�̸�, ����, Ű)�� �Է¹޴� ���α׷�
		// �Է¹ް��� �ϴ� ������ ���� ����ؼ� ����ڷκ��� �Է��� �����Ѵ�.
		System.out.print("����� �̸��� �����Դϱ�?");
		// ����ڰ� �Է��� ���� ���ڿ��� �޾ƿ��� Method : next(), nextLine()
		// sc.next() �Ǵ� nextLine(); => �̷��� �ϸ� ������� �̸��� �ޱ⸸ �Ѵ�.
		// ������� �̸��� �Է¹޾Ƽ� Variable�� ��´�.
		String name = sc.nextLine(); 
		// sc.next() : ����ڰ� ����Ű�� ���������� ����Ѵ�.
		//             ����ڰ� �Է��� �� �� ������ �ִ� ���, ���� ������ ���� �Է¹޴´�.
		// sc.nextLine() : ����ڰ� ����Ű�� ���������� ����Ѵ�.
		//                 ���͸� ġ�� �������� ��� ���ڿ�(��������)�� �Է¹޴´�. 
		//                 ������ ���� �� ������ ���� ��� �����ϰ� ���δ�.
		// (next�迭�� ��� Method���� ����Ű�� ���������� ����Ѵ�.)
		
		
		// ���� �Է¹ޱ�
		System.out.print("����� ���̴� ����Դϱ�?");
		// ����ڰ� �Է¹��� ���� int�� ������ �޾Ƶ��̴� Method : nextInt();
		// [���ǻ���] 
		// nextInt()�� ȣ�� �� �ݵ�� nextLine()�� �ѹ� �����ؾ� �Ѵ�.
		// => ����(�ӽ������)������ �����ִ� ���Ͱ��� ����ڰ� �ڵ����� �Է��ߴٰ� �����Ѵ�.
		// => ����, ��ٷ� �޸𸮿� ����Ǿ� Variable�� ����.
		int age = sc.nextInt();
		sc.nextLine(); // ���ۿ� �����ִ� ���Ͱ��� ����ֱ� ���� �����Ѵ�.
		
		// Ű �Է¹ޱ�
		System.out.print("����� Ű�� ���Դϱ�?");
		//����ڰ� �Է��� ���� double�� �Ǽ��� �޾Ƶ��̴� Method : nextDouble();
		double height = sc.nextDouble(); 
		// nextDouble()�� ���������� nextLine()�� �ѹ� �����ؾ� �Ѵ�.
		sc.nextLine(); // ���ۿ� �����ִ� ���Ͱ��� ����ֱ� ���� �����Ѵ�.
		
		System.out.print("Ű "+ height +"cm, " + "���� " + age + "��, "
		+ name + "�� ȯ���մϴ�.");
		
		/*
		 * Scanner Class ���� �Է¹޴� Method�� ������
		 * 1. next() 		: ���ڿ��� �Է¹��� �� ���. ���� ������ 
		 * 2. nextLine() 	: ���ڿ��� �Է¹��� �� ���. ���͸� ġ�� ������(��������)
		 * 3. nextInt() 	: IntŸ���� ������ �Է¹��� �� ���.
		 * 4. nextByte() 	: ByteŸ���� ������ �Է¹��� �� ���.
		 * 5. nextShort() 	: ShortŸ���� ������ �Է¹��� �� ���.
		 * 6. nextLong() 	: LongŸ���� ������ �Է¹��� �� ���.
		 * 7. nextDouble() 	: DoubleŸ���� �Ǽ��� �Է¹��� �� ���.
		 * 8. nextFloat() 	: floatŸ���� �Ǽ��� �Է¹��� �� ���.
		 */
	}
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		// ���ڿ��� ���� �� = next(), nextLine()
		// ���ڸ� ���� �� = nextChar()�� �������� �ʴ´�.
		
		// ����ڷκ��� ��������(�̸�, ����, ����, Ű)�� Ű����� �Է� �޾� ����ϴ� ���α׷�
		// ���� �Է� ���� : ����(Male), ����(Female)
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine();
		/*
		 * ���ڿ��� �Է¹ް��� ù��° ���� �ϳ����� �̾Ƴ���.
		 * "apple" ���ڿ� => �ε���(Index) : ��ǻ�ʹ� ���ڸ� 0���� ����.
		 * 1��° : a => ��ǻ�� : 0��°
		 * 2��° : p => ��ǻ�� : 1��°
		 * 3��° : p => ��ǻ�� : 2��°
		 * 4��° : l => ��ǻ�� : 3��°
		 * 5��° : e => ��ǻ�� : 4��°
		 * 
		 * ���ڿ��κ��� �ش���ġ(Index)�� ���� �ϳ����� �̾Ƴ��ִ� Method
		 * => �ش繮�ڿ�.charAt(Index)�̶�� Method��.
		 * 1. Ű����� �Է¹޴´� =>nextLine()
		 * 2. �Է¹��� ���ڿ��κ��� charAt()��  ����
		 * => sc.nextLine().charAt(0);
		 * 
		 * [���ǻ���]
		 * ���� ���� �̰��� �ϴ� ��ġ���� ���ڿ��� ũ�⺸�� ũ�ٸ�?
		 * abc.charAt(100);
		 * [�����޼���]
		 * char gender = sc.nextLine().charAt(100);
		 * Exception in thread "main" java.lang
		 * .StringIndexOutOfBoundsException 
		 * : String index out of range: 100
		 * =>���ڿ��� Index�� ������ �����.
		 * Male�� �� 4����(0,1,2,3)�ε� 100��° �ε����� ���ڸ� �����ϰ��� �ؼ� �߻��Ͽ���.
		 * 
		 */
		System.out.print("����(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("Ű : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		// ����غ���
		System.out.println(name + "���� ��������");
		System.out.println("���� : "+gender);
		System.out.println("���� : "+age);
		System.out.println("Ű : "+height);
	}
	// [����]
	// ����,nextInt ������ nextLine���� ���۸� �������� ���� ���. 
	public void inputTest3() {
		//����ڷκ��� ���������� �Է¹޴� ��(�̸�, ����, �ּ�)
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		
		System.out.print("���� : ");
		int age = sc.nextInt();
		sc.nextLine(); //=> ����(�ӽú�����)�� ����ֱ� ���� ����Ѵ�.
		//nextInt�� �̿��Ͽ� ���ڰ��� �ް��� , �� ���Ŀ� nextLine�� ����ϸ� �߻��Ѵ�.
		//nextLine��� next�� ����ϸ� ���鿡 �Է��� �� �ִ� ������ ���ܳ���.
		
		System.out.print("�ּ� : ");
		String addr = sc.nextLine();
		
		System.out.print(addr + "�� ��� " + age + "�� " + name + "�� ȯ���մϴ�.");
	}
}
