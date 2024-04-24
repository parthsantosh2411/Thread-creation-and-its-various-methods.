package org.example;
// Define a custom Thread class by extending Thread
class CustomThread extends Thread {

    // Declare a private variable to hold the name of the thread
    private String threadName;

    // Constructor for CustomThread, takes a string name as parameter
    public CustomThread(String name) {
        this.threadName = name;
        System.out.println("Creating " + threadName);
    }

    // Public method to get the name of the thread
    public String getThreadName() {
        return threadName;
    }

    // The run method is where the thread's operation is defined
    @Override
    public void run() {
        System.out.println(threadName + " started using start() method.");
        try {
            // Loop to simulate some operation by counting down
            for (int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                System.out.println(threadName + " is sleeping for 500ms using sleep() method.");
                // The thread sleeps for 500 milliseconds
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            // If the thread is interrupted during sleep, catch the exception and output a message
            System.out.println(threadName + " was interrupted during sleep.");
        }
        // After completing the task, print that this thread is exiting
        System.out.println(threadName + " is exiting.");
    }
}
