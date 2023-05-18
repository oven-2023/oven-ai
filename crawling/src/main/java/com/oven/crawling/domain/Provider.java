package com.oven.crawling.domain;

import lombok.Getter;

import javax.persistence.*;
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
