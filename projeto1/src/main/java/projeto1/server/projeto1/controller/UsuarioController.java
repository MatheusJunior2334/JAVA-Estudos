package projeto1.server.projeto1.controller;

import projeto1.server.projeto1.model.Usuario;
import projeto1.server.projeto1.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/usuario")

public class UsuarioController {
    
    @Autowired
    private UsuarioController usuarioRepository;

    //CREATE - Cadastrar usuario

    @PostMapping
    public String save(@RequestBody Usuario usuario) {
        usuarioRepository.save(usuario);
        return "Usuario cadastrado com sucesso";
    }

    //READ - Mostrar Usuario

    @GetMapping
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    } 

    //UPDATE

    @PutMapping("/{id}")
    public String atualizarUsuario(@PathVariable("id") Integer id, @RequestBody Usuario usuario) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
        if (usuarioExistente.isPresent()) {
            usuario.setId(id);
            usuarioRepository.save(usuario);
            return "Usuario atualizado com sucesso";
        } else {
            return "Usuario nao encontrado";
        }
    }  

    //DELETE

    @DeleteMapping("/{id}")
    public String apagarUsuario(@PathVariable("id") Integer id) {
       Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);
       if (usuarioExistente.isPresent()) {
        usuarioRepository.deleteById(id);
        return "Usuario apagado com sucesso";
       } else {
        return "Usuario nao encontrado";
       }
    }

    private Optional<Usuario> findById(Integer id) {
        return null;
    }

    private void deleteById(Integer id) {
    }
}
