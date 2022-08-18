package br.com.fiap.epictaskapi.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.fiap.epictaskapi.model.Task;
import br.com.fiap.epictaskapi.repository.TaskRepository;

@Configuration
public class DatabaseSeed implements CommandLineRunner{

    @Autowired
    TaskRepository repository;


    @Override
    public void run(String... args) throws Exception {
        Task t1 = new Task("MOdelar BD","modelar tabelas",150);
        Task t2 = new Task("Prototipo","Prototipar tabelas",50);
        Task t3 = new Task("Bug","Corrigir tabelas",30);
        
        repository.saveAll(List.of(t1, t2, t3));
    }
    
}
