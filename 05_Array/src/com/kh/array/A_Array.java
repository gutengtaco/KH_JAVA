package com.kh.array;

import java.util.Scanner;

public class A_Array {
	/*
	 * 
	 * 변수 : 해당 자료형의 값 하나만을 담을 수 있는 공간(값 자체는 변할 수 있음)
	 * 예시)
	 * int a = 10;
	 * 
	 * 배열 : 해당 자료형의 값 여러개를 담을 수 있는 공간
	 * 예시)
	 * 1. 배열선언
	 * int[] arr;
	 * 
	 * 2. 배열 할당 
	 * => 메모리 공간을 할당.
	 * int[] arr = new int[3]; 
	 * => Heap영역(new)에 int형 값이 들어갈 공간을 3칸을 만듬.
	 * => 방 [0]호,[1]호,[2]호를 만든 것.
	 * => [index] : 인덱스는 0부터 시작함(중요)
	 * => 배열의 크기 : 3 / 마지막 인덱스 : 2		(0,1,2)
	 * => 배열의 크기 : 5 / 마지막 인덱스 : 4		(0,1,2,3,4)
	 * => 문자열의 길이 : 5 / 마지막 인덱스 : 4	(0,1,2,3,4)
	 * => 크기(길이) : n / 마지막 인덱스 = n-1
	 * 
	 * 3. 배열 초기화
	 * arr[0] = 10;
	 * arr[1] = 20;
	 * arr[2] = 30;
	 */
	
