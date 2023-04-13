package com.example.springbootrnd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by Md. Liton Miah
 * Created on April 12, 2023 at 9:00 AM
 */

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private String operatorName;

    @Column(nullable = false, unique = true, length = 14)
    private String contactNumber;

    @Column(nullable = false, length = 15)
    private String packageName;

    @Column(nullable = false, length = 10)
    private String simType;

    /*@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;*/
}
