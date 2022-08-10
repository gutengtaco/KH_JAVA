package com.kh.exception.controller;

// java.lang은 import구문이 생략되어 있음.
import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	/*
	 * 예외는 클래스 계층(상속)구조로 이루어져 있음.
	 * 
	 * Unchecked Exception : 개발자 입장에서 오류가 발생할 수 있는 예측이 가능한 상태. 
	 * RuntimeException 클래스 
	 * 프로그램 실행 시 발생되는 예외들의 부모클래스
	 * 1. ArrayIndexOutOfBoundException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
	 * 2. NegativeArraySizeException : 배열의 크기를 음수로 지정했을 때 발생하는 예외
	 * 3. ClassCastException : 허용할 수 없는 형변환이 진행될 경우 발생하는 예외
	 * => 다형성을 적용할 때, 상속관계가 아닌 클래스끼리 캐스팅을 할 때
	 * => Parent - child1가 아닌, child1 - child2로 캐스팅을 한 경우
	 * 4. NullPointerException : 주소값이 아직 null임에도 불구하고, 접근하고자할 때 발생하는 예외.
	 * 5. ArithmeticException : 나누기 연산 시 0으로 나눌때 발생하는 에러
	 * 
	 * => RuntimeException과 관련된 예외들은 충분히 예측이 가능한 상황이기떄문에
	 * 	  예외처리가 되지 않게끔 사전에 조건문(if문)으로 해결 가능함(권장)
	 * => 굳이 예외처리(예외가 발생했을때 실행할 내용을 정의)를 할 필요 없음.
	 */
	
//	필드부
//	Scanner 객체를 매번 메소드마다 생성하는 것이 아닌, 전역변수로 생성해두고 가져다 씀
	/*default*/ Scanner sc = new Scanner(System.in);
	
	public void method1() {
//		ArithmeticException : 나누기 연산 시, 0으로 나눌때 발생하는 예외
		
//		사용자로부터 두개의 정수값을 입력받아 나눗셈 연산 결과를 출력
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		/*
//		방법1. 조건문으로 처리(예외처리X)
		if(num2 != 0) {	// 나눗셈 진행
			System.out.println("나눗셈 연산 결과 : "+(num1/num2));
		}else {	// 0으로 못나눈다고 알려줌
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램 종료");
		*/
		
//		방법2. 예외처리구문으로 해결(예외가 발생했을 경우를 대비하여 실행할 내용을 미리 정의함.)
		/*
		 * try ~ catch문
		 * [표현법]
		 * try {
		 * 		 예외가 발생할법한 구문;
		 * } catch(발생될예외클래스 변수명 => 매개변수){
		 * 		 해당 예외가 발생할 경우, 실행할 구문
		 * }
		 */
		try {
			System.out.println("나눗셈 연산 결과 : "+(num1/num2));
		}catch(ArithmeticException e) {
//			적어도 이 시점에 도달하면 => 이미 오류가 발생함.
			System.out.println("0으로 나눌 수 없습니다.");
			
//			오류를 추적해줌.
//			현재 예외가 발생한 정보를 볼 수 있음.
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
	
	public void method2() {
		System.out.print("정수입력 (0 제외) : ");
		try {
		int num = sc.nextInt();	// 정수 이외의 값 입력시, InputMismatchException발생
		sc.nextLine();
		
		System.out.println("나눗셈 결과 : "+(10/num)); // 0일 경우, ArithmeticException발생
		
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력해야 합니다.");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
//		다중 catch블럭 : 예외가 여러개 발생할 가능성이 있는 경우, 그 경우의 수만큼 catch블럭을 작성 가능
		System.out.println("프로그램을 종료합니다.");
	}
	public void method3() {
//		ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
//		NegativeArraySizeException : 배열의 크기를 음수로 지정할 경우 발생하는 예외.
		System.out.print("배열의 크기 : ");
		int size = sc.nextInt();
		sc.nextLine();
//		배열을 할당하기 전, if문으로 오류가 나지 않게 막겠다.
//		if(size >= 0) {
//			int[] arr = new int[size];
//		}else {
//			System.out.println("배열의 크기는 양수여야 합니다.");
//		}
		/*
		try {
			int[] arr = new int[size];
//			크기가 음수일 시 오류발생
			System.out.println("100번째 인덱스값 : "+arr[100]);
//			size가 100이하시 오류 발생(마지막인덱스 = 인덱스크기-1)
			
		}catch(NegativeArraySizeException e) { // 해당 catch블럭이 실행된다면 try~catch구문을 빠져나감.
//			이 시점에서 해당 오류가 발생함.
			System.out.println("배열의 크기는 양수여야 합니다.");
			
		}catch(ArrayIndexOutOfBoundsException e) {
//			이 시점에서 해당 오류가 발생함.
			System.out.println("부적합한 인덱스에 접근하였습니다.");
		}
		*/
		
//		다형성 적용
		/*
		try {
			int[] arr = new int[size];
			System.out.println("100번째 인덱스 값 : "+arr[100]);
			
		}catch(RuntimeException e) {
//			다형성을 이용하여 부모타입의 예외클래스로 catch블럭을 작성 가능
//			장점 : catch블럭의 개수를 줄일 수 있음.
//			단점 : 정확히 어떤 오류가 발생했는지 알 수 없음.
			System.out.println("배열의 크기를 음수로 입력했거나, 부적절한 인덱스로 접근하였습니다.");
		}
		System.out.println("프로그램 종료");
		*/
		
		try {
			int[] arr = new int[size];
			System.out.println("100번째 인덱스 값 : "+ arr[100]);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로는 음수를 제시할 수 없습니다.");
		}catch(RuntimeException e) {
			System.out.println("배열의 크기를 음수로 입력했거나, 부적절한 인덱스로 접근했음.");
		}
//		다중 catch 블럭의 경우 순서가 중요함.
//		=> 상대적으로 범위가 작은타입의 예외클래스에 해당하는 catch블럭을 먼저 기술함.
//		=> 범위가 큰 부모클래스를 먼저 기술한다면, 자식클래스에 해당하는 catch블럭에서 Unreachable 오류가 발생.
		System.out.println("프로그램 종료");
	}
	/*
	 * RuntimeException 관련된 에러는
	 * 1. 조건문으로 해결 가능 : 예외 자체가 발생하지 않게 해주는, 예방하는 효과
	 * 						     개발자가 소스코드로 애초에 헨들링하는 것(예외처리X)
	 * 							 예외가 발생하기 이전의 선처리 담당
	 * 2. 예외처리로 해결 가능 : 예외가 발생할 시점을 대비해서, 그때 실행할 내용을 미리 정의해두는 것.
	 * 							 예외가 발생하고 나서의 후처리 담당
	 * 
	 * RuntimeException == UncheckedException(예측가능한 예외)
	 * 예측이 가능한 상황 => 조건문으로 해결하는 것을 더 권장
	 * 예측이 불가능한 상황 => 예외처리 구문으로 해결해야 함.
	 * 
	 */
}
