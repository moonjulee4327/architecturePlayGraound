package com.architecturePlayGraound.todo.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Todo {
    private Long id;
    private String title;
    private boolean completed;
}
