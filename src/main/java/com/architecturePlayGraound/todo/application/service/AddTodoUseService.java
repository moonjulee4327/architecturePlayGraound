package com.architecturePlayGraound.todo.application.service;

import com.architecturePlayGraound.todo.application.command.AddTodoCommand;
import com.architecturePlayGraound.todo.application.port.in.AddTodoUseCase;
import com.architecturePlayGraound.todo.application.port.out.AddTodoPort;
import com.architecturePlayGraound.todo.domain.entity.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class AddTodoUseService implements AddTodoUseCase {
    private final AddTodoPort addTodoPort;

    @Transactional
    @Override
    public Long addTodo(AddTodoCommand command) {
        Todo todo = new Todo(command.getTitle());
        return addTodoPort.save(todo);
    }
}
