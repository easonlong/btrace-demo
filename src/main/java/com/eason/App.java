package com.eason;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		final Counter counter = new Counter();
		new Thread(new Runnable() {

			public void run() {
				while (true) {
					try {
	                    counter.inc(1);
	                    Thread.sleep(1000);
                    } catch (Exception e) {
	                    e.printStackTrace();
                    }
				}

			}
		}).start();
		new Thread(new Runnable() {

			public void run() {
				while (true) {
					try {
	                    counter.dec(1);
	                    Thread.sleep(1000);
                    } catch (Exception e) {
	                    e.printStackTrace();
                    }
				}

			}
		}).start();
		while (true) {
			Thread.sleep(10000);
		}
	}
}
