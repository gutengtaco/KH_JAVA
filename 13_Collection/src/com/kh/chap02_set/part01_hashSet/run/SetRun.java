package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {
	
	public static void main(String[] args) {
//		Set계열은 복주머니 같은 개념으로, 인덱스의 지정이 없음.
		
		HashSet<String> hs1 = new HashSet<>();
		
//		1. add(추가할 값) : 값 추가 메소드
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("반갑습니다."));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		
//		HashSet hs1 = new HashSet(); // 제네릭 설정을 안할 시
//		hs1.add(1); // int값도 들어가고
//		hs1.add(new Student()); // 객체값도 들어감
		
		System.out.println(hs1);
//		[안녕하세요, 여러분, 반갑습니다.]
//		=> 저장 순서가 유지가 되지 않음.
//		=> 중복 저장 X
		
//		2. size() : 현재 HashSet 객체에 들어있는 데이터의 갯수를 반환함.
		System.out.println(hs1.size());
		
//		3. remove(삭제할 값) : 값을 삭제해주는 메소드
//		hs1.remove("여러분");
		hs1.remove(new String("여러분"));
//		=> 둘다 사용 가능
		System.out.println(hs1);
		
//		4. clear() : 모든 값 삭제
		hs1.clear();
		System.out.println(hs1);
		
//		=> ArrayList을 쓸때랑 메소드가 비슷함.
//		=> 부모가 같아서 오버라이딩 된 형태임!
		
		System.out.println("-----------------------------------------------------------------");
		HashSet<Student> hs2 = new HashSet<>();
		hs2.add(new Student("공유",20,100));
		hs2.add(new Student("김영희",24,90));
		hs2.add(new Student("홍길동",33,80));
		hs2.add(new Student("공유",20,100));
//		
		System.out.println(hs2);
//		=> 저장 순서가 유지되지 않음.
//		=> 중복 저장 O
//		=> 왜? 동일객체로 판단이 되지 않아서!
//		equals()와 hashCode()를 오버라이딩을 해주면 중복 저장 X됨.
//		=> 오버라이딩이 필수는 아니나, 
//		=> Set계열에 담고자 할때는 필수
		
//		HashSet 객체가 중복을 판단하는 기준
//		값이 추가될때마다 equals(), HashCode()메소드로 중복을 비교함.
//		=> String메소드에서는 실제값에 대한 주소값을 반환
//		=> 이외에는 참조하는 주소지에 대한 주소값을 반환.
//		둘다 true가 나오면 동일객체로 판단함.
		
			/*
			 * HashSet에 객체를 담을 때, 내부적으로 equals()메소드를 활용해서 중복체크함.
			 * + hashCode() 메소드를 이용하여, 십진수값도 일치하는지 중복체크함.
			 * => equals()와 hashCode()가 모두 true라면, 동일 객체로 판단을 함.
			 * (equals()는 주소값 비교용 메소드 / hashCode()는 주소값 기준으로 십진수값 생성)
			 * 
			 * 지금부터는, 아무리 주소값이 다르더라도, 필드에 들은 값이 일치한다면 동일 객체로 판단하게끔
			 * 메소드를 오버라이딩
			 * 
			 * 메소드의 원래 역할
			 * => Object클래스에 존재하는 equals() : 두 객체의 주소값을 가지고 동등비교하여 true, false반환
			 * => Object클래스에 존재하는 hashCode() : 한 객체의 주소값을 기반으로 십진수의 값을 만들어서 반환
			 * 
			 * 오버라이딩의 역할
			 * Student클래스에 존재하는 equals() : 세 필드 값이 일치하면 true, 아니면 false로 반환하게끔 오버라이딩.
			 * Student클래스에 존재하는 hashCode() : 세 필드 값을 기반으로 해시코드 값을 만들어서 반환하게끔 오버라이딩.
			 */
		System.out.println("-----------------------------------------------------------------");
		
//		Set => 무작위 객체가 저장되어 있는 상태(index개념이 없음)
//		고로, 반복문 활용이 불가함.
//		그럼, 담겨있는 객체에 순차적으로 접근하고 싶으면??
		
//		1. 향상된 for문은 사용 가능(for each문) => index개념이 없음
		for(Student s : hs2  ) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------------------");
		
//		2. ArrayList에 담아준 후, ArrayList에서 반복문을 수행
//		ArrayList<Student> list = new ArrayList<>();
//		addAll(hs2); // 해당 리스트인 hs2에 담겨있던 내용물을 list에 모두 추가해줌.
		
		ArrayList<Student> list = new ArrayList<>(hs2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------------------------");
		
//		3. HashSet클래스에서 제공하는 Iterator 반복자를 이용한 방법
//		hs2에 담겨있는 객체들을 Iterator로 옮겨담아서 반복을 돌림.
//		=> Iterator는 인터페이스기 떄문에 객체생성(new)은 불가함 
		
//		.iterator() : List계열과 Set계열에서 쓸 수 있음(Map계열에서는 쓰지 못함)
		Iterator<Student> it = hs2.iterator();
		
//		반복돌릴때의 주의사항 : StringTokenizer때와 같이 반복문을 돌려줌.
		while(it.hasNext()) {	// 현재 it에 더이상 빼올 값이 남았는가? 있으면 true, 없으면 false(반복종료)
			System.out.println(it.next());
		}
	}

}
