package br.com.fiap.shiftweb6.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="SHIFT6_CATEGORIA")
public class CategoriaModel {
	
	@Id
	@Column(name="ID_CATEGORIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="CATEGORIA_SEQ")
	@SequenceGenerator(name="CATEGORIA_SEQ", initialValue = 1, allocationSize = 1)
	private Long idCategoria;
	
	@Column(name="NOME_CATEGORIA")
	private String nomeCategoria;
	
	@Column(name="ATIVO")
	private Boolean ativo;
	
	@OneToMany(mappedBy = "categoriaModel", fetch = FetchType.EAGER)
	private List<ProdutoModel> produtos;
	
	public CategoriaModel() {
		
	}
	

	public List<ProdutoModel> getProdutos() {
		return produtos;
	}



	public void setProdutos(List<ProdutoModel> produtos) {
		this.produtos = produtos;
	}



	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}

	public Boolean getAtivo() {
		return ativo;
	}

	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
}
