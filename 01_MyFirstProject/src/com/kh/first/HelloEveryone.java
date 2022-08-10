// Package선언부
package com.kh.first; 
// 현재 나의 Class의 위치(Package)를 알려준다. 삭제하면 안된다.
// 만약 기본Package에 Class를 만들게 된다면, Package선언부가 없다.

// Class선언부
// Class의 풀네임은 com.kh.first.HelloEveryone이다.
// Package명을 항상 소문자로 적는 이유가 Class와 구별하기 위해서이다.
// (Package명은 항상 소문자, Class명의 앞글자는 항상 대문자)
public class HelloEveryone {// HelloEveryone이라는 Class의 영역을 시작한다.

		/* Class에 작성할 내용을 적어준다.
		 * 단, Source Code는 그냥 작성할 수 없고, Method라는 영역에 작성을 해주어야 한다.\
		 * 
		 * Method : 사전적으로 '기능'이라는 의미를 가지고 있다.
		 *          즉, 하나의 역할, 기능 단위라고 볼 수 있다.
		 *          Method는 main Method와 main이 아닌 일반 Method로 나뉜다.
		 *          main Method의 경우는 프로그램이 실행되면 스스로 실행되는 Method이다.
		 *          일반 Method는 스스로 실행되지 못하는 Method이다.
		 *          => 다른 Method에서 실행(호출,call)을 해주면 된다.
		 */
	
		//main Method : main이라는 method는 일종의 고유명사로, 항상 아래와 같이 작성한다.
		//	 			프로그램의 시작점을 담당한다. 프로그램당 최소 1개씩은 갖고 있어야 한다.
		public static void main(String[] args) {//main Method영역을 시작한다.
			
			//Source Code를 작성한다.
			//System.out.println
			System.out.println("Hello Everyone!!"); // 출력문 : 해당 내용물을 출력한다.
			System.out.println("안녕하세요"); // ln : line의 약자. 내용물을 출력 후 한줄을 띄움.(개행)
			//System.out.print
			System.out.print("여러분~\n"); // 역슬래시 : Escape 문자(특별한 문자)
			System.out.print("부자되세요"); // \n : 개행효과(Enter키와 같음)
			
		}//main Method영역을 끝낸다.

	
}// HelloEveryone이라는 Class의 영역을 끝낸다.

