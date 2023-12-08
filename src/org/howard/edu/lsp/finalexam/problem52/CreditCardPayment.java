package org.howard.edu.lsp.finalexam.problem52;

public class CreditCardPayment implements PaymentStrategy {
    private String creditCardNumber;

    public CreditCardPayment(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void pay(double payment) {
        System.out.println("Paid " + payment + " using credit card " + creditCardNumber);
    }
}
