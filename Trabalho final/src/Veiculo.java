
public class Veiculo {

	private int codigo;
	private String marca;
	private String modelo;
	private int ano;
	private String acessorios;
	private String valor;
	private String categoria;

	Veiculo(int codigo, String marca, String modelo, int ano, String acessorios, String valor, String categoria) {
		this.codigo = codigo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.acessorios = acessorios;
		this.valor = valor;
		this.categoria = categoria;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int código) {
		this.codigo = código;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(String acessorios) {
		this.acessorios = acessorios;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
