package com.kh.example.run;

import com.kh.example.model.vo.Student;

public class ExampleRun1 {

	public static void main(String[] args) {
		Student st = new Student();
		st.setGrade(5);
		st.setClassroom(2);
		st.setName("õ����");
		st.setHeight(165.0);
		st.setGender('��');
		System.out.println(st.information());
	}

}
