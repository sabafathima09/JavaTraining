package com.lumen.threads;

import java.util.Iterator;

public class ThreadSleep {

	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
				System.out.println(thread);
//				int[] nums = null;//throws null pointer exception
//				System.out.println(nums[0]);
//				
				for(int i = 0;i<10;i++) {
					System.out.println();
					try {
				thread.sleep(2000);
					}catch(InterruptedException e) {
						e.printStackTrace();
					}
				}
	}
}
