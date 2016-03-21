package com.eason;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Counter counter = new Counter();
		while (true) {
			System.out.println(counter.inc(1));
		}
	}
}
