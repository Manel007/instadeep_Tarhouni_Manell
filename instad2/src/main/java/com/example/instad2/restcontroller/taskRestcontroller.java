package com.example.instad2.restcontroller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.instad2.service.itaskservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.instad2.Entity.Task;
@RestController
@AllArgsConstructor
public class taskRestcontroller {

    @Autowired
    itaskservice itaskservice;


    @PostMapping("/addTask")
    public Task addTask(@RequestBody Task t) {
        return itaskservice.addTask(t);
    }
}
