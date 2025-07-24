package com.architecturePlayGraound.todo.adapter.in.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AddTodoResponse {
    private Long id;
    private String title;
    private boolean completed;
}
