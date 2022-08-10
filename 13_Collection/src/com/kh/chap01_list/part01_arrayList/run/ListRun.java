package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {
	/*
	 * 컬렉션
	 * "자료구조"가 내장되어 있는 클래스로, 자바에서 제공하는 "자료구조"를 담당하는 프레임워크임.
	 * 
	 * 자료구조
	 * 방대한 데이터를 효율적, 구조적으로 다룰 때 필요한 개념.
	 * => 여러 개의 값을 어떻게 보관하면 효율적인가?
	 * 
	 * 프레임워크
	 * 효율적인 기능들이 이미 정의되어 있는 틀.(API의 라이브러리와 같은 개념)
	 * 
	 * 정리하자면
	 * 데이터를 새롭게 추가, 삭제, 수정을 하는 기능들이 이미 정의되어 있음 ==> 컬렉션
	 * => 다량의 데이터들을 관리하고자 할 때, 그동안은 배열로도 충분했음.
	 * => 다만, 배열에도 은근히 단점들이 존재했고, 이 단점을 보완한 게 컬렉션임.
	 * 
	 * 배열과 컬렉션의 차이점.
	 * 배열의 단점
	 * 1. 한번 배열의 크기를 지정하면, 크기를 바꿀 수 없음.
	 * => 새로운 값을 추가할 때, 배열의 크기가 오버된다면, 
	 * => 새로운 배열을 만들고 배열복사(깊은 복사)를 해주고, 이에 더하여 새로운 값을 추가해야함.
	 * 2. 배열의 중간 위치에 새로운 데이터를 추가하거나 삭제하는 경우, 
	 * 	  기존의 값을 한칸씩 당기거나 밀어주는 코드를 직접 짜야함.
	 * 3. 한가지 타입의 값들만 저장이 가능
	 * 
	 * 컬렉션의 장점
	 * 1. 크기의 제약이 없음.
	 * => 크기 지정을 할 필요도 없고, 크기지정을 해도 알아서 크기가 늘어나면서 데이터를 추가함.
	 * 2. 중간에 값을 추가하거나 삭제하는 경우, 값을 당기거나 밀어주는 코드가 이미 메소드로 정의되어 있음.
	 * => 필요할때마다 해당 메소드를 호출하면 됨.
	 * 3. 기본적으로 여러 타입의 데이터들을 한번에 묶어서 저장할 수 있음.
	 * => 단, 제네릭이라는 설정을 통해, 한 타입의 데이터만 들어올 수 있게 설정 가능. 
	 * 
	 * 배열 vs 컬렉션
	 * 방대한 데이터들을 단지 담아만 두고 조회만 할 목적 => 배열이 더 효율적
	 * 방대한 데이터들을 추가, 삭제, 수정 => 컬렉션이 더 효율적
	 * 
	 * 컬렉션(인터페이스 중 최상위 부모)의 3가지 분류
	 * 1. List계열(자식) 
	 * => 담고자 하는 값(Value)만 저장 / 값 저장 시, 순서를 유지(==index개념이 존재함)
	 * => 중복되는 값을 허용함.
	 * => 배열과 거의 유사함.
	 * 		- ArrayList(가장 많이 쓰임) 
	 * 		- Vector
	 * 		- LinkedList
	 * 2. Set계열(자식) 
	 * => 담고자 하는 값(Value)만 저장 / 값 저장 시, 순서를 유지하지 않음(index개념이 없음.복주머니 개념)
	 * => 중복되는 값을 허용하지 않음.
	 * 		- HashSet
	 * 		- TreeSet
	 * 3. Map계열(자식)
	 * => 키(Key,식별자)와 값(Value)을 세트로 저장 / 값 저장 시, 순서를 유지하지 않음(index개념이 없음) 
	 * => 키는 중복되지 않고, 값은 중복이 가능
	 * 		- HashMap
	 * 	 	- TreeMap
	 * 		- Properties
	 * 
	 */

	public static void main(String[] args) {
		
//		ArrayList를 쓰겠다 => ArrayList 객체를 생성
		
			/*
			 * 제네릭(<E>) 
			 * "어떤 자료형만 담겠다"라고 컬렉션에 담길 값의 형태를 지정해주는 역할
			 *  제네릭 설정을 하면, 배열처럼 한 자료형의 값만 담게 됨.
			 *  
			 *  별도의 제네릭 제시 없이 컬렉션 객체를 생성하면
			 *  E가 Object로 설정되어, 다양한 타입의 자료형의 값을 담을 수 있음
			 *  => 최상위 부모인 Object에 다형성을 적용하여 형변환을 통해 값을 담을 수 있음.
			 *  
			 *  별도의 제네릭 설정 시(<Music>)
			 *  E가 Music으로 설정하여, 해당 컬렉션에 Music타입의 객체만 담김
			 *  => 어차피 Music타입의 객체만 담기기 때문에, 형변환을 할 필요가 없음.
			 *  
			 *  제네릭을 설정하는 이유
			 *  1. 명시한 타입의 객체만 저장가능하도록 타입의 제한을 두기 위해서
			 *  2. 컬렉션에 저장된 객체를 꺼내서 사용할 경우, 매번 형변환 하는 것이 귀찮아서.
			 *  
			 *  주의사항
			 *  제네릭에는 참조자료형만 들어갈 수 있음
			 *  기본자료형을 이용하고 싶으면 Wrapper클래스를 이용해야 함.
			 *  
			 */
		
		
//		ArrayList list = new ArrayList();	// 내부적으로, 크기가 10짜리인 배열이 생성됨.
//		ArrayList list = new ArrayList(3); 	// 내부적으로, 크기가 3짜리인 배열이 생성됨.
//		제네릭 설정을 추가하여 ArrayList 객체 생성
		ArrayList<Music> list = new ArrayList<>(3); // Music타입만 받아줄 수 있음.
		System.out.println(list/*.toString()*/); // [] : 안에 아무것도 없는 상태(비어있음)
		
//		ArrayList에서 제공하는 메소드 : 추가, 수정, 삭제, 반환
//		추가
//		1. add(E e) : 해당 리스트의 끝에 전달된 e를 추가시켜주는 메소드 
//		E => Element : 제네릭(무슨 내용이 들어올 지 예측을 못하기 때문에, Element라는 타입으로 지정함.)
		list.add(new Music("Tears","소찬휘")); // 0번째 인덱스에 저장
		list.add(new Music("와","이정현")); // 1번째 인덱스에 저장
		list.add(new Music("바다의왕자","박명수")); // 2번째 인덱스에 저장
//		list.add("끝"); // 3번째 인덱스에 저장 
		
//		순서가 유지되면서 값이 추가됨(각 index에 담겨짐)
//		크기에 제약이 없음.
//		다양한 타입의 값 추가를 지원함.
		System.out.println(list);
		
//		2.add(int index, E e) : 리스트에 전달되는 index위치에 전달되는 e를 추가시켜줌(오버로딩)
		list.add(1, new Music("강남스타일","싸이"));
//		중간에 값을 추가 시, 알아서 기존의 값들을 밀어주는 작업이 내부적으로 이루어짐.
		System.out.println(list);
		
//		수정
//		3.set(int index, E e) : 리스트에 해당 index의 값을 전달되는 e로 변경시켜주는 메소드
		list.set(1, new Music("강북멋쟁이","정형돈"));
		System.out.println(list);
		
//		삭제
//		4.remove(int index)
		list.remove(1);
		System.out.println(list);
//		중간에 값 삭제 시, 알아서 기존의 값들을 앞으로 땡겨주는 작업을 내부적으로 진행함.
		
//		반환
//		5.size() : 리스트에 담겨있는 데이터의 개수를 반환해주는 메소드
		System.out.println("리스트에 담긴 데이터 수 : "+list.size()); // 노래 3곡, 문자열 1개
		System.out.println("리스트의 마지막 인덱스 : "+(list.size()-1));
		
//		6.get(int index) : 리스트에 해당 index의 위치의 데이터를 반환해주는 메소드
//		=> 반환형이 e(Element)로 반환됨. 
//		=> Object타입임.
		
//		제네릭 설정 전
//		부모 <------- 자식 : 자동형변환
//		자식 <------- 부모 : 강제형변환
//		올라갈때는 자동형변환, 내려갈때는 강제형변환
		/*
		Music m = (Music)list.get(0); // 다형성에 의해 강제형변환을 해주어야 함.
		System.out.println(m);
		System.out.println(list.get(0));
		System.out.println(((Music)list.get(0)).getTitle());
		*/
//		현재 배운 바에서는 Object타입의 getter/setter메소드를 호출해본 적이 없음.
//		따라서, Object타입을 Music으로 다운캐스팅을 해주고, getter/setter메소드를 사용해줌.
		
		
//		제네릭 설정 후
		Music m = list.get(0); // 형변환을 안해주어도 됨.
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(list.get(0).getTitle());
		
		
//		반복문을 이용하여, 0번~마지막 인덱스까지 데이터를 출력
		System.out.println("------------------------------------------------------------------");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------------------------");
		
//		향상된 for문
//		for(값을 담을 변수 선언문 : 배열명 또는 컬렉션명){}
//		제네릭 설정 전
		/*
		for(Object o : list) {
			System.out.println(o);
		}
		*/
		
//		제네릭 설정 후
		for(Music music : list) {
			System.out.println(music);
		}
		
		System.out.println("------------------------------------------------------------------");
		
//		7.subList(int beginIndex, int endIndex): 시작index에서 끝index-1까지의 데이터값을 반환함.
		
//		제네릭 설정 전
		/*
		List sub = list.subList(0, 2);
//		List는 인터페이스이기때문에 객체 생성(new)은 되지 않음(선언과 대입은 가능)
//		0번째, 1번째 인덱스의 값을 반환.
		System.out.println(sub);
		*/
		
//		제네릭 설정 후
		List<Music> sub = list.subList(0, 2);
		System.out.println("------------------------------------------------------------------");
		
//		8.addAll(Colection c) : 해당 리스트에 다른 컬렉션에 있는 데이터들을 추가(연이어서 붙여줌)
		list.addAll(sub);
		System.out.println(list);
		
		System.out.println("------------------------------------------------------------------");
//		9.isEmpty() : 해당 리스트가 비어있는지 묻는 메소드
//		=> 비어있으면 true, 비어있지 않다면 false를 반환
		System.out.println("리스트가 비어있습니까 ? "+ list.isEmpty());
		
//		10.Clear() : 해당 리스트를 모두 비워주는 메소드
		list.clear();
		System.out.println("리스트 비움 : " + list);
		System.out.println("리스트가 비어있습니까 ? "+ list.isEmpty());
		
	}

}
