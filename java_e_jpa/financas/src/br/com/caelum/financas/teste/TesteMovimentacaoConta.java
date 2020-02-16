package br.com.caelum.financas.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.caelum.financas.modelo.Conta;
import br.com.caelum.financas.util.JPAUtil;

public class TesteMovimentacaoConta {

	public static void main(String[] args) {

		EntityManager manager = new JPAUtil().getEntityManager();

		// essa query se comparta como lazy
		//Query query = manager.createQuery("select c from Conta c");
		
		//pção mais "certeira" seria tratar especificamente esse relacionamento
		// como se tivesse um comportamento Eager (ansioso).
		// Para esse fim temos o join fetch
		Query query = manager.createQuery("select distinct c from Conta c join fetch c.movimentacoes");

		List<Conta> contas = query.getResultList();
		
		for (Conta conta : contas) {
            System.out.println("Número de movimentações ...: " + conta.getMovimentacoes().size());
        }
	}
}
