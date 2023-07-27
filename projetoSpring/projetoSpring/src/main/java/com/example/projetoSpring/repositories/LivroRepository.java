package com.example.projetoSpring.repositories;

import com.example.projetoSpring.models.Livros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository  extends JpaRepository<Livros,Long> {
}
