package pl.dopierala.BlockingQueue;

import java.util.concurrent.BlockingQueue;

public class InverviewScheduler implements Runnable {

    private BlockingQueue<String> queue;
    private int noCandidates=0;

    public InverviewScheduler(BlockingQueue<String> queue, int noCandidates) {

        this.queue = queue;
        this.noCandidates = noCandidates;
    }

    @Override
    public void run() {
        System.out.println("SCHEDULER: "+noCandidates+" candidates checked in...");
        System.out.println("scheduleing appointments.");
        for (int i = 1; i <= noCandidates; i++) {
            try {
                queue.put("Candidate #ID:"+i);
                System.out.println("Scheduled candidate #ID:"+i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //put special EOL string to notify interviewer about end of queue. No more candidates to interview.
        try {
            queue.put("EOL");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
