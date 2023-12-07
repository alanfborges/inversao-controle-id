package com.alandev.services;

public class BrazilTaxService extends TaxServices {

    @Override
    public double tax(double amount) {
        return amount * 0.3;
    }
}
