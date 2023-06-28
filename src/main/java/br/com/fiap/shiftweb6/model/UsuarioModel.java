package br.com.fiap.shiftweb6.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "SHIFT6_USUARIO")
public class UsuarioModel {

	@Id
	@Column(name="ID_USUARIO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="USUARIO_SEQ")
	@SequenceGenerator(name="USUARIO_SEQ", initialValue = 1, allocationSize = 1)
	private Long idUsuario;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="CPF")
	private String cpf;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="SENHA")
	private String senha;
	
	@Column(name="FOTO")
	private String foto;
	
	@Column(name="IDADE")
	private Long idade;
	
	
	public UsuarioModel() {
		super();
	}

	public UsuarioModel(String cpf, String email) {
		super();
		this.cpf = cpf;
		this.email = email;
	}

	public UsuarioModel(Long idUsuario, String cpf, String email) {
		super();
		this.idUsuario = idUsuario;
		this.cpf = cpf;
		this.email = email;
	}

	public UsuarioModel(Long idUsuario, String nome, String cpf, String email, String senha, String foto, Long idade) {
		super();
		this.idUsuario = idUsuario;
		this.nome = nome;
		this.cpf = cpf;
		this.email = email;
		this.senha = senha;
		this.foto = foto;
		this.idade = idade;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Long getIdade() {
		return idade;
	}

	public void setIdade(Long idade) {
		this.idade = idade;
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	@Override
	public String toString() {
		return "UsuarioModel [idUsuario=" + idUsuario + ", nome=" + nome + ", cpf=" + cpf + ", email=" + email
				+ ", senha=" + senha + ", foto=" + foto + ", idade=" + idade + "]";
	}

}
