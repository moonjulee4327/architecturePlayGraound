package com.architecturePlayGraound.todo.application.port.out;

import com.architecturePlayGraound.todo.domain.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository {
    Long save(Todo todo);
}
