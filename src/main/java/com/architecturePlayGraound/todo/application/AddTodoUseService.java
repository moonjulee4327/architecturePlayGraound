package com.architecturePlayGraound.todo.application;

import com.architecturePlayGraound.todo.application.port.in.AddTodoUseCase;
import org.springframework.stereotype.Service;

@Service
public class AddTodoUseService implements AddTodoUseCase {
    @Override
    public Long addTodoUseCase(String title) {
        return null;
    }
}
