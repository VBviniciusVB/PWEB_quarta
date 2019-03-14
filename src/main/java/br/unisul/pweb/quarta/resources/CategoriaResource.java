package br.unisul.pweb.quarta.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.unisul.pweb.quarta.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar(){
		List<Categoria> lista = new ArrayList<Categoria>();
		lista.add(new Categoria(1, "Informática"));
		lista.add(new Categoria(2, "Camping"));
		lista.add(new Categoria(3, "Automobilística"));
		lista.add(new Categoria(4, "Lazer"));
		return lista;
	}

}