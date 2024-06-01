package com.projeto_estoque.serviceIplements;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto_estoque.Repository.ProdutoRepository;
import com.projeto_estoque.estoqueprojeto.entities.DemoApplication.Produto;
import com.projeto_estoque.service.ProdutoService;

@Service
public class ServiceIplements implements ProdutoService {

	@Autowired
	private ProdutoRepository empRepo;

	@Override
	public List<Produto> getAllProduto() {
		return empRepo.findAll();
	}

	@Override
	public void save(Produto produto) {
		empRepo.save(produto);
	}

	@Override
	public Produto getById(Long id) {
		Optional<Produto> optional = empRepo.findById(id);
		Produto produto = null;
		if (optional.isPresent())
			produto = optional.get();
		else
			throw new RuntimeException("Produto not found for id : " + id);
		return produto;
	}

	@Override
	public void deleteViaId(long id) {
		empRepo.deleteById(id);
	}

}
