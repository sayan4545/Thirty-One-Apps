package com.thirtyOneApps.entities;


import com.thirtyOneApps.entities.enums.Roles;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "userTable")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ElementCollection(fetch = FetchType.LAZY)
    @Enumerated(EnumType.STRING)
    private Set<Roles> userRole;
}
