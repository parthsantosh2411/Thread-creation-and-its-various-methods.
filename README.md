# Multithreading Java Program 

## Overview
This Java program demonstrates multithreading using both the `Runnable` interface and extending the `Thread` class. Multithreading allows concurrent execution of multiple threads within a single Java program, enabling better resource utilization and improved performance for certain tasks.

## Classes
1. **CustomRunnable**:
   - Implements the `Runnable` interface, providing a way to create threads by implementing a `run()` method.
   - The `CustomRunnable` class encapsulates a task that can be executed concurrently by multiple threads.
   - It has a constructor that takes the thread name as a parameter and initializes it.
   - Provides a public method `getThreadName()` to retrieve the name of the thread.
   - The `run()` method defines the behavior of the thread, such as performing a task or operation. In this example, it simulates a task by counting down and sleeping.

2. **CustomThread**:
   - Extends the `Thread` class, allowing the class to act as a thread itself.
   - The `CustomThread` class encapsulates a thread with a specific task or operation.
   - It has a constructor that takes the thread name as a parameter and initializes it.
   - Provides a public method `getThreadName()` to retrieve the name of the thread.
   - Overrides the `run()` method to define the behavior of the thread, similar to `CustomRunnable`.
   - Extending the `Thread` class directly is less flexible than implementing `Runnable` because Java doesn't support multiple inheritance. However, it's simpler for small, self-contained tasks.

3. **ThreadDemo**:
   - Contains the `main()` method to demonstrate the creation and running of threads.
   - Creates instances of both `CustomThread` and `CustomRunnable`.
   - Starts the threads using the `start()` method, which invokes their `run()` methods concurrently.
   - Uses `join()` to wait for the threads to complete execution before proceeding with the main thread.
   - Prints messages indicating thread execution and completion.

## Explanation
- Both `CustomThread` and `CustomRunnable` classes achieve the same goal of creating threads, but they use different mechanisms (`extends Thread` vs. `implements Runnable`).
- Using `Runnable` is often preferred because it allows better separation of concerns and enhances code reusability.
- The `ThreadDemo` class demonstrates basic thread synchronization using `join()` to ensure the main thread waits for all other threads to complete before proceeding.



