
public class Locadora {

	private String nome;
	private String CNPJ;
	private String telefone;
	private Veiculo veiculo;
	private LocalizacaoLocadora localizacao;
	
	
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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public LocalizacaoLocadora getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(LocalizacaoLocadora localizacao) {
		this.localizacao = localizacao;
	}
}
