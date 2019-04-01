package br.usjt.Aula1Ex.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Aula1Ex.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);

}