package com.hw4.run;

import com.hw4.controller.EmpTest;
import com.hw4.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		EmpTest et = new EmpTest();
		et.setEmp();
		System.out.println("-----------------------���� ����--------------------------");
		et.printEmp();
		System.out.println("-----------------------���� ����(�̸�)--------------------------");
		et.nameSortPrint();
		System.out.println("-----------------------���� ����(����)--------------------------");
		et.ageSortPrint();
	}

}
