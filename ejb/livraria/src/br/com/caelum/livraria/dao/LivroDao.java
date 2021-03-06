package br.com.caelum.livraria.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebResult;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.com.caelum.livraria.modelo.Livro;

@Stateless
//@Interceptors({LogInterceptador.class})
public class LivroDao {

	@PersistenceContext
    private EntityManager em;
	
	public void salva(Livro livro) {
		em.persist(livro);
	}
	
	public List<Livro> todosLivros() {
		return em.createQuery("select l from Livro l", Livro.class)
                .getResultList();
	}

	@WebResult(name = "autores")
	public List<Livro> livrosPeloTitulo(String titulo) {
        TypedQuery<Livro> query = this.em
                .createQuery(
                        "select l from Livro l where l.titulo like :pTitulo",
                        Livro.class);
        query.setParameter("pTitulo", "%" + titulo + "%");
        return query.getResultList();
    }
	
}
