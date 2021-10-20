package com.sist.exam02;

import java.util.Date;
import java.util.Scanner;

public class CancerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name, jumin;
		
		System.out.println("이름을 입력하시오");
		name = sc.next();
		System.out.println("주민등록 번호를 입력하시오");
		jumin = sc.next();
		
		Date today = new Date();
		int thisYear = today.getYear() + 1900;
		jumin.substring(0,2);
		int userYear = Integer.parseInt(jumin.substring(0, 2)) + 1900;
		int age = thisYear - userYear;
		char gender = jumin.charAt(7);
		
		System.out.println("올해연도 :"+ thisYear);
		System.out.println("이름 :"+ name);
		System.out.println("출생년도 :"+ userYear);
		System.out.println("나이 :"+ age);
		System.out.println("성별 :"+ ((gender == '1')?"남자":"여자"));
		
		String result = "위암, 간암";
		
		if (age >= 40 && thisYear % 2 == userYear % 2 ) {
			if (age >=  50) {
				result += ", 대장암";
			}
			if(gender == '2') {
				result += ", 유방암, 자궁암";	
			}
		}else {
			System.out.println(name + "님  " + thisYear + "년도에 암검진 대상자가 아닙니다.");
		}
		
	
	
	}

}
