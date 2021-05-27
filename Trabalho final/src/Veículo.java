
public class Veículo {

	private int código;
	private String marca;
	private String modelo;
	private int ano;
	private String acessórios;
	private String valor;
	private String categoria;
	
	Veículo(int código, String marca, String modelo, int ano, String acessórios, String valor, String categoria){
		this.código = código;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.acessórios = acessórios;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	
	public int getCódigo() {
		return código;
	}
	public void setCódigo(int código) {
		this.código = código;
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
	public String getAcessórios() {
		return acessórios;
	}
	public void setAcessórios(String acessórios) {
		this.acessórios = acessórios;
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
