
public class Locadora {

	private String nome;
	private String CNPJ;
	private String telefone;
	private Ve�culo veiculo;
	private Localiza��oLocadora localiza��o;
	
	
	Locadora (String nome, String CNPJ, String telefone){
		this.nome = nome;
		this.CNPJ = CNPJ;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Ve�culo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Ve�culo veiculo) {
		this.veiculo = veiculo;
	}

	public Localiza��oLocadora getLocaliza��o() {
		return localiza��o;
	}

	public void setLocaliza��o(Localiza��oLocadora localiza��o) {
		this.localiza��o = localiza��o;
	}
}
