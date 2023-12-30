package org.example;

public class Call {

    private String callId;
    private String customerQuery;

    public Call(String callId, String customerQuery){
        this.callId = callId;
        this.customerQuery = customerQuery;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getCustomerQuery() {
        return customerQuery;
    }

    public void setCustomerQuery(String customerQuery) {
        this.customerQuery = customerQuery;
    }

    @Override
    public String toString() {
        return "Call{" +
                "callId='" + callId + '\'' +
                '}';
    }

    public void processCall(){
        System.out.println("Processing call: " + callId + " - Handled by " + Thread.currentThread().getName());
        System.out.println("Customer query: " + customerQuery);
    }
}
