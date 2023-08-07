package com.lumen.training;

public class Onedim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] marks = new int[3];
		System.out.println(marks.length);
		System.out.println(marks[0]);
		
		//populate
//		marks[0]=100;
//		marks[1]=200;
//		marks[2]=300;
//		int sum =0 ;
//		
//		for ( int i = 0; i<marks.length;i++) {
//			System.out.println(marks[i]);
//			sum+=marks[i];
//			System.out.println(sum);
//		}
//	}
//	
//
//}

//sum of marks using for each 
		marks[0]=100;
		marks[1]=200;
		marks[2]=300;
		int sum=0;
		for(int mark:marks)
		sum+=mark;
		System.out.println(sum);
	}
}