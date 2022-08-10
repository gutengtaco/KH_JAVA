package com.hw4.controller;

import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpTest extends Employee{
	private Employee[] empArr;

	public EmpTest() {
		super();
	}

	public Employee[] getEmpArr() {
		return empArr;
	}
	
	public void setEmp() {
		empArr = new Employee[5];
		empArr[0] = new Employee("문말똥",24, 1500000,1.245);
		empArr[1] = new Employee("장소똥",40, 2500000,1.4);
		empArr[2] = new Employee("금개똥",22, 1780000,1.3);
		empArr[3] = new Employee("봉쥐똥",31, 1950000,1.365);
		empArr[4] = new Employee("홍닭똥",34, 1650000,1.212);
		
	}
	public void printEmp() {
		for(int i=0; i<empArr.length; i++) {
			System.out.println(empArr[i].toString());
		}
	}
//	이름 오름차순
	public void nameSortPrint() {
		// 정렬 : 여러 개의 데이터를 일정한 규칙에 따라 차례대로 나열.
		// 오름차순 : 작은 것부터 큰 순서대로 나열. 
		// 내림차순 : 큰 것부터 작은 순서대로 나열.
		
		/*
		 * 대표적인 정렬 기법
		 * 버블정렬 : 일일이 다 비교하는 원리(가장 쉽고, 비효율적인 방법)
		 * ex) 6 4 8 1 2
		 * 
		 * 1트 (4 6) 8 1 2 => 정렬대상 개수 -1
		 *     4 (6 8) 1 2
		 *     4 6 (1 8) 2
		 *     4 6 1 (2 8)
		 * => 가장 큰 값이 맨 뒤로 밀려남    
		 * 
		 * 2트 (4 6) 1 2 8 => 정렬대상 개수 -2
		 *     4 (1 6) 2 8 
		 *     4 1 (2 6) 8
		 * => 그 다음으로 큰게 뒤로 물러남
		 * 
		 * 3트
		 * 	   (1 4) 2 6 8 => 정렬대상 개수 -3
		 *     1 (2 4) 6 8
		 * => 그 다음으로 큰게 뒤로 물러남.
		 * 
		 * 4트 
		 *     1 2 4 6 8
		 * 
		 * ==> 매 시도마다, 제일 뒷자리부터 차곡차곡 정렬이 이루어짐.
		 * ==> 매 시도마다, 반복되는 횟수가 1씩 감소.
		 * ==> 맨 처음은 정렬대상 개수 -1
		 */
		for(int i=0; i< empArr.length-1; i++) { // 1트, 2트, 3트, 4트
			
			for(int j=0; j<empArr.length-1-i; j++) { // 4바퀴, 3바퀴, 2바퀴, 1바퀴
				
//				만약 앞의 녀석이 더 크다면 자리 바꿈. 아니면 안바꿈
				if(empArr[j].getName().compareTo(empArr[j+1].getName())>0) {
//					임시 저장소를 만들어 잠깐 보관(바꿔치기)
					Employee temp = empArr[j];
					empArr[j] = empArr[j+1];
					empArr[j+1] = temp;
				}
			}
		}
//		적어도 이 시점에 도달했다 == 정렬이 오름차순으로 잘 이루어졌다.
		printEmp();
		
	}
//	나이기준 오름차순
	public void ageSortPrint() {
		for(int i=0; i<empArr.length-1; i++) {
			for(int j=0; j<empArr.length-1-i; j++) {
				if(empArr[j].getAge() > empArr[j+1].getAge()) {
					Employee temp = empArr[j];
					empArr[j] = empArr[j+1];
					empArr[j+1] = temp;
				}
			}
		}
		printEmp();
	}
}
