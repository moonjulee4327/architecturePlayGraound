package com.architecturePlayGraound.todo.adapter.out;

import com.architecturePlayGraound.todo.adapter.out.entity.TodoEntity;
import com.architecturePlayGraound.todo.adapter.out.repository.TodoJpaRepository;
import com.architecturePlayGraound.todo.application.port.out.AddTodoPort;
import com.architecturePlayGraound.todo.domain.entity.Todo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class AddTodoJpaAdapter implements AddTodoPort {
    private final TodoJpaRepository jpaRepository;

    @Override
    public Long save(Todo todo) {
        TodoEntity entity = new TodoEntity(todo.getId(), todo.getTitle(), todo.isCompleted());
        jpaRepository.save(entity);
        return entity.getId();
    }
}
