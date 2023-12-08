package org.howard.edu.lsp.finalexam.problem52;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(double payment) {
        paymentStrategy.pay(payment);
    }
}

