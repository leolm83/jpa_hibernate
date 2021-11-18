package jpa_hibernate.usando_hibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import jpa_hibernate.dao.CategoriaDAO;
import jpa_hibernate.dao.ProdutoDAO;
import jpa_hibernate.enums.Categoria;
import jpa_hibernate.modelo.Produto;
import jpa_hibernate.util.JPAutil;

public class CadastrarProduto {
	 public static void main(String[] args) {
		
		EntityManager em = JPAutil.getEntityManager();
		CategoriaDAO categoriaDAO = new CategoriaDAO(em);
		Categoria celulares = new Categoria("CELULARES");
		Produto celular = new Produto("Xiaomi M1","Top de Linha",new BigDecimal("800"),celulares);
		
		ProdutoDAO produtoDAO = new ProdutoDAO(em);
		
		em.getTransaction().begin();
		categoriaDAO.cadastrar(celulares);
		produtoDAO.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
			
	 }
}
