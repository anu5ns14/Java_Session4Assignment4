package com.learning.polymorphism;

import java.util.Scanner;

public class RectangleTriangle {
	
	int length,breadth;
	float a,base,height;
	
	RectangleTriangle(int l, int b){
		length = l;
		breadth = b;
		
	}
	
	RectangleTriangle(float b, float h){
		
		base = b;
		height = h;
	}
	
	int getRectangle(){
		return length*breadth;
	}
	
	float getTriangle(){
		a = (float)1/2*base*height;
		return a;
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the length and breadth of the rectangle as integer: ");
		
		int len = scan.nextInt();
		int bre = scan.nextInt();
		
		System.out.println("Enter the base and height of the circle as float: ");
		
		float b = scan.nextFloat();
		float h = scan.nextFloat();
		
		RectangleTriangle rt = new RectangleTriangle(len,bre);
		RectangleTriangle rt1 = new RectangleTriangle(b, h);
		
		System.out.println("Area of rectangle is: "+rt.getRectangle());
		System.out.println("Area of triangle is: "+rt1.getTriangle());
	}
}
