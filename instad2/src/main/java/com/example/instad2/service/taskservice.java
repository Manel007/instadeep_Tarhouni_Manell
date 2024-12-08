package com.example.instad2.service;
import com.example.instad2.Entity.Task;
import com.example.instad2.repo.taskRepo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class taskservice implements itaskservice{
    @Autowired
   taskRepo taskRepo;
    @Override
    public Task addTask(Task t) {
        return taskRepo.save(t); //on ajoute une ligne
    }
    @Override
    public Task editTask(Task b) {
        return taskRepo.save(b); //pour faire la modification
    }

    @Override
    public void delete(Task b) {
        taskRepo.delete(b);

    }



}
