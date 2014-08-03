package com.java.example;

public class ExceptionC extends ExceptionB {
	public ExceptionC(String message){
		super(message);
	}
	
	public ExceptionC(){
		super("My Exception from class ExceptionC: ");
	}
	
	public int Sqrl(int value) throws ExceptionB{
		if(value < 0)
			throw new ExceptionB("Can bac 2 thi lam sao ma duoc so nho hon 0");
		return (int)Math.sqrt(value);
	}
}
