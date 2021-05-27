
public class Usuario extends Pessoa {
	
	private String email;
	
	Usuario(String nome, String Cpf, String email){
		super (nome, Cpf);
		this.setEmail(email);
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}	
}
