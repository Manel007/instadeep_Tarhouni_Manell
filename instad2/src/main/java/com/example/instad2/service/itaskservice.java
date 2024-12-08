package com.example.instad2.service;

import com.example.instad2.Entity.Task;

import java.util.List;

public interface itaskservice {
    Task addTask(Task t);

    Task editTask(Task b);

    void delete(Task b);

}
