package com.architecturePlayGraound.todo.adapter.out.repository;

import com.architecturePlayGraound.todo.adapter.out.entity.TodoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoJpaRepository extends JpaRepository<TodoEntity, Long> {
}