	public void method1() {
//	        배열을 왜 써야 하는가?
//	        예시
//		0, 1, 2, 3, 4를 기록해야 함.
		
//		1.변수만을 이용
//		int num1=0;
//		int num2=1;
//		int num3=2;
//		int num4=3;
//		int num5=4;
//		출력하기 위해서 출력문을 5번이나 작성함.
//		System.out.println(num1);
//		System.out.println(num2);
//		System.out.println(num3);
//		System.out.println(num4);
//		System.out.println(num5);
//		for(int i=1; i<=5; i++) {
//			System.out.println(numi); 이런식으로 쓸 수는 없음.
//		}
//		int sum = 0;
//		for(int i=1; i<=5; i++) {
//			sum = sum + numi; 이런식으로 쓸 수 없음.
//		}
//		반복문을 사용하고자 하나, 위와같이 반복문을 쓸수가 없으니
//		sum = num1+num2+num3+num4+num5; // 이런식으로 써줘야 함.
		
//		2.배열을 이용
		/*
		 * -배열 선언
		 * [표현법]
		 * 자료형[] 변수명;
		 * 자료형 변수명[];
		 * int[] arr; 또는 int arr[]; 
		 * => 1. Stack영역에 arr이라는 배열 공간이 생긴다
		 *
		 *
		 * -배열 할당 : 배열의 크기를 지정(메모리 공간에 확보)
		 * 		       지정한만큼 값이 들어갈 방이 만들어짐.
		 * [표현법]
		 * 배열명 = new 자료형[배열크기];
		 * arr = new int[5]; 
		 * => 2. Heap영역에 int형,크기가 5인 공간 생성(4byte*5)
		 *    3. 대입연산자를 통해 Heap의 실제값의 주소값을 Stack에 저장 
		 *
		 */
		// -선언과 동시에 할당
	    System.out.println();
		int[] arr = new int[5];
	    
	    /*
	     * -초기화 및 값 대입
	     * [표현법]
	     * 배열명[인덱스] = 값; => 인덱스가 없으면 주소값을 반환함.
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
		
	    // 반복문을 이용해서 값을 대입
	    for(int i=0; i<5; i++) {
	    	arr[i]=i;
	    }
	    // 반복문을 이용해서 값을 출력
	    for(int i=0; i<5; i++) {
	    	System.out.println(arr[i]);
	    }

		System.out.println(arr);
		// arr에는 주소값이 담김([I@6d06d69c) - Stack영역
		// 따라서, arr에는 값을 담을 수 없음.
		
	}
	public void method2() {
		// 변수 선언과 동시에 대입
		int i = 10;	
		
		// 배열 선언과 동시에 할당
		int[] iArr = new int[5]; 
		
		System.out.println("i : "+i);	
		// 10
		System.out.println("iArr : "+iArr); 
		// [I@6d06d69c (주소값 : Stack(주소값) -> Heap(실제값))
		System.out.println("iArr의 해시코드값 : "+iArr.hashCode()); 
		// 1829164700 (해시코드 : 주소값을 10진수의 형태로 보여줌)
		// 해시코드를 이용하면 Stack의 동등비교가 가능함.
		
		double[] dArr = new double[3]; 
		System.out.println("dArr : "+dArr);
		// [D@7852e922
		System.out.println("dArr의 해시코드값  : "+dArr.hashCode());
		// 2018699554
		
		/*
		 * 기본자료형 : 실제 값을 Stack에 바로 담을 수 있는 변수
		 * boolean, char, byte, short, int long, float, double
		 * => 변수 이름을 댔을 때, 실제 들은 값을 바로 받아볼 수 있음.
		 * => 이를 '일반변수'라고 함.
		 * 
		 * 참조자료형 : 주소값을 담고 있는 변수.실제 값이 Heap영역에 있음.
		 * String, 자료형[](배열), new(Scanner, A_Array,...)
		 * => 실제 값이 아닌, 그 실제값이 존재하는 곳의 주소값을 받아볼 수 있음.
		 * => 이를 '참조변수'(reference Variable)이라고 함.
		 * String str = "바보";
		 * System.out.print("바보");
		 * => 다만, String은 예외적으로 일반변수처럼 주소값이 아닌 실제값을 바로 호출할 수 있음.
		 */
	}
	public void method3() {
		int[] iArr = new int[3]; // [0], [1], [2]
		double[] dArr = new double[3]; // [0], [1], [2]
		System.out.println(iArr); // 주소값 : [I@6d06d69c
		System.out.println("iArr[0] : "+iArr[0]); // 0
		System.out.println("iArr[1] : "+iArr[1]); // 0
		//...
		// 배열 사용시, 반복문이랑 같이쓰는 연습
		
		/*
		 * 배열을 출력할 때, 반복문을 쓰면 더 좋음.
		 * 0번 인덱스부터 마지막 인덱스까지 순차적으로 출력할 수 있음
		 * 마지막 인덱스 값 == 배열의 크기-1
		 * 
		 * 배열의 크기를 아는 방법
		 * [표현법]
		 * 배열명.length
		 * => 배열의 길이를 알려주는 변수
		 * => length()아님. 이건 메소드임.
		 */
		System.out.println("iArr의 크기 : "+iArr.length); 
		// 3([0], [1], [2])
		System.out.println("dArr의 크기 : "+dArr.length); 
		// 3([0], [1], [2])
		
		/*
		 * for문에서 반복의 횟수를 지정하는 가장 편한 방법
		 * 1. 변수에서의 반복
		 * int i=0 ; i<반복횟수 ; i++
		 * int i=0 ; i<5 ; i++ (5번 반복)
		 * 
		 * 2. 배열의 크기만큼 반복
		 * int i=0 ; i<반복횟수 ; i++
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
		 * 배열의 특징
	     * 값을 초기화, 대입하지 않았음에도 잘 출력되는 것을 볼 수 있음.
	     * => int형 배열의 경우는 '0', double형 배열은 '0.0'이 담김
	     * => 배열 구조상, 실제 들어있는 값은 Heap영역에 존재함.
	     * => 이 Heap영역은 특징상, 절대 빈 공간으로 존재할 수 없음.
	     * => 이에 값을 설정하지 않으면, 각 자료형의 기본값을 Heap에 대입함.
	     * 기본값 : 0(정수형), 0.0(실수형), ' '(문자형)
	     * [참고]
	     * 기본자료형 변수 : 내가 직접 초기화(값을 처음 대입)를 함.
	     * 참조자료형 변수 : JVM이 알아서 초기화를 해줌.(Heap영역을)
		 */
		
//		int num;
//		System.out.println(num);
//		[오류메세지]
//		The local variable num may not have been initialized
//		변수에 값이 대입되지 않아 발생하는 문제임.
		
//		String str;
//		System.out.println(str);
//		[오류메세지]
//		The local variable num may not have been initialized
//		변수에 값이 대입되지 않아 발생하는 문제임.
		
	}
	public void method4() {
		int[] arr = new int[5]; //[0],[1],[2],[3],[4]
//		기본값에서 값을 바꿔줌.
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;

//		arr[5] = 6;
//		arr[6] = 7;
		
//		System.out.println(arr[5]);
//		System.out.println(arr[6]);
//		[오류메세지]
//		ArrayIndexOutOfBoundsException: 5
//		당연히 인덱스의 범위를 초과하여 오류메세지가 나옴.
//		(인덱스는 4까지인데 5에 접근하고자 하였음.)
		
//		값 대입을 위한 반복문
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		
//		값 출력을 위한 반복문
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		값 출력과 누적 덧셈을 하기 위한 반복문
		System.out.println();
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			sum = sum+arr[i];
			System.out.println(sum);
		}
	}
	public void method5() {
//		10칸짜리 배열을 만든 후
//		배열 각 방에 랜덤한 수의 값을 대입
//		랜덤 값의 범위는 51~100까지
//		int random = (int)((Math.random()*50)+51); 총50개, 시작값:51
//		for문 밖에다 작성하면, 한번만 출력된 랜덤값이 배열에 모두 채워짐.
		
		int[] arr = new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)((Math.random()*51)+50); 
