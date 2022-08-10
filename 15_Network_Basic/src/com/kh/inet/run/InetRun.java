package com.kh.inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		/*
		 * 네트워크(Network)
		 * 여러 대의 컴퓨터들이 연결되어 있는 통신망을 일컫는 용어
		 * 네트워크를 통해, 서로간의 데이터를 교환가능함.
		 * 
		 * 컴퓨터에서의 주소 체계
		 * IP주소 : 네트워크상에 각 컴퓨터들을 식별해줄 수 있는 번호(주소)
		 * 			중복되지 않는, 컴퓨터를 식별하는 주민등록번호와 같은 개념.
		 * 			중복되는 경우에는, 충돌이 일어남
		 * 			자신의 컴퓨터 IP주소는 '127.0.0.1(localhost)' 였음.
		 * 
		 * Port번호 : 같은 컴퓨터 안에서, 작동하는 프로그램을 찾을 때
		 * 			  각각의 프로그램을 식별해주는 내부 주소
		 * 			  Port번호 또한 중복이 일어나면 안됨.
		 * 			  오라클의 경우, '1521'이라는 포트번호를 사용하였음.
		 * ==> IP주소와 Port번호는 고정값이 아닌, 변동 가능한 유동적인 값임.
		 * ==> IP주소는 같은 네트워크상, Port번호는 같은 컴퓨터 상에서 중복되지 않아야 함.
		 * 
		 * 서버, 클라이언트
		 * 서버 : 고객(클라이언트)에게 서비스를 제공해주는 PC 또는 프로그램
		 *        즉, 클라이언트의 요청을 처리해서 응답해주는 웨이터 같은 개념.
		 *        
		 * 클라이언트 : 서버에 요청하는 PC 또는 프로그램을 일컬음.
		 * 				즉, 서비스를 제공받는 고객
		 * => 서버에 요청하기 위해서는, 요청하고자 하는 서버의 IP주소, Port번호를 알아야 함.
		 */
		
		// InetAddress 클래스 : 네트워크 정보를 확인할 수 있는 클래스(IP주소 관련)
		try {
			InetAddress localhost = InetAddress.getLocalHost();
			// localhost : 지역호스트 => 나의 PC를 지칭
			// getLocalHost() : 내 pc에 대한 정보를 반환하는 메소드
			
			System.out.println(localhost); // 성훈PC/172.30.1.25
			System.out.println("내 pc명 : "+ localhost.getHostName()); // 성훈PC
			System.out.println("내 IP 주소 : "+ localhost.getHostAddress()); // 172.30.1.25
			
			System.out.println("------------------------------------------------");
			
			// 내가 알고있는 웹사이트의 주소(도메인 주소)를 통해서 그 서버와 관련된 정보를 얻기 
			// 도메인 주소 : 사용자가 웹사이트에 접속할 때, 매번 IP주소를 외우기 어렵기 때문에
			//				 외우기 쉬운 구조로 사용자에게 제공해주는 주소
			
			InetAddress googleHost = InetAddress.getByName("www.google.com");
			// getByName() : 도메인 주소라는 고유한 주소를 통해서, 해당 서버의 정보를 얻어내서 반환
			
			System.out.println(googleHost); // www.google.com/172.217.175.4
			
			System.out.println("구글 서버명 : "+ googleHost.getHostName()); //  www.google.com
			System.out.println("구글 IP주소 : "+googleHost.getHostAddress()); // 172.217.175.4
																			  // => 구글의 서버는 여러개임.(다른 IP주소가 나올 수 있음)
																			  // => 서버가 한곳만 있는 경우, 서버에 과부하가 걸리고 보안에 취약함.
			
			System.out.println("---------------------------------------------------------------------");
			
			// 도메인을 통해서 그 서버 관련한 것들을 배열로 받을 수 있음.
			InetAddress[] naverHost = InetAddress.getAllByName("www.naver.com");
			System.out.println("네이버 호스트 개수 : "+naverHost.length);
			for(InetAddress n : naverHost) {
				
				System.out.println("네이버 서버명 : "+n.getHostName()); 
				System.out.println("네이버 IP주소 : "+n.getHostAddress());
				// 223.130.195.200
				// 223.130.200.107
				
			}
		} catch (UnknownHostException e) { // 없는 주소지일 경우 발생하는 오류
			e.printStackTrace();
		}
		
		/*
		 * 현재 구동중인 서버가 있다면, 클라이언트는 그 서버로 "요청"을 보낼 수 있음.
		 * => 요청에 대한 처리 결과를 서버가 클라이언트에게 "응답"을 해줌
		 * 
		 * 요청과 응답에 의해서 웹프로그램(웹사이트, 웹애플리케이션)이 돌아감 == "통신"
		 * 웹에서의 통신 방식 : HTTP프로토콜 통신(HTTP라는 규칙에 의해서 내부적으로 통신이 이루어짐)
		 * 참고) HTTPS : 보안 절차가 추가된 HTTP 규칙 버전
		 * 
		 * 
		 * HTML : 웹에서 정보를 표현으로 만든 마크업 언어
		 * 마크업 : 문서의 논리적은 구조를 정의. 태그의 형식과 규칙을 정의하여 이루어져 있음.
		 * => 문서와 문서가 링크로 연결되어 있고, 언어가 태그와 태그가 연결되어 이루어져 있음.
		 * 
		 * HTML5 특징
		 * 구조적 설계 지원(시멘틱 : 태그의 이름만 보고도 역할을 짐작함.)
		 * 그래픽, 멀티미디어 기능 강화
		 * CSS3 및 JavaScript지원(화면을 예쁘게, 화면에 동적인 요소를 추가)
		 * 
		 * 구성요소
		 * < p      align = 'center'> HTML / CSS </p>
		 * 시작태그 속성      속성값   내부문자	 종료태그
		 * 
		 * 주의사항
		 * 태그는 대소문자를 구분하지 않지만 소문자를 권장함
		 * 시작태그는 반드시 종료태그와 짝지어주어야함.
		 * 파일확장자는 html으로 설정
		 * 문자의 공백은 몇개를 입력하든 한개만 인식함.
		 * => 공백을 추가하기 위해서는 &nbsp;를 이용해야 함.
		 */
	}

}
