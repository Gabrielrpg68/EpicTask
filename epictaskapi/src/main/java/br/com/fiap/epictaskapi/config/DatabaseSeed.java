package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.model.User;
import br.com.fiap.epictaskapi.repository.TaskRepository;
import br.com.fiap.epictaskapi.repository.UserRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner {

    @Autowired
    TaskRepository repository;
    @Autowired
    UserRepository repository2;

    @Override
    public void run(String... args) throws Exception {

        repository.saveAll(List.of(
            new Task("Modelar BD", "modelar tabelas do banco", 150),
            new Task("Prototipo", "prototipar as telas", 250),
            new Task("Bug", "corrigir erro da API", 50)
        ));

        repository2.saveAll(List.of(
            new User("Gabriel", "gabrielrpg68@gmail.com")
        ));
    }
    
}