//			이렇게, 매번 랜덤값을 나오게 해줘야함.
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println("arr["+i+"] : "+arr[i]);
		}
		
	}
	public void method6() {
		
		int[] arr = new int[5];
		System.out.println("주소값 : "+arr);
		// [I@6d06d69c
		System.out.println("해시코드값 : "+arr.hashCode());
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
		 * 배열의 가장 큰 단점
		 * 내가 할당했던 시점에서, 한번 지정한 배열의 크기는
		 * 변경이 불가하다.
		 * => 배열의 크기를 굳이 변경하고자 한다면,
		 * => 어쩔 수 없이 새로운 배열을 다시 만들어서 써야함.
		 * => 이 경우, 선언 및 할당을 다시해야 하나?
		 */
		
//		할당만 다시 해봄
		System.out.println();
//		int[] arr = new int[5]; 
		arr = new int[7]; 
		System.out.println("새로운 주소값 : "+arr); 
//		[I@7852e922
		System.out.println("새로운 해시코드값 : "+arr.hashCode());
//		2018699554
		
		/*
		 * 메모리 영역에는 공간을 할당할 때는 항상 고유한 주소값이 부여됨.
		 * => 기존에 생성된 주소값과 절대 중복되지 않음.
		 * => 새롭게 할당만 한 경우에는 
		 * => 기존에 참조하고 있던 기존의 주소값이 새로운 주소값으로 변경되며
		 * => 기존의 연결이 끊기고, 새로운 연결로 바뀜.
		 * => 연결이 끊어진 배열은 메모리의 Heap영역에 떠다니다가
		 * => 일정 시간이 지나면 정리가 됨.
		 * 	  (자동 메모리 관리 : Garbage Collection(Collector), GC)
		 */
//		연결을 바꾸는게 아니라, 그냥 끊고 싶다면?
//		arr = null; 아무것도 존재하지 않는 값을 의미.
//		System.out.println(arr); null이라고 뜸.
//		arr[0] = 10; 유효하지 않은 코드
		/*
		 * System.out.println(arr);
		 * System.out.println(arr.hashCode());
		 * [오류메세지]
		 * NullPointerException
		 * 찾아갈 주소지가 없는데, 어떻게 0번째 방에 접근해서 값을 넣어?라고 말하는것임.
		 * null이 들어있는 곳 기준으로, 어떠한 행위를 하면 발생하는 오류
		 */
		
		/*
		 * 기본자료형의 기본값
		 * 정수형 : 0
		 * 실수형 : 0.0
		 * 문자형 : ' '(공백)
		 * 참조자료형 : null => 찾아갈 주소값이 없음.
		 * 
		 */
	}
	public void method7() {
		/*
		 * 3명의 사용자에게 매번 키의 정보를 입력받아,
		 * 배열에 담아두고
		 * 3명의 키를 각각 출력, 총합계, 평균을 계산하여 출력
		 */
		Scanner sc = new Scanner(System.in);
		
		//3명의 키 값을 담을 double형 배열 하나 만들기
		//3명의 키를 각각 스캐너로 입력받아 각 방에 담기.
		double[] heights = new double[3];
		double sum = 0;
		double avg = 0;
		for(int i=0; i<heights.length; i++) {
			System.out.print("키 입력(cm) : ");
			heights[i] = sc.nextDouble();
			sc.nextLine();
		}
		//3명의 키 정보 출력 + 총합계,평균 구하기
		for(int i=0; i<heights.length;i++) {
			System.out.println((i+1)+"번째 사람의 키 : "+heights[i]+"cm");
			sum = sum + heights[i];
		}
		System.out.println("키의 총합계 : "+sum+"cm");
		System.out.println("키의 평균 : "+(sum/heights.length)+"cm");
//		System.out.printf("키의 평균 : %.2f"cm",(sum/heights.length));
	}
	public void method8() {
//		사용자에게 문자열 하나를 받고
//		각각의 문자들을 char 배열로 옮겨담기
		Scanner sc = new Scanner(System.in);
		
//		1. 사용자로부터 문자열을 입력
		System.out.print("문자열 입력 : ");
		String str = sc.nextLine();
		
//		2. char배열 만들기(배열 크기는 문자열의 길이만큼)
		char[] chArr = new char[str.length()];
		
//		3. 각각의 문자들을 char배열로 옮겨담기
//		공백도 문자로 취급되어 출력됨.
//		                            배열의 길이로 조건식을 씀 
		for(int i=0; i<chArr.length;i++) {
			chArr[i] = str.charAt(i);
			System.out.println((i+1)+"번째 문자열 : "+chArr[i]);
		}
	}
	public void method9() {
//		변수의 경우
//		1. 변수 선언
		int num;
//		2. 변수의 선언과 동시에 대입
		int num1 = 1;
//		배열의 경우
//		1. 배열의 선언과 동시에 할당
//		(이 경우, 값의 대입은 JVM에 의해 기본값으로 초기화 및 대입됨.)
		int[] arr = new int[4];
//		2. 배열의 선언과 동시에 할당과 동시에 초기화 및 대입
//		- 방법1
		int[] arr1 = new int[] {1,2,3,4};
		
//		- 방법2(이 방법을 많이 씀)
		int[] arr2 = {1,2,3,4};
		
//		배열의 동등비교
//		Stack의 주소값(해시코드)간의 동등비교이기 때문에
//		결과값은 모두 false가 나옴.
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
		
//		좋아하는 과일의 개수를 입력받은 후에,
//		이 개수만큼 배열의 방을 지정하여
//		과일명을 입력받아서 문자열 배열에 대입
		
		Scanner sc = new Scanner(System.in);
		System.out.print("과일의 개수 : ");
//		1. 과일의 개수를 입력받음
		int size = sc.nextInt();
		sc.nextLine();
		
//		2. 과일의 개수만큼 방의 크기를 지정
		String[] fruitsName = new String[size];
		
//		3. 좋아하는 과일명을 입력받아서 각 방에 넣기
		for(int i=0; i<fruitsName.length;i++) {
			System.out.print("좋아하는 과일명 입력 : ");
			fruitsName[i] = sc.nextLine();
		}
//		4. 과일명이 제대로 들어갔는지 결과를 출력
		for(int i=0; i<fruitsName.length;i++) {
			System.out.println("입력된 과일명 : "+fruitsName[i]);
		}
	}
}
