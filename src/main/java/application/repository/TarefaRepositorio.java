package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.model.Tarefa;

public interface TarefaRepositorio extends JpaRepository<Tarefa, Long> {
    
}
