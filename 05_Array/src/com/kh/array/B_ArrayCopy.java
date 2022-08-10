package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * �迭 ����
	 * �迭�� �ڷ���, ������, ũ�⸦ �Ȱ��� ������.
	 * [���]
	 * 1. ���� ���� : �迭�� �ּҰ��� �����ϴ� ����.
	 * 2. ���� ���� : ������, ���ο� �迭�� �����Ͽ� ���ΰ����� �����ϴ� ����.
	 */
	public void method1() {
//		���縦 �ϱ� ��, ������������ �翬�� '����'�� �����ؾ� ��.
//		1. �迭 ����� ���ÿ� �ʱ�ȭ
		int[] origin = {1,2,3,4,5};
//		origin[0] = 1;
//		origin[1] = 2;
//		origin[2] = 3;
//		origin[3] = 4;
//		origin[4] = 5;
		System.out.println("===== ���� �迭 ��� =====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
//		���纻 �迭
//		*���� ���� : �ּҰ����� ������.
//		1. ���� ����(�ּҰ�)
		System.out.println("\n===== ���纻 �迭 ��� =====");
		int[] copy = origin;
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		Stack : origin(0123) -----> Heap : 0123({1,2,3,4,5}) 
//		          copy(0123) --------��
		
//		2. copy�� ������ �����ϱ�
		copy[2] = 100;
		System.out.println("\n===== ���纻 �迭 ���� =====");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		3. copy�� ���� �� ��, originȮ��
		System.out.println("\n===== ���纻 �迭 ���� ���� ����=====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
//		������ �Ѽյ�. 
//		=> copy�� origin�� ���� �ּҰ����� ������ �Ǿ����
//		=> copy�� �����Ͽ��� origin���� ������ �Ǿ����
//		Stack : origin(0123) -----> Heap : 0123({1,2,100,4,5}) 
//        		  copy(0123) --------��
//				 (copy[2]=100;)       
		System.out.print("\n ���� �迭�� �ؽ��ڵ� : "+origin.hashCode());
		System.out.print("\n ���纻 �迭�� �ؽ��ڵ� : "+copy.hashCode());
//		�Ѵ� ���� �ؽ��ڵ��, �ٽø��ϸ� ���� ���� �迭�̶�� �� ������.
	}
	
	public void method2() {
//		*���� ���� : ���ο� �迭�� �����Ͽ� ���ΰ����� �����ϰ� ������.
//		1. for���� �̿��ϴ� ���
//		���ο� �迭�� ������ ��, �� �ε��� ���� ���� ���� ������ ���Խ�����.
		
//		���� �迭
		int[] origin = {1,2,3,4,5};
		
//		���纻 �迭(ũ��� ������, ���빰�� �ٸ�)
//		{0,0,0,0,0}			{1,2,3,4,5}
		int[] copy = new int[origin.length];
		
//		�� ����
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
//			copy[0] = origin[0];
//			copy[1] = origin[1];
//			copy[2] = origin[2];
//			copy[3] = origin[3];
//			copy[4] = origin[4];
		}
//		���纻 ���
		System.out.println("=== ���纻 �迭 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		���纻 �迭 ����
		copy[2] = 100;
		System.out.println("\n=== ���纻 �迭 ���� �� ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		���� Ȯ��
		System.out.println("\n=== ���� �� ���� �迭 ===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
//		������ �Ѽյ��� ���� ���� �� �� ����.
//		=> �ּҰ��� �����ϴ� ���� ����� �޸�,
//		=> ���� ����� �迭�� ���� �����, ���� ���� ���� �����ϴ� ���̱⿡
//		=> �ּҰ��� �޶�, copy�� origin�� �Ѽս�Ű�� ����.
//		Stack : origin(0123) -----> Heap : 0123({1,2,3,4,5}) 
//		          copy(1234) -----> Heap : 1234({1,2,100,4,5})
		}
		System.out.println();
		System.out.println("\n���� �迭�� �ؽ��ڵ� : "+origin.hashCode());
//		1829164700
		System.out.println("���纻 �迭�� �ؽ��ڵ� : "+copy.hashCode());
//		2018699554
//		�ּҰ�(�ؽ��ڵ�)�� �ٸ� ���� �� �� ����.
	}
	public void method3() {
//		2. ���ο� �迭�� ������ ��,
//		System�̶�� Ŭ�������� arraycopy��� �޼ҵ带 ȣ���Ͽ� ����
//		�� �޼ҵ�� static������ �ö� �־� import���� ������� ����.
		
//		���� �迭
		int[] origin = {1,2,3,4,5};
		
//		���纻 �迭
//		             {0,0,0,0,0,0,0,0,0,0}
		int[] copy = new int[10];
		
//		arraycopy
//		origin �迭, 0��° �ε�������, �� 5���� ����,
//		copy�迭, 0��° �ε�������, �����Ͽ� �ְڴ�.
//		System.arraycopy(�����迭��, �����迭�� ���縦 ������ index,
//		                                       ����迭��, ����迭�� ���簪�� �� index, ����)
//		System.arraycopy(origin, 0, copy, 0, 5);
//					{1,2,3,4,5,0,0,0,0,0}
//		System.arraycopy(origin, 0, copy, 2, 5);
//					{0 0 1 2 3 4 5 0 0 0}
		System.arraycopy(origin, 0, copy, 1, 3);
//					{0 1 2 3 0 0 0 0 0 0}
//		System.arraycopy(origin, 2, copy, 9, 2);
//					{0 0 0 0 0 0 0 0 0 3} 4 
//					[�����޼���]
//					ArrayIndexOutOfBoundsException
//					�ε����� ������ �Ѿ�� ���� �����Ϸ��� ����.
//		1. �ε��� ������ ����� ���� ���� ������ �ߴ� ����.
//		2. ���縦 �ϰ� ���� �κ��� JVM�� ���ؼ� �ʱ�ȭ�� �Ǿ��� 0�̶�� ���ڰ� ������.
//		3. ��������� ���� ���ϴ� �ڸ��� ���ϴ� ��ŭ�� �κ� ���簡 ������.
//		4. import���� ���� �ʾ� static�� �پ����� ����.
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		System.out.println("�����ؽ��ڵ� : "+origin.hashCode());
		System.out.println("���纻�ؽ��ڵ� : "+copy.hashCode());
//		�ٸ� �ּҰ��� ������ �ִ� ���� �� �� ����.
//		�迭 ������, ������ ������ ���� �ʴ´ٴ� ���� ������ �� ����.
	}
	public void method4() {
//		3. Arrays
//		�迭�� �����ΰ��� ó���ϰ��� �� �� ����ϴ� Ŭ������.
//		�� �߿����� copyOf��� �޼ҵ带 �̿��Ͽ� ������.
		
//		�����迭
		int[] origin = {1,2,3,4,5};
		
//		���纻 �迭
		int[] copy = Arrays.copyOf(origin, 7);
//					       {1 2 3 4 5 0 0 }
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		�����غ� �� �ִ°�
//		1. �ݺ� ���? 7�� => �迭�� ũ�� ==7
//		2. 1,2,3,4,5�� ���� �ڿ� 0,0�� ����
//		=> 5,6��° �ε����� �����ϸ� �� ������ JVM�� �ڵ����� ä����.
//		3. import���� ���� �ʾ� static�� �پ����� ����.
//		[ǥ����]
//		�ڷ��� ���纻�迭�� = Arrays.copyOf(�����迭��, ���纻�迭�� ũ��)
		System.out.println();
		System.out.println("�����ؽ��ڵ� : "+origin.hashCode());
		System.out.println("���纻�ؽ��ڵ� : "+copy.hashCode());
//		�ٸ� �ּҰ��� ������ �ִ� ���� �� �� ����
//		�迭 ������, ������ ������ ���� �ʴ´ٴ� ���� ������ �� ����.
		
		/* ��������
		 * 1. for���� �̿��� �ܼ� ���� ����
		 * 
		 * 2. System.arraycopy �޼ҵ� ȣ��
		 * => ��� �ε������� ��� ��� ��ġ�� ������ ������ ���ϰ� ��� ����.
		 * 
		 * 3. �迭�� = Arrays.copyOf �޼ҵ� ȣ��
		 * => ������ 0�� �ε������� ���簡 �����.
		 * => ����, ���� ������ ������ŭ ���纻 �迭�� ũ��� ������.
		 * 
		 */
	}
	public void method5() {
//		4. clone�޼ҵ带 ȣ���Ͽ� ����
		
//		�����迭
		int[] origin= {1,2,3,4,5};

//		[ǥ����]
//		�ڷ���[] ���纻�迭�� = �����迭��.clone();
		int[] copy = origin.clone();
//		�ε�������x, ���簳������x => ���� �ɼ��� �������� ����.
		
//		���纻 ���
//		for���� �̿��Ͽ� ��� => [1,2,3,4,5]
		/*
		System.out.print("[");
		for(int i=0; i<copy.length; i++) {
			if(i<copy.length-1) { // ������ �ٷ� ���� �������� �޸��� ÷��O
				System.out.print(copy[i]+", ");
			}else {// ������ �������� �޸��� ÷��X
				System.out.print(copy[i]);
			}
		}
		System.out.println("]");
		*/
//		Arrays���� �����ϴ� �迭�� �Ѱ��� ���ڿ��� ǥ���Ͽ� �������ִ� �޼ҵ�
//		toString()
//		[ǥ����]
//		Arrays.toString(���� ����ϰ��� �ϴ� �迭��);
//		=> �հ� �ڿ� [], ���� ���̿��� �޸�(,)�� �� �� �ε����� ��� ������
//		       �ϳ��� ���ڿ��� ���̾� ����� �ִ� �޼ҵ�
		System.out.println(Arrays.toString(copy));
		
//		�ؽ��ڵ� Ȯ��
		System.out.println();
		System.out.println("�����ؽ��ڵ� : "+origin.hashCode());
		//1829164700
		System.out.println("���纻�ؽ��ڵ� : "+copy.hashCode());
		//2018699554
	}
}
