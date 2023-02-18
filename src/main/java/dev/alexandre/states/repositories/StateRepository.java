package dev.alexandre.states.repositories;

import dev.alexandre.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
