package jpa_hibernate.dao;

import javax.persistence.EntityManager;

import jpa_hibernate.modelo.Produto;

public class ProdutoDAO {
	private EntityManager em;
	
	public ProdutoDAO(EntityManager em) {
		this.em = em;
	}
	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}

}
