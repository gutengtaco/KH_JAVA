package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		// 최대 10명의 학생 정보를 기록할 수 있게 배열을 할당한다.
		Student[] st = new Student[10];
		Scanner sc = new Scanner(System.in);
		// while(true)을 사용하여 학생들의 정보를 계속 입력 받고
		// 입력 받은 정보들을 가지고 배열의 count 인덱스에 매개변수 생성자를 통해 객체 생성
		// 한 명씩 추가 되었기 때문에 count 1증가
		// 계속 추가할 것인지 물어보고, ‘n’ 입력 시 반복문 빠져나감
		int count = 0; // 학생 수를 나타내는 변수  한 명 추가 시 1씩 증가시켜줄꺼임
		while(true) {
			System.out.print("학년 : ");
			int grade = sc.nextInt();
			sc.nextLine();
			System.out.print("반 : ");
			int classroom = sc.nextInt();
			sc.nextLine();
			System.out.print("이름 : ");
			String name = sc.nextLine();
			System.out.print("국어 점수 : ");
			int kor = sc.nextInt();
			sc.nextLine();
			System.out.print("영어 점수 : ");
			int eng = sc.nextInt();
			sc.nextLine();
			System.out.print("수학 점수 : ");
			int math = sc.nextInt();
			sc.nextLine();
				st[count] = new Student(grade,classroom,name,kor,eng,math);
					if(count>=0) {
						System.out.print("계속 추가하시겠습니까?(Y/N) : ");
						String yesNo = sc.nextLine();
							if(yesNo.equals("Y")) {
								count++;
								continue;
							}else {
								break;
							}
					}else if(count ==9) {
						break;
					}
		}
		for(int i=0; i<=count; i++) {
			System.out.println(st[i].information());
		}
		
		
		// 현재 배열에 담겨있는
		// 학생들의 정보를 모두 출력

	}

}
