package com.example.projetoSpring.controller;

import com.example.projetoSpring.models.Livros;
import com.example.projetoSpring.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class LivrosController {

    @Autowired
    LivroRepository livroRepository;

    @ResponseBody
    @GetMapping("/livros")
    public List<Livros> listarLivros(){
        return  livroRepository.findAll();
    }
    @ResponseBody
    @GetMapping("/livros/{id}")
    public Optional<Livros> listarLivroId(@PathVariable Long id){
        return  livroRepository.findById(id);
    }

    @ResponseBody
    @PostMapping("/salvar")
    public String salvarLivro(@RequestBody Livros livros){
        livroRepository.save(livros);
        return "Livro adicionado!";
    }
    @ResponseBody
    @PutMapping("/editar/{id}")
    public String atualizarLivro(@PathVariable Long id,@RequestBody Livros livros){
        Livros update= livroRepository.findById(id).get();

        update.setAutor(livros.getAutor());
        update.setNome(livros.getNome());
        update.setCod_iso(livros.getCod_iso());
        update.setDt_lancamento(livros.getDt_lancamento());

        livroRepository.save(update);
        return "Livro atualizado";
    }
    @ResponseBody
    @DeleteMapping("/excluir/{id}")
    public  String deletarLivro(@PathVariable Long id){
        livroRepository.deleteById(id);
        return "Livro deletado! ";
    }


}
