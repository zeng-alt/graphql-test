package com.zjj.graphqltest.domain;

import jakarta.persistence.*;
import lombok.Data;

/**
 * @author zengJiaJun
 * @version 1.0
 * @crateTime 2024年11月08日 21:30
 */
@Data
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String password;
    private String phone;

    @OneToOne(orphanRemoval = true)
    @JoinColumn(name = "address_id")
    private Address address;

}
