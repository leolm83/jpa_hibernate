package jpa_hibernate.usando_hibernate;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import jpa_hibernate.modelo.Produto;

public class CadastrarProduto {
	 public static void main(String[] args) {
		Produto celular = new Produto();
		celular.setNome("Xiaomi M1");
		celular.setDescricao("Top de Linha");
		celular.setPreco(new BigDecimal("800"));
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory("loja");//o parametro é o atributo name da persistence-unit no arquivo persistence.xml
		EntityManager em = emfactory.createEntityManager();
		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}
}
