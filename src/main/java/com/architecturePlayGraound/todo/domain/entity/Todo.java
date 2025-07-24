package com.architecturePlayGraound.todo.domain.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Getter
public class Todo {
    private Long id;
    private String title;
    private boolean completed = false;

    public Todo(String title) {
        this.title = title;
        this.completed = false;
    }
}
