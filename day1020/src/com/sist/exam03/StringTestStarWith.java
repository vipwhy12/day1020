package com.sist.exam03;
import java.util.Scanner;

public class StringTestStarWith {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		System.out.println("�̸��� �Է��Ͻÿ�");
		name = sc.next();
		
		name.startsWith("��");
		
		if (name.startsWith("��")) {
			System.out.println("�达�Դϴ�. ");
		}else{
			System.out.println("�达�� �ƴմϴ�. ");
		}
		
		

	}

}
