package com.eason;

public class Counter {

	private int count = 0;

	public int inc(int num) throws Exception {
		count += num;
		Thread.sleep(1000);
		return count;
	}
}
