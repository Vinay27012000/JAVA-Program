package javaprogram;

import java.util.Scanner;

public class Exc {
	 int a,b;
	 Exc(){
		 a=b=0;
	 }
	 Exc (int x,int y){
		a=x;b=y;
	 }
	 void func() {
		 try {
			 int c=a/b;
			 System.out.println("no exception");
		 }
		 catch(ArithmeticException e) 
		 {
			 System.out.println(e.toString());
		 }
		 finally {
			 System.out.println("exception handling");
		 }
	 }
		public static void main(String[] args) {
			int a,b;
			Scanner s=new Scanner(System.in);
			System.out.println("enter two numbers :");
			a=s.nextInt();
			b=s.nextInt();
			Exc obj=new Exc(a,b);
			obj.func();

		}

	}