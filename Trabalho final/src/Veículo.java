
public class Ve�culo {

	private int c�digo;
	private String marca;
	private String modelo;
	private int ano;
	private String acess�rios;
	private String valor;
	private String categoria;
	
	Ve�culo(int c�digo, String marca, String modelo, int ano, String acess�rios, String valor, String categoria){
		this.c�digo = c�digo;
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.acess�rios = acess�rios;
		this.valor = valor;
		this.categoria = categoria;
	}
	
	
	public int getC�digo() {
		return c�digo;
	}
	public void setC�digo(int c�digo) {
		this.c�digo = c�digo;
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
	public String getAcess�rios() {
		return acess�rios;
	}
	public void setAcess�rios(String acess�rios) {
		this.acess�rios = acess�rios;
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
