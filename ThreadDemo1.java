package org.example;

// Main class to demonstrate the creation and running of threads
public class ThreadDemo1 {
    public static void main(String[] args) {
        // Create Runnable objects
        CustomRunnable runnable1 = new CustomRunnable("Runnable-1");
        CustomRunnable runnable2 = new CustomRunnable("Runnable-2");

        // Create Thread objects and pass the Runnable objects
        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        // Start the threads; they begin to execute the run method of Runnable
        thread1.start();
        thread2.start();

        try {
            // Use join to ensure both threads complete before continuing in the main thread
            System.out.println("Main thread is waiting for " + runnable1.getThreadName() + " to complete using join() method.");
            thread1.join();
            System.out.println("Main thread is waiting for " + runnable2.getThreadName() + " to complete using join() method.");
            thread2.join();
        } catch (InterruptedException e) {
            // Catch and handle any interruption to the main thread while it's waiting
            System.out.println("Main thread was interrupted while waiting for other threads.");
        }

        // Print out a message when the main thread is exiting, signifying all threads are complete
        System.out.println("Main thread is exiting.");
    }
}

