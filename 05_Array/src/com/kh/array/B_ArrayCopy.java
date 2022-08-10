package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열 복사
	 * 배열의 자료형, 실제값, 크기를 똑같이 복사함.
	 * [방법]
	 * 1. 얕은 복사 : 배열의 주소값만 복사하는 개념.
	 * 2. 깊은 복사 : 동일한, 새로운 배열을 생성하여 내부값들을 복사하는 개념.
	 */
	public void method1() {
//		복사를 하기 전, 전제조건으로 당연히 '원본'이 존재해야 함.
//		1. 배열 선언과 동시에 초기화
		int[] origin = {1,2,3,4,5};
//		origin[0] = 1;
//		origin[1] = 2;
//		origin[2] = 3;
//		origin[3] = 4;
//		origin[4] = 5;
		System.out.println("===== 원본 배열 출력 =====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
//		복사본 배열
//		*얕은 복사 : 주소값만을 복사함.
//		1. 원본 복사(주소값)
		System.out.println("\n===== 복사본 배열 출력 =====");
		int[] copy = origin;
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		Stack : origin(0123) -----> Heap : 0123({1,2,3,4,5}) 
//		          copy(0123) --------↑
		
//		2. copy를 가지고 수정하기
		copy[2] = 100;
		System.out.println("\n===== 복사본 배열 수정 =====");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		3. copy를 수정 한 후, origin확인
		System.out.println("\n===== 복사본 배열 수정 후의 원본=====");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
		}
//		원본이 훼손됨. 
//		=> copy와 origin이 같은 주소값으로 연동이 되어버려
//		=> copy를 수정하여도 origin까지 수정이 되어버림
//		Stack : origin(0123) -----> Heap : 0123({1,2,100,4,5}) 
//        		  copy(0123) --------↑
//				 (copy[2]=100;)       
		System.out.print("\n 원본 배열의 해시코드 : "+origin.hashCode());
		System.out.print("\n 복사본 배열의 해시코드 : "+copy.hashCode());
//		둘다 같은 해시코드로, 다시말하면 둘이 같은 배열이라고 볼 수있음.
	}
	
	public void method2() {
//		*깊은 복사 : 새로운 배열을 생성하여 내부값들을 동일하게 복사함.
//		1. for문을 이용하는 방법
//		새로운 배열을 생성한 후, 각 인덱스 별로 내부 값을 일일이 대입시켜줌.
		
//		원본 배열
		int[] origin = {1,2,3,4,5};
		
//		복사본 배열(크기는 같지만, 내용물은 다름)
//		{0,0,0,0,0}			{1,2,3,4,5}
		int[] copy = new int[origin.length];
		
//		값 대입
		for(int i=0; i<copy.length; i++) {
			copy[i] = origin[i];
//			copy[0] = origin[0];
//			copy[1] = origin[1];
//			copy[2] = origin[2];
//			copy[3] = origin[3];
//			copy[4] = origin[4];
		}
//		복사본 출력
		System.out.println("=== 복사본 배열 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		복사본 배열 수정
		copy[2] = 100;
		System.out.println("\n=== 복사본 배열 수정 후 ===");
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		원본 확인
		System.out.println("\n=== 수정 후 원본 배열 ===");
		for(int i=0; i<origin.length; i++) {
			System.out.print(origin[i]+" ");
//		원본이 훼손되지 않은 것을 볼 수 있음.
//		=> 주소값을 복사하는 얕은 복사와 달리,
//		=> 깊은 복사는 배열을 따로 만들고, 같은 값을 각각 대입하는 것이기에
//		=> 주소값이 달라, copy가 origin을 훼손시키지 못함.
//		Stack : origin(0123) -----> Heap : 0123({1,2,3,4,5}) 
//		          copy(1234) -----> Heap : 1234({1,2,100,4,5})
		}
		System.out.println();
		System.out.println("\n원본 배열의 해시코드 : "+origin.hashCode());
//		1829164700
		System.out.println("복사본 배열의 해시코드 : "+copy.hashCode());
//		2018699554
//		주소값(해시코드)가 다른 것을 볼 수 있음.
	}
	public void method3() {
//		2. 새로운 배열을 생성한 후,
//		System이라는 클래스에서 arraycopy라는 메소드를 호출하여 복사
//		이 메소드는 static영역에 올라가 있어 import문을 사용하지 않음.
		
//		원본 배열
		int[] origin = {1,2,3,4,5};
		
//		복사본 배열
//		             {0,0,0,0,0,0,0,0,0,0}
		int[] copy = new int[10];
		
//		arraycopy
//		origin 배열, 0번째 인덱스부터, 총 5개의 값을,
//		copy배열, 0번째 인덱스부터, 복사하여 넣겠다.
//		System.arraycopy(원본배열명, 원본배열의 복사를 시작할 index,
//		                                       복사배열명, 복사배열의 복사값이 들어갈 index, 개수)
//		System.arraycopy(origin, 0, copy, 0, 5);
//					{1,2,3,4,5,0,0,0,0,0}
//		System.arraycopy(origin, 0, copy, 2, 5);
//					{0 0 1 2 3 4 5 0 0 0}
		System.arraycopy(origin, 0, copy, 1, 3);
//					{0 1 2 3 0 0 0 0 0 0}
//		System.arraycopy(origin, 2, copy, 9, 2);
//					{0 0 0 0 0 0 0 0 0 3} 4 
//					[오류메세지]
//					ArrayIndexOutOfBoundsException
//					인덱스의 범위를 넘어서서 값을 복사하려고 했음.
//		1. 인덱스 범위를 벗어나면 위와 같이 오류가 뜨니 주의.
//		2. 복사를 하고 남은 부분은 JVM에 의해서 초기화가 되었던 0이라는 숫자가 유지됨.
//		3. 자유자재로 내가 원하는 자리에 원하는 만큼만 부분 복사가 가능함.
//		4. import문을 쓰지 않아 static이 붙어있을 것임.
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println();
		System.out.println("원본해시코드 : "+origin.hashCode());
		System.out.println("복사본해시코드 : "+copy.hashCode());
//		다른 주소값을 가지고 있는 것을 볼 수 있음.
//		배열 수정시, 원본에 영향을 주지 않는다는 것을 유추할 수 있음.
	}
	public void method4() {
//		3. Arrays
//		배열에 무엇인가를 처리하고자 할 때 사용하는 클래스임.
//		이 중에서도 copyOf라는 메소드를 이용하여 복사함.
		
//		원본배열
		int[] origin = {1,2,3,4,5};
		
//		복사본 배열
		int[] copy = Arrays.copyOf(origin, 7);
//					       {1 2 3 4 5 0 0 }
		for(int i=0; i<copy.length; i++) {
			System.out.print(copy[i]+" ");
		}
//		유추해볼 수 있는것
//		1. 반복 몇번? 7번 => 배열의 크기 ==7
//		2. 1,2,3,4,5가 들어가고 뒤에 0,0이 붙음
//		=> 5,6번째 인덱스가 존재하며 이 공간은 JVM이 자동으로 채워줌.
//		3. import문을 쓰지 않아 static이 붙어있을 것임.
//		[표현법]
//		자료형 복사본배열명 = Arrays.copyOf(원본배열명, 복사본배열의 크기)
		System.out.println();
		System.out.println("원본해시코드 : "+origin.hashCode());
		System.out.println("복사본해시코드 : "+copy.hashCode());
//		다른 주소값을 가지고 있는 것을 볼 수 있음
//		배열 수정시, 원본에 영향을 주지 않는다는 것을 유추할 수 있음.
		
		/* 깊은복사
		 * 1. for문을 이용한 단순 대입 복사
		 * 
		 * 2. System.arraycopy 메소드 호출
		 * => 몇번 인덱스부터 몇개를 어느 위치에 가져올 것인지 상세하게 기술 가능.
		 * 
		 * 3. 배열명 = Arrays.copyOf 메소드 호출
		 * => 무조건 0번 인덱스부터 복사가 진행됨.
		 * => 또한, 내가 제시한 개수만큼 복사본 배열의 크기로 지정됨.
		 * 
		 */
	}
	public void method5() {
//		4. clone메소드를 호출하여 복사
		
//		원본배열
		int[] origin= {1,2,3,4,5};

//		[표현법]
//		자료형[] 복사본배열명 = 원본배열명.clone();
		int[] copy = origin.clone();
//		인덱스지정x, 복사개수지정x => 따로 옵션이 존재하지 않음.
		
//		복사본 출력
//		for문을 이용하여 출력 => [1,2,3,4,5]
		/*
		System.out.print("[");
		for(int i=0; i<copy.length; i++) {
			if(i<copy.length-1) { // 마지막 바로 이전 값에서는 콤마를 첨가O
				System.out.print(copy[i]+", ");
			}else {// 마지막 값에서는 콤마를 첨가X
				System.out.print(copy[i]);
			}
		}
		System.out.println("]");
		*/
//		Arrays에서 제공하는 배열을 한개의 문자열로 표현하여 내보내주는 메소드
//		toString()
//		[표현법]
//		Arrays.toString(내가 출력하고자 하는 배열명);
//		=> 앞과 뒤에 [], 값들 사이에는 콤마(,)를 찍어서 각 인덱스에 담긴 값들을
//		       하나의 문자열로 연이어 만들어 주는 메소드
		System.out.println(Arrays.toString(copy));
		
//		해시코드 확인
		System.out.println();
		System.out.println("원본해시코드 : "+origin.hashCode());
		//1829164700
		System.out.println("복사본해시코드 : "+copy.hashCode());
		//2018699554
	}
}
