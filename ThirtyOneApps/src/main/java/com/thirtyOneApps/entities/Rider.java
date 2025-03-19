package com.thirtyOneApps.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rider")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double rating;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

}
