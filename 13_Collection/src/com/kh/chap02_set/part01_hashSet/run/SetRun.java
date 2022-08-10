package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {
	
	public static void main(String[] args) {
//		Set�迭�� ���ָӴ� ���� ��������, �ε����� ������ ����.
		
		HashSet<String> hs1 = new HashSet<>();
		
//		1. add(�߰��� ��) : �� �߰� �޼ҵ�
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("�ݰ����ϴ�."));
		hs1.add(new String("������"));
		hs1.add(new String("�ȳ��ϼ���"));
		hs1.add(new String("������"));
		
//		HashSet hs1 = new HashSet(); // ���׸� ������ ���� ��
//		hs1.add(1); // int���� ����
//		hs1.add(new Student()); // ��ü���� ��
		
		System.out.println(hs1);
//		[�ȳ��ϼ���, ������, �ݰ����ϴ�.]
//		=> ���� ������ ������ ���� ����.
//		=> �ߺ� ���� X
		
//		2. size() : ���� HashSet ��ü�� ����ִ� �������� ������ ��ȯ��.
		System.out.println(hs1.size());
		
//		3. remove(������ ��) : ���� �������ִ� �޼ҵ�
//		hs1.remove("������");
		hs1.remove(new String("������"));
//		=> �Ѵ� ��� ����
		System.out.println(hs1);
		
//		4. clear() : ��� �� ����
		hs1.clear();
		System.out.println(hs1);
		
//		=> ArrayList�� ������ �޼ҵ尡 �����.
//		=> �θ� ���Ƽ� �������̵� �� ������!
		
		System.out.println("-----------------------------------------------------------------");
		HashSet<Student> hs2 = new HashSet<>();
		hs2.add(new Student("����",20,100));
		hs2.add(new Student("�迵��",24,90));
		hs2.add(new Student("ȫ�浿",33,80));
		hs2.add(new Student("����",20,100));
//		
		System.out.println(hs2);
//		=> ���� ������ �������� ����.
//		=> �ߺ� ���� O
//		=> ��? ���ϰ�ü�� �Ǵ��� ���� �ʾƼ�!
//		equals()�� hashCode()�� �������̵��� ���ָ� �ߺ� ���� X��.
//		=> �������̵��� �ʼ��� �ƴϳ�, 
//		=> Set�迭�� ����� �Ҷ��� �ʼ�
		
//		HashSet ��ü�� �ߺ��� �Ǵ��ϴ� ����
//		���� �߰��ɶ����� equals(), HashCode()�޼ҵ�� �ߺ��� ����.
//		=> String�޼ҵ忡���� �������� ���� �ּҰ��� ��ȯ
//		=> �̿ܿ��� �����ϴ� �ּ����� ���� �ּҰ��� ��ȯ.
//		�Ѵ� true�� ������ ���ϰ�ü�� �Ǵ���.
		
			/*
			 * HashSet�� ��ü�� ���� ��, ���������� equals()�޼ҵ带 Ȱ���ؼ� �ߺ�üũ��.
			 * + hashCode() �޼ҵ带 �̿��Ͽ�, ���������� ��ġ�ϴ��� �ߺ�üũ��.
			 * => equals()�� hashCode()�� ��� true���, ���� ��ü�� �Ǵ��� ��.
			 * (equals()�� �ּҰ� �񱳿� �޼ҵ� / hashCode()�� �ּҰ� �������� �������� ����)
			 * 
			 * ���ݺ��ʹ�, �ƹ��� �ּҰ��� �ٸ�����, �ʵ忡 ���� ���� ��ġ�Ѵٸ� ���� ��ü�� �Ǵ��ϰԲ�
			 * �޼ҵ带 �������̵�
			 * 
			 * �޼ҵ��� ���� ����
			 * => ObjectŬ������ �����ϴ� equals() : �� ��ü�� �ּҰ��� ������ ������Ͽ� true, false��ȯ
			 * => ObjectŬ������ �����ϴ� hashCode() : �� ��ü�� �ּҰ��� ������� �������� ���� ���� ��ȯ
			 * 
			 * �������̵��� ����
			 * StudentŬ������ �����ϴ� equals() : �� �ʵ� ���� ��ġ�ϸ� true, �ƴϸ� false�� ��ȯ�ϰԲ� �������̵�.
			 * StudentŬ������ �����ϴ� hashCode() : �� �ʵ� ���� ������� �ؽ��ڵ� ���� ���� ��ȯ�ϰԲ� �������̵�.
			 */
		System.out.println("-----------------------------------------------------------------");
		
//		Set => ������ ��ü�� ����Ǿ� �ִ� ����(index������ ����)
//		���, �ݺ��� Ȱ���� �Ұ���.
//		�׷�, ����ִ� ��ü�� ���������� �����ϰ� ������??
		
//		1. ���� for���� ��� ����(for each��) => index������ ����
		for(Student s : hs2  ) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------------------------------------");
		
//		2. ArrayList�� ����� ��, ArrayList���� �ݺ����� ����
//		ArrayList<Student> list = new ArrayList<>();
//		addAll(hs2); // �ش� ����Ʈ�� hs2�� ����ִ� ���빰�� list�� ��� �߰�����.
		
		ArrayList<Student> list = new ArrayList<>(hs2);
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------------------------------------");
		
//		3. HashSetŬ�������� �����ϴ� Iterator �ݺ��ڸ� �̿��� ���
//		hs2�� ����ִ� ��ü���� Iterator�� �Űܴ�Ƽ� �ݺ��� ����.
//		=> Iterator�� �������̽��� ������ ��ü����(new)�� �Ұ��� 
		
//		.iterator() : List�迭�� Set�迭���� �� �� ����(Map�迭������ ���� ����)
		Iterator<Student> it = hs2.iterator();
		
//		�ݺ��������� ���ǻ��� : StringTokenizer���� ���� �ݺ����� ������.
		while(it.hasNext()) {	// ���� it�� ���̻� ���� ���� ���Ҵ°�? ������ true, ������ false(�ݺ�����)
			System.out.println(it.next());
		}
	}

}
