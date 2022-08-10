package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		
//		�����ϰ� ���� ����� ���� �� �޼ҵ� ���
//		java.io.File Ŭ������ ������ �۾�
		
//		1. ������ ��� �������� ���ϸ� �����ؼ� �����غ���
//		=> ���� �۾��ϰ� �ִ� ������Ʈ ���� ���� ������ ����
//		=> ����� : ���� ��ġ�� ���� ��������, ���� ��ġ
		try {
			
			File file1 = new File("test.txt");
			file1.createNewFile();
//			Project�� refresh�ϸ� test.txt�� ����.
			
//		2. ��� ������ �� ���ϸ��� �����ؼ� �����غ���	
//		=> ����� ������ �������� �ʾ� �߻��ϴ� ���� 
//		=> ������ ������ָ� �� �����.	
//		=> ������ : ������ ���������� ������ ��θ� ���� �����ϴ� ���
			File file2 = new File("C:\\aaa\\test.txt");
			file2.createNewFile();
			
//		3. ������ �����, �ű⿡ ���ϵ� ����� ����
			File bbbFolder = new File("C:\\bbb"); //������ Ȯ���ڰ� ���� ����.
			bbbFolder.mkdir(); // make directory
			File file3 = new File("C:\\bbb\\test.txt");
			file3.createNewFile();
			
//		4. ������ ��� �������� ������ ���� �� ���� �����ϱ�
			File folder = new File("test"); // ������Ʈ ���� ����(�����)
			folder.mkdir();
			File file = new File("test\\person.txt"); // �����
			file.createNewFile();
			
//		FileŬ�������� �����ϴ� �޼ҵ��
			System.out.println("������ �½��ϱ�? " + folder.isFile()); // false
			System.out.println("������ �½��ϱ�? " + file.isFile()); // true
			System.out.println("���ϸ� : "+file.getName()); // person.txt
			System.out.println("�������� : "+ file.getParent()); // test
			System.out.println("���Ͽ뷮 : "+ file.length()); // 0
			System.out.println("������ : "+ file.getAbsolutePath()); 
			//  C:\01_Java-workspace\12_IO\test\person.txt
			
		}catch(IOException e){
			e.printStackTrace(); // ������ ��������.
		}
		
		System.out.println("���α׷� ����");
		
	}

}

	/*
	 * ���α׷�             �ܺθ�ü
	 * 
	 * �ҽ��ڵ�(����)       ����
	 *                      Ű����
	 *                      ����� 
	 *                      DB
	 *                      
	 * ���α׷� ���� �����͸� �ܺθ�ü(�����, ����Ŀ, ���� ��)�� ����ϰų�
	 * �Է���ġ(Ű����, ���콺, ����)�� �Է¹��� ������ �����ϰ��� �Ѵٸ�
	 * �ݵ�� ���α׷��� �ܺθ�ü ������ "���"�� ������־�� ��.
	 * => �� ��θ� "Stream(��Ʈ��)"�̶�� ��.
	 * [Ư¡]
	 * 1. �ܹ��� : �Է��̸� �Է�, ����̸� ���
	 * 			   �Է¿� ��Ʈ��, ��¿� ��Ʈ���� ���ε��� ������.
	 *    		   ������� ���ؼ��� ��� 2���� ��Ʈ���� �ʿ���.
	 * 2. ���Լ��� : ���� ������ ���� ���� �����ϰ� ��(First In First Out : FIFO)
	 * 3. delay : �ð� ���� ������ �߻�������. 
	 * 
	 * ��Ʈ��( Ŭ���� )����
	 * 1. ����� ������� ����
	 * >����Ʈ ��Ʈ��(����) : 1byte¥���� �̵��� �� ���� ������ ������
	 * (�Է� : XXXInputStream / ��� : XXXOutputStream)
	 * 
	 * >���� ��Ʈ��(����) : 2byte¥���� �̵��� �� ���� ������ ������
	 * (�Է� : XXXReader / ��� : XXXWriter)
	 * 
	 * 2. �ܺθ�ü�� �������� ���� ����
	 * > ��ݽ�Ʈ�� : �ܺθ�ü�� ���������� ����Ǵ� ���
	 * 
	 * > ������Ʈ�� : ��ݽ�Ʈ�������� ������ ������ �������ִ� �뵵�� ���
	 * => �ܵ����� ������� ����.(�ܺθ�ü�� ���������� ����Ǵ� ������ �ƴ�!)
	 */















