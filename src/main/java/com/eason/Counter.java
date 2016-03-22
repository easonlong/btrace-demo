package com.eason;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

	private AtomicInteger count = new AtomicInteger();

	public Integer inc(int num) throws Exception {
		return count.addAndGet(num);
	}

	public Integer dec(int num) throws Exception {
		return count.addAndGet(-num);
	}
}
