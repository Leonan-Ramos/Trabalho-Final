
public class Localiza��oLocadora {

	private String endere�o;
	private String bairro;
	private String cidade;
	private String estado;
	
	Localiza��oLocadora (String endere�o, String bairro, String cidade, String estado){
		this.endere�o = endere�o;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
}
