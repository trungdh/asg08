package com.java.example;

public class ExceptionB extends ExceptionA {
	public ExceptionB(String message){
		super(message);
	}
	
	public ExceptionB(){
		super("My Exception from class ExceptionB: ");
	}
	
	public void Caculator(int a, int b) throws ExceptionA
	{
		if(a != 0 && b == 0)
			throw new ExceptionA("Khong duoc cho mau so bang 0");
	}
}
