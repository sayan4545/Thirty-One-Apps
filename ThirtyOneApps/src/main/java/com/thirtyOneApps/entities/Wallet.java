package com.thirtyOneApps.entities;

import jakarta.persistence.*;
import org.apache.logging.log4j.util.Lazy;

import java.util.Set;

@Entity
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    private Double balance;

    @OneToMany(mappedBy = "wallet")
    private Set<WalletTransactions> transactions;



}
