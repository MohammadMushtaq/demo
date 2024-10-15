package org.example;

import java.math.BigDecimal;

public class simpleinterestBigDecimal {

    BigDecimal principal;
    BigDecimal interest;

    public simpleinterestBigDecimal(String principal, String interest) {
        this.principal = new BigDecimal(principal);
        this.interest = new BigDecimal(interest).divide(new BigDecimal("100"));

    }

    public static void main(String[] args) {

        simpleinterestBigDecimal simpleinterestBigDecimal = new simpleinterestBigDecimal("500000", "7.2");

        BigDecimal total = simpleinterestBigDecimal.calculateInterest(1);

        System.out.println(total);

    }

    public BigDecimal calculateInterest(int noOfYears) {

        BigDecimal total = principal.add(principal.multiply(interest).multiply(BigDecimal.valueOf(noOfYears)));

        return total;
    }


}
