package com.testcases.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorTest {
	
	private static final int NTHREDS = 10;
	
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for (int i = 0; i < 10; i++) {
                Runnable worker = new MyRunnable(10);
                executor.execute(worker);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        executor.awaitTermination(1000L, TimeUnit.MILLISECONDS);
        
        System.out.println("Finished all threads");
	}

}
