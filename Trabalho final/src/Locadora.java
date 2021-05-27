
public class Locadora {

	private String nome;
	private String CNPJ;
	private String telefone;
	private Veículo veiculo;
	private LocalizaçãoLocadora localização;
	
	
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

	public Veículo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veículo veiculo) {
		this.veiculo = veiculo;
	}

	public LocalizaçãoLocadora getLocalização() {
		return localização;
	}

	public void setLocalização(LocalizaçãoLocadora localização) {
		this.localização = localização;
	}
}
