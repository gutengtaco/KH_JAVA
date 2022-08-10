package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
//		3명의 학생정보를 객체배열에 기록
		System.out.println("1. 학생정보 출력");
		Student[] s = new Student[3];
		s[0] = new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		s[1] = new Student("김말똥",21,187.3,80.0,1,"경영학과");
		s[2] = new Student("강개순",23,167.0,45.0,1,"정보통신학과");
//		학생 정보를 출력
		for(int i=0; i<s.length; i++) {
			System.out.println(s[i].information());
		}
//		10명의 사원정보를 객체배열에 기록
//		객체 배열 생성
		System.out.println("2. 사원정보 출력");
		Employee[] e = new Employee[10];
//			객체배열의 인덱스를 변수로 생성
			int count=0;
			while(true){
//				키보드로 사원정보를 입력받도록 구현
				Scanner sc = new Scanner(System.in);
				System.out.print("사원이름 : ");
				String empName = sc.nextLine();
				System.out.print("사원나이 : ");
				int empAge = sc.nextInt() ; 
				sc.nextLine();
				System.out.print("사원 키 : ");
				double empHeight = sc.nextDouble();
				sc.nextLine();
				System.out.print("사원 몸무게 : ");
				double empWeight = sc.nextDouble();
				System.out.print("사원 급여 : ");
				int empSalary = sc.nextInt();
				sc.nextLine();
				System.out.print("사원 부서 : ");
				String empDept = sc.nextLine();
//					객체배열과 변수를 활용하여 객체 값 대입
					e[count] = new Employee(empName,empAge,empHeight,empWeight,empSalary,empDept);
					count++;
				System.out.print("사원을 더 추가하시겠습니까(Y/N)?");
				char yesNo = sc.nextLine().toUpperCase().charAt(0);
					if(yesNo == 'Y') {
						continue;
					}else {
						System.out.println("프로그램을 종료합니다.");
						break;
					}
			}
//			사원정보를 출력
			for(int i=0; i<e.length; i++) {
				if(e[i] == null) {
					continue;
				}else {
					System.out.println(e[i].information());
				}
			}
	}
}
