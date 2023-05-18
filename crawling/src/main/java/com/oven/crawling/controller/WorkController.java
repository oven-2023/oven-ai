package com.oven.crawling.controller;

import com.oven.crawling.Service.WorkService;
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
