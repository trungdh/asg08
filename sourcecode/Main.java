package com.java.example;

public class Main {
	public static void main(String[] args){
		// test class b
		ExceptionB exceptionB = new ExceptionB();
		int a = 1;
		int b  = 0;
		try{
			exceptionB.Caculator(a, b);
		}catch(ExceptionA e){
			System.out.println(e.getMessage());
		}
		
		//test Class ExceptionC
		ExceptionC exceptionC = new ExceptionC();
		a = -10;
		try{
			exceptionC.Sqrl(a);
		}catch(ExceptionB e){
			System.out.println(e.getMessage());
		}		
	}
}
