package com.sist.exam02;

import java.util.Date;
import java.util.Scanner;

public class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, jumin;
		
		System.out.println("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		System.out.println("�ֹε�� ��ȣ�� �Է��Ͻÿ�");
		jumin = sc.next();
		
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		jumin.substring(0,2);
		int userYear = Integer.parseInt(jumin.substring(0, 2)) + 1900;
		int age = thisYear - userYear;
		char gender = jumin.charAt(7);
		
		System.out.println("���ؿ��� :"+ thisYear);
		System.out.println("�̸� :"+ name);
		System.out.println("����⵵ :"+ userYear);
		System.out.println("���� :"+ age);
		System.out.println("���� :"+ ((gender == '1')?"����":"����"));
		
		String result = "����, ����";
		
		if (age >= 40 && thisYear % 2 == userYear % 2 ) {
			if (age >=  50) {
				result += ", �����";
			}
			if(gender == '2') {
				result += ", �����, �ڱþ�";	
			}
		}else {
			System.out.println(name + "��  " + thisYear + "�⵵�� �ϰ��� ����ڰ� �ƴմϴ�.");
		}
		
	
	
	}

}
