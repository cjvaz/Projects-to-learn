package br.com.caelum.livraria.webservice;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;

import br.com.caelum.livraria.dao.LivroDao;
import br.com.caelum.livraria.modelo.Livro;

@WebService
@Stateless
public class LivrariaWS {

	@Inject
    LivroDao dao;
	
	public List<Livro> getLivrosPorTitulo(String titulo) {
        System.out.println("[LivrariaWS] Procurando pelo titulo " + titulo);
        return dao.livrosPeloTitulo(titulo);
    }
	
}
