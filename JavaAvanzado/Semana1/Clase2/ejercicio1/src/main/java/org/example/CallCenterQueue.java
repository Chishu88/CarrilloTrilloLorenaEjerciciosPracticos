package org.example;

import java.util.Random;

public class CallCenterQueue {

    private static final Object lock = new Object();

    private static int currentCallIndex = 0;

    public static Call takeCall() throws InterruptedException {
        synchronized (lock) {
            String[] possibleQueries = {"QueryA", "QueryB", "QueryC", "QueryD"};
            String randomQuery = possibleQueries[new Random().nextInt(possibleQueries.length)];

            Call call = new Call("Call " + currentCallIndex++, randomQuery);
            System.out.println("Incoming call: " + call);
            return call;
        }
    }
}




