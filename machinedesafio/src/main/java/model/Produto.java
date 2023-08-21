package model;

@Entity
@Table(name = "produto")
public class Produto {
	private Integer id;
	private String nome;
	private Float preco;
	private String codBarras;
	private String dataCadastro;
	
	public Produto(Integer id, String nome, Float preco, String codBarras, String dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.codBarras = codBarras;
		this.dataCadastro = dataCadastro;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public String getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	
	
}
