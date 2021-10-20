package com.sist.exam03;

public class StringTestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "È«±æµ¿/20/¼­¿ï/010-1234-5678";
		String [] arr = data.split("/");
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		
		}
	
		StringTockenizer st = new StringTockenizer(data, "/");
		while (st.hasMoreTokens()) {
			String str = st.nextToken();
	}

}
