package org.example;
// Main class to demonstrate the creation and running of threads
public class ThreadDemo {
    public static void main(String[] args) {
        // Create two threads
        CustomThread thread1 = new CustomThread("Thread-1");
        CustomThread thread2 = new CustomThread("Thread-2");

        // Start the threads; they begin to execute the run method
        thread1.start();
        thread2.start();

        try {
            // Use join to ensure both threads complete before continuing in the main thread
            System.out.println("Main thread is waiting for " + thread1.getThreadName() + " to complete using join() method.");
            thread1.join();
            System.out.println("Main thread is waiting for " + thread2.getThreadName() + " to complete using join() method.");
            thread2.join();
        } catch (InterruptedException e) {
            // Catch and handle any interruption to the main thread while it's waiting
            System.out.println("Main thread was interrupted while waiting for other threads.");
        }

        // Print out a message when the main thread is exiting, signifying all threads are complete
        System.out.println("Main thread is exiting.");
    }
}