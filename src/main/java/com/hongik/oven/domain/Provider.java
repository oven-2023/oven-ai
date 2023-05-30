package com.hongik.oven.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Provider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provider_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "provider")
    private List<WorkProvider> workList = new ArrayList<>();

}
