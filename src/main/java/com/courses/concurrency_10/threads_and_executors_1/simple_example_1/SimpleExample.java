package com.courses.concurrency_10.threads_and_executors_1.simple_example_1;

/**
 * Created by VSulevskiy on 08.05.2015.
 */
public class SimpleExample {
    public static void main(String[] args) {
        Runnable task = new SimpleExampleTask();
        task.run();
        Thread thread = new Thread(task);
        thread.start();
        System.out.println("Done!");
    }


}
