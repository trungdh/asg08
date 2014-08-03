package com.java.example;

public class ExceptionA extends Exception {

	public ExceptionA(String message)
	{
		super("My Exception from class ExceptionA: " + message);
	}
}
