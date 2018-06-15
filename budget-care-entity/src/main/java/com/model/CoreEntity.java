package com.model;

import javax.persistence.*;

@MappedSuperclass
public class CoreEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected long id;

}
