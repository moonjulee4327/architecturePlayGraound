package com.architecturePlayGraound.todo.application.command;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class AddTodoCommand {
    private final String title;
}
