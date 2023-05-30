package com.hongik.oven.controller;

import com.hongik.oven.service.RatingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RatingContoller {

    private final RatingService ratingService;

    @GetMapping(value = "/writing")
    public void writing() {
        ratingService.writing();
    }

}
