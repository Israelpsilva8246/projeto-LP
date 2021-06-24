package ProjetoAyla;

import java.util.ArrayList;

public class AdocaoGUI {
	public static void main(String[] args) {
		
		SisControleAdocao sisControleAdocao = new SisControleAdocao(new ArrayList<Animal>(), new ArrayList<Usuario>());
	
		Animal adotarAnimal = new Animal("bob", "M", "indefinida", "cachorro");
		
		Animal adotarAnimal2 = new Animal("mia", "F", "siames", "gato");
		
		sisControleAdocao.cadastrarAnimal(adotarAnimal);
		sisControleAdocao.cadastrarAnimal(adotarAnimal2);

		sisControleAdocao.cadastrarUsuario("Israel", "5555", "M");
		
		if(sisControleAdocao.usuarioCadastrado("555")) {
			System.out.println("Usuário cadastrado com sucesso");
		}else {
			System.out.println("Problema no Cadastro");
		}
		
		System.out.println(sisControleAdocao.mostrarListaDeAnimaisDisponiveis());
	}
}
