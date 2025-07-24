package com.architecturePlayGraound.todo.application.port.in;

import com.architecturePlayGraound.todo.application.command.AddTodoCommand;

public interface AddTodoUseCase {
    Long addTodo(AddTodoCommand command);
}
