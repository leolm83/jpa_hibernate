package jpa_hibernate.dao;

import javax.persistence.EntityManager;

import jpa_hibernate.enums.Categoria;

public class CategoriaDAO {

		private EntityManager em;
		
		public CategoriaDAO(EntityManager em) {
			this.em = em;
		}
		public void cadastrar(Categoria categoria) {
			this.em.persist(categoria);
		}

	}
