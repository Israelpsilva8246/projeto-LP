package ProjetoAyla;

public class Animal {

	private String nome;
	private String sexo;
	private String raca;
	private String tipoAnimal;
	
	public Animal() {

	}

	public Animal(String nome, String sexo, String raca, String tipoAnimal) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.raca = raca;
		this.tipoAnimal = tipoAnimal;
	}

	@Override
	public String toString() {
		return "Animal [nome=" + nome + ", sexo=" + sexo + ", raca=" + raca + ", tipoAnimal=" + tipoAnimal + "]";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}

}
