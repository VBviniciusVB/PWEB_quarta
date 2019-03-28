package br.unisul.pweb.quarta.services;

import java.text.ParseException;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.unisul.pweb.quarta.domain.Categoria;
import br.unisul.pweb.quarta.domain.Cidade;
import br.unisul.pweb.quarta.domain.Estado;
import br.unisul.pweb.quarta.domain.Produto;
import br.unisul.pweb.quarta.repository.CategoriaRepository;
import br.unisul.pweb.quarta.repository.CidadeRepository;
import br.unisul.pweb.quarta.repository.EstadoRepository;
import br.unisul.pweb.quarta.repository.ProdutoRepository;



@Service
public class DbService {

		@Autowired
		private CategoriaRepository catRep;
		
		@Autowired
		private EstadoRepository estRep;
		
		@Autowired
		private ProdutoRepository prodRep;
		
		@Autowired
		private CidadeRepository cidRep;
		
		public void inicializaBancoDeDados() throws ParseException {
			
			Categoria cat1 = new Categoria(null, "Informática");
			Categoria cat2 = new Categoria(null, "Escritório");
			Categoria cat3 = new Categoria(null, "Cama mesa e banho");
			Categoria cat4 = new Categoria(null, "Eletrônicos");
			Categoria cat5 = new Categoria(null, "Jardinagem");
			Categoria cat6 = new Categoria(null, "Decoração");
			Categoria cat7 = new Categoria(null, "Perfumaria");
			
			Produto p1 = new Produto(null, "Computador", 2000.00);
			Produto p2 = new Produto(null, "Impressora", 800.00);
			Produto p3 = new Produto(null, "Mouse", 80.00);
			
			p1.getCategorias().addAll(Arrays.asList(cat1));
			p2.getCategorias().addAll(Arrays.asList(cat1,cat2));
			p3.getCategorias().addAll(Arrays.asList(cat1));
			
			cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
			cat2.getProdutos().addAll(Arrays.asList(p2));
			
			catRep.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7));
			prodRep.saveAll(Arrays.asList(p1,p2,p3));
			
			
			Estado e1 = new Estado(null, "Paraná");
			Estado e2 = new Estado(null, "Santa Catarina");
			Estado e3 = new Estado(null, "Rio Grande do Sul");
			
			Cidade c1 = new Cidade(null, "Curitiba", e1);
			Cidade c2 = new Cidade(null, "Tubarão", e2);
			Cidade c3 = new Cidade(null, "Gravatal", e2);
			Cidade c4 = new Cidade(null, "Laguna", e2);
			Cidade c5 = new Cidade(null, "Porto Alegre", e3);
			Cidade c6 = new Cidade(null, "Guaíba", e3);
			
			e1.getCidades().addAll(Arrays.asList(c1));
			e2.getCidades().addAll(Arrays.asList(c2, c3, c4));
			e3.getCidades().addAll(Arrays.asList(c5, c6));
			
			estRep.saveAll(Arrays.asList(e1,e2,e3));
			cidRep.saveAll(Arrays.asList(c1,c2,c3,c4,c5,c6));
			
			
			
		}

}