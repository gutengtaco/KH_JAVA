package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;
import com.kh.chap02_inherit.model.vo.Vehicle;

public class Run {

	public static void main(String[] args) {
		
//		객체 생성 테스트
		Car c = new Car("벤틀리",12.5,"세단",4);
		Ship s = new Ship("새우잡이배",3,"어선",1);
		Airplane a = new Airplane("보잉774",0.02,"여객기",16,5);
		
		System.out.println(c.information());
		System.out.println(s.information());
		System.out.println(a.information());
		
		
		Vehicle vehicle = new Vehicle();
        vehicle.howToMove(); 
		a.howToMove();	// 움직인다.
		c.howToMove();	// 움직인다.
		s.howToMove();	// 움직인다.
//		각 자식클래스에 해당 메소드를 만들지 않았음에도 잘 작동함.
//		다만, 아직 오버라이딩을 하지 않은 상태임.
//		오버라이딩을 한다면 예를들어,
//		자동차 : 바퀴를 움직인다, 배: 프로펠러를 움직인다, 비행기 :바퀴를 움직이고, 날개를 움직인다. 
	}

}
