package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 
	 * ���� : �ش� �ڷ����� �� �ϳ����� ���� �� �ִ� ����(�� ��ü�� ���� �� ����)
	 * ����)
	 * int a = 10;
	 * 
	 * �迭 : �ش� �ڷ����� �� �������� ���� �� �ִ� ����
	 * ����)
	 * 1. �迭����
	 * int[] arr;
	 * 
	 * 2. �迭 �Ҵ� 
	 * => �޸� ������ �Ҵ�.
	 * int[] arr = new int[3]; 
	 * => Heap����(new)�� int�� ���� �� ������ 3ĭ�� ����.
	 * => �� [0]ȣ,[1]ȣ,[2]ȣ�� ���� ��.
	 * => [index] : �ε����� 0���� ������(�߿�)
	 * => �迭�� ũ�� : 3 / ������ �ε��� : 2		(0,1,2)
	 * => �迭�� ũ�� : 5 / ������ �ε��� : 4		(0,1,2,3,4)
	 * => ���ڿ��� ���� : 5 / ������ �ε��� : 4	(0,1,2,3,4)
	 * => ũ��(����) : n / ������ �ε��� = n-1
	 * 
	 * 3. �迭 �ʱ�ȭ
	 * arr[0] = 10;
	 * arr[1] = 20;
	 * arr[2] = 30;
	 */
	
	public void method1() {
//	        �迭�� �� ��� �ϴ°�?
//	        ����
//		0, 1, 2, 3, 4�� ����ؾ� ��.
		
//		1.�������� �̿�
//		int num1=0;
//		int num2=1;
//		int num3=2;
//		int num4=3;
//		int num5=4;
//		����ϱ� ���ؼ� ��¹��� 5���̳� �ۼ���.
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		for(int i=1; i<=5; i++) {
//			System.out.println(numi); �̷������� �� ���� ����.
//		}
//		int sum = 0;
//		for(int i=1; i<=5; i++) {
//			sum = sum + numi; �̷������� �� �� ����.
//		}
//		�ݺ����� ����ϰ��� �ϳ�, ���Ͱ��� �ݺ����� ������ ������
//		sum = num1+num2+num3+num4+num5; // �̷������� ����� ��.
		
//		2.�迭�� �̿�
		/*
		 * -�迭 ����
		 * [ǥ����]
		 * �ڷ���[] ������;
		 * �ڷ��� ������[];
		 * int[] arr; �Ǵ� int arr[]; 
		 * => 1. Stack������ arr�̶�� �迭 ������ �����
		 *
		 *
		 * -�迭 �Ҵ� : �迭�� ũ�⸦ ����(�޸� ������ Ȯ��)
		 * 		       �����Ѹ�ŭ ���� �� ���� �������.
		 * [ǥ����]
		 * �迭�� = new �ڷ���[�迭ũ��];
		 * arr = new int[5]; 
		 * => 2. Heap������ int��,ũ�Ⱑ 5�� ���� ����(4byte*5)
		 *    3. ���Կ����ڸ� ���� Heap�� �������� �ּҰ��� Stack�� ���� 
		 *
		 */
		// -����� ���ÿ� �Ҵ�
	    System.out.println();
		int[] arr = new int[5];
	    
	    /*
	     * -�ʱ�ȭ �� �� ����
	     * [ǥ����]
	     * �迭��[�ε���] = ��; => �ε����� ������ �ּҰ��� ��ȯ��.
	     */
//		arr[0]=0;
//		arr[1]=1;
//		arr[2]=2;
//		arr[3]=3;
//		arr[4]=4;
//	    System.out.println(arr[0]);
//	    System.out.println(arr[1]);
//	    System.out.println(arr[2]);
//	    System.out.println(arr[3]);
//	    System.out.println(arr[4]);
		
	    // �ݺ����� �̿��ؼ� ���� ����
	    for(int i=0; i<5; i++) {
	    	arr[i]=i;
	    }
	    // �ݺ����� �̿��ؼ� ���� ���
	    for(int i=0; i<5; i++) {
	    	System.out.println(arr[i]);
	    }

		System.out.println(arr);
		// arr���� �ּҰ��� ���([I@6d06d69c) - Stack����
		// ����, arr���� ���� ���� �� ����.
		
	}
	public void method2() {
		// ���� ����� ���ÿ� ����
		int i = 10;	
		
		// �迭 ����� ���ÿ� �Ҵ�
		int[] iArr = new int[5]; 
		
		System.out.println("i : "+i);	
		// 10
		System.out.println("iArr : "+iArr); 
		// [I@6d06d69c (�ּҰ� : Stack(�ּҰ�) -> Heap(������))
		System.out.println("iArr�� �ؽ��ڵ尪 : "+iArr.hashCode()); 
		// 1829164700 (�ؽ��ڵ� : �ּҰ��� 10������ ���·� ������)
		// �ؽ��ڵ带 �̿��ϸ� Stack�� ����񱳰� ������.
		
		double[] dArr = new double[3]; 
		System.out.println("dArr : "+dArr);
		// [D@7852e922
		System.out.println("dArr�� �ؽ��ڵ尪  : "+dArr.hashCode());
		// 2018699554
		
		/*
		 * �⺻�ڷ��� : ���� ���� Stack�� �ٷ� ���� �� �ִ� ����
		 * boolean, char, byte, short, int long, float, double
		 * => ���� �̸��� ���� ��, ���� ���� ���� �ٷ� �޾ƺ� �� ����.
		 * => �̸� '�Ϲݺ���'��� ��.
		 * 
		 * �����ڷ��� : �ּҰ��� ��� �ִ� ����.���� ���� Heap������ ����.
		 * String, �ڷ���[](�迭), new(Scanner, A_Array,...)
		 * => ���� ���� �ƴ�, �� �������� �����ϴ� ���� �ּҰ��� �޾ƺ� �� ����.
		 * => �̸� '��������'(reference Variable)�̶�� ��.
		 * String str = "�ٺ�";
		 * System.out.print("�ٺ�");
		 * => �ٸ�, String�� ���������� �Ϲݺ���ó�� �ּҰ��� �ƴ� �������� �ٷ� ȣ���� �� ����.
		 */
	}
	public void method3() {
		int[] iArr = new int[3]; // [0], [1], [2]
		double[] dArr = new double[3]; // [0], [1], [2]
		System.out.println(iArr); // �ּҰ� : [I@6d06d69c
		System.out.println("iArr[0] : "+iArr[0]); // 0
		System.out.println("iArr[1] : "+iArr[1]); // 0
		//...
		// �迭 ����, �ݺ����̶� ���̾��� ����
		
		/*
		 * �迭�� ����� ��, �ݺ����� ���� �� ����.
		 * 0�� �ε������� ������ �ε������� ���������� ����� �� ����
		 * ������ �ε��� �� == �迭�� ũ��-1
		 * 
		 * �迭�� ũ�⸦ �ƴ� ���
		 * [ǥ����]
		 * �迭��.length
		 * => �迭�� ���̸� �˷��ִ� ����
		 * => length()�ƴ�. �̰� �޼ҵ���.
		 */
		System.out.println("iArr�� ũ�� : "+iArr.length); 
		// 3([0], [1], [2])
		System.out.println("dArr�� ũ�� : "+dArr.length); 
		// 3([0], [1], [2])
		
		/*
		 * for������ �ݺ��� Ƚ���� �����ϴ� ���� ���� ���
		 * 1. ���������� �ݺ�
		 * int i=0 ; i<�ݺ�Ƚ�� ; i++
		 * int i=0 ; i<5 ; i++ (5�� �ݺ�)
		 * 
		 * 2. �迭�� ũ�⸸ŭ �ݺ�
		 * int i=0 ; i<�ݺ�Ƚ�� ; i++
		 * int i=0 ; i<iArr.length ; i++ 
		 */
		System.out.println();
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);
		}
		// iArr[0] == 0
		// iArr[1] == 0
		// iArr[2] == 0
		
		System.out.println();
		for(int i=0; i<dArr.length; i++) {
			System.out.println(dArr[i]);
		}
		// dArr[0] == 0.0
		// dArr[1] == 0.0
		// dArr[2] == 0.0
		
		/*
		 * �迭�� Ư¡
	     * ���� �ʱ�ȭ, �������� �ʾ������� �� ��µǴ� ���� �� �� ����.
	     * => int�� �迭�� ���� '0', double�� �迭�� '0.0'�� ���
	     * => �迭 ������, ���� ����ִ� ���� Heap������ ������.
	     * => �� Heap������ Ư¡��, ���� �� �������� ������ �� ����.
	     * => �̿� ���� �������� ������, �� �ڷ����� �⺻���� Heap�� ������.
	     * �⺻�� : 0(������), 0.0(�Ǽ���), ' '(������)
	     * [����]
	     * �⺻�ڷ��� ���� : ���� ���� �ʱ�ȭ(���� ó�� ����)�� ��.
	     * �����ڷ��� ���� : JVM�� �˾Ƽ� �ʱ�ȭ�� ����.(Heap������)
		 */
		
