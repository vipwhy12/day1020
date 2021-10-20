package com.sist.exam02;

import java.util.Scanner;

public class ValidJuminNumber {

	public static void main(String[] args) {
		String jumin;
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하시오");
		jumin = sc.next();
		
		int sum = 0;
		int []n = {2 , 3 , 4 , 5 , 6 ,0 ,7 , 8 , 9 , 2 , 3 , 4 , 5 };
		for(int i = 0 ; i  < jumin.length()-1 ; i++ ) {
			if (i != 6) {
				sum = sum + Integer.parseInt(jumin.charAt(i) + "") * n[i];
			}
			
		}
		
		sum = sum % 11;
		sum = 11- sum;
		
		if (sum == 10) {
			sum = 0;
		}
		if (sum == 11) {
			sum = 1;
		}
		
		
		int check  = Integer.parseInt(jumin.charAt(13) + "");
		
		if(sum == check) {
			System.out.println("올바른 주민등록번호입니다.");
		}else {
			System.out.println("올바른 주민등록번호가 아입니다.");
		}
		
		
		
	}

}
