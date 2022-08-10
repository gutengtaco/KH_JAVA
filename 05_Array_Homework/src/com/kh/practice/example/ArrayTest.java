package com.kh.practice.example;

import java.util.Scanner;

public class ArrayTest {
	public void practice1() {
		/*
		 * ���̰� 10�� ������ �迭�� ����� �ݺ����� �̿��Ͽ�
		 * ������� �迭 �ε����� ���� �� �� ���� ������ ���� ����ϼ���
		 * 
		 * 1 2 3 4 5 6 7 8 9 10
		 */
		int[] arr = new int[10];
		for(int i=0; i<=9; i++) {
			arr[i] = (i+1);
			System.out.print(arr[i]+" ");
		}
	}
	public void practice2() {
		/*
		 * ���̰� 10�� ������ �迭�� ����� 
		 * �ݺ����� �̿��Ͽ� �������� �迭 �ε����� ���� �� �� ���� ����ϼ���.
		 * 10 9 8 7 6 5 4 3 2 1
		 */
		int[] arr = new int[10];
//		0 0 0 0 0 0 0 0 0 0(0~9) ���� : 10
		for(int i=arr.length; i>0; i-- ) {
			arr[i-1]=i;
			System.out.print(arr[i-1]+" ");
		}
	}
	public void practice3() {
		/*
		 * ����ڿ��� �Է¹��� ���� ������ŭ
		 * �迭 ũ�⸦ �Ҵ��ϰ�
		 * 1���� �Է¹��� ������ �迭�� �ʱ�ȭ�� �� ���
		 * 
		 * ���� ���� : 5
		 * 1 2 3 4 5
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		if(num>0) {
		// �迭 ���� �� �Ҵ�
			int[] arr = new int[num];
				for(int i=0; i<arr.length; i++) {
					// �迭 �ʱ�ȭ �� �� ����
					arr[i] = i+1;
					System.out.print(arr[i]+" ");
				}
		}else {
			System.out.println("���� ������ ���� �Է��ϼ���.");
		}
		
	}
	public void practice4() {
		/*
		 * ���̰� 5�� String�迭�� �����ϰ� 
		 * �������, ���֡�, ��������, �������ơ�, �����ܡ��� �ʱ�ȭ �� ��
		 * �迭 �ε����� Ȱ���ؼ� ���� ����ϼ���
		 * 
		 * ex.
		 * ��
		 */
		String[] arr = {"���","��","����","������","����"};
		System.out.println(arr[1]);
	}
	public void practice5() {
		/*
		 * ���ڿ��� �Է� �޾� ���� �ϳ��ϳ��� �迭�� �ְ�
		 * �˻��� ���ڰ� ���ڿ��� �� �� �� �ִ���
		 * ������ �� ��° �ε����� ��ġ�ϴ��� �ε����� ����ϼ���
		 * 
		 * ���ڿ� : application
		 * ���� : i
		 * application�� i�� �����ϴ� ��ġ(�ε���) : 4 8 
		 * i ���� : 2
		 */
		Scanner sc = new Scanner(System.in);
//		���ڿ� �� ���� �Է¹ޱ�
		System.out.print("���ڿ� : ");
		String str = sc.nextLine();
		System.out.print("���� : ");
		char ch = sc.nextLine().charAt(0);

//		���ڸ� �ϳ��ϳ� ���� �迭�� �� ���� �����
		char[] arr = new char[str.length()];
		int[] num = new int[arr.length];

//		���ڸ� �ϳ��ϳ� �迭�� �ֱ�
//		a p p l i c a t i o n
		for(int i=0; i<arr.length; i++) {
			arr[i] = str.charAt(i);
		}
//		0 0 0 0 4 0 0 0 8 0 0 
		for(int i=0; i<num.length; i++) {
			if(arr[i]==ch) {
				num[i]=i;
			}
		}
//		���ڿ��� ���ڰ� ��ġ�ϴ� �ε��� Ȯ���ϱ�
		System.out.printf("%s�� %c�� �����ϴ� ��ġ(�ε���) : ", str,ch);
		for(int i=0; i<num.length; i++) {
				if(num[i]==0) {
					System.out.print(" ");
				}else {
					System.out.print(num[i]);
				}
		}
//		������ ���� ã��
		int sum = 0;
		for(int i=0; i<num.length;i++) {
			if(num[i]!=0) {
				sum++;
			}
		}
		System.out.println();
		System.out.printf("%c�� ���� : %d",ch,sum);
		
	}
	public void practice6() {
		/*
		������ ~ ���ϡ� (����)���� �ʱ�ȭ�� ���ڿ� �迭�� �����
		0���� 6���� ���ڸ� �Է� �޾�
		�Է��� ���ڿ� ���� �ε����� �ִ� ������ ����ϰ�
		������ ���� ���ڸ� �Է� �� ���߸� �Է��ϼ̽��ϴ١��� ����ϼ���
		
		0 ~ 6 ���� ���� �Է� : 4 
		�ݿ��� 
		0 ~ 6 ���� ���� �Է� : 7
		�߸� �Է��ϼ̽��ϴ�
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		sc.nextLine();
		String[] days = {"������","ȭ����","������","�����","�ݿ���","�����","�Ͽ���"};
		if(num>=0 && num<=6) {
			for(int i=0; i<days.length; i++) {
				if(num==i) {
					System.out.print(days[i]);
				}
			}
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
	public void practice7() {
		/*
		 * ����ڰ� �迭�� ���̸� ���� �Է��Ͽ� �� ����ŭ ������ �迭�� ���� �� �Ҵ��ϰ�
		 * �迭�� ũ�⸸ŭ ����ڰ� ���� ���� �Է��Ͽ� ������ �ε����� ���� �ʱ�ȭ �ϼ���.
		 * �׸��� �迭 ��ü ���� �����ϰ� �� �ε����� ����� ������ ���� ����ϼ���
		 * 
		 * ���� : 5
		 * �迭 0��° �ε����� ���� �� : 4
		 * �迭 1��° �ε����� ���� �� : -4
		 * �迭 2��° �ε����� ���� �� : 3
		 * �迭 3��° �ε����� ���� �� : -3
		 * �迭 4��° �ε����� ���� �� : 2
		 * 4 -4 3 -3 2 
		 * �� �� : 2
		 */
		
		Scanner sc = new Scanner(System.in);
//		����
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
//		�Է¹��� ������ ��ŭ �迭�� ������ �ø�.
		int[] arrNum = new int[num];
//		����
		int sum = 0;
//			�迭X��° �ε����� ���� ���� �Է� �ޱ�
			for(int i=0; i<arrNum.length; i++) {
				System.out.printf("�迭 %d��° �ε����� ���� �� : ",i);
				arrNum[i] = sc.nextInt();
				sc.nextLine();
				sum = sum+arrNum[i];
			}
//			��� ���
			for(int i=0; i<arrNum.length; i++) {
				System.out.print(arrNum[i]+" ");
			}
			System.out.println();
			System.out.println("���� : "+sum);
	}
	
	
	
	
	
	
	
	
	public void practice8() {
		/*
		 * 3�̻��� Ȧ�� ������ �Է� �޾� 
		 * �迭�� �߰������� 1���� 1�� �����Ͽ� ������������ ���� �ְ�,
		 * �߰� ���ĺ��� �������� 1�� �����Ͽ� ������������ ���� �־� ����ϼ���.
		 * ��, �Է��� ������ Ȧ���� �ƴϰų� 3 �̸��� ��� ���ٽ� �Է��ϼ��䡱�� ����ϰ�
		 * �ٽ� ������ �޵��� �ϼ���
		 * 
		 * ���� : 4
		 * �ٽ� �Է��ϼ���.
		 * ���� : -6
		 * �ٽ� �Է��ϼ���.
		 * ���� : 5
		 * 1, 2, 3, 2, 1
		 */
		Scanner sc = new Scanner(System.in);
		for(;;) {
//			3�� �Է��ߴٰ� ����.
			System.out.print("���� : ");
			int num = sc.nextInt(); 	
//			num�� 3�̻��̸鼭 Ȧ���� ���� �Է¹޵��� ��.
			if(num>=3 && num%2==1) {
				int[] numArr = new int[num+(num-1)]; // num+(num-1) = 5
//				�������� : 1, 2, 3 => num : 3
//				�������� : 2, 1 => num : 2
				
//				k�� �����Ͽ� ��������, ���������� ������.
				int k=1;
				
//				i=0,1,2
				for(int i=0; i<num; i++) {	
//					num[0] = 1
//					num[1] = 2
//					num[2] = 3
					numArr[i]=k;
					k++; 
				}
//				nunArr[i]=3, k=4;
//				i = 3,4
				for(int i=num; i<num+(num-1);i++) {
//					num[3] = 2
//					num[4] = 1
					numArr[i]=k-2; 
					k--;
				}
//				���� ���
				for(int i=0; i<numArr.length; i++) {
					System.out.print(numArr[i]+" ");
				}
				break;
//			num�� 3�̸��̸鼭 ¦���� ��.
			}else {
				System.out.println("�ٽ� �Է��ϼ���.");
				continue;
			}
		}
	}
	public void practice9() {
		/*
		 * ����ڰ� �Է��� ���� �迭�� �ִ��� �˻��Ͽ�
		 * ������ ��OOO ġŲ ��� ���ɡ�, ������ ��OOO ġŲ�� ���� �޴��Դϴ١��� ����ϼ���. 
		 * ��, ġŲ �޴��� ���ִ� �迭�� ���� ������ ���ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		// ���ڿ� �迭 ����� ���ÿ� �ʱ�ȭ
		String[] menu = {"�Ķ��̵�","���","����"};
		 
		for(int i=0;; i++) {
			System.out.print("�޴� �Է� : ");
			String userInput = sc.nextLine();
				if(menu[0].equals(userInput)||
				   menu[1].equals(userInput)||
				   menu[2].equals(userInput)) { // �����ϴ� �޴�
						System.out.printf("%s ġŲ ��� ����\n",userInput);
				}else { // �������� �ʴ� �޴�
					System.out.printf("%s ġŲ�� ���� �޴��Դϴ�\n",userInput);
					break;
				}
		}
	}
	public void practice10() {
		/*
		 * 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		 * 1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ�� �� ����ϼ���
		 * 
		 * ����
		 * 9 7 6 2 5 10 7 2 9 6
		 */
		int[] arr = new int[10];
			for(int i=0; i<arr.length; i++) {
				int random = (int)((Math.random()*10)+1);
				arr[i] = random;
				System.out.print(arr[i]+" ");
			}
	}
	public void practice11() {
		/*
		 * 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		 * 1~10 ������ ������ �߻����� �迭�� �ʱ�ȭ ��
		 * �迭 ��ü ���� �� �� �߿��� �ִ밪�� �ּҰ��� ����ϼ���
		 * 
		 * 		  5 3 2 7 4 8 6 10 9 10 
		 * 
		 * �ִ밪 : 5 5 5 7 7 8 8 10 10 10
		 * �ּҰ� : 5 3 2 2 2 2 2 2  2  2
		 * 		 */
		int[] arr = new int[10];
//			���� �� ����
			for(int i=0; i<arr.length; i++) {
				int random = (int)((Math.random()*10)+1);
				arr[i] = random;
			}
//			5 3 2 7 4 8 6 10 9 10 
			int max = arr[0]; // 5
			int min = arr[0]; // 5
			
//			��Һ�(�ִ밪, �ּҰ�)
			for(int i=0; i<arr.length; i++) {
				if(arr[i]>max || arr[i]==10) { // i�� ������Ű�� arr[0]�� ���Ͽ� �� ū ���� max�� ����
					max = arr[i];
				}else if(arr[i]<min || arr[i]==1) { // i�� ������Ű�� arr[0]�� ���Ͽ� �� ���� ���� min�� ����
					min = arr[i];
				}
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			System.out.println("�ִ밪 : "+max);
			System.out.println("�ּҰ� : "+min);
	}
	public void practice12() {
		/*f
		 * 10���� ���� ������ �� �ִ� ������ �迭�� ���� �� �Ҵ��ϰ�
		 * 1~10 ������ ������ �߻����� �ߺ��� ���� ���� �迭�� �ʱ�ȭ�� �� ����ϼ���
		 * 
		 * arr1 : 1 1 8 3 9 5 7 3 10 5 
		 * k    : 1 
		 */

		int[] arr = new int[10];
//		i=0~9 
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*10)+1);

//			i=0 => X
//			i=1 => j=0;
//			i=2 => j=0,1
//			i=3 => j=0,1,2
//			...
//			i=7 => j=0,1,2,3,4,5,6
//			i=8 => j=0,1,2,3,4,5,6,7
//			i=9 => j=0,1,2,3,4,5,6,7,8
//			������(j)�� ������(i)�� ������ ��ġ�� 1 ���ҽ��� ������(j)���� ���ư�
			for(int j=0; j<i ; j++) {
				if(arr[j] == arr[i]) {
				i--;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public void practice13() {
		/*
		 * �ֹε�Ϲ�ȣ�� String ���ڿ��� �Է� �ް�
		 * �Է� ���� �� ���ڿ��� �� �ε��� �� ���ڸ�
		 * char[]�� �Ű� ��� (��, ���� �ڸ� ���ĺ��ʹ� *�� ���
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		String adress = sc.nextLine();
		
		char[] ch = new char[adress.length()];
		for(int i=0; i<9; i++) {
			ch[i] = adress.charAt(i);
		}
		for(int i=8; i<14; i++) {
			ch[i] = '*';
		}
		for(int i=0; i<ch.length; i++) {
			System.out.print(ch[i]);
		}
	}
	public void practice14() {
		/*
		 * �ζ� ��ȣ �ڵ� ������ ���α׷��� �ۼ��ϴµ� 
		 * �ߺ��� ���� ������������ �����Ͽ� ����ϼ���.
		 * 
		 * 3 4 15 17 28 40
		 */
		int[] lotto = new int[6];

//		�ζǿ� ��ȣ ����
		for(int i=0; i<lotto.length; i++) {
			int random = (int)((Math.random()*50)+1);
			lotto[i] = random;
			
//				 X			: i=0
//			     j=0   		: i=1
//				 j=0,1		: i=2
//				 j=0,1,2  	: i=3
//				 j=0,1,2,3 	: i=4
//				 j=0,1,2,3,4  : i=5
//				������(j)�� ������(i)�� ������ ��ġ�� 1 ���ҽ��� ������(j)���� ���ư�
				for(int j=0; j<i; j++) {
					if(lotto[j]==lotto[i]) {
						i--;
					}
					
//					box��� ������ �̿��Ͽ�
//					box�� lotto[i]�� �ְ�
//					lotto[i]�ڸ��� lotto[j]�� �ְ�
//					lotto[j]�ڸ��� ������ lotto[i]�� �ִ´�.
					
//					����
//					12 9 x x x
					
//					lotto[j](������) > lotto[i](������)
//					12 > 9
					
//					box = lotto[i]
//					box = 12
					
//					lotto[i] = lotto[j]
//					9 9 x x x 
					
//					lotto[j] = box;
//					9 12 x x x 
					if(lotto[i]<lotto[j]) {
						int box = lotto[i];
						lotto[i]=lotto[j];
						lotto[j] = box;
					}
				}
		}
		for(int i=0; i<lotto.length;i++) {
			System.out.print(lotto[i]+" ");
		}
		
	}
}

	
	
















