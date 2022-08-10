package com.kh.chap01_beforeVSafter.after.model.vo;
//			 �ڽ�					          �θ�
//           ����                             ����
//           ����                             ����
//           �ļ�                             ����
public class Desktop extends /*�θ�Ŭ������*/Product {
//	Ŭ���� ����� : ��𿡼� �������� ���� �����ð��� ������־����.
	
//	�ʵ��
//	(brand, pCode, pName, price)
//	�ʵ�ο� ���� ���� ���� �ƴ�, �θ�Ŭ������ �ʵ带 �����ϴ� ����.
	private boolean allInOne;
	
//	�����ں�
//	�⺻������
	public Desktop() {}
	
//	�Ű����� ������
//	brand, pCode, pName, price, allInOne�̶�� �ʵ忡 ���� �� �������ִ� ������
	public Desktop(String brand, String pCode, String pName, int price,
				   boolean allInOne) {
//		super.�� �ش� �θ�Ŭ������ ��ü�� �ּҸ� ��� ����.
//		��, �θ� ������ ������.
//		ex) super.brand;
//		��, private�� ��쿡�� ���������� �Ұ���!!
//		[�����޼���]
//		The field Product.brand is not visible
//		�� �ʵ��� ���� private�̱� ������, ���������� �Ұ��Ͽ� ������ ��.
//		[�ذ�]
//		1. private�� protected�� �ٲ��ֱ�
//		=> ������ �������, ���ȶ����� ��������.
		/*
		super.brand = brand;
		super.pCode = pCode;
		super.pName = pName;
		super.price = price;
		*/
//		2. �θ�Ŭ������ �ִ� public���� �������� setter�޼ҵ� Ȱ��
//		=>�ذ��� �ǳ�, �ڵ��� ���̰� �����.
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		this.allInOne = allInOne;
		*/
//		3. �θ�Ŭ������ �Ű����������ڸ� ȣ���Ͽ� ����ϱ�.
//		=> super()�����ڸ� �̿��Ͽ� �ۼ���.
//		=> �Ű����������ڵ� ������ �޼ҵ��̱� ������ super(�Ű�����)�� ȣ���� ������.
//		=> ���������� ȣ���� �� ��, �ٽ� �θ�Ŭ������ �ش� �Ű����� �����ڷ� ���ư� ���� �ʱ�ȭ�� �� ����.��
//		=> ��, this()�����ڿ� ���� ������ �ۼ����� 
		super(brand,pCode,pName,price);
		this.allInOne = allInOne;
	}
//	�޼ҵ��
	public boolean getAllInOne() {
		return allInOne;
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
//	�����ε� : ���� Ŭ���� ���� ���� �̸����� �޼ҵ带 ���� �� ����.
//			   �ٸ�, �Ű������� ����,����,������ �޶�� ������ �� ����.
//	�������̵� : �θ� Ŭ������ �ִ�, ���� �̸��� �޼ҵ带 �� �Ը���� �����ؼ� ���Ӱ� ���� ����.
//				 �������ε��̶�� ��.
//	��, �����ε��� �� Ŭ���� ���� �޼ҵ� �̸��� �����ϳ�, �Ű������� ����, ����, ������ �ٸ��� �Ͽ� �޼ҵ带 ����� ���̰�
//		�������̵��� ��Ӱ��迡�� �θ�Ŭ������ �Ű������� ����,����,������ �״�� ������ ����ϴ� ����.
//		���⼭, ������ ���� ������ �޼ҵ��̱� ������ �����ε�, �������̵��� �����.
	public String information() {
//		return brand+pCode+pName+price+allInOne;
//		[�����޼���]
//		The field Product.brand is not visible
//		product�� 4���� �ʵ尡 desktop�� �������� �ʾƼ� ����.
		
//		return super.getBrand()+", "+super.getpCode()+", "+super.getpName()+", "
//		+super.getPrice()+", "+allInOne;
//		product�� �ʵ带 protected�� �ٲپ��ָ� ������ �����.
//		(protected : ������Ű�� o, �ٸ���Ű��x(��Ӱ����Ͻÿ��� ����))
//		�ٸ�, �̰� ������ ����ΰ�? No!
//		���� ��Ű�� ����, ���� ������� �ٸ� Ŭ���������� �����Ӱ� ������ ������ ������
//		private�� "���������� ���ڴ�" => "���������� �����ϰ� �ϰڴ�."
//		=> getter�޼ҵ带 ȣ���Ͽ� �����(public�̶� �ٷ� ȣ�� ������)
//		=> ���⿡ �θ�κ��� �޼ҵ带 ȣ���Ѵٴ� �ǹ̿��� super.�� �ٿ���.
		
//		�θ�κ��� .�ʵ忡 ���� �����ϰ�ʹٸ�? super.�ʵ��
//		�θ�κ��� �޼ҵ带 ȣ���ϰ� �ʹٸ�? super.�޼ҵ��()
//		�θ�κ��� ������(�⺻, �Ű�����)�� ȣ���ϰ� �ʹٸ�? super(), super(�Ű�����)
		return super.information() + ", "+allInOne;
//		���� getter�޼ҵ带 �̿��� ��İ� ���� ȿ����.
	}
}
