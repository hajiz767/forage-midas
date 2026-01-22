package com.jpmc.midascore.entity;

import jakarta.persistence.*;
import com.jpmc.midascore.entity.UserRecord;

@Entity
public class TransactionRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double amount;

    @ManyToOne
    private UserRecord sender;

    @ManyToOne
    private UserRecord recipient;

    private double incentive;

    public TransactionRecord() {}

    public TransactionRecord(double amount, double incentive, UserRecord sender, UserRecord recipient) {
        this.amount = amount;
        this.incentive = incentive;
        this.sender = sender;
        this.recipient = recipient;
    }


    public double getAmount() {
        return amount;
    }

    public UserRecord getSender() {
        return sender;
    }

    public UserRecord getRecipient() {
        return recipient;
    }
    public double getIncentive() {
        return incentive;
    }

}
