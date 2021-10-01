package br.com.alura.forum.controller;

import br.com.alura.forum.model.Curso;
import br.com.alura.forum.model.Topico;
import org.springframework.stereotype.Controller;

import java.util.Arrays;
import java.util.List;

@Controller
public class TopicosController {

    public List<Topico> lista() {
        Topico topico = new Topico("Dúvida", "Duvida com Spring",  new Curso("Spring", "Programação"));

        return Arrays.asList(topico, topico, topico);
    }

}
