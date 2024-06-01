package com.projeto_estoque.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.projeto_estoque.estoqueprojeto.entities.DemoApplication.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}