package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체배열을 크기 3으로 할당 한 뒤
		// 0번 인덱스에는 기본생성자를 통해서 객체 생성
		// 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
		// 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
		Employee e1 = new Employee();
		Employee e2 = new Employee(1, "홍길동",19,'M',"01022223333","서울잠실");
		Employee e3 = new Employee(2, "강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","사울 마곡");
		System.out.println("emp[0] : "+e1.information());
		System.out.println("emp[1] : "+e2.information());
		System.out.println("emp[2] : "+e3.information());
		System.out.println("==========================================================================================");
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
		e1.setEmpName("김말똥");
		e1.setDept("영업부");
		e1.setJob("팀장");
		e1.setAge(30);
		e1.setGender('M');
		e1.setSalary(3000000);
		e1.setBonusPoint(0.2);
		e1.setPhone("01055559999");
		e1.setAdress("전라도 광주");
		
		e2.setDept("기획부");
		e2.setJob("부장");
		e2.setSalary(4000000);
		e2.setBonusPoint(0.3);
		e2.setPhone("01022223333");
		e2.setAdress("서울 잠실");
		System.out.println("emp[0] : "+e1.information());
		System.out.println("emp[1] : "+e2.information());
		System.out.println("==========================================================================================");

		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12
		int e1Salary = e1.getSalary();
		double e1bonus = e1.getBonusPoint();
		int e1Income = (e1.getSalary()+((int)(e1.getSalary()*e1.getBonusPoint())))*12;
		int e2Salary = e2.getSalary();
		double e2bonus = e2.getBonusPoint();
		int e2Income = (e2.getSalary()+((int)(e2.getSalary()*e2.getBonusPoint())))*12;
		int e3Salary = e3.getSalary();
		double e3bonus = e3.getBonusPoint();
		int e3Income = (e3.getSalary()+((int)(e3.getSalary()*e3.getBonusPoint())))*12;
		System.out.println("김말똥의 연봉 : "+e1Income+"원");
		System.out.println("홍길동의 연봉 : "+e2Income+"원");
		System.out.println("강말순의 연봉 : "+e3Income+"원");
		System.out.println("==========================================================================================");
		// 3명 직원의 연봉 평균을 구하여 출력
		System.out.println("직원들의 연봉 평균 : "+(e1Income+e2Income+e3Income)/3+"원");
	}

}
