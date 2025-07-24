package com.architecturePlayGraound.todo.adapter.in.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AddTodoDto {
    private final String title;
}
