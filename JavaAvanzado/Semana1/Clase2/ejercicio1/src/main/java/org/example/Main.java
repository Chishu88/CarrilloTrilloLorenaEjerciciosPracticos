package org.example;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {

    private static final int NUM_AGENTS = 5;
    private static final int NUM_CALLS = 20;
    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(NUM_AGENTS);

        for (int i = 1; i <= NUM_AGENTS; i++) {
            Agent agent = new Agent("Agent " + i);
            executorService.execute(agent);
        }

        for (int i = 1; i <= NUM_CALLS; i++) {
            //Call call = new Call("Call " + i);
            executorService.execute(() -> {
                try {
                    Call call = CallCenterQueue.takeCall();
                    call.processCall();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}