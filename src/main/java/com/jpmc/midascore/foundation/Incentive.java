
// this mirrors JSON returned by /incentive
// spring will deserialize automatically

package com.jpmc.midascore.foundation;

public class Incentive {

    private double amount;

    public Incentive() {
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