//		int num;
//		System.out.println(num);
//		[�����޼���]
//		The local variable num may not have been initialized
//		������ ���� ���Ե��� �ʾ� �߻��ϴ� ������.
		
//		String str;
//		System.out.println(str);
//		[�����޼���]
//		The local variable num may not have been initialized
//		������ ���� ���Ե��� �ʾ� �߻��ϴ� ������.
		
	}
	public void method4() {
		int[] arr = new int[5]; //[0],[1],[2],[3],[4]
//		�⺻������ ���� �ٲ���.
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;

//		arr[5] = 6;
//		arr[6] = 7;
		
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		[�����޼���]
//		ArrayIndexOutOfBoundsException: 5
//		�翬�� �ε����� ������ �ʰ��Ͽ� �����޼����� ����.
//		(�ε����� 4�����ε� 5�� �����ϰ��� �Ͽ���.)
		
//		�� ������ ���� �ݺ���
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
//		�� ����� ���� �ݺ���
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		�� ��°� ���� ������ �ϱ� ���� �ݺ���
		System.out.println();
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			System.out.println(sum);
		}
	}
	public void method5() {
//		10ĭ¥�� �迭�� ���� ��
//		�迭 �� �濡 ������ ���� ���� ����
//		���� ���� ������ 51~100����
//		int random = (int)((Math.random()*50)+51); ��50��, ���۰�:51
//		for�� �ۿ��� �ۼ��ϸ�, �ѹ��� ��µ� �������� �迭�� ��� ä����.
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*51)+50); 
//			�̷���, �Ź� �������� ������ �������.
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
	}
	public void method6() {
		
		int[] arr = new int[5];
		System.out.println("�ּҰ� : "+arr);
		// [I@6d06d69c
		System.out.println("�ؽ��ڵ尪 : "+arr.hashCode());
		// 1829164700
		
		int value = 2;
		for(int i=0; i<arr.length;i++) {
			arr[i] = value;
			value += 2;
		}
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		/*
		 * �迭�� ���� ū ����
		 * ���� �Ҵ��ߴ� ��������, �ѹ� ������ �迭�� ũ���
		 * ������ �Ұ��ϴ�.
		 * => �迭�� ũ�⸦ ���� �����ϰ��� �Ѵٸ�,
		 * => ��¿ �� ���� ���ο� �迭�� �ٽ� ���� �����.
		 * => �� ���, ���� �� �Ҵ��� �ٽ��ؾ� �ϳ�?
		 */
		
//		�Ҵ縸 �ٽ� �غ�
		System.out.println();
//		int[] arr = new int[5]; 
		arr = new int[7]; 
		System.out.println("���ο� �ּҰ� : "+arr); 
//		[I@7852e922
		System.out.println("���ο� �ؽ��ڵ尪 : "+arr.hashCode());
//		2018699554
		
		/*
		 * �޸� �������� ������ �Ҵ��� ���� �׻� ������ �ּҰ��� �ο���.
		 * => ������ ������ �ּҰ��� ���� �ߺ����� ����.
		 * => ���Ӱ� �Ҵ縸 �� ��쿡�� 
		 * => ������ �����ϰ� �ִ� ������ �ּҰ��� ���ο� �ּҰ����� ����Ǹ�
		 * => ������ ������ �����, ���ο� ����� �ٲ�.
		 * => ������ ������ �迭�� �޸��� Heap������ ���ٴϴٰ�
		 * => ���� �ð��� ������ ������ ��.
		 * 	  (�ڵ� �޸� ���� : Garbage Collection(Collector), GC)
		 */
//		������ �ٲٴ°� �ƴ϶�, �׳� ���� �ʹٸ�?
//		arr = null; �ƹ��͵� �������� �ʴ� ���� �ǹ�.
//		System.out.println(arr); null�̶�� ��.
//		arr[0] = 10; ��ȿ���� ���� �ڵ�
		/*
		 * System.out.println(arr);
		 * System.out.println(arr.hashCode());
		 * [�����޼���]
		 * NullPointerException
		 * ã�ư� �ּ����� ���µ�, ��� 0��° �濡 �����ؼ� ���� �־�?��� ���ϴ°���.
		 * null�� ����ִ� �� ��������, ��� ������ �ϸ� �߻��ϴ� ����
		 */
		
		/*
		 * �⺻�ڷ����� �⺻��
		 * ������ : 0
		 * �Ǽ��� : 0.0
		 * ������ : ' '(����)
		 * �����ڷ��� : null => ã�ư� �ּҰ��� ����.
		 * 
		 */
	}
	public void method7() {
		/*
		 * 3���� ����ڿ��� �Ź� Ű�� ������ �Է¹޾�,
		 * �迭�� ��Ƶΰ�
		 * 3���� Ű�� ���� ���, ���հ�, ����� ����Ͽ� ���
		 */
		Scanner sc = new Scanner(System.in);
		
		//3���� Ű ���� ���� double�� �迭 �ϳ� �����
		//3���� Ű�� ���� ��ĳ�ʷ� �Է¹޾� �� �濡 ���.
		double[] heights = new double[3];
		double sum = 0;
		double avg = 0;
		for(int i=0; i<heights.length; i++) {
			System.out.print("Ű �Է�(cm) : ");
			heights[i] = sc.nextDouble();
			sc.nextLine();
		}
		//3���� Ű ���� ��� + ���հ�,��� ���ϱ�
		for(int i=0; i<heights.length;i++) {
			System.out.println((i+1)+"��° ����� Ű : "+heights[i]+"cm");
			sum = sum + heights[i];
		}
		System.out.println("Ű�� ���հ� : "+sum+"cm");
		System.out.println("Ű�� ��� : "+(sum/heights.length)+"cm");
//		System.out.printf("Ű�� ��� : %.2f"cm",(sum/heights.length));
	}
	public void method8() {
//		����ڿ��� ���ڿ� �ϳ��� �ް�
//		������ ���ڵ��� char �迭�� �Űܴ��
		Scanner sc = new Scanner(System.in);
		
//		1. ����ڷκ��� ���ڿ��� �Է�
		System.out.print("���ڿ� �Է� : ");
		String str = sc.nextLine();
		
//		2. char�迭 �����(�迭 ũ��� ���ڿ��� ���̸�ŭ)
		char[] chArr = new char[str.length()];
		
//		3. ������ ���ڵ��� char�迭�� �Űܴ��
//		���鵵 ���ڷ� ��޵Ǿ� ��µ�.
//		                            �迭�� ���̷� ���ǽ��� �� 
		for(int i=0; i<chArr.length;i++) {
			chArr[i] = str.charAt(i);
			System.out.println((i+1)+"��° ���ڿ� : "+chArr[i]);
		}
	}
	public void method9() {
//		������ ���
//		1. ���� ����
		int num;
//		2. ������ ����� ���ÿ� ����
		int num1 = 1;
//		�迭�� ���
//		1. �迭�� ����� ���ÿ� �Ҵ�
//		(�� ���, ���� ������ JVM�� ���� �⺻������ �ʱ�ȭ �� ���Ե�.)
		int[] arr = new int[4];
//		2. �迭�� ����� ���ÿ� �Ҵ�� ���ÿ� �ʱ�ȭ �� ����
//		- ���1
		int[] arr1 = new int[] {1,2,3,4};
		
//		- ���2(�� ����� ���� ��)
		int[] arr2 = {1,2,3,4};
		
//		�迭�� �����
//		Stack�� �ּҰ�(�ؽ��ڵ�)���� ������̱� ������
//		������� ��� false�� ����.
		System.out.println(arr == arr1);	// false
		System.out.println(arr1 == arr2);	// false
		System.out.println(arr2 == arr);	// false
		System.out.println();
		System.out.println(arr.hashCode() == arr1.hashCode());	
		// false
		System.out.println(arr1.hashCode() == arr2.hashCode());	
		// false
		System.out.println(arr2.hashCode() == arr.hashCode());	
		// false
	}
	public void method10() {
		
//		�����ϴ� ������ ������ �Է¹��� �Ŀ�,
//		�� ������ŭ �迭�� ���� �����Ͽ�
//		���ϸ��� �Է¹޾Ƽ� ���ڿ� �迭�� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ ���� : ");
//		1. ������ ������ �Է¹���
		int size = sc.nextInt();
		sc.nextLine();
		
//		2. ������ ������ŭ ���� ũ�⸦ ����
		String[] fruitsName = new String[size];
		
//		3. �����ϴ� ���ϸ��� �Է¹޾Ƽ� �� �濡 �ֱ�
		for(int i=0; i<fruitsName.length;i++) {
			System.out.print("�����ϴ� ���ϸ� �Է� : ");
			fruitsName[i] = sc.nextLine();
		}
//		4. ���ϸ��� ����� ������ ����� ���
		for(int i=0; i<fruitsName.length;i++) {
			System.out.println("�Էµ� ���ϸ� : "+fruitsName[i]);
		}
	}
}
