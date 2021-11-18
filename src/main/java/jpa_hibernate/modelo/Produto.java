package jpa_hibernate.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jpa_hibernate.enums.Categoria;

//o hibernate por padrao consegue encontrar as classes porem na JPA é necessario incluir uma tag <class>NomeDaClasse</class>
@Entity
@Table(name="produtos")//informa a JPA que o nome da tabela é diferente do nome da classe
public class Produto {
	@Id//deve se explicitar qual é a primary key!!!
	@GeneratedValue(strategy=GenerationType.IDENTITY)//indica a JPA que o valor é gerado pelo BD
	private Long id;//a strategy costuma ter diferencas entre os bancos que possuem ou nao sequence,no case se possuirem sequence provavelmente se utilizará o GenerationType.SEQUENCE
	
	private String nome;
	@Column(name="descricao_produto")//informa a JPA que o nome da coluna é diferente do nome do atributo
	private String descricao;
	
	private BigDecimal preco;
	@Column(name="data_cadastro")
	private LocalDate dataCadastro =LocalDate.now();
	@Enumerated(EnumType.STRING)//usa o valor em string da Enum
	private Categoria categoria;
	
	public Produto(String nome, String descricao, BigDecimal preco, Categoria categoria) {
		super();
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
}
