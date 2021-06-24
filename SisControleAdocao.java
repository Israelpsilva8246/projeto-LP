package ProjetoAyla;

import java.util.ArrayList;
import java.util.List;

public class SisControleAdocao implements SistemaAdocao{
	
	private List<Usuario> usuarios;
	private List<Animal> animais;
	private List<Adotados> adotados;

	public SisControleAdocao() {
		
	}

	public SisControleAdocao(List<Animal> animais, List<Usuario> usuarios) {
		super();
		this.animais = animais;
		this.usuarios = usuarios;
	}
	
	public boolean usuarioCadastrado(String cpf) {
		for(Usuario u : usuarios) {
			if(u.getCpf().equals(cpf)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void cadastrarUsuario(String nome, String cpf, String sexo) {
		if(!usuarioCadastrado(cpf)) {
			Usuario usuario = new Usuario(nome, cpf, sexo);
			this.usuarios.add(usuario);
		}
	}

	@Override
	public List<Animal> mostrarListaDeAnimaisDisponiveis() {
		List<Animal> mostrarAnimais = new ArrayList<Animal>();
		for(Animal a : this.animais) {
			mostrarAnimais.add(a);
		}
		return mostrarAnimais;
	}

	@Override
	public List<Usuario> pesquisarAnimaisDoCliente(String cpf) {
		List<Usuario> animaisAdotados = new ArrayList<Usuario>();
		for(Usuario u : this.usuarios) {
			if(u.getCpf().equals(cpf)) {
				animaisAdotados.add(u.get);
			}
		}

		return null;
	}

	@Override
	public void adotarAnimal(String nome, String sexo, String raca, String tipoAnimal) {
		
	}

	@Override
	public void cadastrarAnimal(Animal cadastraAnimal) {
		this.animais.add(cadastraAnimal);
	}
	
	
}
