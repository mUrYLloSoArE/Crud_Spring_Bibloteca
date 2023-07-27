package com.example.projetoSpring.models;

import jakarta.persistence.*;

@Entity
@Table(name="livros")
public class Livros {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private  Long id;

    @Column(name = "nome")
    private String nome;
    @Column(name = "autor")
    private String autor;

    @Column(name = "dt_lancamento")
    private String dt_lancamento;
    @Column(name = "cod_iso")
    private String cod_iso;

    public Livros() {
    }

    public Livros(Long id, String nome, String autor, String dt_lancamento, String cod_iso) {
        this.id = id;
        this.nome = nome;
        this.autor = autor;
        this.dt_lancamento = dt_lancamento;
        this.cod_iso = cod_iso;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDt_lancamento() {
        return dt_lancamento;
    }

    public void setDt_lancamento(String dt_lancamento) {
        this.dt_lancamento = dt_lancamento;
    }

    public String getCod_iso() {
        return cod_iso;
    }

    public void setCod_iso(String cod_iso) {
        this.cod_iso = cod_iso;
    }
}
