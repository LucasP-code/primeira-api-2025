package application.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {
    // Criando um conjunto de dados
    private List<String> frutas = Arrays.asList(...a:"Maçã", "Uva", "Banana");

    @GetMapping
    public List<String> home() {
        return frutas;
    }
}