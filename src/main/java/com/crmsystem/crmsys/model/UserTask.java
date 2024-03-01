package com.crmsystem.crmsys.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class UserTask {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameTask;
    private String typeOfTask;
    // many to many wykonawca - User
    private String description;
    private LocalDateTime dateTime;
}
