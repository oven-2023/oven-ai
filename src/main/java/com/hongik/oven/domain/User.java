package com.hongik.oven.domain;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String userName;

    private String nickname;

    private String password;

//    @OneToMany(mappedBy = "user")
//    private List<RatingWork> ratingWorkList = new ArrayList<>();
//
//    @OneToMany(mappedBy = "user")
//    private List<InterestingWork> interestingWorkList = new ArrayList<>();

    @Builder
    public User(Long id, String userName, String nickname, String password) {
        this.id = id;
        this.userName = userName;
        this.nickname = nickname;
        this.password = password;
    }

}
