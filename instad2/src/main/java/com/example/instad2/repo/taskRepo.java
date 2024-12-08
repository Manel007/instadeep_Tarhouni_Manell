package com.example.instad2.repo;

import com.example.instad2.Entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface taskRepo extends JpaRepository<Task,Long> {

  //  List<Task> findByCategAndPriority(String category, int capaciteBloc);
}
