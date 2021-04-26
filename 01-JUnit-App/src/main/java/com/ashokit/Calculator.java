package com.ashokit;

public class Calculator {

	public Integer add(Integer a, Integer b) {
		return a + b;
	}

	public Integer mul(Integer a, Integer b) {
		return a * b;
	}

	public Integer div(Integer a, Integer b) {
		try {
			Thread.sleep(1005);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a / b;
	}
}
