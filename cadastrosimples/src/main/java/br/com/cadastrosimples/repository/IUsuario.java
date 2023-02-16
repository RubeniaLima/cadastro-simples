package br.com.cadastrosimples.repository;

import br.com.cadastrosimples.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuario extends JpaRepository<Usuario,Integer> {
}
