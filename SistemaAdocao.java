package ProjetoAyla;

import java.util.List;

public interface SistemaAdocao {

	public abstract void adotarAnimal(String nome, String sexo, String raca, String tipoAnimal);
	
	public abstract void cadastrarUsuario(String nome, String cpf, String sexo);
	
	public abstract List<Usuario> pesquisarAnimaisDoCliente(String cpf);
	
	public abstract List<Animal> mostrarListaDeAnimaisDisponiveis();

	void cadastrarAnimal(Animal cadastraAnimal);
}
