package com.example.instad2.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name="Task")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Task {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idtask ;
    @Column(name="title")
    private String title ;

    @Column(name="due_date")
    private Date due_date ;

    @Column(name="description")
    private String description ;
    @Column(name="priority")
    private String priority ;


}
