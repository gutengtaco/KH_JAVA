package com.hw4.run;

import com.hw4.controller.EmpTest;
import com.hw4.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		et.setEmp();
		System.out.println("-----------------------정렬 이전--------------------------");
		et.printEmp();
		System.out.println("-----------------------정렬 이후(이름)--------------------------");
		et.nameSortPrint();
		System.out.println("-----------------------정렬 이후(나이)--------------------------");
		et.ageSortPrint();
	}

}
