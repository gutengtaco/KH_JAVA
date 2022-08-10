//주석 : 해당 source code에 대한 설명을 기술하고 싶을 때 사용.(source code와 무관-code로 인식x)
//한줄 짜리 주석
/* 
 * 여러 줄의 주석
 */
/*
 * 자바프로그래밍 순서
 * 1. Project 생성(src-.java, bin-.class)
 * 2. Package 생성(src폴더 안에 생성)
 * 3. Class 생성(Package안에 생성)
 */
/*
 * Project : 내가 만들 프로그램에 필요한 모든 파일,폴더를 담고 있는 최상위 폴더
 * 			  즉, 프로그램 1개 단위 = 프로젝트 폴더 1개이다.
 */
package com.kh.first;
/*
 * Package : Project내에 존재하는 src폴더 내에 source code를 보관하는 폴더.
 * 생성 시 규칙
 * 1. Package는 소문자로 만든다.
 * 2. Package안에 새로운 Package를 만들 경우, 기존패키지명.새로운패키지명으로 짓는다.
 * 3. com.kh.first <- 이런식으로 한번에 Package를 만들 수 있다.
 * 생성 시 주의사항
 * 1. 한 Package내에 동일한 이름의 Package가 존재할 수 없다(이름의 중복 불가)
 * 2. 한 Package내에 동일한 이름의 Class가 존재할 수 없다 (이름의 중복 불가)
 * 3. 기본 Package(Package가 없는 상태)에 Class를 만드는 것은 권장하지 않는다
 * => 모든 Class들을 기본Package에 분류 없이 몰아넣으면 관리하기 힘들다.
 * => 기본  Package에 만들어진 Class는 절대 다른 Package에서 사용할 수 없다
 * (Class의 위치를 찾아갈 수 없다.)
 * 생성 시 권장사항
 * 1. Package는 적어도 3단계 이상으로 만들어준다.
 * => com.회사명.프로젝트명 또는 com.회사명.프로젝트명(팀명).카테고리명
 * 2. Package에 두번째 레벨까지는 도메인 주소의 역순으로 쓴다.
 * => naver.com이 com.naver가 되듯이 쓴다.
 * => 도메인 주소는 고유한 이름이기 때문이다. (이름의 중복을 사전에 막을 수 있다.)
 * => Package만 봐도 어디서 제작한 Project인지 파악이 가능하기 때문이다.
 */

public class HelloWorld {
	
/*
 * Class : 유사한 특징을 지닌 Variable과 Method를 묶어 놓은 집합체
 * 	       Java에서는 모든 Code들이 반드시 Class 안에 존재한다
 * 	                이때, 한개의 Class = 한개의 .java파일이 된다.
 */
	
}
