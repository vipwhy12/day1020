package com.sist.exam03;
import java.util.Scanner;

public class StringReplace {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("���ڿ��� �Է��ϼ���");
		str = sc.next();

		str = str.replace("hello","�ȳ�");
		System.out.println(str);
	}
	
	
	


}
