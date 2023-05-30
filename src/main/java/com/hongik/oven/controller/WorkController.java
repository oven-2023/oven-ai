package com.hongik.oven.controller;


import com.hongik.oven.service.WorkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class WorkController {

    private final WorkService workService;

    @GetMapping(value = "/crawling")
    public void crawling() {
        workService.saveWork();
    }

}
