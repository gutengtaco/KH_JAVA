package com.kh.variable;

import java.util.Scanner;

//사용자가 Keyboard로 입력한 값을 Variable에 기록하는 방법
public class B_KeyboardInput {
	
	public void inputTest1() {
		/*
		 * Scanner Class
		 * Java에서 이미 제공하고 있는 패키지(java.util.Scanner)
		 * Scanner Class안에 작성되어있는 Method를 호출하여 사용한다.
		 * => sc.Method명();
		 */
		
		// 1. 다른 Package, Class내의 Method를 호출할 경우에는 대변할 이름을 먼저 생성(new)
		// 2. import문 작성 
		Scanner sc = new Scanner(System.in);
		// System.in : 키보드로 입력받은 값을 byte단위로 받아들이겠다는 의미이다.
		// [참고] 출력시에는 System.out구문을 썼다.
		
		// 사용자의 인적사항(이름, 나이, 키)을 입력받는 프로그램
		// 입력받고자 하는 내용을 먼저 출력해서 사용자로부터 입력을 유도한다.
		System.out.print("당신의 이름은 무엇입니까?");
		// 사용자가 입력한 값을 문자열로 받아오는 Method : next(), nextLine()
		// sc.next() 또는 nextLine(); => 이렇게 하면 사용자의 이름을 받기만 한다.
		// 사용자의 이름을 입력받아서 Variable에 담는다.
		String name = sc.nextLine(); 
		// sc.next() : 사용자가 엔터키를 누를때까지 대기한다.
		//             사용자가 입력한 값 중 공백이 있는 경우, 공백 이전의 값만 입력받는다.
		// sc.nextLine() : 사용자가 엔터키를 누를때까지 대기한다.
		//                 엔터를 치기 전까지의 모든 문자열(공백포함)을 입력받는다. 
		//                 공백이 포함 될 여지가 있을 경우 유용하게 쓰인다.
		// (next계열의 모든 Method들은 엔터키를 누를때까지 대기한다.)
		
		
		// 나이 입력받기
		System.out.print("당신의 나이는 몇살입니까?");
		// 사용자가 입력받은 값을 int형 정수로 받아들이는 Method : nextInt();
		// [주의사항] 
		// nextInt()를 호출 후 반드시 nextLine()를 한번 실행해야 한다.
		// => 버퍼(임시저장소)공간에 남아있는 엔터값을 사용자가 자동으로 입력했다고 간주한다.
		// => 이후, 곧바로 메모리에 저장되어 Variable에 담긴다.
		int age = sc.nextInt();
		sc.nextLine(); // 버퍼에 남아있는 엔터값을 비워주기 위해 실행한다.
		
		// 키 입력받기
		System.out.print("당신의 키는 얼마입니까?");
		//사용자가 입력한 값을 double형 실수로 받아들이는 Method : nextDouble();
		double height = sc.nextDouble(); 
		// nextDouble()도 마찬가지로 nextLine()을 한번 실행해야 한다.
		sc.nextLine(); // 버퍼에 남아있는 엔터값을 비워주기 위해 실행한다.
		
		System.out.print("키 "+ height +"cm, " + "나이 " + age + "세, "
		+ name + "님 환영합니다.");
		
		/*
		 * Scanner Class 내의 입력받는 Method의 종류들
		 * 1. next() 		: 문자열을 입력받을 때 사용. 공백 전까지 
		 * 2. nextLine() 	: 문자열을 입력받을 때 사용. 엔터를 치기 전까지(공백포함)
		 * 3. nextInt() 	: Int타입의 정수를 입력받을 때 사용.
		 * 4. nextByte() 	: Byte타입의 정수를 입력받을 때 사용.
		 * 5. nextShort() 	: Short타입의 정수를 입력받을 때 사용.
		 * 6. nextLong() 	: Long타입의 정수를 입력받을 때 사용.
		 * 7. nextDouble() 	: Double타입의 실수를 입력받을 때 사용.
		 * 8. nextFloat() 	: float타입의 실수를 입력받을 때 사용.
		 */
	}
	public void inputTest2() {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열을 뽑을 때 = next(), nextLine()
		// 문자를 뽑을 때 = nextChar()는 존재하지 않는다.
		
		// 사용자로부터 인적사항(이름, 나이, 성별, 키)을 키보드로 입력 받아 출력하는 프로그램
		// 성별 입력 유도 : 남자(Male), 여자(Female)
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine();
		/*
		 * 문자열로 입력받고나서 첫번째 문자 하나만을 뽑아낸다.
		 * "apple" 문자열 => 인덱스(Index) : 컴퓨터는 숫자를 0부터 센다.
		 * 1번째 : a => 컴퓨터 : 0번째
		 * 2번째 : p => 컴퓨터 : 1번째
		 * 3번째 : p => 컴퓨터 : 2번째
		 * 4번째 : l => 컴퓨터 : 3번째
		 * 5번째 : e => 컴퓨터 : 4번째
		 * 
		 * 문자열로부터 해당위치(Index)의 문자 하나만을 뽑아내주는 Method
		 * => 해당문자열.charAt(Index)이라는 Method임.
		 * 1. 키보드로 입력받는다 =>nextLine()
		 * 2. 입력받은 문자열로부터 charAt()을  실행
		 * => sc.nextLine().charAt(0);
		 * 
		 * [주의사항]
		 * 만약 내가 뽑고자 하는 위치값이 문자열의 크기보다 크다면?
		 * abc.charAt(100);
		 * [오류메세지]
		 * char gender = sc.nextLine().charAt(100);
		 * Exception in thread "main" java.lang
		 * .StringIndexOutOfBoundsException 
		 * : String index out of range: 100
		 * =>문자열의 Index가 범위를 벗어났다.
		 * Male은 총 4글자(0,1,2,3)인데 100번째 인덱스의 글자를 추출하고자 해서 발생하였다.
		 * 
		 */
		System.out.print("성별(M/F) : ");
		char gender = sc.nextLine().charAt(0);
		
		System.out.print("키 : ");
		double height = sc.nextDouble();
		sc.nextLine();
		
		// 출력해보기
		System.out.println(name + "님의 개인정보");
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
		System.out.println("키 : "+height);
	}
	// [참고]
	// 만약,nextInt 다음에 nextLine으로 버퍼를 지워주지 않은 경우. 
	public void inputTest3() {
		//사용자로부터 인적사항을 입력받는 것(이름, 나이, 주소)
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("나이 : ");
		int age = sc.nextInt();
		sc.nextLine(); //=> 버퍼(임시보관소)를 비워주기 위해 사용한다.
		//nextInt를 이용하여 숫자값을 받고나서 , 그 이후에 nextLine을 사용하면 발생한다.
		//nextLine대신 next를 사용하면 공백에 입력할 수 있는 구간이 생겨난다.
		
		System.out.print("주소 : ");
		String addr = sc.nextLine();
		
		System.out.print(addr + "에 사는 " + age + "살 " + name + "님 환영합니다.");
	}
}
