package org.howard.edu.lsp.finalexam.problem52;

public class PayPalPayment implements PaymentStrategy {
    private String emailAddress;

    public PayPalPayment(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void pay(double payment) {
        System.out.println("Paid " + payment + " using PayPal account " + emailAddress);
    }
}