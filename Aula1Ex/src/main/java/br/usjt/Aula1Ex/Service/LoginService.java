package br.usjt.Aula1Ex.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.Aula1Ex.model.Usuario;
import br.usjt.Aula1Ex.repository.UsuarioRepository;

@Service
public class LoginService {
	
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar (Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(), usuario.getSenha()) != null;
	}
}