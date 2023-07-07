package projeto1.server.projeto1.repository;

import projeto1.server.projeto1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}