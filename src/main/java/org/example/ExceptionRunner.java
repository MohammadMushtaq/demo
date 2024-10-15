package org.example;

class Currency {

    public String currencyType;
    public int amount;

    public Currency(String currencyType, int amount) {
        this.currencyType = currencyType;
        this.amount = amount;
    }


    @Override
    public String toString() {
        return "Currency{" +
                "currency='" + currencyType + '\'' +
                ", type='" + amount + '\'' +
                '}';
    }

    public void add(Currency that) {

        if (!this.currencyType.equals(that.currencyType)) {
            // throw new Exception("currenct do not match " + this.currencyType + " & " + that.currencyType);
            throw new CurrencyDonotException("currenct do not match " + this.currencyType + " & " + that.currencyType);

        }
        this.amount = this.amount + that.amount;
//Checked Expection are need to handle in try catch or throws exception the caller of the method need to handle ex:InterruptedException
//UnChecked Exception are need to handle or throws are called runtime exception ex:indexoutofbound
    }
}

class CurrencyDonotException extends RuntimeException {

    public CurrencyDonotException(String msg) {
        super(msg);
    }
}

public class ExceptionRunner {

    public static void main(String[] args) {

        Currency amount = new Currency("USD", 10);
        Currency amount1 = new Currency("EUR", 20);
        amount.add(amount1);
        System.out.println(amount);
    }
}
