package com.kh.chap02_set.part01_hashSet.model.vo;

public class Student {
//	�ʵ��
	private String name;
	private int age;
	private int score;
//	�����ں�
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
//	�޼ҵ��
//	getter,setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
//	toString
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	
	
//	eqauls() �޼ҵ� ������ : �� �ʵ��� ���� ��� ��ġ�ϴ���
	@Override
	public boolean equals(Object obj) {
		Student other = (Student)obj;
		
//		this.name�� other.name�� ��ġ�ϴ��� ��
//		this.age�� other.age�� ��ġ�ϴ��� ��
//		this.score�� other.score�� ��ġ�ϴ��� ��
//		=> ���ڿ��� eqauls(), �������� ==
		if( (this.name.equals(other.name))&& 
			(this.age == other.age) &&
			(this.score == other.score)) {
			
			return true;
		}else {
			return false;
		}
	}
//	hashCode() �޼ҵ� ������ : �� �ʵ��� ���� ���ڿ� �ϳ��� ���� ����, hashCode����
	public int hashCode() {
//		"����20100"
//		=> �� �ʵ带 ��� String���� ����� �� ��, �̸� hashCode������ �ٲ���.
		return (name+age+score).hashCode();
	}
	
	/*
//	�ڵ��ϼ�������� eqauls(), hashCode()�����
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
	*/
	
}