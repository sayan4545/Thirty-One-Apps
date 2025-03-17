package com.thirtyOneApps.entities;


import com.thirtyOneApps.entities.enums.TransactionMethods;
import com.thirtyOneApps.entities.enums.TransactionType;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
public class WalletTransactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double amount;

    private TransactionMethods transactionMethods;

    private TransactionType transactionType;

    @OneToOne
    private Ride ride;

    @ManyToOne
    private Wallet wallet;

    private String transactionId;

    @CreationTimestamp
    private LocalDateTime timestamp;


}
