package com.projeto_estoque.service;

import java.util.List;
import com.projeto_estoque.estoqueprojeto.entities.DemoApplication.Produto;

public interface ProdutoService {
	
	    List<Produto> getAllProduto();
	    void save(Produto produto);
	    Produto getById(Long id);
	    void deleteViaId(long id);
}

