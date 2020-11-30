package com.bootjpa.test.entity;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@Table(name = "TEST_TABLE", schema = "testdb")
public class TestTableDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "AGE")
    private int age;

    @Column(name = "TEL")
    private String tel;
}
