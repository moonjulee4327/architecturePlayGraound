package com.architecturePlayGraound.todo.application.port.out;

import com.architecturePlayGraound.todo.domain.entity.Todo;

public interface AddTodoPort {
    Long save(Todo todo);
}
