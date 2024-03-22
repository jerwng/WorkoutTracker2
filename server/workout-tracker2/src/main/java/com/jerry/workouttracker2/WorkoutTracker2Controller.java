package com.jerry.workouttracker2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WorkoutTracker2Controller {
    @GetMapping
    public String hello() {
        return "Hello";
    }
}
