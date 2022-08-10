package com.kh.third;

public class MyName {
	//callMyName Method�����
	public void callMyName() {
		System.out.println("�ȳ��ϼ��� õ�����Դϴ�.");
	}
}

/*
 * workspace > Project > Package(����) > Class(����) > Method
 * ���� �ȿ� ������ �̸��� �������� �ߺ��� �� ����.
 * => �� workspace�ȿ� ������ �̸��� Project���� �ߺ�X
 * => �� Project�ȿ� ������ �̸��� Package���� �ߺ�X
 * => �� Package�ȿ� ������ �̸��� Class���� �ߺ�X
 * => �� Class�ȿ� ������ �̸��� Method���� �ߺ�O (�����ε�. �ڿ������)
 * => �� Method�ȿ� ������ �̸��� ����(�뺯�� �̸�)���� �ߺ�X 
 */

/*
 * Java�� ��� ��Ģ(�ڵ� ������)
 * 1. ��� ����ؾ� �Ѵ�.
 * 2. ���Ⱑ �Ұ��ϴ�.(Project,Package,Class,Method ��� �Ұ�)
 * 3. �ǹ� �ο��� �Ͽ� �ܾ �����Ͽ� ���´�.
 * 4. Package���� �ҹ��ڷ� ���´�(Class�� �������� ���ؼ�)
 * 5. Class���� ù���ڸ� �빮�ڷ� ���´�
 * 6. Method���� ù���ڸ� �ҹ��ڷ� ���´�.
 * 7. Variable�� ù���ڸ� �ҹ��ڷ� ���´�.
 * 8. �����Ģ : ���� �ܾ �ٿ��� ���� �ܾ��� �ձ��ڸ��� �빮�ڸ� ����Ѵ�.(���� ���)
 * => ��Ÿ��ǥ���(Camel Case)��� �θ���.
 * => MethodTest(Class), testPrint(Method)
 */

/*
 * 1. com.kh.first.MethodTest Ŭ����
 *    com.kh.second.MethodTest Ŭ����
 * ���� �ΰ��� Class�� ������ �����Ѱ�?
 * ��Ű���� �ٸ��� ������ ������ �����ϴ�.
 * 
 * 2. com.kh.member.MemberController
 * �������� Package�̰� Class�ΰ�?
 * member������ Package�̰� MemberController�� Class�̴�.
 */
