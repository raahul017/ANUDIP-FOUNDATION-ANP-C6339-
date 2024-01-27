package com.threadprocess.example;

class Counter  {
    
	// Shared variable
    private int count = 0;

    // Synchronized method to increment count
    public synchronized void increment() {
        count++;
    }

    // Synchronized method to get the count
    public synchronized int getCount() {
        return count;
    }
}

class MyThread extends Thread {
    private Counter  counter ;

    public MyThread(String name, Counter  counter ) {
        super(name);
        this.counter  = counter;
    }

    @Override
    public void run() {
        synchronized (counter ) {
            System.out.println(Thread.currentThread().getName() + " is running.");

            // Increment count in shared resource
            counter .increment();

            // Notify other threads waiting on sharedResource
            counter.notify();
        }
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
    	Counter counter = new Counter();

        // Create two threads
        MyThread thread1 = new MyThread("Thread 1", counter);
        MyThread thread2 = new MyThread("Thread 2", counter);

        // Start both threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish using join()
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Final count: " + counter.getCount());
    }
}
