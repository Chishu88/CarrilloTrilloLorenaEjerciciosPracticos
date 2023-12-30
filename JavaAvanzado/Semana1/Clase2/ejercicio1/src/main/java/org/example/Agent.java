package org.example;

public class Agent implements Runnable {

    private String nameAgent;

    public Agent(String nameAgent) {
        this.nameAgent = nameAgent;
    }

    public String getNameAgent() {
        return nameAgent;
    }

    public void setNameAgent(String nameAgent) {
        this.nameAgent = nameAgent;
    }

    @Override
    public String toString() {
        return "Agent{" +
                "nameAgent='" + nameAgent + '\'' +
                '}';
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Receive and handle the call
                Call call = CallCenterQueue.takeCall();
                processCall(call);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void processCall(Call call) {
        System.out.println(nameAgent + " handling call: " + call.getCallId());
        System.out.println("Customer query: " + call.getCustomerQuery());
        // Simula procesamiento adicional
        try {
            Thread.sleep((long) (Math.random() * 500));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(nameAgent + " completed call: " + call.getCallId());
    }
}
