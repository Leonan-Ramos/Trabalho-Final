
public class LocalizaçãoLocadora {

	private String endereço;
	private String bairro;
	private String cidade;
	private String estado;
	
	LocalizaçãoLocadora (String endereço, String bairro, String cidade, String estado){
		this.endereço = endereço;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
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
