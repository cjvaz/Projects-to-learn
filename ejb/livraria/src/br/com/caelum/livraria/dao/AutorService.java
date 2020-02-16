package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorService {
	
	@Inject
    AutorDao dao;

    public void adiciona(Autor autor) {
        this.dao.salva(autor);
    }

    public List<Autor> todosAutores() {
        return this.dao.todosAutores();
    }
}
