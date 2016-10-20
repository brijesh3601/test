package com.testcases.Multithreading;

public class MyRunnable implements Runnable {
    private final long countUntil;

    MyRunnable(long countUntil) {
            this.countUntil = countUntil;
    }

    public void run() {
            long sum = 0;
            for (long i = 1; i < countUntil; i++) {
                    sum =i+1;
            }
            System.out.println(Thread.currentThread().getName()+" total = " + sum);
    }
}