package pl.dopierala.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Testing ArrayBlockingQueue with threads
 */
public class InterviewMain {
    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(3);
        InverviewScheduler sched = new InverviewScheduler(queue,5);
        InverviewProcessor proce = new InverviewProcessor(queue);

        Thread schedThread = new Thread(sched);
        Thread procThread = new Thread(proce);

        schedThread.start();
        procThread.start();

        System.out.println("Main ends its work gere.");

    }
}

