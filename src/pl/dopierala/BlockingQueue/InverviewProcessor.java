package pl.dopierala.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class InverviewProcessor implements Runnable {

    private BlockingQueue<String> queue;
    private boolean run = false;

    public InverviewProcessor(BlockingQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        run=true;
        System.out.println("Interviewer here. Starting my work.");
        String candidate;
        synchronized (queue) {
            while (run) {
                try {
                    candidate = queue.take();
                    if(candidate!="EOL") {
                        System.out.println("Interviewing another person: "+ candidate);
                        Thread.sleep(2000);
                    }
                    else{
                        run=false;
                    }
                } catch (InterruptedException e) {
                        e.printStackTrace();
                }
            }
        }
    }


}
