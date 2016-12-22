package br.com.caelum.financas.teste;

import javax.persistence.EntityManager;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteEstadosJPA {

	public static void main(String[] args) {
		
		EntityManager em = new JPAUtil().getEntityManager();

		em.getTransaction().begin();

		Conta conta = em.find(Conta.class, 1);
		
		// Já está em estado managed
		System.out.println("=====> ID:" + conta.getId() + "  Nome:" + conta.getTitular());

		//em.persist(conta);
		
		// como está no estado managed se alterar o objeto o estado dele
		// será sincronizado no banco de dados
		conta.setTitular("Pedro Ferreira");
		System.out.println("=====> ID:" + conta.getId() + "  Nome:" + conta.getTitular());

		em.getTransaction().commit();

		em.close();

	}

}
