package br.com.caelum.livraria.dao;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.caelum.livraria.modelo.Autor;

@Stateless
public class AutorDao {

	@PersistenceContext
    private EntityManager em;

	@PostConstruct
	void aposCriacao() {
	    System.out.println("[INFO] AutorDao foi criado.");
	}
	
	public void salva(Autor autor) {

		System.out.println("[INFO] Salvando o Autor " + autor.getNome());

//	    try {
//	        Thread.sleep(20000);    // 20 segundos
//	    } catch (InterruptedException e) {
//	        e.printStackTrace();
//	    }
	    
		em.persist(autor);
		
		System.out.println("[INFO] Salvou o Autor " + autor.getNome());
	}
	
	public List<Autor> todosAutores() {
		return em.createQuery("select a from Autor a", Autor.class)
	            .getResultList();
	}

	public Autor buscaPelaId(Integer autorId) {
		Autor autor = this.em.find(Autor.class, autorId);
		return autor;
	}
	
}
