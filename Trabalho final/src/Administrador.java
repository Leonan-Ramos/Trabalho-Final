
public class Administrador extends Pessoa {

	private int codAdm;
	private Locadora locadora;
	
	
	Administrador(String nome, String Cpf, int codAdm){
			super(nome, Cpf);
			this.setCodAdm(codAdm);
	}

	public int getCodAdm() {
		return codAdm;
	}

	public void setCodAdm(int codAdm) {
		this.codAdm = codAdm;
	}

	public Locadora getLocadora() {
		return locadora;
	}

	public void setLocadora(Locadora locadora) {
		this.locadora = locadora;
	}
}
