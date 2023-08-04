package com.lumen.fun;

public class FunMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapefactory = new ShapeFactory();
		shapefactory.printArea((x, y)->{
			System.out.println("Area of Rectangle:"+(x*y)) ;
			return (x*y);
	},10, 30);
	
		shapefactory = new ShapeFactory();
		shapefactory.printArea((x,y)->{
			System.out.println("Area of Traingle:"+ (1/2*x*y) );
			return (1/2*x*y);
	},100, 900);
	}
}
