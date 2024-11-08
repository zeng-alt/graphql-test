package com.zjj.graphqltest.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * @author zengJiaJun
 * @version 1.0
 * @crateTime 2024年11月08日 21:31
 */
@Data
@Entity
@Table(name = "address")
public class Address {

    @Id
    @GeneratedValue
    private Long id;


    private String country;

    private String province;

    private String city;

}
