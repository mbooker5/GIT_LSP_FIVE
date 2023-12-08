package org.howard.edu.lsp.finalexam.problem52;

public class BitcoinPayment implements PaymentStrategy {
    private String bitcoinAddress;

    public BitcoinPayment(String bitcoinAddress) {
        this.bitcoinAddress = bitcoinAddress;
    }

    @Override
    public void pay(double payment) {
        System.out.println("Paid " + payment + " using Bitcoin address " + bitcoinAddress);
    }
}
