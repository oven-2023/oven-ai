package com.oven.crawling.domain;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "work_id")
    private Long id;

    private String titleKr;

    private String titleEng;

    private int year;

    private String rating;  // 관람연령등급


    private String director;

    private String actor;

    @Column(length = 10000)
    private String summary;

    private String poster;

    @Builder.Default
    @OneToMany(mappedBy = "work")
    private List<WorkProvider> providerList = new ArrayList<>();

    @Embedded
    private Genre genre;

    // private int runningTime;

    // private String nation;

    //    private String trailer;

    // private Boolean isMovie;    // false -> TV
}
