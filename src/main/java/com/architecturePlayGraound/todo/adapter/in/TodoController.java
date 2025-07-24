package com.architecturePlayGraound.todo.adapter.in;

import com.architecturePlayGraound.todo.adapter.in.dto.AddTodoDto;
import com.architecturePlayGraound.todo.application.command.AddTodoCommand;
import com.architecturePlayGraound.todo.application.port.in.AddTodoUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequiredArgsConstructor
@RequestMapping("/todos")
public class TodoController {
    private final AddTodoUseCase addTodoUseCase;

    @PostMapping
    public ResponseEntity<?> addTodo(@RequestBody AddTodoDto addTodoDto) {
        AddTodoCommand command = new AddTodoCommand(addTodoDto.getTitle());
        Long id = addTodoUseCase.addTodo(command);
        return ResponseEntity.created(URI.create("/todo/" + id)).build();
    }
}
